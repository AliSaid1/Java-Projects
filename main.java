/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project1Med;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author alisaid
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
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

        l1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        pic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-eintreten-75.png"))); // NOI18N
        l1.setText("Table");
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l1MouseEntered(evt);
            }
        });
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 370, 110));

        back.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/backG.png"))); // NOI18N
        back.setText("Back");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 230, 70));

        p5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/löschen.png"))); // NOI18N
        p5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p5MouseClicked(evt);
            }
        });
        getContentPane().add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 30, 30, 40));

        p6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimize.png"))); // NOI18N
        p6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p6MouseClicked(evt);
            }
        });
        getContentPane().add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 30, 50, 40));

        l2.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        l2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-eintreten-75.png"))); // NOI18N
        l2.setText("Medical Report");
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l2MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l2MouseEntered(evt);
            }
        });
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 370, 110));

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/doctors-stethoscope-white-background-2.jpg"))); // NOI18N
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        // TODO add your handling code here:
        back.setForeground(Color.black);
        back.setText("Back");
    }//GEN-LAST:event_backMouseExited

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        // TODO add your handling code here:
        back.setForeground(Color.red);
        back.setText("Go Back to Login");

    }//GEN-LAST:event_backMouseEntered

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        // TODO add your handling code here:
        new table().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_l1MouseClicked

    private void l1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseEntered
        // TODO add your handling code here:
        l1.setForeground(Color.ORANGE);
        l1.setText("Go To Table");
        
    }//GEN-LAST:event_l1MouseEntered

    private void l1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseExited
        // TODO add your handling code here:
        l1.setForeground(Color.black);
        l1.setText("Table");
    }//GEN-LAST:event_l1MouseExited

    private void p5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_p5MouseClicked

    private void p6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6MouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_p6MouseClicked

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        // TODO add your handling code here:
         new loginr().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_l2MouseClicked

    private void l2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseExited
        // TODO add your handling code here:
        l2.setForeground(Color.black);
        l2.setText("Medical Report");
    }//GEN-LAST:event_l2MouseExited

    private void l2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseEntered
        // TODO add your handling code here:
        l2.setForeground(Color.orange);
        l2.setText("Go To Medical Report");
    }//GEN-LAST:event_l2MouseEntered

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    private javax.swing.JLabel pic;
    // End of variables declaration//GEN-END:variables
}
