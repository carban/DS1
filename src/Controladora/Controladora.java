package Controladora;

import Modelo.Users;
import ModeloDAO.Acceso;
import ModeloDAO.UsersDAO;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Controladora {
    
    Acceso access;
    UsersDAO usersDao;
    
    public Controladora(){
        access = new Acceso();
        this.usersDao = new UsersDAO(access);
    }
    
    public String login(String user, String pass){
        return usersDao.login(user, pass);
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
    
    public boolean createUser(String id, String fname, String lname, String position, String pass, String state, String placeid){
        Users aU = new Users(id, fname, lname, position, pass, state, placeid);
        return usersDao.createNewUser(aU);
    }
    
    public void consultUser(String id){
        Users aU =  usersDao.consultUser(id);

        JOptionPane.showMessageDialog(null, "\nID: "+aU.getId()+"\nFirst Name: "+aU.getFname()+"\nLast Name: "+
                aU.getLname()+"\nWork Position: "+aU.getPosition()+"\nPassword: "+aU.getPass()+
                "\nState: "+aU.getState()+"\nId-Sede: "+aU.getPlaceid(), 
                "RESULT", JOptionPane.INFORMATION_MESSAGE);
    }
}
