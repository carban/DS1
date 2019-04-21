/*

Nombre del archivo: Orden.java
Fecha de creación: 09/10/2018
Fecha de modificación: 23/04/2019
Autores: Carlos Esteban Murillo Sandoval 1526857-3743
         Juan Camilo Sánchez Barreiro    1527749-3743
         Bryan Steven Biojó Romero       1629366-3743
         Santiago Andrés Pineda Ramírez  1663634-2711

*/

// Paquete:
package Modelo;

// INICIO DE LA CLASE.
public class Orden {
    String idOrden;
    String cantidadFabricar;
    boolean estado;
    String idProducto;
    String idSede;

    // Constructor de la clase:
    public Orden(String cantidadFabricar, boolean estado, String idProducto,String idSede) {
        this.cantidadFabricar = cantidadFabricar;
        this.estado = estado;
        this.idProducto = idProducto;
        this.idSede = idSede;
    }

    public String getIdOrden() {
        return idOrden;
    }

    public String getCantidadFabricar() {
        return cantidadFabricar;
    }

    public boolean getEstado() {
        return estado;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public String getIdSede() {
        return idSede;
    }

    public void setIdOrden(String idOrden) {
        this.idOrden = idOrden;
    }

    public void setCantidadFabricar(String cantidadFabricar) {
        this.cantidadFabricar = cantidadFabricar;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public void setIdSede(String idSede) {
        this.idSede = idSede;
    } 
} // FIN DE LA CLASE.
