/*

Nombre del archivo: Acceso.java
Fecha de creación: 09/10/2018
Fecha de modificación: 23/04/2019
Autores: Carlos Esteban Murillo Sandoval 1526857-3743
         Juan Camilo Sánchez Barreiro    1527749-3743
         Bryan Steven Biojó Romero       1629366-3743
         Santiago Andrés Pineda Ramírez  1663634-2711

*/

// Paquete:
package ModeloDAO;

// Import:
import java.sql.*;

// INICIO DE LA CLASE.
public class Acceso {
    String url, usuario, password;
    Connection conexion = null;
    
    // Constructor de la clase:
    public Acceso() {
        //this.url = "jdbc:postgresql://otto.db.elephantsql.com:5432/vvpcnayj";
        //this.usuario = "vvpcnayj";
        //this.password = "LaDK1W0ZNGd-S-TQCRVRd0Z7F5Qm6DUY";
        this.url = "jdbc:postgresql://localhost:5433/xyz";
        this.usuario = "postgres";
        this.password = "papulogico";
    }
    
    // Conexión a la base de datos:
    public Connection conectar() {
        try {
            //Se carga el driver
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver Cargado");
        } catch(Exception e) {
            System.out.println("No se pudo cargar el Driver.");
        }
        try {
        //Crear el objeto de conexión a la base de datos.
        conexion = DriverManager.getConnection(this.url, this.usuario, this.password);
        System.out.println("Conexion Abierta");
        return conexion;
        } catch(Exception e) {
            System.out.println("No se pudo abrir la base de datos.");
            return null;
        }
    }
    
    public Connection getConnetion() {
        if (conexion == null) {
            return this.conectar();
        } else{
            return conexion;
        }
    }
    
    public void closeConection(Connection c) {
        try {
            if (conexion != null){
                c.close();
                System.out.println("Conexion cerrada exitosamente.");
            } 
        } catch(Exception e) {
            System.out.println("No se pudo cerrar la conexion a la base de datos.");
            }
        }
} // FIN DE LA CLASE.
