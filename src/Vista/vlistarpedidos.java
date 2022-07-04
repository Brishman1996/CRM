/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import Controlador.cpedidos;
import Modelo.mpedidos;
import java.sql.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SISTEMAS
 */
public class vlistarpedidos extends javax.swing.JFrame {

    /**
     * Creates new form vlistarpedidos
     */
    cpedidos func = new cpedidos();
    mpedidos mp = new mpedidos();
    
    public vlistarpedidos() {
        initComponents();
        
        DefaultTableModel modelo;
        modelo = func.mostrarPedidos();
        
        tablalistadopedido.setModel(modelo);
        txt_idpedido.setText("");
        txt_idpedido.setVisible(false);
        txtnombrecliente.setEnabled(false);
        txtnombrecliente.setText("");
        dcfecha_entrega.setEnabled(false);
        dcfecha_envio.setEnabled(false);
        cbo_formaenvio.setEnabled(false);
        cbo_estado.setEnabled(false);
        txtdireccion.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel12 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablalistadopedido = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        lb_telefono1 = new javax.swing.JLabel();
        dcfecha_entrega = new com.toedter.calendar.JDateChooser();
        lb_telefono2 = new javax.swing.JLabel();
        dcfecha_envio = new com.toedter.calendar.JDateChooser();
        lb_telefono3 = new javax.swing.JLabel();
        cbo_formaenvio = new javax.swing.JComboBox<>();
        lb_telefono4 = new javax.swing.JLabel();
        cbo_estado = new javax.swing.JComboBox<>();
        lb_telefono5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdireccion = new javax.swing.JTextArea();
        txt_idpedido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombrecliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel12.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 330, 10));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("PEDIDOS");
        jLabel21.setOpaque(true);
        jPanel12.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 330, 30));

        tablalistadopedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Telefono"
            }
        ));
        tablalistadopedido.setGridColor(new java.awt.Color(255, 255, 255));
        tablalistadopedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablalistadopedidoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablalistadopedido);

        btnEditar.setText("Actualizar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        lb_telefono1.setText("Fecha de entrega:");

        dcfecha_entrega.setDateFormatString("yyyy-MM-dd H:mm:ss");

        lb_telefono2.setText("Fecha de envio:");

        dcfecha_envio.setDateFormatString("yyyy-MM-dd H:mm:ss");

        lb_telefono3.setText("Forma de envio:");

        cbo_formaenvio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Delivery", "Recojo en local" }));
        cbo_formaenvio.setToolTipText("");

        lb_telefono4.setText("Estado:");

        cbo_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Enviado", "Cancelado", "Entregado" }));

        lb_telefono5.setText("Direccion:");

        txtdireccion.setColumns(20);
        txtdireccion.setRows(5);
        jScrollPane1.setViewportView(txtdireccion);

        jLabel1.setText("Datos del pedido");

        jLabel2.setText("Nombre Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_idpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtnombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_telefono3)
                                    .addComponent(lb_telefono2)
                                    .addComponent(lb_telefono4)
                                    .addComponent(lb_telefono5))
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lb_telefono1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dcfecha_entrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(dcfecha_envio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbo_formaenvio, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbo_estado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(192, 192, 192)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(btnEditar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_idpedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lb_telefono2))
                            .addComponent(dcfecha_envio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbo_formaenvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_telefono3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_telefono4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_telefono5)
                                .addGap(46, 46, 46)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_telefono1)
                    .addComponent(dcfecha_entrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnEditar)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        if ("".equals(txt_idpedido.getText())){
            JOptionPane.showMessageDialog(null,"Selecciona una fila");
        }else{
            if (!"".equals(cbo_estado.getSelectedIndex())){
                
                String forma_envio = "";
                if (!"".equals(cbo_formaenvio.getSelectedIndex())){
                    int seleccionadoE = cbo_formaenvio.getSelectedIndex();
                    forma_envio = cbo_formaenvio.getItemAt(seleccionadoE);
                }
                
                
                int seleccionadoEs = cbo_estado.getSelectedIndex();
                String estado_pedido = cbo_estado.getItemAt(seleccionadoEs);
                
                
                Date fentrega = null;
                if (dcfecha_entrega.getDate() != null){ 
                    Calendar cal = dcfecha_entrega.getCalendar();
                    int d,m,a;
                    d=cal.get(Calendar.DAY_OF_MONTH);
                    m=cal.get(Calendar.MONTH);
                    a=cal.get(Calendar.YEAR) - 1900;
                    cal.set(a, m, d);
                    fentrega = new Date(a,m,d);
                }
                
                
                Date fenvio = null;
                if (dcfecha_envio.getDate() != null){ 
                    Calendar cal2;
                    cal2 = dcfecha_envio.getCalendar();
                    int d2,m2,a2;
                    d2=cal2.get(Calendar.DAY_OF_MONTH);
                    m2=cal2.get(Calendar.MONTH);
                    a2=cal2.get(Calendar.YEAR) - 1900;
                    cal2.set(a2, m2, d2);
                    fenvio = new Date(a2,m2,d2);
                }
                
                mp.setFecha_envio(fenvio);
                mp.setFecha_entrega(fentrega);
                mp.setForma_envio(forma_envio);
                mp.setEstado_pedido(estado_pedido);
                mp.setDireccion_envio(txtdireccion.getText());
                mp.setIdtb_pedidos(Integer.parseInt(txt_idpedido.getText()));
                func.RegistrarVenta(mp);
                JOptionPane.showMessageDialog(null,"Se registro la venta");
                
            }else{
                JOptionPane.showMessageDialog(null,"Los campos estan vacios");
            }
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void tablalistadopedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablalistadopedidoMouseClicked
        // TODO add your handling code here:
        int fila = tablalistadopedido.rowAtPoint(evt.getPoint());
        txt_idpedido.setText(tablalistadopedido.getValueAt(fila, 0).toString());
        txtnombrecliente.setText(tablalistadopedido.getValueAt(fila, 1).toString());
        dcfecha_entrega.setEnabled(true);
        dcfecha_envio.setEnabled(true);
        cbo_formaenvio.setEnabled(true);
        cbo_estado.setEnabled(true);
        txtdireccion.setEnabled(true);
    }//GEN-LAST:event_tablalistadopedidoMouseClicked

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
            java.util.logging.Logger.getLogger(vlistarpedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vlistarpedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vlistarpedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vlistarpedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vlistarpedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JComboBox<String> cbo_estado;
    private javax.swing.JComboBox<String> cbo_formaenvio;
    private com.toedter.calendar.JDateChooser dcfecha_entrega;
    private com.toedter.calendar.JDateChooser dcfecha_envio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lb_telefono1;
    private javax.swing.JLabel lb_telefono2;
    private javax.swing.JLabel lb_telefono3;
    private javax.swing.JLabel lb_telefono4;
    private javax.swing.JLabel lb_telefono5;
    private javax.swing.JTable tablalistadopedido;
    private javax.swing.JTextField txt_idpedido;
    private javax.swing.JTextArea txtdireccion;
    private javax.swing.JTextField txtnombrecliente;
    // End of variables declaration//GEN-END:variables
}
