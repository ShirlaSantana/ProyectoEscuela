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
public class VAsistencia extends javax.swing.JFrame {
    public static RAsistenciaAlumno VRasistenciaA;
    public static RAsistenciaMaestro VRasistenciaM;
    public static Menu VMenuAsistencia;
    Usuario Mod;
    /**
     * Creates new form Asistencia
     */
    public VAsistencia() {
        initComponents();
    }
    
    public VAsistencia(Usuario Mod) {
        initComponents();
        this.Mod = Mod;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtAAlumno = new javax.swing.JButton();
        BtAMaestro = new javax.swing.JButton();
        BtRegresarA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtAAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/AsistenicaAlumno.png"))); // NOI18N
        BtAAlumno.setText("Alumno");
        BtAAlumno.setBorder(null);
        BtAAlumno.setBorderPainted(false);
        BtAAlumno.setContentAreaFilled(false);
        BtAAlumno.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/AsistenicaAlumnoP.png"))); // NOI18N
        BtAAlumno.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/AsistenicaAlumnoS.png"))); // NOI18N
        BtAAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtAAlumnoMouseClicked(evt);
            }
        });

        BtAMaestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/AsistenciaProfesor.png"))); // NOI18N
        BtAMaestro.setText("Maestro");
        BtAMaestro.setBorder(null);
        BtAMaestro.setBorderPainted(false);
        BtAMaestro.setContentAreaFilled(false);
        BtAMaestro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/AsistenciaProfesorP.png"))); // NOI18N
        BtAMaestro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/AsistenciaProfesorS.png"))); // NOI18N
        BtAMaestro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtAMaestroMouseClicked(evt);
            }
        });

        BtRegresarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/Salir48.png"))); // NOI18N
        BtRegresarA.setText("Regresar");
        BtRegresarA.setBorder(null);
        BtRegresarA.setBorderPainted(false);
        BtRegresarA.setContentAreaFilled(false);
        BtRegresarA.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/Salir48P.png"))); // NOI18N
        BtRegresarA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/Salir48S.png"))); // NOI18N
        BtRegresarA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtRegresarAMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(BtRegresarA))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BtAAlumno)
                        .addGap(54, 54, 54)
                        .addComponent(BtAMaestro)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtAAlumno)
                    .addComponent(BtAMaestro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(BtRegresarA)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtAAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtAAlumnoMouseClicked
        // TODO add your handling code here:     
        if (VRasistenciaA == null){
            RAsistenciaAlumno.VAsistenciaA = null;
            VRasistenciaA = new RAsistenciaAlumno(Mod);
            VRasistenciaA.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BtAAlumnoMouseClicked

    private void BtAMaestroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtAMaestroMouseClicked
        // TODO add your handling code here:
        if (VRasistenciaM == null){
            RAsistenciaMaestro.VAsistenciaM = null;
            VRasistenciaM = new RAsistenciaMaestro(Mod);
            VRasistenciaM.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_BtAMaestroMouseClicked

    private void BtRegresarAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtRegresarAMouseClicked
        // TODO add your handling code here:
        if(VMenuAsistencia == null){
            Menu.VAsistencias = null;
            VMenuAsistencia = new Menu(Mod);
            VMenuAsistencia.setVisible(true);
            this.dispose();
            
        }
    }//GEN-LAST:event_BtRegresarAMouseClicked

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
            java.util.logging.Logger.getLogger(VAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VAsistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAAlumno;
    private javax.swing.JButton BtAMaestro;
    private javax.swing.JButton BtRegresarA;
    // End of variables declaration//GEN-END:variables
}
