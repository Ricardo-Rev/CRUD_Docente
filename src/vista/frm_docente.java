/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import modelo.Docente;
/**
 *
 * @author DELL
 */
public class frm_docente extends javax.swing.JFrame {
Docente docente = new Docente();
    /**
     * Creates new form frm_docente
     */
    public frm_docente() {
        initComponents();
        docente = new Docente();
        tbl_datos.setModel(docente.leer());
    }
    
    private void limpia_datos(){
        lbl_resultado_id.setText("");
        txt_nit.setText("");
        txt_nombres.setText("");
        txt_apellidos.setText("");
        txt_direccion.setText("");
        txt_telefono.setText("");
        txt_fn.setText("");
        txt_codigo_docente.setText("");
        txt_salario.setText("");
        txt_fi.setText("");
        txt_fr.setText("");
    }
    
    // Método para seleccionar datos de la tabla de clientes
    private void select_datos() {
        int fila = tbl_datos.getSelectedRow();
        lbl_resultado_id.setText(tbl_datos.getValueAt(fila, 0).toString());
        txt_nit.setText(tbl_datos.getValueAt(fila, 1).toString());
        txt_nombres.setText(tbl_datos.getValueAt(fila, 2).toString());
        txt_apellidos.setText(tbl_datos.getValueAt(fila, 3).toString());
        txt_direccion.setText(tbl_datos.getValueAt(fila, 4).toString());
        txt_telefono.setText(tbl_datos.getValueAt(fila, 5).toString());
        txt_fn.setText(tbl_datos.getValueAt(fila, 6).toString());
        txt_codigo_docente.setText(tbl_datos.getValueAt(fila, 7).toString());
        txt_salario.setText(tbl_datos.getValueAt(fila, 8).toString());
        txt_fi.setText(tbl_datos.getValueAt(fila, 9).toString());
        txt_fr.setText(tbl_datos.getValueAt(fila, 10).toString());
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
        lbl_titulo = new javax.swing.JLabel();
        lbl_nit = new javax.swing.JLabel();
        txt_nit = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        lbl_nombres = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        lbl_apellidos = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        lbl_direccion = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        txt_fn = new javax.swing.JTextField();
        lbl_fn = new javax.swing.JLabel();
        txt_codigo_docente = new javax.swing.JTextField();
        lbl_codigo_docente = new javax.swing.JLabel();
        txt_salario = new javax.swing.JTextField();
        lbl_salario = new javax.swing.JLabel();
        txt_fi = new javax.swing.JTextField();
        lbl_fi = new javax.swing.JLabel();
        txt_fr = new javax.swing.JTextField();
        lbl_fr = new javax.swing.JLabel();
        btn_agregar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_datos = new javax.swing.JTable();
        lbl_id = new javax.swing.JLabel();
        lbl_resultado_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_titulo.setBackground(new java.awt.Color(0, 204, 204));
        lbl_titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(0, 204, 204));
        lbl_titulo.setText("FORMULARIO DOCENTES");

        lbl_nit.setText("NIT");

        lbl_nombres.setText("NOMBRES");

        lbl_apellidos.setText("APELLIDOS");

        lbl_direccion.setText("DIRECCION");

        lbl_telefono.setText("TELEFONO");

        lbl_fn.setText("FECHA NACIMIENTO");

        lbl_codigo_docente.setText("CODIGO DOCENTE");

        lbl_salario.setText("SALARIO");

        lbl_fi.setText("FECHA INGRESO");

        lbl_fr.setText("FECHA REGISTRO");

        btn_agregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_agregar.setText("AGREGAR");
        btn_agregar.setBorder(new javax.swing.border.MatteBorder(null));
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        btn_actualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_actualizar.setText("ACTUALIZAR");
        btn_actualizar.setBorder(new javax.swing.border.MatteBorder(null));
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_borrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_borrar.setText("BORRAR");
        btn_borrar.setBorder(new javax.swing.border.MatteBorder(null));
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        tbl_datos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tbl_datos.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_datosMouseClicked(evt);
            }
        });
        tbl_datos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_datosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_datos);

        lbl_id.setText("ID");

        lbl_resultado_id.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nombres)
                    .addComponent(lbl_nit)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_direccion)
                            .addComponent(lbl_fn)
                            .addComponent(lbl_apellidos)
                            .addComponent(lbl_telefono))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_apellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(txt_nit)
                            .addComponent(txt_nombres)
                            .addComponent(txt_direccion)
                            .addComponent(txt_telefono)
                            .addComponent(txt_fn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_id)
                        .addGap(54, 54, 54)
                        .addComponent(lbl_resultado_id, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_codigo_docente)
                            .addComponent(lbl_salario))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_codigo_docente, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(txt_salario))
                        .addGap(79, 79, 79))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_fi)
                                    .addComponent(lbl_fr))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_fr, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(txt_fi))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(lbl_titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbl_titulo)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_resultado_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nit)
                    .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_codigo_docente)
                    .addComponent(txt_codigo_docente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombres)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_salario)
                    .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_fi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_fi))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_apellidos)
                        .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_fr)
                        .addComponent(txt_fr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_direccion)
                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_telefono)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_fn)
                            .addComponent(txt_fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
        docente = new Docente(0, txt_nit.getText(), txt_nombres.getText(), txt_apellidos.getText(), txt_direccion.getText(), txt_telefono.getText(), this.txt_fn.getText(), txt_codigo_docente.getText(), txt_salario.getText(), this.txt_fi.getText(), this.txt_fr.getText() );
        docente.agregar();
        tbl_datos.setModel(docente.leer());
        limpia_datos();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
        docente = new Docente(Integer.valueOf(lbl_resultado_id.getText()), txt_nit.getText(), txt_nombres.getText(), txt_apellidos.getText(), txt_direccion.getText(), txt_telefono.getText(), txt_fn.getText(), txt_codigo_docente.getText(), txt_salario.getText(), txt_fi.getText(), txt_fr.getText());
        docente.actualizar();
        tbl_datos.setModel(docente.leer());
        limpia_datos();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        // TODO add your handling code here:
        docente = new Docente();
        docente.setId(Integer.valueOf(lbl_resultado_id.getText()));
        docente.borrar();
        tbl_datos.setModel(docente.leer());
        limpia_datos();
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void tbl_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_datosMouseClicked
        // TODO add your handling code here:
        select_datos();
    }//GEN-LAST:event_tbl_datosMouseClicked

    private void tbl_datosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_datosKeyReleased
        // TODO add your handling code here:
        select_datos();
    }//GEN-LAST:event_tbl_datosKeyReleased

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
            java.util.logging.Logger.getLogger(frm_docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_docente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_docente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_codigo_docente;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_fi;
    private javax.swing.JLabel lbl_fn;
    private javax.swing.JLabel lbl_fr;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_nit;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_resultado_id;
    private javax.swing.JLabel lbl_salario;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTable tbl_datos;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_codigo_docente;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_fi;
    private javax.swing.JTextField txt_fn;
    private javax.swing.JTextField txt_fr;
    private javax.swing.JTextField txt_nit;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_salario;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
