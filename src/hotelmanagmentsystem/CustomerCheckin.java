/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotelmanagmentsystem;

import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Toshiba
 */
public class CustomerCheckin extends javax.swing.JFrame {

    Connection conn = null;
    Statement smt = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    /**
     * Creates new form CustomerCheckin
     */
    public CustomerCheckin() {
        initComponents();
        ShowDataInRoomTable();
        combogender.setSelectedIndex(-1);
        combobedtype.setSelectedIndex(-1);
        comboroomtype.setSelectedIndex(-1);
        
        SimpleDateFormat DT = new SimpleDateFormat("yyyy/MM/dd ");
        Date date = new Date();
        txtindate.setText(DT.format(date));
        txtname.requestFocus();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels", "root", "password");
            pst = conn.prepareStatement("select roomnumber from room where status=? AND roomtype=? AND bedtype=?");
            pst.setString(1, "Not Booked");
            pst.setString(2, comboroomtype.getItemAt(comboroomtype.getSelectedIndex()));
            pst.setString(3, combobedtype.getItemAt(combobedtype.getSelectedIndex()));
            rs = pst.executeQuery();
            while (rs.next()) {
                comboroomnumber.addItem(rs.getString("roomnumber"));
            }
            pst = conn.prepareStatement("select price from room where roomnumber=?");
            pst.setString(1, comboroomnumber.getItemAt(comboroomnumber.getSelectedIndex()));
            rs = pst.executeQuery();
            if (rs.next()) {
                txtprice.setText(rs.getString("price"));
            }
        } catch (ClassNotFoundException | SQLException e) {
        }
       
    }

    
    public void ShowDataInRoomTable() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels", "root", "password");
            pst = conn.prepareStatement("Select *from room where status=?");
            pst.setString(1, "NOT BOOKED");
            rs = pst.executeQuery();
            
            ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
            int q = stData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel) Table.getModel();
            RecordTable.setRowCount(0);

            while (rs.next()) {
                Vector vector = new Vector();
                for (int i = 1; i <= q; i++) {
                    vector.add(rs.getString("roomnumber"));
                    vector.add(rs.getString("roomtype"));
                    vector.add(rs.getString("bedtype"));
                    vector.add(rs.getString("price"));
                    vector.add(rs.getString("status"));
                }
                RecordTable.addRow(vector);
            }

        } catch (ClassNotFoundException | SQLException e) { 
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtmobilenumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        combogender = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtnation = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        lblemail = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        combobedtype = new javax.swing.JComboBox<>();
        comboroomtype = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        bottoncheckin = new javax.swing.JButton();
        bottonclear = new javax.swing.JButton();
        comboroomnumber = new javax.swing.JComboBox<>();
        txtindate = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1055, 0, 45, -1));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(222, 108, 100));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customer Check Out.png"))); // NOI18N
        jLabel1.setText("Customer Checkin");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 57));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 349, 32));

        txtname.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnameKeyPressed(evt);
            }
        });
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 180, 33));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Mobile Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 180, 27));

        txtmobilenumber.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtmobilenumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmobilenumberKeyPressed(evt);
            }
        });
        getContentPane().add(txtmobilenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 180, 34));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 180, 37));

        combogender.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        combogender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        combogender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combogenderKeyPressed(evt);
            }
        });
        getContentPane().add(combogender, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 180, 36));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nationality");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 180, 36));

        txtnation.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtnation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnationKeyPressed(evt);
            }
        });
        getContentPane().add(txtnation, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 180, 36));

        txtemail.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtemailKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 180, 38));

        lblemail.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        lblemail.setForeground(new java.awt.Color(0, 0, 0));
        lblemail.setText("Email");
        getContentPane().add(lblemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 180, 40));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Checkin Date(Today)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 386, 32));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Bed Type");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 180, 33));

        jLabel9.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Room Type");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 180, 34));

        jLabel10.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Room Number");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 180, 36));

        combobedtype.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        combobedtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Triple" }));
        combobedtype.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobedtypeItemStateChanged(evt);
            }
        });
        combobedtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobedtypeActionPerformed(evt);
            }
        });
        combobedtype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combobedtypeKeyPressed(evt);
            }
        });
        getContentPane().add(combobedtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 180, 34));

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
        comboroomtype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboroomtypeKeyPressed(evt);
            }
        });
        getContentPane().add(comboroomtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 180, 37));

        jLabel11.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("price");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 180, 40));

        bottoncheckin.setBackground(new java.awt.Color(204, 0, 0));
        bottoncheckin.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        bottoncheckin.setText("Checkin Now");
        bottoncheckin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoncheckinActionPerformed(evt);
            }
        });
        getContentPane().add(bottoncheckin, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 479, 120, 30));

        bottonclear.setBackground(new java.awt.Color(204, 0, 0));
        bottonclear.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        bottonclear.setText("Clear");
        bottonclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottonclearActionPerformed(evt);
            }
        });
        getContentPane().add(bottonclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 520, 120, -1));

        comboroomnumber.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        comboroomnumber.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboroomnumberItemStateChanged(evt);
            }
        });
        comboroomnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboroomnumberActionPerformed(evt);
            }
        });
        comboroomnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                comboroomnumberKeyPressed(evt);
            }
        });
        getContentPane().add(comboroomnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 180, 36));

        txtindate.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        getContentPane().add(txtindate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 180, 33));

        txtprice.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 180, 38));

        address.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        address.setForeground(new java.awt.Color(0, 0, 0));
        address.setText("Address");
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 180, 30));

        txtaddress.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        getContentPane().add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 180, 40));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ROOM NUMBER", "ROOM TYPE", "BED TYPE", "PRICE", "STATUS"
            }
        ));
        Table.setName(""); // NOI18N
        Table.setShowGrid(true);
        jScrollPane1.setViewportView(Table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 470, 370));

        jPanel1.setBackground(new java.awt.Color(255, 0, 255));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, 500));

        jLabel12.setFont(new java.awt.Font("Algerian", 2, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("AVAILABLE ROOMS");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 240, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/room.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 60, -1, 90));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void combobedtypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobedtypeItemStateChanged

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels", "root", "password");
            pst = con.prepareStatement("select roomnumber from room where status=? AND roomtype=? AND bedtype=?");
            pst.setString(1, "Not Booked");
            pst.setString(2, (String) comboroomtype.getSelectedItem());
            pst.setString(3, (String) combobedtype.getSelectedItem());
            rs = pst.executeQuery();

            // Clear existing items
            comboroomnumber.removeAllItems();

            while (rs.next()) {
                comboroomnumber.addItem(rs.getString("roomnumber"));
            }

            // Assuming you want to set the price for the first room number in the list
            if (comboroomnumber.getItemCount() > 0) {
                pst = con.prepareStatement("select price from room where roomnumber=?");
                pst.setString(1, comboroomnumber.getItemAt(0));
                rs = pst.executeQuery();
                if (rs.next()) {
                    txtprice.setText(rs.getString("price"));
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
           JOptionPane.showMessageDialog(null, e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_combobedtypeItemStateChanged

    private void comboroomtypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboroomtypeItemStateChanged
// TODO add your handling code here:
    }//GEN-LAST:event_comboroomtypeItemStateChanged

    private void bottonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottonclearActionPerformed
        txtname.setText("");
        txtmobilenumber.setText("");
        txtemail.setText("");
        txtnation.setText("");
        txtprice.setText("");
        txtaddress.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_bottonclearActionPerformed


    private void bottoncheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoncheckinActionPerformed

           // Input validation
        String name = txtname.getText().trim();
        String mobileNumber = txtmobilenumber.getText().trim();
        String email = txtemail.getText().trim().toLowerCase();
        String address=txtaddress.getText();
        String nation = txtnation.getText().trim();

        if (name.isEmpty() || mobileNumber.isEmpty() || email.isEmpty() || nation.isEmpty()||address.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required.");
            return;
        }

        if (mobileNumber.length() != 10 || !mobileNumber.matches("\\d{10}")) {
            JOptionPane.showMessageDialog(this, "Mobile Number should be 10 digits and contain only numeric digits.");
            return;
        }

        try {
            long parsedMobileNumber = Long.parseLong(mobileNumber);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Mobile Number is not valid.\nInsert like(09xxxxxxxx)");
            return;
        }

        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Email is not valid.\nInsert like(example@gmail.com)");
            return;
        }

        try {
            // Database connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels", "root", "password");

            // Insert customer data into the database
            pst = con.prepareStatement("INSERT INTO customer (name, mobile, email, gender, nationality,address, indate, roomnumber, bedtype, roomtype, price, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)");
            pst.setString(1, name);
            pst.setString(2, mobileNumber);
            pst.setString(3, email);
            pst.setString(4, combogender.getItemAt(combogender.getSelectedIndex()));
            pst.setString(5, nation);
            pst.setString(6, address);
            pst.setString(7, txtindate.getText());
            pst.setString(8, (String) comboroomnumber.getSelectedItem());
            pst.setString(9, (String) combobedtype.getSelectedItem());
            pst.setString(10, (String) comboroomtype.getSelectedItem());
            pst.setString(11, txtprice.getText());
            pst.setString(12, "NULL");
            pst.executeUpdate();

            // Update room status
            pst = con.prepareStatement("UPDATE room SET status=? WHERE roomnumber=?");
            pst.setString(1, "Booked");
            pst.setString(2, (String) comboroomnumber.getSelectedItem());
            pst.executeUpdate();

            // Refresh room number combo box
            pst = con.prepareStatement("SELECT roomnumber FROM room WHERE status=? AND roomtype=? AND bedtype=?");
            pst.setString(1, "Not Booked");
            pst.setString(2, comboroomtype.getItemAt(comboroomtype.getSelectedIndex()));
            pst.setString(3, combobedtype.getItemAt(combobedtype.getSelectedIndex()));
            rs = pst.executeQuery();
            comboroomnumber.removeAllItems();
            while (rs.next()) {
                comboroomnumber.addItem(rs.getString("roomnumber"));
            }

            // Set price text field
            pst = con.prepareStatement("SELECT price FROM room WHERE roomnumber=?");
            pst.setString(1, comboroomnumber.getItemAt(comboroomnumber.getSelectedIndex()));
            rs = pst.executeQuery();
            if (rs.next()) {
                txtprice.setText(rs.getString("price"));
            }

            // Clear input fields
            txtname.setText("");
            txtmobilenumber.setText("");
            txtnation.setText("");
            txtemail.setText("");
            txtaddress.setText("");
            txtprice.setText("");
            combogender.setSelectedIndex(-1);
            combobedtype.setSelectedIndex(-1);
            comboroomtype.setSelectedIndex(-1);

            if (comboroomnumber.getItemCount() == 0) {
                txtprice.setText("");
            }
            JOptionPane.showMessageDialog(this, "Room Allotted");
              ShowDataInRoomTable();
              
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
        // TODO add your handling code here:
    }//GEN-LAST:event_bottoncheckinActionPerformed


    private void comboroomnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboroomnumberActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_comboroomnumberActionPerformed


    private void comboroomtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboroomtypeActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels", "root", "password");
            pst = con.prepareStatement("select roomnumber from room where status=? AND roomtype=? AND bedtype=?");
            pst.setString(1, "Not Booked");
            pst.setString(2, comboroomtype.getItemAt(comboroomtype.getSelectedIndex()));
            pst.setString(3, combobedtype.getItemAt(combobedtype.getSelectedIndex()));
            rs = pst.executeQuery();
            comboroomnumber.removeAllItems();
            while (rs.next()) {
                comboroomnumber.addItem(rs.getString("roomnumber"));
            }
            pst = con.prepareStatement("select price from room where roomnumber=?");
            pst.setString(1, comboroomnumber.getItemAt(comboroomnumber.getSelectedIndex()));
            rs = pst.executeQuery();
            if (rs.next()) {
                txtprice.setText(rs.getString("price"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_comboroomtypeActionPerformed


    private void combobedtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobedtypeActionPerformed
        // TODO add your handling code here:  
    }//GEN-LAST:event_combobedtypeActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
// TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed


    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
// TODO add your handling code here:
    }//GEN-LAST:event_txtemailKeyReleased


    private void txtnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtname.requestFocus();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_txtnameKeyPressed

    private void txtmobilenumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmobilenumberKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtmobilenumber.requestFocus();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_txtmobilenumberKeyPressed

    private void combogenderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combogenderKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            combogender.requestFocus();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_combogenderKeyPressed

    private void txtnationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnationKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtnation.requestFocus();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_txtnationKeyPressed

    private void txtemailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtemail.requestFocus();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_txtemailKeyPressed

    private void combobedtypeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combobedtypeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            combobedtype.requestFocus();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_combobedtypeKeyPressed

    private void comboroomtypeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboroomtypeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            comboroomtype.requestFocus();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_comboroomtypeKeyPressed

    private void comboroomnumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboroomnumberKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            comboroomnumber.requestFocus();
        }
// TODO add your handling code here:
    }//GEN-LAST:event_comboroomnumberKeyPressed

    private void comboroomnumberItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboroomnumberItemStateChanged
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels", "root", "password");
            pst = con.prepareStatement("select price from room where roomnumber=?");
            pst.setString(1, comboroomnumber.getItemAt(comboroomnumber.getSelectedIndex()));
            rs = pst.executeQuery();
            if (rs.next()) {
                txtprice.setText(rs.getString("price"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_comboroomnumberItemStateChanged

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
            java.util.logging.Logger.getLogger(CustomerCheckin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCheckin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCheckin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JLabel address;
    private javax.swing.JButton bottoncheckin;
    private javax.swing.JButton bottonclear;
    private javax.swing.JComboBox<String> combobedtype;
    private javax.swing.JComboBox<String> combogender;
    private javax.swing.JComboBox<String> comboroomnumber;
    private javax.swing.JComboBox<String> comboroomtype;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblemail;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtindate;
    private javax.swing.JTextField txtmobilenumber;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnation;
    private javax.swing.JTextField txtprice;
    // End of variables declaration//GEN-END:variables
}
