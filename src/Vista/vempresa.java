/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.cempresa;
import Modelo.mempresa;

/**
 *
 * @author SISTEMAS
 */
public class vempresa extends javax.swing.JFrame {

    /**
     * Creates new form cempresa
     */
    public vempresa() {
        initComponents();
        
        mempresa pros = new mempresa();
        cempresa cem = new cempresa();
        
        pros = cem.Buscarempresa(1);
        
        if (pros.getIdtb_empresa() != 0){
            txt_empresa.setText(""+pros.getNombre_empresa());
            txt_ruc.setText(""+pros.getRuc_empresa());
            txt_correo.setText(""+pros.getCorreo_empresa());
            txt_telefono.setText(""+pros.getTelefono_empresa());
            
            txt_empresa.setEnabled(false);
            txt_ruc.setEnabled(false);
            txt_correo.setEnabled(false);
            txt_telefono.setEnabled(false);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jFrame1 = new javax.swing.JFrame();
        popupMenu1 = new java.awt.PopupMenu();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jDialog1 = new javax.swing.JDialog();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        panel_nempresa = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lb_nombre = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_ruc = new javax.swing.JTextPane();
        lb_ruc = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_empresa = new javax.swing.JTextPane();
        lb_correo = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_correo = new javax.swing.JTextPane();
        lb_telefono = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt_telefono = new javax.swing.JTextPane();

        jMenu1.setText("jMenu1");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        popupMenu1.setLabel("popupMenu1");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu4.setText("jMenu4");

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panel_nempresa.setBackground(new java.awt.Color(204, 255, 255));
        panel_nempresa.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setText("DETALLES DE EMPRESA");

        lb_nombre.setText("Nombre empresa:");

        jScrollPane2.setViewportView(txt_ruc);

        lb_ruc.setText("RUC:");

        jScrollPane3.setViewportView(txt_empresa);

        lb_correo.setText("Correo:");

        jScrollPane4.setViewportView(txt_correo);

        lb_telefono.setText("Teléfono:");

        jScrollPane5.setViewportView(txt_telefono);

        javax.swing.GroupLayout panel_nempresaLayout = new javax.swing.GroupLayout(panel_nempresa);
        panel_nempresa.setLayout(panel_nempresaLayout);
        panel_nempresaLayout.setHorizontalGroup(
            panel_nempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_nempresaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panel_nempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(panel_nempresaLayout.createSequentialGroup()
                        .addGroup(panel_nempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_nombre)
                            .addComponent(lb_ruc)
                            .addComponent(lb_correo)
                            .addComponent(lb_telefono))
                        .addGap(18, 18, 18)
                        .addGroup(panel_nempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane5))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        panel_nempresaLayout.setVerticalGroup(
            panel_nempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_nempresaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panel_nempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_nempresaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(panel_nempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_nempresaLayout.createSequentialGroup()
                                .addComponent(lb_nombre)
                                .addGap(29, 29, 29)
                                .addComponent(lb_ruc))
                            .addGroup(panel_nempresaLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(lb_correo)))
                .addGap(18, 18, 18)
                .addGroup(panel_nempresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_telefono)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_nempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_nempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(vempresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vempresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vempresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vempresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vempresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lb_correo;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_ruc;
    private javax.swing.JLabel lb_telefono;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JPanel panel_nempresa;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextPane txt_correo;
    private javax.swing.JTextPane txt_empresa;
    private javax.swing.JTextPane txt_ruc;
    private javax.swing.JTextPane txt_telefono;
    // End of variables declaration//GEN-END:variables
}
