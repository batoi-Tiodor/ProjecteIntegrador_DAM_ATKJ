package hibernate;
// Generated 12-feb-2018 18:52:59 by Hibernate Tools 4.3.1

import controlador.Controlador;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 * TareasPendientes generated by hbm2java
 */
public class TareasPendientes implements java.io.Serializable {

    private Integer idTarea;
    private Dependiente dependiente;
    private Date fecha;
    private String encabezado;
    private String descripcion;
    private Double horasRepeticion;
    private Boolean tareaAsistente;
    private Boolean realizada;

    public TareasPendientes() {
    }

    public TareasPendientes(Dependiente dependiente) {
        this.dependiente = dependiente;
    }
    
    public TareasPendientes(Dependiente dependiente, Date fecha, String encabezado, String descripcion) {
        this.dependiente = dependiente;
        this.fecha = fecha;
        this.encabezado = encabezado;
        this.descripcion = descripcion;
    }

    public TareasPendientes(Dependiente dependiente, Date fecha, String encabezado, String descripcion, Double horasRepeticion, Boolean tareaAsistente, Boolean realizada) {
        this.dependiente = dependiente;
        this.fecha = fecha;
        this.encabezado = encabezado;
        this.descripcion = descripcion;
        this.horasRepeticion = horasRepeticion;
        this.tareaAsistente = tareaAsistente;
        this.realizada = realizada;
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

    public Double getHorasRepeticion() {
        return horasRepeticion;
    }

    public void setHorasRepeticion(Double horasRepeticion) {
        this.horasRepeticion = horasRepeticion;
    }

    public Boolean getTareaAsistente() {
        return tareaAsistente;
    }

    public void setTareaAsistente(Boolean tareaAsistente) {
        this.tareaAsistente = tareaAsistente;
    }

    public Boolean getRealizada() {
        return realizada;
    }

    public void setRealizada(Boolean realizada) {
        this.realizada = realizada;
    }

    public Object[] getTareaPendienteForTable() {
        return new Object[]{this, Controlador.formateaFecha(this.fecha), this.encabezado, this.descripcion, this.horasRepeticion != null ? this.horasRepeticion.intValue():0, this.tareaAsistente?"Si":"No"};
    }


    public static void setColumns(DefaultTableModel model) {
        model.addColumn("Dependiente");
        model.addColumn("Fecha");
        model.addColumn("Encabezado");
        model.addColumn("Descripcion");
        model.addColumn("Repetición (horas)");
        model.addColumn("Tarea de Asistente");
    }

    public String toString() {
        return this.getDependiente().getPersonas().getNombre() + " " + this.getDependiente().getPersonas().getApellidos();
    }

}
