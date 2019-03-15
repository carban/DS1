package Controladora;

import Modelo.Sedes;
import Modelo.Users;
import ModeloDAO.Acceso;
import ModeloDAO.UsersDAO;
import ModeloDAO.SedesDAO;
import Vista.consultEdit;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Controladora {
    
    Acceso access;
    UsersDAO usersDao;
    SedesDAO sedesDao;
    public Controladora(){
        access = new Acceso();
        this.usersDao = new UsersDAO(access);
        this.sedesDao = new SedesDAO(access);
    }
    
    public String login(String user, String pass){
        return usersDao.login(user, pass);
    }
    
    public Users consultProfile(String userID){
        return usersDao.consultProfile(userID);
    }
    
    public void alterComboJefeEditing(JComboBox combo){//NO C
        String first = (String) combo.getItemAt(0);
        combo.removeAllItems();
        combo.addItem(first);
        try {
            ResultSet res = sedesDao.comboOptions();
            while(res.next()){
                combo.addItem(res.getString("idUser")+", "+res.getString("first_name")+", "+res.getString("last_name"));
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

    
    public boolean createUser(String id, String fname, String lname, String telefono, String direccion, String position, String pass, String state){
        Users aU = new Users(id, fname, lname, telefono, direccion, position, pass, state);
        return usersDao.createNewUser(aU);
    }
    
    public boolean updateUser(String id, String fname, String lname, String telefono, String direccion, String position, String state){
        Users aU = new Users(id, fname, lname, telefono, direccion, position, state);
        return usersDao.updateUser(aU);
    }
    
    public boolean updateSede(String idSede, String city, String address,String state, String placeid){
        Sedes aS = new Sedes(city, address, state, placeid);
        aS.setId(idSede);
        return sedesDao.updateSede(aS);
    }
    
    public ArrayList<String[]> consultUsers(){
        return  usersDao.consultUsers();

    }
    
    public ArrayList<String[]> consultSedes(){
        return  sedesDao.consultSede();

    }
    
    public boolean createSede(String ciudad, String direccion,String estado ,String jefe){
        Sedes sede = new Sedes(ciudad, direccion, estado,jefe);
        return sedesDao.createNewSede(sede);
    }
}
