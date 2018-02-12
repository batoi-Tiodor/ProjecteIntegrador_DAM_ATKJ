package hibernate;
// Generated 12-feb-2018 18:52:59 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 * TareasPendientes generated by hbm2java
 */
public class TareasPendientes implements java.io.Serializable {

    private Integer idTarea;
    private Dependiente dependiente;
    private Date fecha;
    private String hora;
    private String encabezado;
    private String descripcion;

    public TareasPendientes() {
    }

    public TareasPendientes(Dependiente dependiente) {
        this.dependiente = dependiente;
    }

    public TareasPendientes(Dependiente dependiente, Date fecha, String hora, String encabezado, String descripcion) {
        this.dependiente = dependiente;
        this.fecha = fecha;
        this.hora = hora;
        this.encabezado = encabezado;
        this.descripcion = descripcion;
    }

    public Integer getIdTarea() {
        return this.idTarea;
    }

    public void setIdTarea(Integer idTarea) {
        this.idTarea = idTarea;
    }

    public Dependiente getDependiente() {
        return this.dependiente;
    }

    public void setDependiente(Dependiente dependiente) {
        this.dependiente = dependiente;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return this.hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getEncabezado() {
        return this.encabezado;
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Object[] getTareaPendienteForTable() {
        return new Object[]{this.dependiente.getPersonas().getNombre() + ", " + this.dependiente.getPersonas().getApellidos(), this.fecha, this.hora, this.encabezado, this.descripcion};
    }

    public static void setColumns(DefaultTableModel model) {
        model.addColumn("Dependiente");
        model.addColumn("Fecha");
        model.addColumn("Hora");
        model.addColumn("Encabezado");
        model.addColumn("Descripcion");
    }

}
