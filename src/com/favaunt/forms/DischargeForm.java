package com.favaunt.forms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author deepratnaawale
 */
public class DischargeForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisteredPatients
     */
    public DischargeForm() {
        initLookAndFeel();
        initComponents();
        tablePanel.setVisible(false);
    }

    private void initLookAndFeel() {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DischargeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        hidePatientDatabaseBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        criteriaPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchCriteria = new javax.swing.JComboBox();
        searchField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        dischargeBtn = new javax.swing.JButton();
        dischargePatientId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        patientBillInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("registeredPatientsWindow"); // NOI18N

        jButton1.setText(">>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        patientTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(patientTable);

        hidePatientDatabaseBtn.setText("<<");
        hidePatientDatabaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hidePatientDatabaseBtnActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Search");

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Select Criteria:");

        searchCriteria.setMaximumRowCount(12);
        searchCriteria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "patientId", "patientName", "patientAge", "patientGender", "patientBloodGroup", "patientPhoneNumber", "patientComments", "patientAdmissionDate", "patientDischageDate", "patientWard", "patientMedicalReportNumber", "patientAddress" }));
        searchCriteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCriteriaActionPerformed(evt);
            }
        });

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        dischargeBtn.setText("Discharge");
        dischargeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dischargeBtnActionPerformed(evt);
            }
        });

        dischargePatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dischargePatientIdActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Enter Patient Id");

        patientBillInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientBillInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout criteriaPanelLayout = new javax.swing.GroupLayout(criteriaPanel);
        criteriaPanel.setLayout(criteriaPanelLayout);
        criteriaPanelLayout.setHorizontalGroup(
            criteriaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(criteriaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(criteriaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchCriteria, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(criteriaPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2))
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn)
                    .addComponent(jLabel3)
                    .addGroup(criteriaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(patientBillInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                        .addComponent(dischargePatientId, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(dischargeBtn))
                .addGap(59, 59, 59))
        );
        criteriaPanelLayout.setVerticalGroup(
            criteriaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(criteriaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchCriteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dischargePatientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(patientBillInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dischargeBtn)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1))
                    .addComponent(criteriaPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(142, 142, 142)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(hidePatientDatabaseBtn))
                .addGap(137, 137, 137)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(criteriaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(75, 75, 75))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hidePatientDatabaseBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/db_base", "root", "toor");
            PreparedStatement statement = conn.prepareStatement("Select * from PATIENT_DATABASE");

            ResultSet result = statement.executeQuery();
            patientTable.setModel(DbUtils.resultSetToTableModel(result));
            TableColumnModel cm = patientTable.getColumnModel();
            cm.getColumn(0).setPreferredWidth(100);
            cm.getColumn(1).setPreferredWidth(100);
            cm.getColumn(2).setPreferredWidth(100);
            cm.getColumn(3).setPreferredWidth(200);
            cm.getColumn(4).setPreferredWidth(200);
            cm.getColumn(5).setPreferredWidth(200);
            cm.getColumn(6).setPreferredWidth(200);
            cm.getColumn(7).setPreferredWidth(200);
            cm.getColumn(8).setPreferredWidth(200);
            cm.getColumn(9).setPreferredWidth(150);
            cm.getColumn(10).setPreferredWidth(150);
            cm.getColumn(11).setPreferredWidth(220);
            cm.getColumn(12).setPreferredWidth(150);
            cm.getColumn(13).setPreferredWidth(200);

            tablePanel.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void hidePatientDatabaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hidePatientDatabaseBtnActionPerformed
        tablePanel.setVisible(true);
    }//GEN-LAST:event_hidePatientDatabaseBtnActionPerformed

    private void searchCriteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCriteriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchCriteriaActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/db_base", "root", "toor");
            PreparedStatement statement = conn.prepareStatement("Select * from PATIENT_DATABASE where ' " + searchCriteria.getSelectedItem().toString() + " ' = ?");
            statement.setString(1, searchField.getText());
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                patientTable.setModel(DbUtils.resultSetToTableModel(result));
                TableColumnModel cm = patientTable.getColumnModel();
                cm.getColumn(0).setPreferredWidth(100);
                cm.getColumn(1).setPreferredWidth(100);
                cm.getColumn(2).setPreferredWidth(100);
                cm.getColumn(3).setPreferredWidth(200);
                cm.getColumn(4).setPreferredWidth(200);
                cm.getColumn(5).setPreferredWidth(200);
                cm.getColumn(6).setPreferredWidth(200);
                cm.getColumn(7).setPreferredWidth(200);
                cm.getColumn(8).setPreferredWidth(200);
                cm.getColumn(9).setPreferredWidth(150);
                cm.getColumn(10).setPreferredWidth(150);
                cm.getColumn(11).setPreferredWidth(220);
                cm.getColumn(12).setPreferredWidth(150);
                cm.getColumn(13).setPreferredWidth(200);
                tablePanel.setVisible(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void dischargeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dischargeBtnActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/db_base", "root", "toor");
            PreparedStatement statement = conn.prepareStatement("UPDATE PATIENT_DATABASE SET patientDischargeDate = ? , patientBill = ? WHERE patientId = ?");
            statement.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
            statement.setString(2, patientBillInput.getText());
            statement.setString(3, dischargePatientId.getText());
            statement.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_dischargeBtnActionPerformed

    private void dischargePatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dischargePatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dischargePatientIdActionPerformed

    private void patientBillInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientBillInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientBillInputActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel criteriaPanel;
    private javax.swing.JButton dischargeBtn;
    private javax.swing.JTextField dischargePatientId;
    private javax.swing.JButton hidePatientDatabaseBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField patientBillInput;
    private javax.swing.JTable patientTable;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox searchCriteria;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel tablePanel;
    // End of variables declaration//GEN-END:variables

}
