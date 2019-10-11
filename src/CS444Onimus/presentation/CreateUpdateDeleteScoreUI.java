/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS444Onimus.presentation;

import CS444Onimus.service.*;
import CS444Onimus.domain.*;
import javax.swing.*;

/**
 *
 * @author matt
 */
public class CreateUpdateDeleteScoreUI extends javax.swing.JFrame {
    
    private Account account = null;
    
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * Creates new form createUpdateDeleteScore
     */
    public CreateUpdateDeleteScoreUI() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        roundTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cancelAdd = new javax.swing.JButton();
        deleteAdd = new javax.swing.JButton();
        updateAdd = new javax.swing.JButton();
        submitAdd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        enterCourseName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        roundTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), null, null, null},
                { new Integer(2), null, null, null},
                { new Integer(3), null, null, null},
                { new Integer(4), null, null, null},
                { new Integer(5), null, null, null},
                { new Integer(6), null, null, null},
                { new Integer(7), null, null, null},
                { new Integer(8), null, null, null},
                { new Integer(9), null, null, null},
                { new Integer(10), null, null, null},
                { new Integer(11), null, null, null},
                { new Integer(12), null, null, null},
                { new Integer(13), null, null, null},
                { new Integer(14), null, null, null},
                { new Integer(15), null, null, null},
                { new Integer(16), null, null, null},
                { new Integer(17), null, null, null},
                { new Integer(18), null, null, null}
            },
            new String [] {
                "Hole", "Par", "Score", "Difference"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        roundTable.getTableHeader().setReorderingAllowed(false);
        roundTable.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                roundTableInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        jScrollPane1.setViewportView(roundTable);

        jLabel1.setText("Round Score");

        cancelAdd.setText("Cancel");
        cancelAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelAddActionPerformed(evt);
            }
        });

        deleteAdd.setText("Delete");
        deleteAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAddActionPerformed(evt);
            }
        });

        updateAdd.setText("Update");
        updateAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateAddActionPerformed(evt);
            }
        });

        submitAdd.setText("Submit");
        submitAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitAddActionPerformed(evt);
            }
        });

        jLabel2.setText("Course Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(submitAdd)
                        .addGap(18, 18, 18)
                        .addComponent(updateAdd)
                        .addGap(18, 18, 18)
                        .addComponent(deleteAdd)
                        .addGap(18, 18, 18)
                        .addComponent(cancelAdd)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(190, 190, 190))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(enterCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(enterCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelAdd)
                    .addComponent(deleteAdd)
                    .addComponent(updateAdd)
                    .addComponent(submitAdd))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roundTableInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_roundTableInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_roundTableInputMethodTextChanged

    private void submitAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitAddActionPerformed
        Round round = new Round();
        
               
        //would have loved to do this in a for loop
        round.setHole1Par((int) roundTable.getValueAt(0, 1));
        round.setHole2Par((int) roundTable.getValueAt(1, 1));
        round.setHole3Par((int) roundTable.getValueAt(2, 1));
        round.setHole4Par((int) roundTable.getValueAt(3, 1));
        round.setHole5Par((int) roundTable.getValueAt(4, 1));
        round.setHole6Par((int) roundTable.getValueAt(5, 1));
        round.setHole7Par((int) roundTable.getValueAt(6, 1));
        round.setHole8Par((int) roundTable.getValueAt(7, 1));
        round.setHole9Par((int) roundTable.getValueAt(8, 1));
        round.setHole10Par((int) roundTable.getValueAt(9, 1));
        round.setHole11Par((int) roundTable.getValueAt(10, 1));
        round.setHole12Par((int) roundTable.getValueAt(11, 1));
        round.setHole13Par((int) roundTable.getValueAt(12, 1));
        round.setHole14Par((int) roundTable.getValueAt(13, 1));
        round.setHole15Par((int) roundTable.getValueAt(14, 1));
        round.setHole16Par((int) roundTable.getValueAt(15, 1));
        round.setHole17Par((int) roundTable.getValueAt(16, 1));
        round.setHole18Par((int) roundTable.getValueAt(17, 1));
        
        round.setHole1Score((int) roundTable.getValueAt(0, 2));
        round.setHole2Score((int) roundTable.getValueAt(1, 2));
        round.setHole3Score((int) roundTable.getValueAt(2, 2));
        round.setHole4Score((int) roundTable.getValueAt(3, 2));
        round.setHole5Score((int) roundTable.getValueAt(4, 2));
        round.setHole6Score((int) roundTable.getValueAt(5, 2));
        round.setHole7Score((int) roundTable.getValueAt(6, 2));
        round.setHole8Score((int) roundTable.getValueAt(7, 2));
        round.setHole9Score((int) roundTable.getValueAt(8, 2));
        round.setHole10Score((int) roundTable.getValueAt(9, 2));
        round.setHole11Score((int) roundTable.getValueAt(10, 2));
        round.setHole12Score((int) roundTable.getValueAt(11, 2));
        round.setHole13Score((int) roundTable.getValueAt(12, 2));
        round.setHole14Score((int) roundTable.getValueAt(13, 2));
        round.setHole15Score((int) roundTable.getValueAt(14, 2));
        round.setHole16Score((int) roundTable.getValueAt(15, 2));
        round.setHole17Score((int) roundTable.getValueAt(16, 2));
        round.setHole18Score((int) roundTable.getValueAt(17, 2));
        
        
        round.setHole1Difference(round.getHole1Par() - round.getHole1Score());
        round.setHole2Difference(round.getHole2Par() - round.getHole2Score());
        round.setHole3Difference(round.getHole3Par() - round.getHole3Score());
        round.setHole4Difference(round.getHole4Par() - round.getHole4Score());
        round.setHole5Difference(round.getHole5Par() - round.getHole5Score());
        round.setHole6Difference(round.getHole6Par() - round.getHole6Score());
        round.setHole7Difference(round.getHole7Par() - round.getHole7Score());
        round.setHole8Difference(round.getHole8Par() - round.getHole8Score());
        round.setHole9Difference(round.getHole9Par() - round.getHole9Score());
        round.setHole10Difference(round.getHole10Par() - round.getHole10Score());
        round.setHole11Difference(round.getHole11Par() - round.getHole11Score());
        round.setHole12Difference(round.getHole12Par() - round.getHole12Score());
        round.setHole13Difference(round.getHole13Par() - round.getHole13Score());
        round.setHole14Difference(round.getHole14Par() - round.getHole14Score());
        round.setHole15Difference(round.getHole15Par() - round.getHole15Score());
        round.setHole16Difference(round.getHole16Par() - round.getHole16Score());
        round.setHole17Difference(round.getHole17Par() - round.getHole17Score());
        round.setHole18Difference(round.getHole18Par() - round.getHole18Score());
        
        
        
        round.setCourseName(enterCourseName.getText());
        
        boolean isValid = round.validate();
        
        if(!isValid) {
            JOptionPane.showMessageDialog(this,
                    "A course name and all score must be entered","Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        account.add(round);
        IAccountSvc impl = AccountSvcCacheImpl.getInstance();
        account = impl.update(account);
        if(account == null) {
            JOptionPane.showMessageDialog(this, 
                    "Your round was not saved, please try again", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        JOptionPane.showMessageDialog(this, "Your new round has been saved");
        
        for(int i = 0;i<=17;i++) {
            roundTable.setValueAt("", i, 1);
            roundTable.setValueAt("", i, 2);
        }
       
        
        
        
        
        
    }//GEN-LAST:event_submitAddActionPerformed

    private void updateAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateAddActionPerformed

    private void deleteAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteAddActionPerformed

    private void cancelAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelAddActionPerformed
        this.setVisible(false);
        MainScreenUI mainscreenUI = 
                    new MainScreenUI();
            mainscreenUI.setVisible(true);
    }//GEN-LAST:event_cancelAddActionPerformed

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
            java.util.logging.Logger.getLogger(CreateUpdateDeleteScoreUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUpdateDeleteScoreUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUpdateDeleteScoreUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUpdateDeleteScoreUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUpdateDeleteScoreUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelAdd;
    private javax.swing.JButton deleteAdd;
    private javax.swing.JTextField enterCourseName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable roundTable;
    private javax.swing.JButton submitAdd;
    private javax.swing.JButton updateAdd;
    // End of variables declaration//GEN-END:variables
}
