/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import controlador.Controlador;
import controlador.Main;
import hibernate.Asistencia;
import hibernate.Contacto;
import hibernate.ContactoHasDependiente;
import hibernate.Dependiente;
import hibernate.DependienteHasMedicacion;
import hibernate.Medicacion;
import hibernate.Personas;
import hibernate.Poblacion;
import hibernate.TareasPendientes;
import hibernate.Telefonos;
import hibernate.Vivienda;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.conexion.Conexion;

/**
 *
 * @author vesprada
 */
public class JFrameDependienteLlamada extends javax.swing.JFrame {

    private Controlador controlador;
    private Dependiente dependienteLlamada;
    private Contacto contactoSeleccionado;
    private TableRowSorter trsFiltroMedicinas;
    private TableRowSorter trsFiltroPoblaciones;
    private Double longitudDependienteLlamada;
    private Double latitudDependienteLlamada;
    
    Set telefonos = new HashSet();
    private JTable tablaHistorialLlamadas;
    
    /**
     * Creates new form JFrameDependiente
     *
     * @param controlador
     * @param dependienteSeleccionado
     */

    public JFrameDependienteLlamada(Controlador controlador, Dependiente dependiente, Double longitudDependienteLlamada, Double latitudDependienteLlamada, JTable jTableHistorialLlamadas) {
        super("Dependiente " + dependiente.getPersonas().getNombre());
        initComponents();
        this.controlador = controlador;
        this.dependienteLlamada = dependiente;        
        this.longitudDependienteLlamada = longitudDependienteLlamada;
        this.latitudDependienteLlamada = latitudDependienteLlamada;
        this.tablaHistorialLlamadas = jTableHistorialLlamadas;
        setUI();
    }
    public JFrameDependienteLlamada() {
        initComponents();
    }

