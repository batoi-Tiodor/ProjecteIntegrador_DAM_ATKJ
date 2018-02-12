package hibernate;
// Generated 12-feb-2018 18:52:59 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Contacto generated by hbm2java
 */
public class Contacto  implements java.io.Serializable {


     private int idContacto;
     private Personas personas;
     private Set contactoHasDependientes = new HashSet(0);

    public Contacto() {
    }

	
    public Contacto(Personas personas) {
        this.personas = personas;
    }
    public Contacto(Personas personas, Set contactoHasDependientes) {
       this.personas = personas;
       this.contactoHasDependientes = contactoHasDependientes;
    }
   
    public int getIdContacto() {
        return this.idContacto;
    }
    
    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }
    public Personas getPersonas() {
        return this.personas;
    }
    
    public void setPersonas(Personas personas) {
        this.personas = personas;
    }
    public Set getContactoHasDependientes() {
        return this.contactoHasDependientes;
    }
    
    public void setContactoHasDependientes(Set contactoHasDependientes) {
        this.contactoHasDependientes = contactoHasDependientes;
    }




}


