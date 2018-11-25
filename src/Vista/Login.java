/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Login.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Poot
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private void Limpiar() {
        IngresaUsuario.setText("");
        IngresaPassword.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtUsuario = new javax.swing.JLabel();
        TxtContraseña = new javax.swing.JLabel();
        IngresaUsuario = new javax.swing.JTextField();
        IngresaPassword = new javax.swing.JPasswordField();
        BtSalirLogin = new javax.swing.JButton();
        BtIngresarLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TxtUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/Usuario.png"))); // NOI18N
        TxtUsuario.setToolTipText("Usuario");

        TxtContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/Contraseña.png"))); // NOI18N
        TxtContraseña.setToolTipText("Contraseña");

        IngresaUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        IngresaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresaUsuarioActionPerformed(evt);
            }
        });

        IngresaPassword.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        IngresaPassword.setText("Password");
        IngresaPassword.setToolTipText("");
        IngresaPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresaPasswordMouseClicked(evt);
            }
        });
        IngresaPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresaPasswordActionPerformed(evt);
            }
        });

        BtSalirLogin.setText("Salir");
        BtSalirLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtSalirLoginMouseClicked(evt);
            }
        });
        BtSalirLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalirLoginActionPerformed(evt);
            }
        });

        BtIngresarLogin.setText("Ingresar");
        BtIngresarLogin.setToolTipText("");
        BtIngresarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtIngresarLoginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setText("Iniciar Sesion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(BtSalirLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(283, 283, 283)
                .addComponent(BtIngresarLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IngresaUsuario)
                            .addComponent(IngresaPassword))
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(127, 127, 127))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(TxtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(52, 52, 52)
                        .addComponent(TxtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(IngresaUsuario)
                        .addGap(123, 123, 123)
                        .addComponent(IngresaPassword)
                        .addGap(99, 99, 99)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtSalirLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtIngresarLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresaUsuarioActionPerformed
        // TODO add your handling code here:
        IngresaUsuario.transferFocus();
    }//GEN-LAST:event_IngresaUsuarioActionPerformed

    private void BtSalirLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtSalirLoginMouseClicked
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_BtSalirLoginMouseClicked

    private void BtSalirLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalirLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtSalirLoginActionPerformed

    private void BtIngresarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtIngresarLoginActionPerformed
        // TODO add your handling code here:
        
        SQLUsuario modSql = new SQLUsuario();
        Usuario mod = new Usuario();
        
        String pass = new String(IngresaPassword.getPassword());
        
        if (!IngresaUsuario.getText().equals("") && !pass.equals("")) {
            
            
            mod.setUsuario(IngresaUsuario.getText());
            mod.setPassword(IngresaPassword.getText());
            
            if (modSql.Login(mod)) {
                
                
                Menu frmMenu = new Menu(mod);
                frmMenu.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
                Limpiar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar sus datos");
        }
        
    }//GEN-LAST:event_BtIngresarLoginActionPerformed

    private void IngresaPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresaPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresaPasswordActionPerformed

    private void IngresaPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresaPasswordMouseClicked
        // TODO add your handling code here:
        IngresaPassword.setText("");
    }//GEN-LAST:event_IngresaPasswordMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtIngresarLogin;
    private javax.swing.JButton BtSalirLogin;
    private javax.swing.JPasswordField IngresaPassword;
    private javax.swing.JTextField IngresaUsuario;
    private javax.swing.JLabel TxtContraseña;
    private javax.swing.JLabel TxtUsuario;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
