/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.conexion.Conexion;

/**
 *
 * @author vesprada
 */
public class JFramePantallaPrincipal extends javax.swing.JFrame {

    private Controlador controlador;
    private Conexion conexion;
    
    public JFramePantallaPrincipal(Controlador controlador, Conexion conexion){
        initComponents();
        this.controlador = controlador;
        this.conexion = conexion;
        
        setUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPanePrincipal = new javax.swing.JTabbedPane();
        jPanelAgenda = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableAgenda = new javax.swing.JTable();
        jPanelHistorialLlamadas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableHistorialLlamadas = new javax.swing.JTable();
        jPanelDependientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaDependientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableAgenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTableAgenda);

        javax.swing.GroupLayout jPanelAgendaLayout = new javax.swing.GroupLayout(jPanelAgenda);
        jPanelAgenda.setLayout(jPanelAgendaLayout);
        jPanelAgendaLayout.setHorizontalGroup(
            jPanelAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelAgendaLayout.setVerticalGroup(
            jPanelAgendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAgendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPanePrincipal.addTab("Agenda", jPanelAgenda);

        jTableHistorialLlamadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableHistorialLlamadas);

        javax.swing.GroupLayout jPanelHistorialLlamadasLayout = new javax.swing.GroupLayout(jPanelHistorialLlamadas);
        jPanelHistorialLlamadas.setLayout(jPanelHistorialLlamadasLayout);
        jPanelHistorialLlamadasLayout.setHorizontalGroup(
            jPanelHistorialLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHistorialLlamadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelHistorialLlamadasLayout.setVerticalGroup(
            jPanelHistorialLlamadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHistorialLlamadasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPanePrincipal.addTab("Historial Llamadas", jPanelHistorialLlamadas);

        jTableListaDependientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableListaDependientes);

        javax.swing.GroupLayout jPanelDependientesLayout = new javax.swing.GroupLayout(jPanelDependientes);
        jPanelDependientes.setLayout(jPanelDependientesLayout);
        jPanelDependientesLayout.setHorizontalGroup(
            jPanelDependientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDependientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 779, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelDependientesLayout.setVerticalGroup(
            jPanelDependientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDependientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jTabbedPanePrincipal.addTab("Dependientes", jPanelDependientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPanePrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPanePrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelAgenda;
    private javax.swing.JPanel jPanelDependientes;
    private javax.swing.JPanel jPanelHistorialLlamadas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPanePrincipal;
    private javax.swing.JTable jTableAgenda;
    private javax.swing.JTable jTableHistorialLlamadas;
    private javax.swing.JTable jTableListaDependientes;
    // End of variables declaration//GEN-END:variables

    private void setUI() {
        try {
            this.controlador.rellenaTablaAgenda(this.jTableAgenda);
            this.controlador.rellenaTablaHistorialLlamadas(this.jTableHistorialLlamadas);
            this.controlador.rellenaTablaListaDependiente(this.jTableListaDependientes);
        } catch (SQLException ex) {
            Logger.getLogger(JFramePantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
