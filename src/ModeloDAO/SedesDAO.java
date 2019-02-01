/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;
import Modelo.Sedes;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author juancamilo
 */
public class SedesDAO {
    Acceso access;

    public SedesDAO(Acceso access) {
        this.access = access;
    }
    
    public boolean createNewSede(Sedes aSede){
        String querySQL = "INSERT INTO Sedes VALUES ("+ aSede.getId() + ", '"+aSede.getCiudad()+ "', '"+aSede.getDireccion()+ "', '"
                +aSede.getEstado()+ "', '"+aSede.getJefe()+ "')";
        String querySQLaux = "SELECT idSedes FROM Users WHERE idUser = '"+aSede.getId()+"'";
        System.out.println(querySQL);
        System.out.println(querySQLaux);
        Connection coneccion= this.access.getConnetion();
        System.out.println("Connection: "+coneccion);
        try {
            Statement sentencia = coneccion.createStatement();
            System.out.println("sentencia: "+sentencia);
            ResultSet resultado = sentencia.executeQuery(querySQLaux);
            System.out.println("resultado: "+resultado);
            if(resultado.next()){
                return false;
            }else{
                int res = sentencia.executeUpdate(querySQL);
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
 
    public ResultSet comboOptions(){
        String QuerySQL = "SELECT * FROM Users WHERE work_position = 'Jefe de Taller'";
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
    
    public boolean updateSede(Sedes aSede) {
            String QuerySQL = "UPDATE Sedes SET idSedes='"+aSede.getId()+ "', city='"+aSede.getCiudad()+
                    "', address='"+aSede.getDireccion()+ "', stateSede='"+aSede.getEstado()
                    + "', idUser='"+aSede.getJefe()+"' WHERE idSedes = '"+aSede.getId()+"'";
            
        String QuerySQLaux = "SELECT idSedes FROM Sedes WHERE idSedes = '"+aSede.getId()+"'";
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
       
    public Sedes consultSede(String id){
        String QuerySQL = "SELECT * FROM Sedes WHERE idSedes = '"+id+"'";
        System.out.println(QuerySQL);
        Connection coneccion= this.access.getConnetion();
        System.out.println("Connection: "+coneccion);
        
        try {
            Statement sentencia = coneccion.createStatement();
            System.out.println("sentencia: "+sentencia);
            ResultSet resultado = sentencia.executeQuery(QuerySQL);
            System.out.println("resultado: "+resultado);
            if(resultado.next()){
                String idSede = resultado.getString("idSedes");
                String city = resultado.getString("city");
                String address = resultado.getString("address");
                String stateSede = resultado.getString("stateSede");
                String idUser = resultado.getString("idUser");
                
                return new Sedes(idSede, city, address, stateSede, idUser);
            }else{
                return new Sedes(null, null, null, null, null);
            }

        } catch (SQLException ex) {
            System.out.println("---- Problema en la ejecucion.");
            ex.printStackTrace();
        }
        return new Sedes(null, null, null, null, null);
    }
}
