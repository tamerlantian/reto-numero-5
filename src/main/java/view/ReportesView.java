/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import controller.ReportesController;
import java.util.LinkedList;
import model.vo.PrimerInformeVo;
import model.vo.SegundoInformeVo;
import model.vo.TercerInformeVo;

/**
 *
 * @author sebastian
 */
public class ReportesView extends javax.swing.JFrame {

    ReportesController controlador;

    /**
     * Creates new form ReportesView
     */
    public ReportesView() {
        initComponents();
        this.controlador = new ReportesController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        getInforme1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        getInforme2 = new javax.swing.JButton();
        getInforme3 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        descripcion = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTabbedPane1.addTab("Informes", jScrollPane2);

        getInforme1.setText("Informe 1");
        getInforme1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getInforme1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        getInforme2.setText("Informe 2");
        getInforme2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getInforme2ActionPerformed(evt);
            }
        });

        getInforme3.setText("Informe 3");
        getInforme3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getInforme3ActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("AnjaliOldLipi", 1, 24)); // NOI18N
        label1.setText("CONSULTA A BASE DE DATOS PROYECTOS DE CONSTRUCCION");

        descripcion.setAlignment(java.awt.Label.CENTER);
        descripcion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        descripcion.setText("Descripcion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(getInforme1)
                .addGap(18, 18, 18)
                .addComponent(getInforme2)
                .addGap(18, 18, 18)
                .addComponent(getInforme3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getInforme1)
                    .addComponent(getInforme2)
                    .addComponent(getInforme3)
                    .addComponent(jButton2))
                .addGap(28, 28, 28)
                .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getInforme1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getInforme1ActionPerformed
        limpiar();
        descripcion.setText("Lideres de proyectos");
        LinkedList<PrimerInformeVo> lideres = this.controlador.primerInforme();
        String columns[] = {"id", "nombre", "apellido", "ciudad"};
        
        DefaultTableModel tbModel = agregarColumnas(columns);

        for (PrimerInformeVo lider : lideres) {
            String id = lider.getId();
            String ciudad = lider.getCiudad();
            String nombre = lider.getNombre();
            String apellido = lider.getApellido();
            String rows[] = {id, nombre, apellido, ciudad};
            tbModel.addRow(rows);
        }
    }//GEN-LAST:event_getInforme1ActionPerformed

    private void getInforme2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getInforme2ActionPerformed
        limpiar();
        descripcion.setText("Casas campestres ubicadas en Santa Marta, Barranquilla y Cartagena");
        LinkedList<SegundoInformeVo> proyectos = this.controlador.segundoInforme();
        String columns[] = {"id", "constructora", "numero habitaciones", "ciudad"};
        
        DefaultTableModel tbModel = agregarColumnas(columns);

        for (SegundoInformeVo proyecto : proyectos) {
            String id = proyecto.getProyectoId();
            String constructora = proyecto.getConstructora();
            String numeroHabitaciones = proyecto.getNumeroHabitaciones();
            String ciudad = proyecto.getCiudad();
            String rows[] = {id, constructora, numeroHabitaciones, ciudad};
            tbModel.addRow(rows);
        }

    }//GEN-LAST:event_getInforme2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void getInforme3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getInforme3ActionPerformed
        // TODO add your handling code here:
        limpiar();
        descripcion.setText("Compras hechas en Homecenter para proyectos en Salento");
        LinkedList<TercerInformeVo> compras = this.controlador.tercerInforme();
        String columns[] = {"id", "constructora", "banco"};
        
        DefaultTableModel tbModel = agregarColumnas(columns);

        for (TercerInformeVo compra : compras) {
            String id = compra.getId();
            String constructora = compra.getConstructora();
            String banco = compra.getBanco();
            String rows[] = {id, constructora, constructora, banco};
            tbModel.addRow(rows);
        }
    }//GEN-LAST:event_getInforme3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReportesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportesView().setVisible(true);
            }
        });
    }

    public void limpiar() {
        DefaultTableModel tbModel = (DefaultTableModel) jTable2.getModel();
        tbModel.setRowCount(0);
        tbModel.setColumnCount(0);
    }
    
    public DefaultTableModel agregarColumnas(String columns[]){
        DefaultTableModel tbModel = (DefaultTableModel) jTable2.getModel();
        for (String col : columns) {
            tbModel.addColumn(col);
        }
        
        return tbModel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label descripcion;
    private javax.swing.JButton getInforme1;
    private javax.swing.JButton getInforme2;
    private javax.swing.JButton getInforme3;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
