/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Modelo.Users;
import Modelo.Jefes;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author invitado
 */
public class JefesDAO {
    Acceso access;

    public JefesDAO(Acceso access) {
        this.access = access;
    }
    
    public boolean createNewUser(Users aUser){
        String QuerySQL = "INSERT INTO Users VALUES ("+ aUser.getId() + ", '"+aUser.getFname()+ "', '"+aUser.getLname()+ "', '"
                +aUser.getTel()+"', '"+aUser.getDir()+"', '"+aUser.getPosition()+ "', '"+aUser.getPass()+ "', '"+aUser.getState()+ "')";
        String QuerySQLaux = "SELECT idUser FROM Users WHERE idUser = '"+aUser.getId()+"' ";//AND work_position='Vendedor'";
        System.out.println(QuerySQL);
        System.out.println(QuerySQLaux);
        Connection coneccion= this.access.getConnetion();
        System.out.println("Connection: "+coneccion);
        
        try {
            Statement sentencia = coneccion.createStatement();
            System.out.println("sentencia: "+sentencia);
            ResultSet resultado = sentencia.executeQuery(QuerySQLaux);
            System.out.println("resultado: "+resultado);
            if(resultado.next()){
                JOptionPane.showMessageDialog(null, "El usuario ya existe \nIntentelo nuevamente");
            }else{
                int res = sentencia.executeUpdate(QuerySQL);
                if(res==1){
                    return true;
                }else{
                    return false;
                }
            }

        } catch (SQLException ex) {
            System.out.println("---- Problema en la ejecucion.");
            ex.printStackTrace();
        }
        return false;
    } 

public Jefes consultProfile(String userID){
        String QuerySQL = "SELECT * FROM Users NATURAL JOIN Sedes WHERE idUser = '"+userID+"'";
        System.out.println(QuerySQL);
        Connection coneccion= this.access.getConnetion();
        System.out.println("Connection: "+coneccion);
        
        try {
            Statement sentencia = coneccion.createStatement();
            System.out.println("sentencia: "+sentencia);
            ResultSet resultado = sentencia.executeQuery(QuerySQL);
            System.out.println("resultado: "+resultado);
            if(resultado.next()){
                String iduser = resultado.getString("iduser");
                String fname = resultado.getString("first_name");
                String lname = resultado.getString("last_name");
                String tel = resultado.getString("telefono");
                String dir = resultado.getString("direccion");
                String wp = resultado.getString("work_position");
                String pass = resultado.getString("password");
                String state = resultado.getString("stateuser");
                String idSede = resultado.getString("idSedes");
                String ciudad = resultado.getString("city");
                String dirSede = resultado.getString("address");
                
                return new Jefes(iduser, fname, lname, tel, dir, wp, pass,state,idSede,ciudad,dirSede);
            }else{
                return new Jefes(null, null, null, null, null, null, null,null,null,null,null);
            }
            
        } catch (SQLException ex) {
            System.out.println("---- Problema en la ejecucion.");
            ex.printStackTrace();
        }
        return new Jefes(null, null, null, null, null, null, null,null,null,null,null);
    }
}
