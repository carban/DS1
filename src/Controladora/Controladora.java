package Controladora;

import Modelo.Sedes;
import Modelo.Users;
import Modelo.Jefes;
import Modelo.Orden;
import Modelo.Producto;
import ModeloDAO.Acceso;
import ModeloDAO.JefesDAO;
import ModeloDAO.OrdenDAO;
import ModeloDAO.ProductoDAO;
import ModeloDAO.UsersDAO;
import ModeloDAO.SedesDAO;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Controladora {
    
    Acceso access;
    UsersDAO usersDao;
    SedesDAO sedesDao;
    JefesDAO jefesDao;
    ProductoDAO productoDao;
    OrdenDAO ordenDao;
    public Controladora(){
        access = new Acceso();
        this.usersDao = new UsersDAO(access);
        this.sedesDao = new SedesDAO(access);
        this.jefesDao = new JefesDAO(access);
        this.productoDao = new ProductoDAO(access);
        this.ordenDao = new OrdenDAO(access);
    }
    
    public String login(String user, String pass){
        return usersDao.login(user, pass);
    }
    
    public Users consultProfile(String userID){
        return usersDao.consultProfile(userID);
    }
    
    public Jefes consultProfileJefe(String userID){
        return jefesDao.consultProfile(userID);
    }
    
    public void alterComboJefeEditing(JComboBox combo, String[] firstPersonOnCombo){//NO C
        
        System.err.println(firstPersonOnCombo);
        combo.removeAllItems();
        combo.addItem(firstPersonOnCombo[0]+","+firstPersonOnCombo[1]);
        try {
            ResultSet res = sedesDao.comboOptions();
            
            while(res.next()){
                combo.addItem(res.getString("idUser")+", "+res.getString("first_name")+" "+res.getString("last_name"));
            }
        } catch (Exception e) {
            System.out.println("---- Problema en la ejecucion.");
        }
        
    }
    
    public void alterComboJefe(JComboBox combo){
        combo.removeAllItems();
        try {
            ResultSet res = sedesDao.comboOptions();
            int c = 0;
            while(res.next()){
                c++;
                combo.addItem(res.getString("idUser")+", "+res.getString("first_name")+", "+res.getString("last_name"));
            }
            if(c==0){
                combo.addItem("Seleccione");
            }
        } catch (Exception e) {
            System.out.println("---- Problema en la ejecucion.");
             e.printStackTrace();
        }
        
    }

    //Funcion para crear usuarios desde el gerente
    public boolean createUser(String id, String fname, String lname, String telefono, String direccion, String position, String pass){
        Users aU = new Users(id, fname, lname, telefono, direccion, position, pass);
        aU.setState("Inactivo");
        return usersDao.createNewUser(aU);
    }
    //Funcion para crear usuarios vendedor desde la vista del Jefe de taller
    public boolean createUserVendedor(String id, String fname, String lname, String telefono, String direccion, String pass, String idSede){
        Users aU = new Users(id, fname, lname, telefono, direccion, "Vendedor", pass);
        aU.setState("Activo");
        return jefesDao.createNewUser(aU, idSede);
    }
    
    //Funcion para actualizar usuarios desde el gerente
    public boolean updateUser(String id, String fname, String lname, String telefono, String direccion, String position){
        Users aU = new Users(id, fname, lname, telefono, direccion, position);
        return usersDao.updateUser(aU);
    }
    
    //Funcion para actualizar usuarios desde el gerente
    public boolean updateUserVendedor(String id, String fname, String lname, String telefono, String direccion){
        Users aU = new Users(id, fname, lname, telefono, direccion, "Vendedor");
        return jefesDao.updateUserVendedor(aU);
    }
    
    //Funcion para actualizar sedes desde el gerente
    public boolean updateSede(String idSede, String city, String address,String state, String placeid, String jefeActual){
        Sedes aS = new Sedes(city, address, state, placeid);
        aS.setId(idSede);
        return sedesDao.updateSede(aS, jefeActual);
    }
    
    //Funcion para consultar usuarios desde el gerente
    public ArrayList<String[]> consultUsers(){
        return  usersDao.consultUsers();
    }
    
    //Funcion para consultar vendedores desde el Jefe de taller
    public ArrayList<String[]> consultUsersVendedores(String idSede){
        return  jefesDao.consultUsersVendedores(idSede);
    }
    
    //Funcion para consultar sedes desde el gerente
    public ArrayList<String[]> consultSedes(){
        return  sedesDao.consultSede();
    }
    
    //Funcion para crear sedes desde el gerente
    public boolean createSede(String ciudad, String direccion,String estado ,String jefe){
        Sedes sede = new Sedes(ciudad, direccion, estado,jefe);
        return sedesDao.createNewSede(sede);
    }
    
    //Funcion para crear usuarios desde el gerente
    public boolean crearProducto(String nombre, String descripcion, String color, int alto, int largo, int ancho, int precio){
        Producto prod = new Producto("TEMPORAL", nombre, descripcion, color, alto, largo, ancho, precio);
        return productoDao.crearNuevoProducto(prod);
    }
    
    //Funcion para consultar productos desde el gerente
    public ArrayList<String[]> consultProductos(){
        return  productoDao.consultProductos();
    }

    public void AlterComboVendedoresDisponibles(JComboBox<String> comboVendedoresDisponibles) {
        comboVendedoresDisponibles.removeAllItems();
        try {
            ResultSet res = productoDao.comboOptions();
            int c = 0;
            while(res.next()){
                c++;
                comboVendedoresDisponibles.addItem(res.getString("idUser")+", "+res.getString("first_name")+" "+res.getString("last_name"));
            }
            if(c==0){
                comboVendedoresDisponibles.addItem("Seleccione");
            }
        } catch (Exception e) {
            System.out.println("---- Problema en la ejecucion.");
             e.printStackTrace();
        }
    }

    public boolean AsignarUnVendedor(String id, String sedeid) {
        return jefesDao.asignarUnVendedor(id, sedeid);
    }

    public ArrayList<String[]> consultProductosDelJefe(String sedeid) {
        return  productoDao.consultProductosDelJefe(sedeid);
    }

    public boolean crearOrden(String cantidad, boolean estado, String idProducto, String idSede) {
        Orden ao = new Orden(cantidad, estado, idProducto, idSede);
        return ordenDao.crearOrden(ao);
    }

    public ArrayList<String[]> consultOrders(String sedeid) {
        return ordenDao.consultOrders(sedeid);
    }

    public boolean finalizarOrden(String idOrden, String idProd, String sedeid) {
        return ordenDao.finalizarOrden(idOrden, idProd, sedeid);
    }
    
}
