/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ap.main;

import Ap.db.Data;
import Ap.model.Asistencia;
import Ap.model.TMAsistencia;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.ComboBoxUI;

/**
 *
 * @author DaddyChary
 */
public class App extends javax.swing.JFrame {

    /**
     * Creates new form App
     */
    private Data data;
    private Asistencia asistencia;

    ;
    
    //Instanciamos los objetos en el constructor
    public App() {
        initComponents();
        try {
            this.data = new Data();
            actualizarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setTitle("Asistencia Perfecta");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Head = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FormularioAsis = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        app_txt_rut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        app_field_date = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        app_cbx_sala = new javax.swing.JComboBox<>();
        app_btn_save = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        app_btn_modify = new javax.swing.JButton();
        app_btn_delete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Filtros = new javax.swing.JPanel();
        app_txt_filters = new javax.swing.JTextField();
        app_btn_search = new javax.swing.JButton();
        app_btn_refresh = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        app_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setRequestFocusEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/graduado.png"))); // NOI18N
        jLabel4.setText("Administrador de Asistencia");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lista-de-verificacion (2).png"))); // NOI18N

        javax.swing.GroupLayout HeadLayout = new javax.swing.GroupLayout(Head);
        Head.setLayout(HeadLayout);
        HeadLayout.setHorizontalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18))
        );
        HeadLayout.setVerticalGroup(
            HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeadLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(HeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        FormularioAsis.setBorder(javax.swing.BorderFactory.createTitledBorder("Formulario De Asistencia"));

        jLabel1.setText("Rut (12345678-9)");

        app_txt_rut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                app_txt_rutActionPerformed(evt);
            }
        });

        jLabel2.setText("Fecha (2000-12-31)");

        app_field_date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("y-MM-d"))));
        app_field_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                app_field_dateActionPerformed(evt);
            }
        });

        jLabel3.setText("Sala");

        app_cbx_sala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "301", "302", "303", "304" }));
        app_cbx_sala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                app_cbx_salaActionPerformed(evt);
            }
        });

        app_btn_save.setText("Guardar");
        app_btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                app_btn_saveActionPerformed(evt);
            }
        });

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/seguro.png"))); // NOI18N

        app_btn_modify.setText("Modificar");
        app_btn_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                app_btn_modifyActionPerformed(evt);
            }
        });

        app_btn_delete.setText("Eliminar");
        app_btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                app_btn_deleteActionPerformed(evt);
            }
        });

        jLabel7.setText("Ingrese solo el Rut para eliminar");

        javax.swing.GroupLayout FormularioAsisLayout = new javax.swing.GroupLayout(FormularioAsis);
        FormularioAsis.setLayout(FormularioAsisLayout);
        FormularioAsisLayout.setHorizontalGroup(
            FormularioAsisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioAsisLayout.createSequentialGroup()
                .addGroup(FormularioAsisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(app_btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(app_btn_modify, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FormularioAsisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(FormularioAsisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(app_txt_rut)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(app_field_date)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(app_cbx_sala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(app_btn_delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                .addContainerGap())
        );
        FormularioAsisLayout.setVerticalGroup(
            FormularioAsisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormularioAsisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(app_txt_rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(app_field_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(app_cbx_sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(app_btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(app_btn_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(app_btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Filtros.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros"));

        app_txt_filters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                app_txt_filtersActionPerformed(evt);
            }
        });

        app_btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lupa.png"))); // NOI18N
        app_btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                app_btn_searchActionPerformed(evt);
            }
        });

        app_btn_refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/recargar (2).png"))); // NOI18N
        app_btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                app_btn_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FiltrosLayout = new javax.swing.GroupLayout(Filtros);
        Filtros.setLayout(FiltrosLayout);
        FiltrosLayout.setHorizontalGroup(
            FiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(app_txt_filters)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(app_btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(app_btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FiltrosLayout.setVerticalGroup(
            FiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(app_btn_refresh, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addGroup(FiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(app_txt_filters)
                        .addComponent(app_btn_search, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        app_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        app_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        app_table.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        app_table.setGridColor(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(app_table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(FormularioAsis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Filtros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(Head, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Head, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(FormularioAsis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void app_btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_app_btn_searchActionPerformed
        // TODO add your handling code here:
        try {
            String filter = app_txt_filters.getText();
            chargeTableFilters(filter);
        } catch (SQLException ex) {
            System.out.println("Error al filtrar la lista de datos");
        }

        limpiarFiltro();

    }//GEN-LAST:event_app_btn_searchActionPerformed

    private void app_btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_app_btn_saveActionPerformed
        // TODO add your handling code here:
        Asistencia asistencia = new Asistencia();
        try {
            String rut = app_txt_rut.getText();
            String txtFecha = app_field_date.getText();
            String sala = app_cbx_sala.getSelectedItem().toString();
            if (rut.isEmpty() || txtFecha.isEmpty() || sala.isEmpty()) {
                JOptionPane.showConfirmDialog(null, "Error: Rellene todos los campos", "Aceptar", JOptionPane.DEFAULT_OPTION);
            } else {
                asistencia.setRut(rut);
                asistencia.setFecha(LocalDate.parse(txtFecha));
                asistencia.setSala(sala);

                data.agregarAsistencia(asistencia);
                actualizarTabla();
                limpiarCampos();
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error inesperado", "Aceptar", JOptionPane.DEFAULT_OPTION);
        }


    }//GEN-LAST:event_app_btn_saveActionPerformed

    private void app_txt_rutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_app_txt_rutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_app_txt_rutActionPerformed

    private void app_field_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_app_field_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_app_field_dateActionPerformed

    private void app_cbx_salaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_app_cbx_salaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_app_cbx_salaActionPerformed

    private void app_btn_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_app_btn_modifyActionPerformed
        // TODO add your handling code here:

        try {
            String rut = app_txt_rut.getText();
            String txtFecha = app_field_date.getText();
            String sala = app_cbx_sala.getSelectedItem().toString();

            if (rut.isEmpty() || txtFecha.isEmpty()) {
                JOptionPane.showConfirmDialog(null, "Error: Rellene todos los campos", "Aceptar", JOptionPane.DEFAULT_OPTION);
            } else {
                Asistencia asistencia = new Asistencia();
                asistencia.setRut(rut);
                asistencia.setFecha(LocalDate.parse(txtFecha));
                asistencia.setSala(sala);
                data.updateAsistencia(asistencia);
                actualizarTabla();
                limpiarCampos();
            }
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error inesperado", "Aceptar", JOptionPane.DEFAULT_OPTION);
        }

    }//GEN-LAST:event_app_btn_modifyActionPerformed

    private void app_btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_app_btn_deleteActionPerformed
        // TODO add your handling code here:
        Asistencia asistencia = new Asistencia();
        asistencia.setRut(app_txt_rut.getText());
        String rut = app_txt_rut.getText().trim();
        if (!rut.isEmpty()) {
            asistencia.setRut(rut);
            try {
                data.deleteAsistencia(asistencia);
                actualizarTabla();
                limpiarCampos();
            } catch (SQLException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showConfirmDialog(null, "Error: El campo Rut no puede estar vacío", "Aceptar", JOptionPane.DEFAULT_OPTION);
        }

    }//GEN-LAST:event_app_btn_deleteActionPerformed

    private void app_txt_filtersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_app_txt_filtersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_app_txt_filtersActionPerformed

    private void app_btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_app_btn_refreshActionPerformed
        try {
            // TODO add your handling code here:
            actualizarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_app_btn_refreshActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Filtros;
    private javax.swing.JPanel FormularioAsis;
    private javax.swing.JPanel Head;
    private javax.swing.JButton app_btn_delete;
    private javax.swing.JButton app_btn_modify;
    private javax.swing.JButton app_btn_refresh;
    private javax.swing.JButton app_btn_save;
    private javax.swing.JButton app_btn_search;
    private javax.swing.JComboBox<String> app_cbx_sala;
    private javax.swing.JFormattedTextField app_field_date;
    private javax.swing.JTable app_table;
    private javax.swing.JTextField app_txt_filters;
    private javax.swing.JTextField app_txt_rut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void actualizarTabla() throws SQLException {
        List<Asistencia> lista = data.getAll();
        TMAsistencia tmAsistencia = new TMAsistencia(lista);
        app_table.setModel(tmAsistencia);

    }

    public void limpiarCampos() {
        app_txt_rut.setText("");
        app_field_date.setText("");
    }

    public void limpiarFiltro() {
        app_txt_filters.setText("");
    }

    private void chargeTableFilters(String filter) throws SQLException {
        List<Asistencia> lista = data.getOne(filter);
        TMAsistencia tmAsistencia = new TMAsistencia(lista);
        app_table.setModel(tmAsistencia);
    }

}
