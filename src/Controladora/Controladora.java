/*

Nombre del archivo: Controladora.java
Fecha de creación: 09/10/2018
Fecha de modificación: 23/04/2019
Autores: Carlos Esteban Murillo Sandoval 1526857-3743
         Juan Camilo Sánchez Barreiro    1527749-3743
         Bryan Steven Biojó Romero       1629366-3743
         Santiago Andrés Pineda Ramírez  1663634-2711

*/

// Paquete:
package Controladora;

// Imports:
import Modelo.Sedes;
import Modelo.Usuarios;
import Modelo.Jefes;
import Modelo.Orden;
import Modelo.Producto;
import Modelo.Vendedor;
import ModeloDAO.Acceso;
import ModeloDAO.JefesDAO;
import ModeloDAO.OrdenDAO;
import ModeloDAO.ProductoDAO;
import ModeloDAO.UsersDAO;
import ModeloDAO.SedesDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

// INICIO DE LA CLASE.
public class Controladora {
    Acceso access;
    UsersDAO usersDao;
    SedesDAO sedesDao;
    JefesDAO jefesDao;
    ProductoDAO productoDao;
    OrdenDAO ordenDao;

    // Constructor de la clase:
    public Controladora() {
        access = new Acceso();
        this.usersDao = new UsersDAO(access);
        this.sedesDao = new SedesDAO(access);
        this.jefesDao = new JefesDAO(access);
        this.productoDao = new ProductoDAO(access);
        this.ordenDao = new OrdenDAO(access);      
    }

    public String login(String user, String pass) {
        return usersDao.login(user, pass);
    }

    public Usuarios consultProfile(String userID) {
        return usersDao.consultProfile(userID);
    }

    public Jefes consultProfileJefe(String userID) {
        return jefesDao.consultProfile(userID);
    }

    public Vendedor consultProfileVENDEDOR(String userID) {
        //CAMBIAR A VENDEDOR DAO
        return jefesDao.consultProfileVENDEDOR(userID);
    }

    public Producto consultProducto(String codigo) {
        return productoDao.consultProducto(codigo);
    }

    public Producto consultProductCoincidencia(String valor) {
        return productoDao.consultProductosCoincidencia(valor);
    }

    public DefaultTableModel mostrarActivos(String sede) {
        return productoDao.mostrarACTIVOS(sede);
    }

    public ResultSet maxVenta() throws SQLException {
        return productoDao.maxIDventa();
    }

    public void alterComboJefeEditing(JComboBox combo, String[] firstPersonOnCombo) {
        System.err.println(firstPersonOnCombo);
        combo.removeAllItems();
        combo.addItem(firstPersonOnCombo[0] + "," + firstPersonOnCombo[1]);     
        try {
            ResultSet res = sedesDao.comboOptions();
            while (res.next()) {
                combo.addItem(res.getString("idUser") + ", " + res.getString("first_name") + " " + res.getString("last_name"));
            }   
        } catch (Exception e) {
            System.out.println("---- Problema en la ejecucion.");
        }
    }

    public void alterComboJefe(JComboBox combo) {
        combo.removeAllItems();
        try {
            ResultSet res = sedesDao.comboOptions();
            int c = 0;
            while (res.next()) {
                c++;
                combo.addItem(res.getString("idUser") + ", " + res.getString("first_name") + ", " + res.getString("last_name"));
            }
            if (c == 0) {
                combo.addItem("Seleccione");
            }
        } catch (Exception e) {
            System.out.println("---- Problema en la ejecucion.");
            e.printStackTrace();
        }
    }

    //Función para crear usuarios desde el Gerente.
    public boolean createUser(String id, String fname, String lname, String telefono, String direccion, String position, String pass) {
        Usuarios aU = new Usuarios(id, fname, lname, telefono, direccion, position, pass);
        aU.setState("Inactivo");
        return usersDao.createNewUser(aU);
    }

    //Función para crear usuarios vendedor desde la vista del Jefe de Taller.
    public boolean createUserVendedor(String id, String fname, String lname, String telefono, String direccion, String pass, String idSede) {
        Usuarios aU = new Usuarios(id, fname, lname, telefono, direccion, "Vendedor", pass);
        aU.setState("Activo");
        return jefesDao.createNewUser(aU, idSede);
    }

    //Función para actualizar usuarios desde el Gerente.
    public boolean updateUser(String id, String fname, String lname, String telefono, String direccion, String position) {
        Usuarios aU = new Usuarios(id, fname, lname, telefono, direccion, position);
        return usersDao.updateUser(aU);
    }

    //Función para actualizar usuarios desde el Gerente.
    public boolean updateUserVendedor(String id, String fname, String lname, String telefono, String direccion) {
        Usuarios aU = new Usuarios(id, fname, lname, telefono, direccion, "Vendedor");
        return jefesDao.updateUserVendedor(aU);
    }

    //Función para actualizar sedes desde el Gerente.
    public boolean updateSede(String idSede, String city, String address, String state, String placeid, String jefeActual) {
        Sedes aS = new Sedes(city, address, state, placeid);
        aS.setId(idSede);
        return sedesDao.updateSede(aS, jefeActual);
    }

