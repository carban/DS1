/*

Nombre del archivo: Jefes.java
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
public class Jefes {
    String id;
    String fname;
    String lname;
    String pass;
    String position;
    String tel;
    String dir;
    String state;
    String idSede;
    String ciudadSede;
    String dirSede;

    // Constructor de la clase:
    public Jefes(String id, String fname, String lname, String tel, String dir, String wp, String pass, String state, String idSede, String ciudad, String dirSede) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.pass = pass;
        this.position = wp;
        this.tel = tel;
        this.dir = dir;
        this.state = state;
        this.idSede = idSede;
        this.ciudadSede = ciudad;
        this.dirSede = dirSede;
    }

    public String getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getPass() {
        return pass;
    }

    public String getPosition() {
        return position;
    }

    public String getTel() {
        return tel;
    }

    public String getDir() {
        return dir;
    }

    public String getState() {
        return state;
    }

    public String getIdSede() {
        return idSede;
    }

    public String getCiudadSede() {
        return ciudadSede;
    }

    public String getDirSede() {
        return dirSede;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setIdSede(String idSede) {
        this.idSede = idSede;
    }

    public void setCiudadSede(String ciudadSede) {
        this.ciudadSede = ciudadSede;
    }

    public void setDirSede(String dirSede) {
        this.dirSede = dirSede;
    }
} // FIN DE LA CLASE.
