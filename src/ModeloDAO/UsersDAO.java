package ModeloDAO;
import Modelo.Users;
import java.sql.*;
import javax.swing.JOptionPane;

public class UsersDAO {
    Acceso access;
    
    public UsersDAO(Acceso access){
        this.access =  access;
    }
    
    public String login (String user, String pass) {
        String QuerySQL = "SELECT * FROM Users WHERE idUser = '" + user + "' and password = '"+ pass + "'";
        System.out.println(QuerySQL);
        Connection coneccion= this.access.getConnetion();
        System.out.println("Connection: "+coneccion);
        
        try {
            Statement sentencia = coneccion.createStatement();
            System.out.println("sentencia: "+sentencia);
            ResultSet resultado = sentencia.executeQuery(QuerySQL);
            System.out.println("resultado: "+resultado);
            if(resultado.next()){
                String cargo = resultado.getString("work_position");
                System.out.println("cargo: "+cargo);
                if(cargo.equals("Gerente")){
                    return "Gerente";
                }
                else if(cargo.equals("Jefe de Taller")){
                    return "Jefe de Taller";
                }
                else if(cargo.equals("Vendedor")){
                    return "Vendedor";
                }
            }else{
                return "error";
            }

        } catch (SQLException ex) {
            System.out.println("---- Problema en la ejecucion.");
            ex.printStackTrace();
        }
        return "error";
    }
    
    public boolean createNewUser(Users aUser){
        String QuerySQL = "INSERT INTO Users VALUES ("+ aUser.getId() + ", '"+aUser.getFname()+ "', '"+aUser.getLname()+ "', '"
                +aUser.getPosition()+ "', '"+aUser.getPass()+ "', '"+aUser.getState()+ "')";
        String QuerySQLaux = "SELECT idUser FROM Users WHERE idUser = '"+aUser.getId()+"' AND (work_position='Jefe de Taller' OR work_position='Vendedor')";
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
                JOptionPane.showMessageDialog(null, "User already exists \nTry again");
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
    
    public Users consultProfile(String userID){
        String QuerySQL = "SELECT * FROM Users WHERE idUser = '"+userID+"'";
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
                String wp = resultado.getString("work_position");
                String pass = resultado.getString("password");
                String state = resultado.getString("stateuser");
                
                return new Users(iduser, fname, lname, wp, pass, state);
            }else{
                return new Users(null, null, null, null, null, null);
            }

        } catch (SQLException ex) {
            System.out.println("---- Problema en la ejecucion.");
            ex.printStackTrace();
        }
        return new Users(null, null, null, null, null, null);
    }
    
    
    public Users consultUser(String id){
        String QuerySQL = "SELECT * FROM Users WHERE idUser = '"+id+"' AND (work_position='Jefe de Taller' OR work_position='Vendedor')";
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
                String wp = resultado.getString("work_position");
                String pass = resultado.getString("password");
                String state = resultado.getString("stateuser");
                
                return new Users(iduser, fname, lname, wp, pass, state);
            }else{
                return new Users(null, null, null, null, null, null);
            }

        } catch (SQLException ex) {
            System.out.println("---- Problema en la ejecucion.");
            ex.printStackTrace();
        }
        return new Users(null, null, null, null, null, null);
    }
    
    public ResultSet comboOptions(){
        String QuerySQL = "SELECT * FROM Sedes";
        System.out.println(QuerySQL);
        Connection coneccion= this.access.getConnetion();
        System.out.println("Connection: "+coneccion);
        
        try {
            Statement sentencia = coneccion.createStatement();
            System.out.println("sentencia: "+sentencia);
            ResultSet resultado = sentencia.executeQuery(QuerySQL);
            System.out.println("resultado: "+resultado);
            return resultado;

        } catch (SQLException ex) {
            System.out.println("---- Problema en la ejecucion.");
            ex.printStackTrace();
        }
        return null;
    }

    public boolean updateUser(Users aUser) {
            String QuerySQL = "UPDATE Users SET first_name='"+aUser.getFname()+ "', last_name='"+aUser.getLname()+
                    "', work_position='"+aUser.getPosition()+ "', stateuser='"+aUser.getState()+"' WHERE iduser = '"+aUser.getId()+"' AND (work_position='Jefe de Taller' OR work_position='Vendedor')";
            
        String QuerySQLaux = "SELECT idUser FROM Users WHERE idUser = '"+aUser.getId()+"' AND (work_position='Jefe de Taller' OR work_position='Vendedor')";
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
                int res = sentencia.executeUpdate(QuerySQL);
                if(res==1){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }

        } catch (SQLException ex) {
            System.out.println("---- Problema en la ejecucion.");
            ex.printStackTrace();
        }
        return false;    
        
    }
    
    

      
    
}
