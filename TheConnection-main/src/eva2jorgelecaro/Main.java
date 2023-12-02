package eva2jorgelecaro;

import db.Data;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Libro;
import model.tm.TMLibro;

public class Main extends javax.swing.JFrame {

    private Data data;
    private TMLibro tmlibro;

    public Main() {
        initComponents();
        menu_De_Insumos.setSize(1100, 800);
        
        try {
            data = new Data("jorge");
        } catch (SQLException ex) {
            System.out.println("[*] Error en la conexion a base de datos" + ex.getMessage());
        }
        actualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu_De_Insumos = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panel_Main_cuerpo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_menu_De_Insumos_nombreLibro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_menu_De_Insumos_autorLibro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFormatted_menu_De_Insumos_fechaPublicacion = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_menu_De_Insumos_Genero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_menu_De_Insumos_numeroPaginas = new javax.swing.JTextField();
        TM_table = new javax.swing.JScrollPane();
        TM_menu_De_Insumos_table = new javax.swing.JTable();
        btn_menu_De_Insumos_Guardar = new javax.swing.JButton();
        btn_menu_De_Insumos_Limpiar = new javax.swing.JButton();
        btn_menu_De_Insumos_Cerrar_Sesion = new javax.swing.JButton();
        btn_menu_De_Insumos_Actualizar = new javax.swing.JButton();
        panel_Main_Principal = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_Main_Usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Main_Contraseña = new javax.swing.JTextField();
        btn_Main_Ingresar = new javax.swing.JButton();

        menu_De_Insumos.setTitle("MENÚ DE INSUMOS");

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("INVENTARIO DE LIBROS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        panel_Main_cuerpo.setBackground(new java.awt.Color(0, 204, 204));
        panel_Main_cuerpo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("REGISTRO DE LIBRO");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jLabel5.setOpaque(true);

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nombre del Libro:");

        txt_menu_De_Insumos_nombreLibro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_menu_De_Insumos_nombreLibro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Autor del Libro:");

        txt_menu_De_Insumos_autorLibro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_menu_De_Insumos_autorLibro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Fecha de Publicación:");

        txtFormatted_menu_De_Insumos_fechaPublicacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtFormatted_menu_De_Insumos_fechaPublicacion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyy-M-d"))));
        txtFormatted_menu_De_Insumos_fechaPublicacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFormatted_menu_De_Insumos_fechaPublicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFormatted_menu_De_Insumos_fechaPublicacionActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Género:");

        txt_menu_De_Insumos_Genero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_menu_De_Insumos_Genero.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel10.setFont(new java.awt.Font("Segoe UI Historic", 3, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Número de Páginas:");

        txt_menu_De_Insumos_numeroPaginas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_menu_De_Insumos_numeroPaginas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        TM_menu_De_Insumos_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TM_table.setViewportView(TM_menu_De_Insumos_table);

        btn_menu_De_Insumos_Guardar.setBackground(new java.awt.Color(255, 102, 0));
        btn_menu_De_Insumos_Guardar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_menu_De_Insumos_Guardar.setText("GUARDAR");
        btn_menu_De_Insumos_Guardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn_menu_De_Insumos_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_De_Insumos_GuardarActionPerformed(evt);
            }
        });

        btn_menu_De_Insumos_Limpiar.setBackground(new java.awt.Color(255, 102, 0));
        btn_menu_De_Insumos_Limpiar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_menu_De_Insumos_Limpiar.setText("LIMPIAR");
        btn_menu_De_Insumos_Limpiar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn_menu_De_Insumos_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_De_Insumos_LimpiarActionPerformed(evt);
            }
        });

        btn_menu_De_Insumos_Cerrar_Sesion.setBackground(new java.awt.Color(255, 102, 0));
        btn_menu_De_Insumos_Cerrar_Sesion.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_menu_De_Insumos_Cerrar_Sesion.setText("CERRAR SESIÓN");
        btn_menu_De_Insumos_Cerrar_Sesion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn_menu_De_Insumos_Cerrar_Sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_De_Insumos_Cerrar_SesionActionPerformed(evt);
            }
        });

        btn_menu_De_Insumos_Actualizar.setBackground(new java.awt.Color(255, 102, 0));
        btn_menu_De_Insumos_Actualizar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_menu_De_Insumos_Actualizar.setText("ACTUALIZAR");
        btn_menu_De_Insumos_Actualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn_menu_De_Insumos_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_De_Insumos_ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_Main_cuerpoLayout = new javax.swing.GroupLayout(panel_Main_cuerpo);
        panel_Main_cuerpo.setLayout(panel_Main_cuerpoLayout);
        panel_Main_cuerpoLayout.setHorizontalGroup(
            panel_Main_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Main_cuerpoLayout.createSequentialGroup()
                .addGroup(panel_Main_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Main_cuerpoLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btn_menu_De_Insumos_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btn_menu_De_Insumos_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_Main_cuerpoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panel_Main_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_Main_cuerpoLayout.createSequentialGroup()
                                .addGroup(panel_Main_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_Main_cuerpoLayout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(panel_Main_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Main_cuerpoLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panel_Main_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_Main_cuerpoLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(panel_Main_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panel_Main_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txt_menu_De_Insumos_nombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_menu_De_Insumos_autorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtFormatted_menu_De_Insumos_fechaPublicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(7, 7, 7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Main_cuerpoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_menu_De_Insumos_numeroPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel_Main_cuerpoLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_menu_De_Insumos_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_Main_cuerpoLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(btn_menu_De_Insumos_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_Main_cuerpoLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btn_menu_De_Insumos_Cerrar_Sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TM_table, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_Main_cuerpoLayout.setVerticalGroup(
            panel_Main_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Main_cuerpoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_Main_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Main_cuerpoLayout.createSequentialGroup()
                        .addComponent(TM_table, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panel_Main_cuerpoLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(panel_Main_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_menu_De_Insumos_nombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_Main_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_menu_De_Insumos_autorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_Main_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFormatted_menu_De_Insumos_fechaPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_Main_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_menu_De_Insumos_numeroPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_Main_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_menu_De_Insumos_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(panel_Main_cuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_menu_De_Insumos_Guardar)
                            .addComponent(btn_menu_De_Insumos_Limpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_menu_De_Insumos_Actualizar)
                        .addGap(27, 27, 27)
                        .addComponent(btn_menu_De_Insumos_Cerrar_Sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_Main_cuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_Main_cuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menu_De_InsumosLayout = new javax.swing.GroupLayout(menu_De_Insumos.getContentPane());
        menu_De_Insumos.getContentPane().setLayout(menu_De_InsumosLayout);
        menu_De_InsumosLayout.setHorizontalGroup(
            menu_De_InsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_De_InsumosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        menu_De_InsumosLayout.setVerticalGroup(
            menu_De_InsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_De_InsumosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BIENVENIDO A LITERARIA");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        panel2.setBackground(new java.awt.Color(255, 153, 0));
        panel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jLabel1.setText("LOGIN DE USUARIO");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(236, 236, 236))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("USUARIO:");

        txt_Main_Usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Main_Usuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txt_Main_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Main_UsuarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("CONTRASEÑA:");

        txt_Main_Contraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Main_Contraseña.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        btn_Main_Ingresar.setBackground(new java.awt.Color(255, 153, 0));
        btn_Main_Ingresar.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        btn_Main_Ingresar.setText("INGRESAR");
        btn_Main_Ingresar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btn_Main_Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Main_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Main_IngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(51, 51, 51))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(34, 34, 34)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_Main_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Main_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(173, 173, 173))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_Main_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_Main_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Main_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(btn_Main_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout panel_Main_PrincipalLayout = new javax.swing.GroupLayout(panel_Main_Principal);
        panel_Main_Principal.setLayout(panel_Main_PrincipalLayout);
        panel_Main_PrincipalLayout.setHorizontalGroup(
            panel_Main_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Main_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Main_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_Main_PrincipalLayout.setVerticalGroup(
            panel_Main_PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Main_PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Main_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Main_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Main_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Main_IngresarActionPerformed
        String usuario = txt_Main_Usuario.getText();
        String contraseña = txt_Main_Contraseña.getText();

        if (usuario.equals("Amanda") && contraseña.equals("David")) {
            JOptionPane.showMessageDialog(this, "Credenciales Correctas: Bienvenid@ a Literaria!!");
            menu_De_Insumos.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "El Nombre de usuario no existe o la Contraseña es incorrecta!!");
        }
    }//GEN-LAST:event_btn_Main_IngresarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setVisible(true);

    }//GEN-LAST:event_formWindowClosing

    private void btn_menu_De_Insumos_Cerrar_SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_De_Insumos_Cerrar_SesionActionPerformed
        menu_De_Insumos.setVisible(false);
        this.setVisible(true);
    }//GEN-LAST:event_btn_menu_De_Insumos_Cerrar_SesionActionPerformed

    private void txt_Main_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Main_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Main_UsuarioActionPerformed

    private void btn_menu_De_Insumos_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_De_Insumos_GuardarActionPerformed
        try {
            Libro libro = new Libro();
            String nombreLibro = txt_menu_De_Insumos_nombreLibro.getText();
            String autor = txt_menu_De_Insumos_autorLibro.getText();
            String fechaPublicacion = txtFormatted_menu_De_Insumos_fechaPublicacion.getText();
            String numerosPaginas = txt_menu_De_Insumos_numeroPaginas.getText();
            String generoLibro = txt_menu_De_Insumos_Genero.getText();

            libro.setNombre(nombreLibro);
            libro.setAutor(autor);
            libro.setFechaPublicacion(LocalDate.parse(fechaPublicacion));
            libro.setNumeroDePaginas(numerosPaginas);
            libro.setGenero(generoLibro);

            data.agregarLibro(libro);
            JOptionPane.showMessageDialog(this, "Libro agregado a la biblioteca con éxito!!");
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_menu_De_Insumos_GuardarActionPerformed

    private void btn_menu_De_Insumos_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_De_Insumos_LimpiarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btn_menu_De_Insumos_LimpiarActionPerformed

    private void btn_menu_De_Insumos_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_De_Insumos_ActualizarActionPerformed
        actualizarTabla();

    }//GEN-LAST:event_btn_menu_De_Insumos_ActualizarActionPerformed

    private void txtFormatted_menu_De_Insumos_fechaPublicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFormatted_menu_De_Insumos_fechaPublicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFormatted_menu_De_Insumos_fechaPublicacionActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TM_menu_De_Insumos_table;
    private javax.swing.JScrollPane TM_table;
    private javax.swing.JButton btn_Main_Ingresar;
    private javax.swing.JButton btn_menu_De_Insumos_Actualizar;
    private javax.swing.JButton btn_menu_De_Insumos_Cerrar_Sesion;
    private javax.swing.JButton btn_menu_De_Insumos_Guardar;
    private javax.swing.JButton btn_menu_De_Insumos_Limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JFrame menu_De_Insumos;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel_Main_Principal;
    private javax.swing.JPanel panel_Main_cuerpo;
    private javax.swing.JFormattedTextField txtFormatted_menu_De_Insumos_fechaPublicacion;
    private javax.swing.JTextField txt_Main_Contraseña;
    private javax.swing.JTextField txt_Main_Usuario;
    private javax.swing.JTextField txt_menu_De_Insumos_Genero;
    private javax.swing.JTextField txt_menu_De_Insumos_autorLibro;
    private javax.swing.JTextField txt_menu_De_Insumos_nombreLibro;
    private javax.swing.JTextField txt_menu_De_Insumos_numeroPaginas;
    // End of variables declaration//GEN-END:variables
public void limpiarCampos() {
        txt_menu_De_Insumos_nombreLibro.setText("");
        txt_menu_De_Insumos_autorLibro.setText("");
        txtFormatted_menu_De_Insumos_fechaPublicacion.setText("");
        txt_menu_De_Insumos_numeroPaginas.setText("");
        txt_menu_De_Insumos_Genero.setText("");
    }

    public void actualizarTabla() {
        try {
            tmlibro = new TMLibro(data.getListaDeLibros());
            TM_menu_De_Insumos_table.setModel(tmlibro);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
