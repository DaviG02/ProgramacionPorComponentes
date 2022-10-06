/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class PersonaInf {
    private String Email;
    private String Nombre; 
    private String Telf;
    
    public PersonaInf(String nombres, String telefono, String correo) {
        this.Nombre = nombres;
        this.Telf = telefono;
        this.Email = correo;
    }
    public PersonaInf() {
        this.Nombre = "";
        this.Telf = "";
        this.Email = "";
    }

    public String getTelf() {
        return Telf;
    }

    public void setTelf(String Telf) {
        this.Telf = Telf;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    @Override
    public String toString() {
        return "nombres=" + Nombre + ", telefono=" + Telf + ", correo=" + Email;
    }    
}
