/*

Nombre del archivo: Usuarios.java
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
public class Usuarios {
    String id;
    String fname;
    String lname;
    String pass;
    String position;
    String tel;
    String dir;
    String state;
    
    // Constructor de la clase:
    public Usuarios(String id, String fname, String lname, String tel, String dir, String position, String pass) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.pass = pass;
        this.position = position;
        this.tel = tel;
        this.dir = dir;
    }

    public Usuarios(String id, String fname, String lname, String tel, String dir, String position) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.tel = tel;
        this.dir = dir;
        this.position = position;
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

    public String getState() {
        return state;
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

    public void setState(String state) {
        this.state = state;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
} // FIN DE LA CLASE.
