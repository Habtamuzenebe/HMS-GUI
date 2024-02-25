package hotelmanagmentsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba
 */
public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtPop = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jButton8.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manage.png"))); // NOI18N
        jButton8.setText("Manage Room");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(222, 108, 100));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customer Registration & Check IN.png"))); // NOI18N
        jButton1.setText("Customer Check in");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 270, 60));

        jButton2.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(219, 118, 103));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manage.png"))); // NOI18N
        jButton2.setText("Manage Room");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 60));

        jButton3.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(222, 108, 100));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/out.jpg"))); // NOI18N
        jButton3.setText("Customer Check out");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, 60));

        jButton4.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(222, 108, 100));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, -1, 60));

        jButton5.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(222, 108, 100));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bill.jpg"))); // NOI18N
        jButton5.setText("Bill Details");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 20, 210, 60));

        jButton6.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(222, 108, 100));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jButton6.setText("Logout");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 160, 60));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 90));

        jPanel3.setBackground(new java.awt.Color(51, 0, 51));

        txtPop.setFont(new java.awt.Font("Algerian", 2, 36)); // NOI18N
        txtPop.setForeground(new java.awt.Color(11, 255, 11));
        txtPop.setText("Welcome to Hotel Manageent System HOME PAGE");
        txtPop.setToolTipText("");
        txtPop.setMaximumSize(new java.awt.Dimension(900, 48));
        txtPop.setMinimumSize(new java.awt.Dimension(900, 48));
        txtPop.setName(""); // NOI18N
        txtPop.setPreferredSize(new java.awt.Dimension(910, 48));
        jPanel3.add(txtPop);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 1370, 50));

        jPanel2.setBackground(new java.awt.Color(102, 102, 0));
        jPanel2.setEnabled(false);
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 770));

        jPanel4.setBackground(new java.awt.Color(102, 102, 0));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 50, 770));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Java hotel project\\Hotel-Management-System-master\\src\\1.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new CustomerCheckout().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new ManageRoom().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new CustomerCheckin().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        new BillDetails().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int yes = JOptionPane.showConfirmDialog(this, "Are you sure?", "Log out", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (yes == JOptionPane.YES_OPTION) {
            new Login0().setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int yes = JOptionPane.showConfirmDialog(this, "Are you sure?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (yes == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel txtPop;
    // End of variables declaration//GEN-END:variables

    void setVisible(String atrue) {

        throw new UnsupportedOperationException("Not supported yet.");
    }
}
