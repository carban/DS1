
package Modelo;

public class Users {
    String id;
    String fname;
    String lname;
    String pass;
    String position;
    String state;
    String placeid;
    
    public Users (String id, String fname, String lname, String position, String pass, String state, String placeid){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.pass = pass;
        this.position = position;
        this.state = state;
        this.placeid = placeid;
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

    public String getPlaceid() {
        return placeid;
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

    public void setPlaceid(String placeid) {
        this.placeid = placeid;
    }
    
}
