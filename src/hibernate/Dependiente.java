package hibernate;
// Generated 12-feb-2018 18:52:59 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Dependiente generated by hbm2java
 */
public class Dependiente  implements java.io.Serializable {


     private Integer idDependiente;
     private Personas personas;
     private String tipoDeDependiente;
     private Date fechaAlta;
     private String contrasenya;
     private Set contactoHasDependientes = new HashSet(0);
     private Set avisos = new HashSet(0);
     private Set tareasPendienteses = new HashSet(0);
     private Set asistencias = new HashSet(0);
     private Set dependienteHasMedicacions = new HashSet(0);
     private Set personases = new HashSet(0);

    public Dependiente() {
    }

	
    public Dependiente(Personas personas) {
        this.personas = personas;
    }
    public Dependiente(Personas personas, String tipoDeDependiente, Date fechaAlta, String contrasenya, Set contactoHasDependientes, Set avisos, Set tareasPendienteses, Set asistencias, Set dependienteHasMedicacions, Set personases) {
       this.personas = personas;
       this.tipoDeDependiente = tipoDeDependiente;
       this.fechaAlta = fechaAlta;
       this.contrasenya = contrasenya;
       this.contactoHasDependientes = contactoHasDependientes;
       this.avisos = avisos;
       this.tareasPendienteses = tareasPendienteses;
       this.asistencias = asistencias;
       this.dependienteHasMedicacions = dependienteHasMedicacions;
       this.personases = personases;
    }
   
    public Integer getIdDependiente() {
        return this.idDependiente;
    }
    
    public void setIdDependiente(Integer idDependiente) {
        this.idDependiente = idDependiente;
    }
    public Personas getPersonas() {
        return this.personas;
    }
    
    public void setPersonas(Personas personas) {
        this.personas = personas;
    }
    public String getTipoDeDependiente() {
        return this.tipoDeDependiente;
    }
    
    public void setTipoDeDependiente(String tipoDeDependiente) {
        this.tipoDeDependiente = tipoDeDependiente;
    }
    public Date getFechaAlta() {
        return this.fechaAlta;
    }
    
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    public String getContrasenya() {
        return this.contrasenya;
    }
    
    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }
    public Set getContactoHasDependientes() {
        return this.contactoHasDependientes;
    }
    
    public void setContactoHasDependientes(Set contactoHasDependientes) {
        this.contactoHasDependientes = contactoHasDependientes;
    }
    public Set getAvisos() {
        return this.avisos;
    }
    
    public void setAvisos(Set avisos) {
        this.avisos = avisos;
    }
    public Set getTareasPendienteses() {
        return this.tareasPendienteses;
    }
    
    public void setTareasPendienteses(Set tareasPendienteses) {
        this.tareasPendienteses = tareasPendienteses;
    }
    public Set getAsistencias() {
        return this.asistencias;
    }
    
    public void setAsistencias(Set asistencias) {
        this.asistencias = asistencias;
    }
    public Set getDependienteHasMedicacions() {
        return this.dependienteHasMedicacions;
    }
    
    public void setDependienteHasMedicacions(Set dependienteHasMedicacions) {
        this.dependienteHasMedicacions = dependienteHasMedicacions;
    }
    public Set getPersonases() {
        return this.personases;
    }
    
    public void setPersonases(Set personases) {
        this.personases = personases;
    }




}

