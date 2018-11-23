/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import java.awt.Image;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import Clases.*;
import Login.Usuario;
import Modulos.Alumno;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;

/**
 *
 * @author Daniel Poot
 */
public class RegistroAlumno extends javax.swing.JFrame {
    public Conectar ConexionRA = new Conectar();
    Usuario Mod;
    //Variables utilizadas para que las vistas cierren adecuadamente
    public static Registros VRegistros;  //VRegistroR es un Frame de tipo Registro que es utilizada para abrir RA(true) o cerrar (false)
    /**
     * Creates new form RegistroAlumno
     */
    public RegistroAlumno() {
        initComponents();
        this.setLocationRelativeTo(null);
        Grupo ComboGrupo = new Grupo();
        ComboGrupo.MostrarGrupos(ComboGrupoRA);
    }
    public RegistroAlumno(Usuario Mod) {
        this.Mod = Mod;
        initComponents();
        this.setLocationRelativeTo(null);
        Grupo ComboGrupo = new Grupo();
        ComboGrupo.MostrarGrupos(ComboGrupoRA);
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        TxtRegistroAlumno = new javax.swing.JLabel();
        NombreRA = new javax.swing.JLabel();
        APaternoRA = new javax.swing.JLabel();
        AMaternoRA = new javax.swing.JLabel();
        EdadRA = new javax.swing.JLabel();
        TelefonoRA = new javax.swing.JLabel();
        FechaIngreRA = new javax.swing.JLabel();
        GrupoRA = new javax.swing.JLabel();
        RegistrarRA = new javax.swing.JButton();
        BtRegresarRA = new javax.swing.JButton();
        IngreNombreRA = new javax.swing.JTextField();
        IngreAPaternoRA = new javax.swing.JTextField();
        IngreAMaternoRA = new javax.swing.JTextField();
        IngreEdadRA = new javax.swing.JTextField();
        IngreTelefonoRA = new javax.swing.JTextField();
        BtFotoRA = new javax.swing.JButton();
        RutaImagenRA = new javax.swing.JTextField();
        MostrarFotoRA = new javax.swing.JLabel();
        PagoInscripcionRA = new javax.swing.JLabel();
        IngrePagoInscripcionRA = new javax.swing.JTextField();
        PagoMensualidadRA = new javax.swing.JLabel();
        IngrePagoMensualRA = new javax.swing.JTextField();
        IngreFechaRA = new com.toedter.calendar.JDateChooser();
        ComboGrupoRA = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TxtRegistroAlumno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        TxtRegistroAlumno.setText("Registro de Alumno");

        NombreRA.setText("Nombre :  ");

        APaternoRA.setText("Apellido Paterno : ");

        AMaternoRA.setText("Apellido Materno :");

        EdadRA.setText("Edad : ");

        TelefonoRA.setText("Telefono Celular : ");

        FechaIngreRA.setText("Fecha de Ingreso :");

        GrupoRA.setText("Grupo : ");

        RegistrarRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/Guardar48.png"))); // NOI18N
        RegistrarRA.setText("Registrar");
        RegistrarRA.setBorder(null);
        RegistrarRA.setBorderPainted(false);
        RegistrarRA.setContentAreaFilled(false);
        RegistrarRA.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/Guardar48P.png"))); // NOI18N
        RegistrarRA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/Guardar48S.png"))); // NOI18N
        RegistrarRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarRAActionPerformed(evt);
            }
        });

        BtRegresarRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/Salir48.png"))); // NOI18N
        BtRegresarRA.setText("Salir");
        BtRegresarRA.setBorder(null);
        BtRegresarRA.setBorderPainted(false);
        BtRegresarRA.setContentAreaFilled(false);
        BtRegresarRA.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/Salir48P.png"))); // NOI18N
        BtRegresarRA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/Salir48S.png"))); // NOI18N
        BtRegresarRA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtRegresarRAMouseClicked(evt);
            }
        });
        BtRegresarRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtRegresarRAActionPerformed(evt);
            }
        });

        IngreNombreRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngreNombreRAActionPerformed(evt);
            }
        });

        IngreAPaternoRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngreAPaternoRAActionPerformed(evt);
            }
        });

        IngreAMaternoRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngreAMaternoRAActionPerformed(evt);
            }
        });

        IngreEdadRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngreEdadRAActionPerformed(evt);
            }
        });

        IngreTelefonoRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngreTelefonoRAActionPerformed(evt);
            }
        });

        BtFotoRA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/AñadirFoto48.png"))); // NOI18N
        BtFotoRA.setText("Foto");
        BtFotoRA.setBorder(null);
        BtFotoRA.setBorderPainted(false);
        BtFotoRA.setContentAreaFilled(false);
        BtFotoRA.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/AñadirFotoP48.png"))); // NOI18N
        BtFotoRA.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesProyecto/AñadirFotoS48.png"))); // NOI18N
        BtFotoRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtFotoRAActionPerformed(evt);
            }
        });

        RutaImagenRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RutaImagenRAActionPerformed(evt);
            }
        });

        PagoInscripcionRA.setText("Pago de Inscripcion : ");

        IngrePagoInscripcionRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngrePagoInscripcionRAActionPerformed(evt);
            }
        });

        PagoMensualidadRA.setText("Pago de Mensualidad : ");

        IngrePagoMensualRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngrePagoMensualRAActionPerformed(evt);
            }
        });

        IngreFechaRA.setDateFormatString("dd/MM/yyyy");

        ComboGrupoRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboGrupoRAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MostrarFotoRA, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GrupoRA)
                            .addComponent(TelefonoRA)
                            .addComponent(NombreRA)
                            .addComponent(APaternoRA)
                            .addComponent(AMaternoRA)
                            .addComponent(EdadRA))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(IngreAPaternoRA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(IngreAMaternoRA, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IngreEdadRA, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IngreTelefonoRA, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IngreNombreRA)))
                    .addComponent(PagoMensualidadRA)
                    .addComponent(PagoInscripcionRA)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FechaIngreRA)
                        .addGap(78, 78, 78)
                        .addComponent(IngreFechaRA, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(TxtRegistroAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtRegresarRA, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(234, 234, 234)
                                .addComponent(RegistrarRA))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtFotoRA)
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(IngrePagoInscripcionRA)
                                    .addComponent(IngrePagoMensualRA, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(RutaImagenRA, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ComboGrupoRA, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(TxtRegistroAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreRA)
                    .addComponent(IngreNombreRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(APaternoRA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngreAPaternoRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AMaternoRA)
                    .addComponent(IngreAMaternoRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EdadRA)
                    .addComponent(IngreEdadRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonoRA)
                    .addComponent(IngreTelefonoRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FechaIngreRA)
                    .addComponent(IngreFechaRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GrupoRA)
                        .addGap(18, 18, 18)
                        .addComponent(PagoInscripcionRA)
                        .addGap(18, 18, 18)
                        .addComponent(PagoMensualidadRA)
                        .addGap(18, 18, 18)
                        .addComponent(BtFotoRA))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ComboGrupoRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(IngrePagoInscripcionRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(IngrePagoMensualRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RutaImagenRA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(MostrarFotoRA, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegistrarRA, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtRegresarRA, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngreTelefonoRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngreTelefonoRAActionPerformed
        // TODO add your handling code here:
        IngreTelefonoRA.transferFocus();
    }//GEN-LAST:event_IngreTelefonoRAActionPerformed

    private void BtRegresarRAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtRegresarRAMouseClicked
        // TODO add your handling code here:
        if(VRegistros == null){
            Registros.VRegistroAlumno = null;
            this.dispose();
            VRegistros = new Registros(Mod);
            VRegistros.setVisible(true);
        }
    }//GEN-LAST:event_BtRegresarRAMouseClicked

    private void RegistrarRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarRAActionPerformed
        // TODO add your handling code here:
        
        
        
        String NombreA = this.IngreNombreRA.getText();
        String ApellidoPA = this.IngreAPaternoRA.getText();
        String ApellidoMA  = this.IngreAMaternoRA.getText();
        int EdadA = Integer.parseInt(this.IngreEdadRA.getText());
        
        
        //Creo un objeto fecha diseñado para poder ser pasado a la BD
        Date Date = IngreFechaRA.getDate();
        long Fecha = Date.getTime();
        java.sql.Date FechaA = new java.sql.Date(Fecha);
        ////////////////////////////////////////////////////////////////
        Grupo NGrupoRA = new Grupo(ComboGrupoRA.getItemAt(ComboGrupoRA.getSelectedIndex()).getTipoDeGrupo(),ComboGrupoRA.getItemAt(ComboGrupoRA.getSelectedIndex()).getIDHorario(),ComboGrupoRA.getItemAt(ComboGrupoRA.getSelectedIndex()).getIDMaestro());
        Long TelefonoA = Long.parseLong(this.IngreTelefonoRA.getText());
        ///////////////////Ingresar ruta de la foto /////////////////////////////
        
        File RutImageA = new File(RutaImagenRA.getText());
        
        ////////////////////////////////////////////////////////////////////////
        Double MensualidadA = Double.parseDouble(this.IngrePagoMensualRA.getText());
        Double InscripcionA = Double.parseDouble(this.IngrePagoInscripcionRA.getText());
        

        Alumno AlumnoRA = new Alumno(FechaA, MensualidadA, InscripcionA ,NGrupoRA, NombreA,ApellidoPA, ApellidoMA, EdadA,TelefonoA);
        
        PreparedStatement Pst = null;
        
        try{    
            
            
            
            byte[] Icono = new byte[(int) RutImageA.length()];
            InputStream input = new FileInputStream(RutImageA);
            input.read(Icono);
            AlumnoRA.setFotografia(Icono);
            
            Pst = ConexionRA.getConnection().prepareStatement("insert into ingresoalumnos values(null,?,?,?,?,?,?,?,?,?,?)");
            Pst.setString(1, NombreA);
            Pst.setString(2, ApellidoPA);
            Pst.setString(3, ApellidoMA);
            Pst.setInt(4, EdadA);
            Pst.setDate(5, FechaA);
            Pst.setLong(6, TelefonoA);
            Pst.setBytes(7,AlumnoRA.getFotografia());    
            Pst.setDouble(8, MensualidadA);
            Pst.setDouble(9,InscripcionA );
            Pst.setInt(10, NGrupoRA.getIDHorario());
            
            
            
            Pst.executeUpdate();
            
            IngreNombreRA.setText("");
            IngreAPaternoRA.setText("");
            IngreAMaternoRA.setText("");
            IngreEdadRA.setText("");
            IngreTelefonoRA.setText("");
            IngrePagoInscripcionRA.setText("");
            IngrePagoMensualRA.setText("");
            RutaImagenRA.setText("");
            
                    
            JOptionPane.showMessageDialog(null, "Alumno Registrado");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
        
        
    }//GEN-LAST:event_RegistrarRAActionPerformed

    private void IngreNombreRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngreNombreRAActionPerformed
        // TODO add your handling code here:
        IngreNombreRA.transferFocus();
    }//GEN-LAST:event_IngreNombreRAActionPerformed

    private void IngreAPaternoRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngreAPaternoRAActionPerformed
        // TODO add your handling code here:
        IngreAPaternoRA.transferFocus();
    }//GEN-LAST:event_IngreAPaternoRAActionPerformed

    private void IngreAMaternoRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngreAMaternoRAActionPerformed
        // TODO add your handling code here:
        IngreAMaternoRA.transferFocus();
    }//GEN-LAST:event_IngreAMaternoRAActionPerformed

    private void IngreEdadRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngreEdadRAActionPerformed
        // TODO add your handling code here:
        IngreEdadRA.transferFocus();
    }//GEN-LAST:event_IngreEdadRAActionPerformed

    private void BtFotoRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtFotoRAActionPerformed
        // TODO add your handling code here:
        JFileChooser ImagenAlumno = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        ImagenAlumno.setFileFilter(fil);
        
        int Ventana = ImagenAlumno.showOpenDialog(this);
        if(Ventana == JFileChooser.APPROVE_OPTION){
            String ruta = ImagenAlumno.getSelectedFile().getAbsolutePath();
            RutaImagenRA.setText(ruta);
            
            Image FotoAlumno = getToolkit().getImage(RutaImagenRA.getText());
            
            FotoAlumno = FotoAlumno.getScaledInstance(110, 110, Image.SCALE_DEFAULT);
            MostrarFotoRA.setIcon(new ImageIcon(FotoAlumno));
        }
    }//GEN-LAST:event_BtFotoRAActionPerformed

    private void IngrePagoInscripcionRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngrePagoInscripcionRAActionPerformed
        // TODO add your handling code here:
        IngrePagoInscripcionRA.transferFocus();
    }//GEN-LAST:event_IngrePagoInscripcionRAActionPerformed

    private void IngrePagoMensualRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngrePagoMensualRAActionPerformed
        // TODO add your handling code here:
        IngrePagoMensualRA.transferFocus();
    }//GEN-LAST:event_IngrePagoMensualRAActionPerformed

    private void ComboGrupoRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboGrupoRAActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ComboGrupoRAActionPerformed

    private void BtRegresarRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtRegresarRAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtRegresarRAActionPerformed

    private void RutaImagenRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RutaImagenRAActionPerformed
        // TODO add your handling code here:
        RutaImagenRA.transferFocus();
    }//GEN-LAST:event_RutaImagenRAActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AMaternoRA;
    private javax.swing.JLabel APaternoRA;
    private javax.swing.JButton BtFotoRA;
    private javax.swing.JButton BtRegresarRA;
    private javax.swing.JComboBox<Grupo> ComboGrupoRA;
    private javax.swing.JLabel EdadRA;
    private javax.swing.JLabel FechaIngreRA;
    private javax.swing.JLabel GrupoRA;
    private javax.swing.JTextField IngreAMaternoRA;
    private javax.swing.JTextField IngreAPaternoRA;
    private javax.swing.JTextField IngreEdadRA;
    private com.toedter.calendar.JDateChooser IngreFechaRA;
    private javax.swing.JTextField IngreNombreRA;
    private javax.swing.JTextField IngrePagoInscripcionRA;
    private javax.swing.JTextField IngrePagoMensualRA;
    private javax.swing.JTextField IngreTelefonoRA;
    private javax.swing.JLabel MostrarFotoRA;
    private javax.swing.JLabel NombreRA;
    private javax.swing.JLabel PagoInscripcionRA;
    private javax.swing.JLabel PagoMensualidadRA;
    private javax.swing.JButton RegistrarRA;
    private javax.swing.JTextField RutaImagenRA;
    private javax.swing.JLabel TelefonoRA;
    private javax.swing.JLabel TxtRegistroAlumno;
    private javax.swing.Box.Filler filler1;
    // End of variables declaration//GEN-END:variables
}
