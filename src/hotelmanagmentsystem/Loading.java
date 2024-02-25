package hotelmanagmentsystem;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Loading extends javax.swing.JFrame {

    public Loading() {
        initComponents();
        Thread obj = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    txtPop.setVisible(false);
                    txtPop.setVisible(true);
                    ProgressBar1.setValue(i);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (ProgressBar1.getString().equals("10%")) {
                        txtloading.setText("Loading Application...");
                    }
                    if (ProgressBar1.getString().equals("30%")) {
                        txtloading.setText("Loading Connection...");
                    }
                    if (ProgressBar1.getString().equals("50%")) {
                        txtloading.setText("Loading Connection Database...");
                    }
                    if (ProgressBar1.getString().equals("90%")) {
                        txtloading.setText("Launching Application...");
                    }
                    if (ProgressBar1.getString().equals("100%")) {
                        new Login0().setVisible(true);
                    }
                }
            }
        });
        obj.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProgressBar1 = new javax.swing.JProgressBar();
        txtPop = new javax.swing.JLabel();
        txtloading = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProgressBar1.setBackground(new java.awt.Color(102, 102, 0));
        ProgressBar1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        ProgressBar1.setForeground(new java.awt.Color(8, 8, 255));
        ProgressBar1.setStringPainted(true);
        ProgressBar1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                ProgressBar1StateChanged(evt);
            }
        });
        getContentPane().add(ProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 560, 26));

        txtPop.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        txtPop.setForeground(new java.awt.Color(255, 255, 0));
        txtPop.setText("Hotel Managment ");
        getContentPane().add(txtPop, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 370, 60));

        txtloading.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        txtloading.setForeground(new java.awt.Color(255, 255, 51));
        txtloading.setText("Loading..");
        getContentPane().add(txtloading, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 270, 20));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 40, 30));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("SYSTEM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 50));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 580, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loasd.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 500));

        setSize(new java.awt.Dimension(578, 502));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ProgressBar1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_ProgressBar1StateChanged

        // TODO add your handling code here:
    }//GEN-LAST:event_ProgressBar1StateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtPop;
    private javax.swing.JLabel txtloading;
    // End of variables declaration//GEN-END:variables
}