    private void setUI() {
        this.jLabelNombreYApellidosDependiente.setText(this.dependienteLlamada.toString());
        this.jLabelDNIDependiente.setText(this.dependienteLlamada.getPersonas().getDni());
        this.jLabelFechaNacimientoDependiente.setText(this.dependienteLlamada.getPersonas().getNacimiento().toString());
        this.jLabelGeneroDependiente.setText(this.dependienteLlamada.getPersonas().getGenero());
        this.jLabelFechaAltaDependiente.setText(this.dependienteLlamada.getFechaAlta().toString());
        this.jLabelTipoDeDependiente.setText(this.dependienteLlamada.getTipoDeDependiente());

        this.controlador.rellenaTablaContactosDependiente(jTableContactosDependiente, dependienteLlamada);
        this.controlador.rellenaTablaMedicacionDependiente(jTableMedicacionDependiente, dependienteLlamada);
        abreMapa(this.longitudDependienteLlamada, this.latitudDependienteLlamada);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialogViviendas = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableViviendasDependiente = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jListRecursos = new javax.swing.JList<>();
        jTextFieldViviendaActual = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNombreYApellidosDependiente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelDNIDependiente = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelFechaNacimientoDependiente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelGeneroDependiente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelFechaAltaDependiente = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContactosDependiente = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMedicacionDependiente = new javax.swing.JTable();
        jButtonVerViviendasDependiente = new javax.swing.JButton();
        jLabelTipoDeDependiente = new javax.swing.JLabel();
        jPanelMapaDependiente = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        dateChooserComboFechaDetallesLlamada = new datechooser.beans.DateChooserCombo();
        jTextFieldMotivoDetallesLlamada = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextAreaDatosAsistenciaDetallesLlamada = new javax.swing.JTextArea();
        jButtonAceptarDetallesLlamada = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jTableViviendasDependiente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableViviendasDependiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableViviendasDependienteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableViviendasDependiente);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Viviendas");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Recursos Localidad");

        jScrollPane8.setViewportView(jListRecursos);

        jTextFieldViviendaActual.setEditable(false);

        jLabel40.setText("Actual:");

        javax.swing.GroupLayout jDialogViviendasLayout = new javax.swing.GroupLayout(jDialogViviendas.getContentPane());
        jDialogViviendas.getContentPane().setLayout(jDialogViviendasLayout);
        jDialogViviendasLayout.setHorizontalGroup(
            jDialogViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialogViviendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialogViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogViviendasLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldViviendaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDialogViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogViviendasLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane8))
                .addContainerGap())
        );
        jDialogViviendasLayout.setVerticalGroup(
            jDialogViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogViviendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDialogViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogViviendasLayout.createSequentialGroup()
                        .addGroup(jDialogViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialogViviendasLayout.createSequentialGroup()
                        .addGroup(jDialogViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(jTextFieldViviendaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jDialogViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialogViviendasLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addGap(47, 47, 47))
                    .addGroup(jDialogViviendasLayout.createSequentialGroup()
                        .addComponent(jScrollPane8)
                        .addContainerGap())))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Datos de Dependiente:");

        jLabelNombreYApellidosDependiente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelNombreYApellidosDependiente.setText("Nombre y Apellidos");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("DNI:");

        jLabelDNIDependiente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelDNIDependiente.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Fecha Nacimiento:");

        jLabelFechaNacimientoDependiente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelFechaNacimientoDependiente.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Género:");

        jLabelGeneroDependiente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelGeneroDependiente.setText("jLabel8");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Tipo:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Fecha Alta:");

        jLabelFechaAltaDependiente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelFechaAltaDependiente.setText("jLabel8");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel8.setText("Contactos");

        jTableContactosDependiente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTableContactosDependiente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableContactosDependiente.setRowHeight(18);
        jScrollPane1.setViewportView(jTableContactosDependiente);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setText("Medicación");

        jTableMedicacionDependiente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTableMedicacionDependiente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableMedicacionDependiente.setRowHeight(18);
        jScrollPane2.setViewportView(jTableMedicacionDependiente);

        jButtonVerViviendasDependiente.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonVerViviendasDependiente.setText("Ver Viviendas");
        jButtonVerViviendasDependiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerViviendasDependienteActionPerformed(evt);
            }
        });

        jLabelTipoDeDependiente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelTipoDeDependiente.setText("jLabel2");

        jPanelMapaDependiente.setLayout(new java.awt.BorderLayout());

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Ubicación no encontrada");
        jPanelMapaDependiente.add(jLabel36, java.awt.BorderLayout.CENTER);

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Detalles Llamada");

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel37.setText("Fecha:");

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel38.setText("Motivo:");

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel39.setText("Datos de Asistencia:");

        dateChooserComboFechaDetallesLlamada.setLocked(true);

        jTextFieldMotivoDetallesLlamada.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jTextAreaDatosAsistenciaDetallesLlamada.setColumns(20);
        jTextAreaDatosAsistenciaDetallesLlamada.setLineWrap(true);
        jTextAreaDatosAsistenciaDetallesLlamada.setRows(5);
        jScrollPane10.setViewportView(jTextAreaDatosAsistenciaDetallesLlamada);

        jButtonAceptarDetallesLlamada.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButtonAceptarDetallesLlamada.setText("Aceptar");
        jButtonAceptarDetallesLlamada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarDetallesLlamadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel33)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldMotivoDetallesLlamada)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(dateChooserComboFechaDetallesLlamada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtonAceptarDetallesLlamada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooserComboFechaDetallesLlamada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jTextFieldMotivoDetallesLlamada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAceptarDetallesLlamada)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setText("Posición Actual del Dependiente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelNombreYApellidosDependiente)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanelMapaDependiente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelDNIDependiente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelFechaNacimientoDependiente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelGeneroDependiente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelFechaAltaDependiente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelTipoDeDependiente))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonVerViviendasDependiente))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelNombreYApellidosDependiente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelDNIDependiente)
                    .addComponent(jLabel5)
                    .addComponent(jLabelFechaNacimientoDependiente)
                    .addComponent(jLabel7)
                    .addComponent(jLabelGeneroDependiente)
                    .addComponent(jLabel6)
                    .addComponent(jLabelFechaAltaDependiente)
                    .addComponent(jLabel4)
                    .addComponent(jButtonVerViviendasDependiente)
                    .addComponent(jLabelTipoDeDependiente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelMapaDependiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerViviendasDependienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerViviendasDependienteActionPerformed
        this.controlador.rellenaTablaViviendaDependiente(jTableViviendasDependiente, this.dependienteLlamada);
        if (this.dependienteLlamada.getPersonas().getVivienda() != null) 
        this.jTextFieldViviendaActual.setText(this.dependienteLlamada.getPersonas().getVivienda().getDireccion());
        this.controlador.abreDialog(jDialogViviendas, false);
    }//GEN-LAST:event_jButtonVerViviendasDependienteActionPerformed

    private void jTableViviendasDependienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableViviendasDependienteMouseClicked
        // Al hacer click en la tabla viviendas, coger los recursos de esa vivienda
        this.controlador.rellenaListRecursos(jListRecursos, (Vivienda) jTableViviendasDependiente.getValueAt(jTableViviendasDependiente.getSelectedRow(), 0));
    }//GEN-LAST:event_jTableViviendasDependienteMouseClicked

    private void jButtonAceptarDetallesLlamadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarDetallesLlamadaActionPerformed
        //TODO --- si se puede editar el historial de llamadas, hay que hacer o otro dialog o bien modificar este (jDialogDetallesLlamada)
        
        String motivo = jTextFieldMotivoDetallesLlamada.getText();
        String datos = jTextAreaDatosAsistenciaDetallesLlamada.getText();
        Asistencia asistencia = new Asistencia(dependienteLlamada, Calendar.getInstance().getTime(), motivo, datos);
        this.controlador.crearAsistencia(asistencia);
        DefaultTableModel dtm = (DefaultTableModel) tablaHistorialLlamadas.getModel();
        dtm.addRow(asistencia.getAsistenciaForTable());
        this.dispose();
    }//GEN-LAST:event_jButtonAceptarDetallesLlamadaActionPerformed

    
    public void abreMapa(Double longitud, Double latitud) {
        if(longitud != 0 && latitud != 0){
            jPanelMapaDependiente.removeAll();
        
            Browser browser = new Browser();
            BrowserView view = new BrowserView(browser);

            browser.loadHTML("<!DOCTYPE html>\n"
                + "<html>\n"
                + "  <head>\n"
                + " <style>\n"
                + "      /* Always set the map height explicitly to define the size of the div\n"
                + "       * element that contains the map. */\n"
                + "      #map {\n"
                + "        height: 100%;\n"
                + "      }\n"
                + "      /* Optional: Makes the sample page fill the window. */\n"
                + "      html, body {\n"
                + "        height: 100%;\n"
                + "        margin: 0;\n"
                + "        padding: 0;\n"
                + "      }\n"
                + "    </style>"
                + "  </head>\n"
                + "  <body>\n"
                + "    <div id=\"map\"></div>\n"
                + "    <script>\n"
                + "      function initMap() {\n"
                + "        var uluru = {lat: " + latitud + ", lng: " + longitud + "};\n"
                + "        var map = new google.maps.Map(document.getElementById('map'), {\n"
                + "          zoom: 17,\n"
                + "          center: uluru\n"
                + "        });\n"
                + "        var marker = new google.maps.Marker({\n"
                + "          position: uluru,\n"
                + "          map: map\n"
                + "        });\n"
                + "      }\n"
                + "    </script>\n"
                + "    <script async defer\n"
                + "    src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCibsAi2HsAAXYqwQBOMpKJUvec8ol2eKM&callback=initMap\">\n"
                + "    </script>\n"
                + "  </body>\n"
                + "</html>");
            
            
            jPanelMapaDependiente.add(view, BorderLayout.CENTER);
            
            jPanelMapaDependiente.updateUI();
            jPanelMapaDependiente.repaint();
            this.repaint();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserComboFechaDetallesLlamada;
    private javax.swing.JButton jButtonAceptarDetallesLlamada;
    private javax.swing.JButton jButtonVerViviendasDependiente;
    private javax.swing.JDialog jDialogViviendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDNIDependiente;
    private javax.swing.JLabel jLabelFechaAltaDependiente;
    private javax.swing.JLabel jLabelFechaNacimientoDependiente;
    private javax.swing.JLabel jLabelGeneroDependiente;
    private javax.swing.JLabel jLabelNombreYApellidosDependiente;
    private javax.swing.JLabel jLabelTipoDeDependiente;
    private javax.swing.JList<String> jListRecursos;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelMapaDependiente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTableContactosDependiente;
    private javax.swing.JTable jTableMedicacionDependiente;
    private javax.swing.JTable jTableViviendasDependiente;
    private javax.swing.JTextArea jTextAreaDatosAsistenciaDetallesLlamada;
    private javax.swing.JTextField jTextFieldMotivoDetallesLlamada;
    private javax.swing.JTextField jTextFieldViviendaActual;
    // End of variables declaration//GEN-END:variables
}