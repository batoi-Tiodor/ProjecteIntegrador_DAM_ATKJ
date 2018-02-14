package hibernate;
// Generated 12-feb-2018 18:52:59 by Hibernate Tools 4.3.1

import javax.swing.table.DefaultTableModel;




/**
 * RecursosLocalidad generated by hbm2java
 */
public class RecursosLocalidad  implements java.io.Serializable {


     private int idPoblacion;
     private Poblacion poblacion;
     private String telefonoGuardiaCil;
     private String telefonoBomberos;
     private String telefonoPoliciaLocal;
     private String telefonoUrgencias;
     private String telefonoPoliciaNacional;
     private String telefonoAmbulatorio;
     private String telefonoHospital;

    public RecursosLocalidad() {
    }

	
    public RecursosLocalidad(Poblacion poblacion) {
        this.poblacion = poblacion;
    }
    public RecursosLocalidad(Poblacion poblacion, String telefonoGuardiaCil, String telefonoBomberos, String telefonoPoliciaLocal, String telefonoUrgencias, String telefonoPoliciaNacional, String telefonoAmbulatorio, String telefonoHospital) {
       this.poblacion = poblacion;
       this.telefonoGuardiaCil = telefonoGuardiaCil;
       this.telefonoBomberos = telefonoBomberos;
       this.telefonoPoliciaLocal = telefonoPoliciaLocal;
       this.telefonoUrgencias = telefonoUrgencias;
       this.telefonoPoliciaNacional = telefonoPoliciaNacional;
       this.telefonoAmbulatorio = telefonoAmbulatorio;
       this.telefonoHospital = telefonoHospital;
    }
   
    public int getIdPoblacion() {
        return this.idPoblacion;
    }
    
    public void setIdPoblacion(int idPoblacion) {
        this.idPoblacion = idPoblacion;
    }
    public Poblacion getPoblacion() {
        return this.poblacion;
    }
    
    public void setPoblacion(Poblacion poblacion) {
        this.poblacion = poblacion;
    }
    public String getTelefonoGuardiaCil() {
        return this.telefonoGuardiaCil;
    }
    
    public void setTelefonoGuardiaCil(String telefonoGuardiaCil) {
        this.telefonoGuardiaCil = telefonoGuardiaCil;
    }
    public String getTelefonoBomberos() {
        return this.telefonoBomberos;
    }
    
    public void setTelefonoBomberos(String telefonoBomberos) {
        this.telefonoBomberos = telefonoBomberos;
    }
    public String getTelefonoPoliciaLocal() {
        return this.telefonoPoliciaLocal;
    }
    
    public void setTelefonoPoliciaLocal(String telefonoPoliciaLocal) {
        this.telefonoPoliciaLocal = telefonoPoliciaLocal;
    }
    public String getTelefonoUrgencias() {
        return this.telefonoUrgencias;
    }
    
    public void setTelefonoUrgencias(String telefonoUrgencias) {
        this.telefonoUrgencias = telefonoUrgencias;
    }
    public String getTelefonoPoliciaNacional() {
        return this.telefonoPoliciaNacional;
    }
    
    public void setTelefonoPoliciaNacional(String telefonoPoliciaNacional) {
        this.telefonoPoliciaNacional = telefonoPoliciaNacional;
    }
    public String getTelefonoAmbulatorio() {
        return this.telefonoAmbulatorio;
    }
    
    public void setTelefonoAmbulatorio(String telefonoAmbulatorio) {
        this.telefonoAmbulatorio = telefonoAmbulatorio;
    }
    public String getTelefonoHospital() {
        return this.telefonoHospital;
    }
    
    public void setTelefonoHospital(String telefonoHospital) {
        this.telefonoHospital = telefonoHospital;
    }

    public Object[] getRecursosForTable() {
        
        return new Object[]{this.telefonoGuardiaCil, this.telefonoBomberos, this.telefonoPoliciaLocal, this.telefonoUrgencias, this.telefonoPoliciaNacional, this.telefonoAmbulatorio, this.telefonoHospital };
    }

    public static void setColumns(DefaultTableModel model) {
       
        model.addColumn("Telefono GuardiaCil");
        model.addColumn("Telefono Bomberos");
        model.addColumn("Telefono Policia Local");
        model.addColumn("Tipo telefono Urgencias");
        model.addColumn("Telefono Policia Nacional");
        model.addColumn("Telefono Ambulatorio");
        model.addColumn("Telefono Hospital");
    }
    


}


