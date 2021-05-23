/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import FiveCodMover.FiveCodMoverJFrame;
//import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;
import necesario.FadeEffect;
import vista.Alertas.AWTUtilitie;

/**
 *
 * @author Kevin
 */

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    public Login() {
        initComponents();
       
        labelError.setVisible(false);
        setLocationRelativeTo(null);
        Shape forma = new RoundRectangle2D.Double(0, 0, getBounds().width, getBounds().height, 20, 20);
        //AWTUtilities.setWindowShape(this, forma);
        AWTUtilitie.setOpaque(this, false);
        FadeEffect.fadeInFrame(this, 50, 0.1f);
        
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
        btnExit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelError = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(33, 45, 62));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(400, 600));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/icons8_delete_25px_1.png"))); // NOI18N
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 40, 50));

        jLabel3.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Iniciar Sesión");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 275, 53));

        jLabel4.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NOMBRE DE USUARIO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTRASEÑA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        txtcorreo.setBackground(new java.awt.Color(33, 45, 62));
        txtcorreo.setFont(new java.awt.Font("Gotham Thin", 0, 18)); // NOI18N
        txtcorreo.setForeground(new java.awt.Color(65, 165, 238));
        txtcorreo.setBorder(null);
        txtcorreo.setCaretColor(new java.awt.Color(65, 165, 238));
        txtcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcorreoKeyTyped(evt);
            }
        });
        jPanel1.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 270, 40));

        txtpassword.setBackground(new java.awt.Color(33, 45, 62));
        txtpassword.setFont(txtpassword.getFont().deriveFont(txtpassword.getFont().getSize()+7f));
        txtpassword.setForeground(new java.awt.Color(65, 165, 238));
        txtpassword.setBorder(null);
        txtpassword.setCaretColor(new java.awt.Color(65, 165, 238));
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpasswordKeyTyped(evt);
            }
        });
        jPanel1.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 270, 36));

        jSeparator1.setBackground(new java.awt.Color(65, 165, 238));
        jSeparator1.setForeground(new java.awt.Color(65, 165, 238));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 310, 10));

        jSeparator2.setBackground(new java.awt.Color(65, 165, 238));
        jSeparator2.setForeground(new java.awt.Color(65, 165, 238));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 310, 10));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/icons8_email_25px_2.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 48, 36));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/icons8_lock_25px_2.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 48, 42));

        jLabel6.setFont(new java.awt.Font("Gotham Thin", 0, 40)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Iniciar Sesión");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 275, 53));

        labelError.setForeground(new java.awt.Color(255, 0, 0));
        labelError.setText("Usuario o contraseña invalido");
        jPanel1.add(labelError, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 310, -1));

        btnIngresar.setBackground(new java.awt.Color(65, 165, 238));
        btnIngresar.setFont(new java.awt.Font("Gotham Extra Light", 0, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/BTN2.png"))); // NOI18N
        btnIngresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIngresar.setBorderPainted(false);
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIngresar.setFocusPainted(false);
        btnIngresar.setFocusable(false);
        btnIngresar.setRequestFocusEnabled(false);
        btnIngresar.setVerifyInputWhenFocusTarget(false);
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        btnIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnIngresarKeyTyped(evt);
            }
        });
        jPanel1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 200, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 400, 600));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/iconos/bodega1.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
       DashBoard D = new DashBoard();
       D.show();
       this.dispose();


    }//GEN-LAST:event_btnIngresarMouseClicked

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
       FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
       FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_jPanel1MousePressed

    private void btnIngresarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnIngresarKeyTyped
       
    }//GEN-LAST:event_btnIngresarKeyTyped

    private void txtpasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyTyped
         if ((evt.getKeyChar() == KeyEvent.VK_ENTER)) {
            DashBoard D = new DashBoard();
            D.show();
            this.dispose();
        }
    }//GEN-LAST:event_txtpasswordKeyTyped

    private void txtcorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyTyped
        if ((evt.getKeyChar() == KeyEvent.VK_ENTER)) {
            txtpassword.requestFocus();
        }
    }//GEN-LAST:event_txtcorreoKeyTyped

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
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btnIngresar;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelError;
    public javax.swing.JTextField txtcorreo;
    public javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
