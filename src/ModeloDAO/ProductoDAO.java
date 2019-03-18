
package ModeloDAO;

import Modelo.Producto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

    public ArrayList<String[]> consultProductos() {
        String QuerySQL = "Select idproducto, idsedes, nombre, descripcion, color, alto, largo, ancho, precio, cantidad from (select * from inventario order by idsedes, idproducto) as foo natural join (select * from producto) as goo";
        System.out.println(QuerySQL);
        Connection coneccion= this.access.getConnetion();
        System.out.println("Connection: "+coneccion);
        
        try {
            Statement sentencia = coneccion.createStatement();
            System.out.println("sentencia: "+sentencia);
            ResultSet resultado = sentencia.executeQuery(QuerySQL);
            System.out.println("resultado: "+resultado);
            

            ArrayList<String[]> matrixList = new ArrayList<String[]>();
            int cont = 0;
            while (resultado.next()) {
                
                String a1 = resultado.getString("idproducto");
                String a2 = resultado.getString("idsedes");
                String a3 = resultado.getString("nombre");
                String a4 = resultado.getString("descripcion");
                String a5 = resultado.getString("color");
                String a6 = resultado.getString("alto");
                String a7 = resultado.getString("largo");
                String a8 = resultado.getString("ancho");
                String a9 = resultado.getString("precio");
                String a10 = resultado.getString("cantidad");
                String[] niu = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10}; //Es importante crear un nuevo arreglo cada vez
                matrixList.add(niu);
                cont++;
            }
            return matrixList;

        } catch (SQLException ex) {
            System.out.println("---- Problema en la ejecucion.");
            ex.printStackTrace();
        }
        return null;
    }

    public ResultSet comboOptions() {
        String QuerySQL = "select * from users where work_position='Vendedor' and stateuser='Inactivo';";
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
    
}
