/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Objects;
/**
 *
 * @author david
 */
public class PersonaInf {
    
    private String Nombre;
    private String Telf;
    private String Email;
    private String Clave;

    public PersonaInf(String Nombre, String Telf, String Email, String Clave) {
        this.Nombre = Nombre;
        this.Telf = Telf;
        this.Email = Email;
        this.Clave = Clave;
    }
    public PersonaInf() {
        this.Nombre = "";
        this.Telf = "";
        this.Email = "";
        this.Clave = "";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }
 
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.Nombre);
        hash = 97 * hash + Objects.hashCode(this.Telf);
        hash = 97 * hash + Objects.hashCode(this.Email);
        hash = 97 * hash + Objects.hashCode(this.Clave);
        return hash;
    }
      
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PersonaInf other = (PersonaInf) obj;
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Telf, other.Telf)) {
            return false;
        }
        if (!Objects.equals(this.Email, other.Email)) {
            return false;
        }
        return Objects.equals(this.Clave, other.Clave);
    }

    @Override
    public String toString() {
        return "PersonaInf{" + "Nombre=" + Nombre + ", Telf=" + Telf + ", Email=" + Email + ", Clave=" + Clave + '}';
    }
    
}
