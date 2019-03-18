
package ModeloDAO;

import Modelo.Producto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author carban
 */
public class ProductoDAO {
        Acceso access;
    
    public ProductoDAO(Acceso access){
        this.access =  access;
    }

    public boolean crearNuevoProducto(Producto prod) {
        String QuerySQL = "INSERT INTO producto VALUES("+ prod.getId() + ", '"+prod.getNombre()+ "', '"+prod.getDescripcion()+ "', '"+prod.getColor()+"', '"+prod.getAlto()+"', '"+prod.getLargo()+ "', '"+prod.getAncho()+ "', '"+prod.getPrecio()+ "')";
        String QuerySQLaux = "SELECT idProducto FROM producto WHERE idProducto = '"+prod.getId()+"' ";//AND work_position='Vendedor'";
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
                JOptionPane.showMessageDialog(null, "El Producto ya existe \nIntentelo nuevamente");
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
    
}
