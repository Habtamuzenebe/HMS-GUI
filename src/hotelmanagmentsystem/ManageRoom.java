/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotelmanagmentsystem;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Toshiba
 */
public final class ManageRoom extends javax.swing.JFrame {

    /**
     * Creates new form ManageRoom
     */
    Connection conn = null;
    Statement smt = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String s2;

    public ManageRoom() {
        initComponents();
        ShowRecordInTables();
        combobedtype.setSelectedIndex(-1);
        comboroomtype.setSelectedIndex(-1);
    }

    public void ShowRecordInTables() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels", "root", "password");
            pst = conn.prepareStatement("Select * from room");
            rs = pst.executeQuery();
            ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
            //System.out.print(stData);
            int q = stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel) Table.getModel();
            //System.out.print(RecordTable);
            RecordTable.setRowCount(0);
            while (rs.next()) {
                //Vector is like the dynamic array.
                Vector columnData = new Vector();
                for (int i = 1; i <= q; i++) {
                    columnData.add(rs.getString("roomnumber"));
                    columnData.add(rs.getString("roomtype"));
                    columnData.add(rs.getString("bedtype"));
                    columnData.add(rs.getString("price"));
                    columnData.add(rs.getString("status"));
                }
                RecordTable.addRow(columnData);
                //System.out.println(columnData);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtroomnumber = new javax.swing.JTextField();
        comboroomtype = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        combobedtype = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        Addroom = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        txtsearch = new javax.swing.JLabel();
        text1 = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(222, 108, 100));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manage.png"))); // NOI18N
        jLabel1.setText("Manege Room");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 45));

        Table.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Room Number", "Room Type", "Bed Type", "Price", "Status"
            }
        ));
        Table.setEnabled(false);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);
        if (Table.getColumnModel().getColumnCount() > 0) {
            Table.getColumnModel().getColumn(0).setHeaderValue("Room Number");
            Table.getColumnModel().getColumn(1).setHeaderValue("Room Type");
            Table.getColumnModel().getColumn(2).setHeaderValue("Bed Type");
            Table.getColumnModel().getColumn(3).setHeaderValue("Price");
            Table.getColumnModel().getColumn(4).setHeaderValue("Status");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 680, 220));

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1058, 0, 42, 32));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Room Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 176, 31));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Room Type");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 176, 34));

        txtroomnumber.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        getContentPane().add(txtroomnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 176, 35));

        comboroomtype.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        comboroomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "NON-AC" }));
        comboroomtype.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboroomtypeItemStateChanged(evt);
            }
        });
        comboroomtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboroomtypeActionPerformed(evt);
            }
        });
        getContentPane().add(comboroomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 176, 35));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Bed Type");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 176, 29));

        combobedtype.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        combobedtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Triple" }));
        getContentPane().add(combobedtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 176, 35));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Price");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, 176, 37));

        txtprice.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 480, 176, 36));

        Addroom.setBackground(new java.awt.Color(0, 0, 153));
        Addroom.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Addroom.setForeground(new java.awt.Color(102, 255, 51));
        Addroom.setText("Add Room ");
        Addroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddroomActionPerformed(evt);
            }
        });
        getContentPane().add(Addroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 390, 113, 39));

        Update.setBackground(new java.awt.Color(0, 0, 0));
        Update.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 0, 238));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 113, 39));

        Delete.setBackground(new java.awt.Color(204, 0, 0));
        Delete.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Delete.setForeground(new java.awt.Color(255, 255, 255));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 480, 113, 39));

        txtsearch.setBackground(new java.awt.Color(0, 0, 0));
        txtsearch.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtsearch.setForeground(new java.awt.Color(51, 51, 51));
        txtsearch.setText("Search By Room Number");
        getContentPane().add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, 30));

        text1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        text1.setPreferredSize(new java.awt.Dimension(5, 30));
        getContentPane().add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 176, -1));

        Search.setBackground(new java.awt.Color(51, 255, 51));
        Search.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        Search.setForeground(new java.awt.Color(0, 0, 255));
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/room1.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 210, 220));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all pages background.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed


    private void AddroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddroomActionPerformed

        if (txtroomnumber.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All field is required");
            txtroomnumber.requestFocus();
        } else if (txtprice.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All field is required");
            txtprice.requestFocus();
        } else 
            try {
            pst = conn.prepareStatement("select *from room where roomnumber=?");
            pst.setString(1, txtroomnumber.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Room number already exit");
            } else {
                try {
                    double price = Double.parseDouble(txtprice.getText());

                    try {
                int yes = JOptionPane.showConfirmDialog(this, "Do you want to add room?", "Add Room", JOptionPane.YES_NO_OPTION);
                if (JOptionPane.YES_NO_OPTION == yes) {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels", "root", "password");
                        pst = conn.prepareStatement("insert into room(roomnumber,roomtype,bedtype,price,status)values(?,?,?,?,?)");
                        pst.setString(1, txtroomnumber.getText());
                        pst.setString(2, comboroomtype.getItemAt(comboroomtype.getSelectedIndex()));
                        pst.setString(3, combobedtype.getItemAt(combobedtype.getSelectedIndex()));
                        pst.setString(4, txtprice.getText());
                        pst.setString(5, "Not Booked");
                        pst.executeUpdate();
                        ShowRecordInTables();
                        txtprice.setText("");
                        txtroomnumber.setText("");
                        combobedtype.setSelectedIndex(-1);
                        comboroomtype.setSelectedIndex(-1);
                }else{
                JOptionPane.showMessageDialog(this, "room is not added.");
                }
                    } catch (ClassNotFoundException | SQLException ex) {
                    }
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Price is not valid");
                }
                // TODO add your handling code here:
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_AddroomActionPerformed


    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked

  // TODO add your handling code here:
    }//GEN-LAST:event_TableMouseClicked


    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        if (text1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter 'Search by Room Number' and delete.");
            return;
        }

        try {
            // Establish database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels", "root", "");

            // Check if the room is booked
            pst = conn.prepareStatement("SELECT * FROM room WHERE roomnumber = ? AND status = ?");
            pst.setString(1, text1.getText());
            pst.setString(2, "Booked");
            rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Sorry, the room is booked and cannot be deleted.");
                return;
            }

            // If the room is not booked, proceed with deletion
            int yes = JOptionPane.showConfirmDialog(this, "Do you want to delete room?", "Delete", JOptionPane.YES_NO_OPTION);
            if (JOptionPane.YES_NO_OPTION == yes) {
                pst = conn.prepareStatement("DELETE FROM room WHERE roomnumber = ?");
                pst.setString(1, text1.getText());
                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    ShowRecordInTables();
                    txtroomnumber.setText("");
                    txtprice.setText("");
                    combobedtype.setSelectedIndex(-1);
                    comboroomtype.setSelectedIndex(-1);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Room not deleted.");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error deleting room: " + ex.getMessage());
        } finally {
            // Close resources
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error closing resources: " + ex.getMessage());
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteActionPerformed


    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        String searchroom = text1.getText().trim();
        String price = txtprice.getText().trim();
        String bedType = (String) combobedtype.getSelectedItem();
        String roomType = (String) comboroomtype.getSelectedItem();

        if (searchroom.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the 'Search by Room Number' and search then update.");
            return; // Stop further execution
        }

        if (price.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the price for the room.");
            return; // Stop further execution
        }

        try {
            double priceValue = Double.parseDouble(price);

            // Establish database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels", "root", "password");

            // Check if the room is booked
            pst = conn.prepareStatement("SELECT * FROM room WHERE roomnumber = ? AND status = ?");
            pst.setString(1, text1.getText());
            pst.setString(2, "Booked");
            rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Sorry, the room is booked and cannot be updated.");
                return;
            }

            // If the room is not booked, proceed with update
            int yes = JOptionPane.showConfirmDialog(this, "Do you want to update room?", "Update", JOptionPane.YES_NO_OPTION);
            if (JOptionPane.YES_NO_OPTION == yes) {
                pst = conn.prepareStatement("UPDATE room SET price=?, roomtype=?, bedtype=? WHERE roomnumber=?");
                pst.setString(1, price);
                pst.setString(2, roomType);
                pst.setString(3, bedType);
                pst.setString(4, searchroom);

                int rowsUpdated = pst.executeUpdate();
                if (rowsUpdated > 0) {

                    ShowRecordInTables();
                    txtprice.setText("");
                    txtroomnumber.setText("");
                    combobedtype.setSelectedIndex(-1);
                    comboroomtype.setSelectedIndex(-1);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Room not updated");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid price for the room.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error updating room: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Database driver not found: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (pst != null) {
                    pst.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_UpdateActionPerformed


    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        txtroomnumber.setText("");
        txtprice.setText("");
        combobedtype.setSelectedIndex(-1); // Reset bed type selection
        comboroomtype.setSelectedIndex(-1); // Reset room type selection

        if (text1.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please Enter 'Search by Room Number' and Search.");
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels", "root", "password");
                pst = conn.prepareStatement("select * from room where roomnumber=?");
                pst.setString(1, text1.getText());
                rs = pst.executeQuery();

                if (rs.next()) {
                    txtroomnumber.setText(rs.getString("roomnumber"));
                    txtprice.setText(rs.getString("price"));
                    // Set selected room type
                    String temp = rs.getString("roomtype");
                    if (temp != null) {
                        for (int i = 0; i < comboroomtype.getItemCount(); i++) {
                            if (comboroomtype.getItemAt(i).equals(temp)) {
                                comboroomtype.setSelectedIndex(i);
                                break;
                            }
                        }
                    }
                    // Set selected bed type
                    String temp1 = rs.getString("bedtype");
                    if (temp1 != null) {
                        for (int i = 0; i < combobedtype.getItemCount(); i++) {
                            if (combobedtype.getItemAt(i).equals(temp1)) {
                                combobedtype.setSelectedIndex(i);
                                break;
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Record Not Found.");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                txtroomnumber.setText("");
                txtprice.setText("");
                combobedtype.setSelectedIndex(-1); // Reset bed type selection
                comboroomtype.setSelectedIndex(-1); // Reset room type selection
                JOptionPane.showMessageDialog(this, "Error searching for record: " + ex.getMessage());
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_SearchActionPerformed

    private void comboroomtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboroomtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboroomtypeActionPerformed

    private void comboroomtypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboroomtypeItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboroomtypeItemStateChanged

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
            java.util.logging.Logger.getLogger(ManageRoom.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ManageRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addroom;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Search;
    private javax.swing.JTable Table;
    private javax.swing.JButton Update;
    private javax.swing.JComboBox<String> combobedtype;
    private javax.swing.JComboBox<String> comboroomtype;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField text1;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtroomnumber;
    private javax.swing.JLabel txtsearch;
    // End of variables declaration//GEN-END:variables
}
