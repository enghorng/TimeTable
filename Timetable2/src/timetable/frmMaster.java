/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetable;

import java.awt.Frame;
import java.awt.PopupMenu;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class frmMaster extends javax.swing.JFrame {

    /**
     * Creates new form frmMaster
     */
    public frmMaster() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        pnlBuilding = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mitLogOut = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mitClass = new javax.swing.JMenuItem();
        mitCourse = new javax.swing.JMenuItem();
        mitEmployee = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        mitStudent = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mitUser = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mitAboutUs = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabel2.setText("User:");

        lblUser.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        lblUser.setText("jLabel3");

        javax.swing.GroupLayout pnlBuildingLayout = new javax.swing.GroupLayout(pnlBuilding);
        pnlBuilding.setLayout(pnlBuildingLayout);
        pnlBuildingLayout.setHorizontalGroup(
            pnlBuildingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlBuildingLayout.setVerticalGroup(
            pnlBuildingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N

        jMenu1.setText("File      ");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        mitLogOut.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mitLogOut.setText("Log Out           ");
        mitLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitLogOutActionPerformed(evt);
            }
        });
        jMenu1.add(mitLogOut);

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Function    ");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        jMenu3.setText("Information");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        mitClass.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mitClass.setText("Class");
        mitClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitClassActionPerformed(evt);
            }
        });
        jMenu3.add(mitClass);

        mitCourse.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mitCourse.setText("Course");
        mitCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitCourseActionPerformed(evt);
            }
        });
        jMenu3.add(mitCourse);

        mitEmployee.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mitEmployee.setText("Employee        ");
        mitEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitEmployeeActionPerformed(evt);
            }
        });
        jMenu3.add(mitEmployee);

        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItem12.setText("Room");
        jMenu3.add(jMenuItem12);

        mitStudent.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mitStudent.setText("Student");
        mitStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitStudentActionPerformed(evt);
            }
        });
        jMenu3.add(mitStudent);

        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItem6.setText("Teacher");
        jMenu3.add(jMenuItem6);

        jMenu2.add(jMenu3);

        jMenuItem4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItem4.setText("Teacher Form");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Security    ");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        mitUser.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mitUser.setText("User Security      ");
        mitUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitUserActionPerformed(evt);
            }
        });
        jMenu4.add(mitUser);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("About   ");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        mitAboutUs.setText("About us   ");
        jMenu5.add(mitAboutUs);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblUser, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1653, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBuilding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlBuilding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 542, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblUser))
                .addGap(30, 30, 30))
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitStudentActionPerformed
 try{
            dlgStudent obj = new dlgStudent(this, true);
            obj.setVisible(true);
            formWindowOpened(null);
            
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_mitStudentActionPerformed

    private void mitClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitClassActionPerformed
        try{
            dlgClass obj = new dlgClass(this, true);
            obj.setVisible(true);
            formWindowOpened(null);
            
        }
        catch(Exception e){
            
        }
    }//GEN-LAST:event_mitClassActionPerformed

    private void mitLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitLogOutActionPerformed
        try{
            clsCon.getCon().close();
            this.dispose();
            Login.main(null);
        }
        catch(Exception e){   
        }  
    }//GEN-LAST:event_mitLogOutActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lblUser.setText(Login.getUserName());
    }//GEN-LAST:event_formWindowOpened

    private void mitCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitCourseActionPerformed
         try{
            dlgCourse obj = new dlgCourse(this, true);
            obj.setVisible(true);
            formWindowOpened(null);            
        }
        catch(Exception e){            
        }    
       
    }//GEN-LAST:event_mitCourseActionPerformed

    private void mitEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitEmployeeActionPerformed
        try{
            dlgEmployee obj = new dlgEmployee(this, true);
            obj.setVisible(true);
            formWindowOpened(null);            
        }
        catch(Exception e){          
        }         
    }//GEN-LAST:event_mitEmployeeActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            clsCon.getCon().close();
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_formWindowClosed

    private void mitUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitUserActionPerformed
        try{
            dlgUser obj = new dlgUser(this, true);
            obj.setVisible(true);
            formWindowOpened(null);            
        }
        catch(Exception e){          
        }
    }//GEN-LAST:event_mitUserActionPerformed

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
            java.util.logging.Logger.getLogger(frmMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMaster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMaster().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JLabel lblUser;
    private javax.swing.JMenuItem mitAboutUs;
    private javax.swing.JMenuItem mitClass;
    private javax.swing.JMenuItem mitCourse;
    private javax.swing.JMenuItem mitEmployee;
    private javax.swing.JMenuItem mitLogOut;
    private javax.swing.JMenuItem mitStudent;
    private javax.swing.JMenuItem mitUser;
    private javax.swing.JPanel pnlBuilding;
    // End of variables declaration//GEN-END:variables
}