    //Función para consultar usuarios desde el Gerente.
    public ArrayList<String[]> consultUsers() {
        return usersDao.consultUsers();
    }
    
    public boolean despedirUsuario(String idUser) {
        return usersDao.despedirUsuario(idUser);
    }

    //Función para consultar vendedores desde el Jefe de Taller.
    public ArrayList<String[]> consultUsersVendedores(String idSede) {
        return jefesDao.consultUsersVendedores(idSede);
    }

    //Función para consultar sedes desde el Gerente.
    public ArrayList<String[]> consultSedes() {
        return sedesDao.consultSede();
    }

    //Función para crear sedes desde el Gerente.
    public boolean createSede(String ciudad, String direccion, String estado, String jefe) {
        Sedes sede = new Sedes(ciudad, direccion, estado, jefe);
        return sedesDao.createNewSede(sede);
    }

    //Función para crear usuarios desde el Gerente.
    public boolean crearProducto(String nombre, String descripcion, String color, int alto, int largo, int ancho, int precio) {
        Producto prod = new Producto("TEMPORAL", nombre, descripcion, color, alto, largo, ancho, precio);
        return productoDao.crearNuevoProducto(prod);
    }

    //Función para consultar productos desde el Gerente.
    public ArrayList<String[]> consultProductos() {
        return productoDao.consultProductos();
    }
    
    public ArrayList<String[]> consultProductosCoincidencia_tabla(String busqueda) {
       return productoDao.consultProductosCoincidencia_tabla(busqueda);
    }

    public void AlterComboVendedoresDisponibles(JComboBox<String> comboVendedoresDisponibles) {
        comboVendedoresDisponibles.removeAllItems();
        try {
            ResultSet res = productoDao.comboOptions();
            int c = 0;
            while (res.next()) {
                c++;
                comboVendedoresDisponibles.addItem(res.getString("idUser") + ", " + res.getString("first_name") + " " + res.getString("last_name"));
            }
            if (c == 0) {
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
        return productoDao.consultProductosDelJefe(sedeid);
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

    public boolean updateCantidadResta(String codigo, String cantidad, String idsede) {
        return productoDao.RestarCantidadProductos(codigo, cantidad, idsede);
    }

    public boolean updateCantidadSuma(String codigo, String cantidad, String idsede) {
        return productoDao.SumarCantidadProductos(codigo, cantidad, idsede);
    }

    public boolean agregarVenta(String idventa, String iduser, String preciototal, String fecha, String idsedes) {
        return productoDao.agregarVenta(idventa, iduser, preciototal, fecha, idsedes);
    }

    public DefaultTableModel agregarRegistroVentaVendedor(String iduser) {
        return productoDao.mostrarRegistrosDeVentaVendedor(iduser);
    }

    public DefaultTableModel consultarRegistroVentasVendedor(String iduser, String fechaInicio, String fechaFinal) {
        return productoDao.BuscarRegistrosDeVentaVendedor(iduser, fechaInicio, fechaFinal);
    }

    public DefaultTableModel agregarRegistroVentaGerente() {
        return productoDao.mostrarRegistrosDeVentaGerente();
    }

    public DefaultTableModel consultarRegistroVentasGerente(String fechaInicio, String fechaFinal) {
        return productoDao.BuscarRegistrosDeVentaGerente(fechaInicio, fechaFinal);
    }

    public DefaultTableModel agregarRegistroVentaJefeTaller(String idsede) {
        return productoDao.mostrarRegistrosDeVentaJefeTaller(idsede);
    }

    public DefaultTableModel consultarRegistroVentasJefeTaller(String idsede, String fechaInicio, String fechaFinal) {
        return productoDao.BuscarRegistrosDeVentaJefeTaller(idsede, fechaInicio, fechaFinal);
    }
<<<<<<< HEAD
} // FIN DE LA CLASE.
=======

    public ArrayList<String[]> consultUsersJefes() {
        return usersDao.consultUsersJefes();
    }
    
    public ArrayList<String[]> consultUsersVendedores() {
        return usersDao.consultUsersVendedores();
    }

    public ArrayList<String[]> consultUsersCoincidencia_tabla(String busqueda) {
        return usersDao.consultUsersCoincidencia_tabla(busqueda);
    }

    public ArrayList<String[]> consultSedesCoincidencia_tabla(String busqueda) {
        return sedesDao.consultSedesCoincidencia_tabla(busqueda);
    }

    public ArrayList<String[]> consultProductosCoincidenciaDelJefe(String idSede, String busqueda) {
        return productoDao.consulProductosCoincidenciaDelJefe(idSede, busqueda);
    }

    public ArrayList<String[]> consultUsersVendedoresCoincidencia(String idSede, String busqueda) {
        return jefesDao.consultUsersVendedoresCoincidencia(idSede, busqueda);
    }


}
>>>>>>> beb3c8032a4bcf12c3fa4078232613305c3650a5
