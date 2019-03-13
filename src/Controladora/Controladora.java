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
    
    public void alterCombo(JComboBox combo){
        combo.removeAllItems();
        try {
            ResultSet res = usersDao.comboOptions();
            while(res.next()){
                combo.addItem(res.getString("idSedes")+", "+res.getString("city")+", "+res.getString("address"));
            }
        } catch (Exception e) {
            System.out.println("---- Problema en la ejecucion.");
        }
        
    }
    
    public void alterComboJefe(JComboBox combo){
        combo.removeAllItems();
        try {
            ResultSet res = sedesDao.comboOptions();
            while(res.next()){
                combo.addItem(res.getString("idUser")+", "+res.getString("first_name")+", "+res.getString("last_name"));
            }
        } catch (Exception e) {
            System.out.println("---- Problema en la ejecucion.");
             e.printStackTrace();
        }
        
    }
    
    public void alterComboInConsult(JComboBox combo, String identificator){
        combo.removeAllItems();
        try {
            ResultSet res = usersDao.comboOptions();
            while(res.next()){
                if(identificator.equals(res.getString("idSedes"))){
                    combo.addItem(res.getString("idSedes")+", "+res.getString("city")+", "+res.getString("address"));
                }
            }
        } catch (Exception e) {
            System.out.println("---- Problema en la ejecucion.");
        }
        
    }
    
     public void alterComboJefeInConsult(JComboBox combo, String identificator){
        combo.removeAllItems();
        try {
            ResultSet res = sedesDao.comboOptions();
            while(res.next()){
                if(identificator.equals(res.getString("idUser"))){
                    combo.addItem(res.getString("idUser")+", "+res.getString("first_name")+", "+res.getString("last_name"));
                }
            }
        } catch (Exception e) {
            System.out.println("---- Problema en la ejecucion.");
        }
        
    }
        
    public void alterComboUpdating(JComboBox combo, String actualItem){
        combo.removeAllItems();
        combo.addItem(actualItem);
        String[] cadenaID = actualItem.split(",");
        try {
            ResultSet res = usersDao.comboOptions();
            while(res.next()){
                if(!cadenaID[0].equals(res.getString("idSedes"))){
                    combo.addItem(res.getString("idSedes")+", "+res.getString("city")+", "+res.getString("address"));
                }
                
            }
        } catch (Exception e) {
            System.out.println("---- Problema en la ejecucion.");
        }
        
    }
    
    public void alterComboSedesUpdating(JComboBox combo, String actualItem){
        combo.removeAllItems();
        combo.addItem(actualItem);
        String[] cadenaID = actualItem.split(",");
        try {
            ResultSet res = sedesDao.comboOptions();
            while(res.next()){
                if(!cadenaID[0].equals(res.getString("idUser"))){
                    combo.addItem(res.getString("idUser")+", "+res.getString("first_name")+", "+res.getString("last_name"));
                }
                
            }
        } catch (Exception e) {
            System.out.println("---- Problema en la ejecucion.");
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
        Sedes aS = new Sedes(idSede, city, address, state, placeid);
        return sedesDao.updateSede(aS);
    }
    
    public ArrayList<String[]> consultUsers(){
        return  usersDao.consultUsers();

    }
    
    public boolean createSede(String idSede, String ciudad, String direccion,String estado ,String jefe){
        Sedes sede = new Sedes(idSede, ciudad, direccion, estado,jefe);
        return sedesDao.createNewSede(sede);
    }
}
