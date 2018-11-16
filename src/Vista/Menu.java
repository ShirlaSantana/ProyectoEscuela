/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Login.Usuario;



/**
 *
 * @author Daniel Poot
 */
public class Menu extends javax.swing.JFrame {
    public static Registros VRegistro;

    Usuario mod;
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }
    
    public Menu(Usuario mod)
    {
        initComponents();
        setLocationRelativeTo(null);
        this.mod = mod;
        if(mod.getIdTipo() == 1)
        {
            
            
            
        }else if(mod.getIdTipo() == 2)
        {
            
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

        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        MenuLb = new javax.swing.JLabel();
        BtRegistrarMenu = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        BtModificarMenu = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        BtEliminarMenu = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        MenuLb.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        MenuLb.setText("Menu");

        BtRegistrarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/Registrar.png"))); // NOI18N
        BtRegistrarMenu.setText("Registrar");
        BtRegistrarMenu.setBorder(null);
        BtRegistrarMenu.setBorderPainted(false);
        BtRegistrarMenu.setContentAreaFilled(false);
        BtRegistrarMenu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/RegistrarP.png"))); // NOI18N
        BtRegistrarMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/RegistrarS.png"))); // NOI18N
        BtRegistrarMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtRegistrarMenuMouseClicked(evt);
            }
        });

        jButton5.setText("Consultas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        BtModificarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/Modificar.png"))); // NOI18N
        BtModificarMenu.setText("Modificar");
        BtModificarMenu.setBorder(null);
        BtModificarMenu.setBorderPainted(false);
        BtModificarMenu.setContentAreaFilled(false);
        BtModificarMenu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/ModificarP.png"))); // NOI18N
        BtModificarMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/ModificarS.png"))); // NOI18N

        jButton7.setText("Asitenicas");

        BtEliminarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/Eliminar.png"))); // NOI18N
        BtEliminarMenu.setText("Eliminar");
        BtEliminarMenu.setBorder(null);
        BtEliminarMenu.setBorderPainted(false);
        BtEliminarMenu.setContentAreaFilled(false);
        BtEliminarMenu.setMaximumSize(new java.awt.Dimension(96, 96));
        BtEliminarMenu.setMinimumSize(new java.awt.Dimension(96, 96));
        BtEliminarMenu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/EliminarP.png"))); // NOI18N
        BtEliminarMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/EliminarS.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtRegistrarMenu)
                                .addGap(64, 64, 64)
                                .addComponent(BtModificarMenu)
                                .addGap(78, 78, 78)
                                .addComponent(BtEliminarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(MenuLb)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(0, 84, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(MenuLb)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtRegistrarMenu)
                    .addComponent(BtModificarMenu)
                    .addComponent(BtEliminarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(114, 114, 114)
                .addComponent(jButton7)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void BtRegistrarMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtRegistrarMenuMouseClicked
        // TODO add your handling code here:
        if(VRegistro == null)
        {
            Registros.VMenu = null;
            this.dispose();
            VRegistro = new Registros(mod);
            VRegistro.setVisible(true);
        }
        
    }//GEN-LAST:event_BtRegistrarMenuMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtEliminarMenu;
    private javax.swing.JButton BtModificarMenu;
    private javax.swing.JButton BtRegistrarMenu;
    private javax.swing.JLabel MenuLb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    // End of variables declaration//GEN-END:variables
}