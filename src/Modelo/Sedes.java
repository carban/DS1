/*

Nombre del archivo: Sedes.java
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
public class Sedes {
    String id;
    String ciudad;
    String direccion;
    String estado;
    String jefe;

    // Constructor de la clase:
    public Sedes(String ciudad, String direccion,String estado, String jefe) {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.estado = estado;
        this.jefe = jefe;
    }

    public String getId() {
        return id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getJefe() {
        return jefe;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }   
} // FIN DE LA CLASE.
