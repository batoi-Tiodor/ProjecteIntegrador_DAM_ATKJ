package hibernate;
// Generated 12-feb-2018 18:52:59 by Hibernate Tools 4.3.1



/**
 * DependienteHasMedicacionId generated by hbm2java
 */
public class DependienteHasMedicacionId  implements java.io.Serializable {


     private int idDependiente;
     private int idMedicacion;

    public DependienteHasMedicacionId() {
    }

    public DependienteHasMedicacionId(int idDependiente, int idMedicacion) {
       this.idDependiente = idDependiente;
       this.idMedicacion = idMedicacion;
    }
   
    public int getIdDependiente() {
        return this.idDependiente;
    }
    
    public void setIdDependiente(int idDependiente) {
        this.idDependiente = idDependiente;
    }
    public int getIdMedicacion() {
        return this.idMedicacion;
    }
    
    public void setIdMedicacion(int idMedicacion) {
        this.idMedicacion = idMedicacion;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DependienteHasMedicacionId) ) return false;
		 DependienteHasMedicacionId castOther = ( DependienteHasMedicacionId ) other; 
         
		 return (this.getIdDependiente()==castOther.getIdDependiente())
 && (this.getIdMedicacion()==castOther.getIdMedicacion());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdDependiente();
         result = 37 * result + this.getIdMedicacion();
         return result;
   }   


}


