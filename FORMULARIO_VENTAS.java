/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package school_cash;

/**
 *
 * @author GUZZY
 */
public class FORMULARIO_VENTAS extends javax.swing.JFrame {

    /**
     * Creates new form FORMULARIO_VENTAS
     */
    public FORMULARIO_VENTAS() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CAMPO_FECHA = new javax.swing.JLabel();
        FECHA = new javax.swing.JTextField();
        NUM_PEDIDO = new javax.swing.JLabel();
        NUMERO_PEDIDO = new javax.swing.JTextField();
        IDENTIFICACION = new javax.swing.JLabel();
        NUMERO_DE_IDENTIFICACION = new javax.swing.JTextField();
        NOMBRE = new javax.swing.JLabel();
        NOMBRE_DEL_ROL = new javax.swing.JTextField();
        APELLIDO = new javax.swing.JLabel();
        APELLIDO_ROL = new javax.swing.JTextField();
        ROL = new javax.swing.JLabel();
        ROL_PERFIL = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        SALDO = new javax.swing.JLabel();
        SALDO_ROL = new javax.swing.JTextField();
        DESCRIPCION_VENTA_PANEL = new javax.swing.JScrollPane();
        DESCRIPCION_VENTA = new javax.swing.JTable();
        REGISTRAR_VENTA = new javax.swing.JButton();
        BOTON_CANCELAR = new javax.swing.JButton();
        TOTAL = new javax.swing.JLabel();
        TOTAL_VENTA = new javax.swing.JTextField();
        LOGO1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("MODULO DE VENTAS");
        jLabel1.setAlignmentX(0.5F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS PERFIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 10), new java.awt.Color(0, 0, 204))); // NOI18N

        CAMPO_FECHA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CAMPO_FECHA.setText("FECHA:");

        FECHA.setEditable(false);

        NUM_PEDIDO.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NUM_PEDIDO.setText("NUMERO DE PEDIDO:");

        NUMERO_PEDIDO.setEditable(false);
        NUMERO_PEDIDO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMERO_PEDIDOActionPerformed(evt);
            }
        });

        IDENTIFICACION.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        IDENTIFICACION.setText("IDENTIFICACION:");

        NUMERO_DE_IDENTIFICACION.setEditable(false);

        NOMBRE.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NOMBRE.setText("NOMBRE:");

        NOMBRE_DEL_ROL.setEditable(false);

        APELLIDO.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        APELLIDO.setText("APELLIDO:");

        APELLIDO_ROL.setEditable(false);

        ROL.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ROL.setText("ROL:");

        ROL_PERFIL.setEditable(false);

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));

        SALDO.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        SALDO.setText("SALDO:");

        SALDO_ROL.setEditable(false);

        DESCRIPCION_VENTA_PANEL.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESCRIPCION VENTA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 10), new java.awt.Color(0, 0, 153))); // NOI18N

        DESCRIPCION_VENTA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripcion", "Cantidad", "Valor Unidad", "Valor Total"
            }
        ));
        DESCRIPCION_VENTA.setColumnSelectionAllowed(true);
        DESCRIPCION_VENTA_PANEL.setViewportView(DESCRIPCION_VENTA);

        REGISTRAR_VENTA.setBackground(new java.awt.Color(0, 255, 0));
        REGISTRAR_VENTA.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        REGISTRAR_VENTA.setText("VENTA");
        REGISTRAR_VENTA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        REGISTRAR_VENTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTRAR_VENTAActionPerformed(evt);
            }
        });

        BOTON_CANCELAR.setBackground(new java.awt.Color(255, 0, 0));
        BOTON_CANCELAR.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BOTON_CANCELAR.setText("CANCELAR");

        TOTAL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TOTAL.setText("TOTAL: ");

        TOTAL_VENTA.setEditable(false);

        LOGO1.setIcon(new javax.swing.ImageIcon("C:\\Users\\GUZZY\\OneDrive\\Escritorio\\logo modi.png")); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("SCHOOL CASH MR. 2022");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(DESCRIPCION_VENTA_PANEL, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(REGISTRAR_VENTA, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TOTAL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TOTAL_VENTA, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(BOTON_CANCELAR)
                .addGap(0, 547, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(NOMBRE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NOMBRE_DEL_ROL, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(APELLIDO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(APELLIDO_ROL, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ROL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ROL_PERFIL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CAMPO_FECHA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(IDENTIFICACION)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NUMERO_DE_IDENTIFICACION, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(SALDO, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SALDO_ROL, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(NUM_PEDIDO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NUMERO_PEDIDO, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(LOGO1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NUM_PEDIDO)
                            .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CAMPO_FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NUMERO_PEDIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LOGO1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NUMERO_DE_IDENTIFICACION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDENTIFICACION)
                    .addComponent(SALDO)
                    .addComponent(SALDO_ROL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NOMBRE)
                    .addComponent(NOMBRE_DEL_ROL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(APELLIDO)
                    .addComponent(APELLIDO_ROL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ROL)
                    .addComponent(ROL_PERFIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DESCRIPCION_VENTA_PANEL, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REGISTRAR_VENTA, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TOTAL)
                    .addComponent(TOTAL_VENTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BOTON_CANCELAR, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NUMERO_PEDIDOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMERO_PEDIDOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NUMERO_PEDIDOActionPerformed

    private void REGISTRAR_VENTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTRAR_VENTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REGISTRAR_VENTAActionPerformed

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
            java.util.logging.Logger.getLogger(FORMULARIO_VENTAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORMULARIO_VENTAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORMULARIO_VENTAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORMULARIO_VENTAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORMULARIO_VENTAS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel APELLIDO;
    private javax.swing.JTextField APELLIDO_ROL;
    private javax.swing.JButton BOTON_CANCELAR;
    private javax.swing.JLabel CAMPO_FECHA;
    private javax.swing.JTable DESCRIPCION_VENTA;
    private javax.swing.JScrollPane DESCRIPCION_VENTA_PANEL;
    private javax.swing.JTextField FECHA;
    private javax.swing.JLabel IDENTIFICACION;
    private javax.swing.JLabel LOGO1;
    private javax.swing.JLabel NOMBRE;
    private javax.swing.JTextField NOMBRE_DEL_ROL;
    private javax.swing.JTextField NUMERO_DE_IDENTIFICACION;
    private javax.swing.JTextField NUMERO_PEDIDO;
    private javax.swing.JLabel NUM_PEDIDO;
    private javax.swing.JButton REGISTRAR_VENTA;
    private javax.swing.JLabel ROL;
    private javax.swing.JTextField ROL_PERFIL;
    private javax.swing.JLabel SALDO;
    private javax.swing.JTextField SALDO_ROL;
    private javax.swing.JLabel TOTAL;
    private javax.swing.JTextField TOTAL_VENTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
