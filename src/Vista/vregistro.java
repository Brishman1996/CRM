/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.cempleados;
import Modelo.mempleado;
import javax.swing.JOptionPane;

/**
 *
 * @author SISTEMAS
 */
public class vregistro extends javax.swing.JFrame {

    /**
     * Creates new form vregistro
     */
    public vregistro() {
        initComponents();
        txt_nombre_completo.setText("");
        txt_correo.setText("");
        txt_telefono.setText("");
        txt_usuario.setText("");
        txt_contraseña.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_nempresa = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_usuario = new javax.swing.JTextPane();
        lb_ruc = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_nombre_completo = new javax.swing.JTextPane();
        lb_correo = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_correo = new javax.swing.JTextPane();
        lb_telefono = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt_telefono = new javax.swing.JTextPane();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        lb_ruc1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txt_contraseña = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel_nempresa.setBackground(new java.awt.Color(204, 204, 255));
        panel_nempresa.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setText("REGISTRAR USUARIO");

        lb_nombre.setText("Nombre Completo:");

        jScrollPane2.setViewportView(txt_usuario);

        lb_ruc.setText("Usuario:");

        jScrollPane3.setViewportView(txt_nombre_completo);

        lb_correo.setText("Correo:");

        jScrollPane4.setViewportView(txt_correo);

        lb_telefono.setText("Teléfono:");

        jScrollPane5.setViewportView(txt_telefono);

        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btncancelar.setText("CANCELAR");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        lb_ruc1.setText("Contraseña:");

        jScrollPane6.setViewportView(txt_contraseña);

        javax.swing.GroupLayout panel_nempresaLayout = new javax.swing.GroupLayout(panel_nempresa);
        panel_nempresa.setLayout(panel_nempresaLayout);
        panel_nempresaLayout.setHorizontalGroup(
            panel_nempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_nempresaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btncancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(panel_nempresaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panel_nempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(panel_nempresaLayout.createSequentialGroup()
                        .addGroup(panel_nempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_nombre)
                            .addComponent(lb_correo)
                            .addComponent(lb_telefono)
                            .addComponent(lb_ruc)
                            .addComponent(lb_ruc1))
                        .addGap(18, 18, 18)
                        .addGroup(panel_nempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane6))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_nempresaLayout.setVerticalGroup(
            panel_nempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_nempresaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(panel_nempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_nempresaLayout.createSequentialGroup()
                        .addGroup(panel_nempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_nombre)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(panel_nempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_correo))
                        .addGap(46, 46, 46)
                        .addComponent(lb_telefono))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(panel_nempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_ruc)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panel_nempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_nempresaLayout.createSequentialGroup()
                        .addComponent(lb_ruc1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(panel_nempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnguardar)
                            .addComponent(btncancelar))
                        .addGap(34, 34, 34))
                    .addGroup(panel_nempresaLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_nempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_nempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private String accion = "guardar";
    
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:

        if (txt_nombre_completo.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Nombre para el empleado");
            txt_nombre_completo.requestFocus();
            return;
        }
        if (txt_correo.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un apellido para el empleado");
            txt_correo.requestFocus();
            return;
        }

        if (txt_telefono.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un telefono para el empleado");
            txt_telefono.requestFocus();
            return;
        }

        if (txt_usuario.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un usuario para el empleado");
            txt_usuario.requestFocus();
            return;
        }
        
        if (txt_contraseña.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar una contraseña para el empleado");
            txt_contraseña.requestFocus();
            return;
        }

        mempleado dts = new mempleado();
        cempleados func = new cempleados();

        dts.setNombre_empleado(txt_nombre_completo.getText());
        dts.setCorreo_empleado(txt_correo.getText());
        dts.setTelefono_empleado(Integer.parseInt(txt_telefono.getText()));
        dts.setUsuario_empleado(txt_usuario.getText());
        dts.setContraseña(txt_contraseña.getText());

        if (accion.equals("guardar")) {
            if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "el usuario fue registrado satisfactoriamente");
                new vmenu().getContentPane().setVisible(true);
                dispose();
            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:

    }//GEN-LAST:event_btncancelarActionPerformed

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
            java.util.logging.Logger.getLogger(vregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vregistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lb_correo;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_ruc;
    private javax.swing.JLabel lb_ruc1;
    private javax.swing.JLabel lb_telefono;
    private javax.swing.JPanel panel_nempresa;
    private javax.swing.JTextPane txt_contraseña;
    private javax.swing.JTextPane txt_correo;
    private javax.swing.JTextPane txt_nombre_completo;
    private javax.swing.JTextPane txt_telefono;
    private javax.swing.JTextPane txt_usuario;
    // End of variables declaration//GEN-END:variables
}
