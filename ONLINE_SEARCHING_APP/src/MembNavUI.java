import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MembNavUI.java
 *
 * Created on May 13, 2010, 10:43:17 AM
 */

/**
 *
 * @author xp_system
 */
public class MembNavUI extends javax.swing.JFrame {

    /** Creates new form MembNavUI */
    public MembNavUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMDate = new javax.swing.JTextField();
        txtMFee = new javax.swing.JTextField();
        txtMNo = new javax.swing.JTextField();
        txtMStatus = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtMAdd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMName = new javax.swing.JTextField();
        txtMPh = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMIssue = new javax.swing.JTextField();
        cmdPrev = new javax.swing.JButton();
        cmdLast = new javax.swing.JButton();
        cmdNext = new javax.swing.JButton();
        cmdExit = new javax.swing.JButton();
        cmdFirst = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Member Record Navigation");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMDate.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        getContentPane().add(txtMDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 167, 100, -1));

        txtMFee.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        getContentPane().add(txtMFee, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 193, 74, -1));
        getContentPane().add(txtMNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 62, 47, -1));

        txtMStatus.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        getContentPane().add(txtMStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 193, 31, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Membership Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 168, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Member No.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 64, -1, -1));

        jLabel6.setFont(new java.awt.Font("VAGRounded BT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MEMBER INFORMATION");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 24, 517, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 49, 537, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Status");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 194, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 527, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Membership Fee");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 194, -1, -1));
        getContentPane().add(txtMAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 131, 272, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Address");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 133, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 102, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Phone/Mobile");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 168, -1, -1));

        txtMName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMNameActionPerformed(evt);
            }
        });
        txtMName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtMNamePropertyChange(evt);
            }
        });
        txtMName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMNameKeyPressed(evt);
            }
        });
        getContentPane().add(txtMName, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 100, 178, -1));
        getContentPane().add(txtMPh, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 166, 118, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Issue Status");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 194, -1, -1));
        getContentPane().add(txtMIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 192, 29, -1));

        cmdPrev.setText("Previous");
        cmdPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPrevActionPerformed(evt);
            }
        });
        getContentPane().add(cmdPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 243, -1, -1));

        cmdLast.setText("Last");
        cmdLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLastActionPerformed(evt);
            }
        });
        getContentPane().add(cmdLast, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 243, -1, -1));

        cmdNext.setText("Next");
        cmdNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNextActionPerformed(evt);
            }
        });
        getContentPane().add(cmdNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 243, -1, -1));

        cmdExit.setText("Exit");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });
        getContentPane().add(cmdExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 243, -1, -1));

        cmdFirst.setText("First");
        cmdFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdFirstActionPerformed(evt);
            }
        });
        getContentPane().add(cmdFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 243, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.PNG"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 300));

        setSize(new java.awt.Dimension(556, 340));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
// Global variables
    Statement stmt = null;
    ResultSet rs = null;
    String SQL = "SELECT * FROM Member";
    public void disable_textfields() {
        txtMNo.setEditable(false);
        txtMName.setEditable(false);
        txtMAdd.setEditable(false);
        txtMPh.setEditable(false);
        txtMDate.setEditable(false);
        txtMFee.setEditable(false);
        txtMStatus.setEditable(false);
        txtMIssue.setEditable(false);
    }

    private void txtMNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMNameActionPerformed

}//GEN-LAST:event_txtMNameActionPerformed

    private void txtMNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtMNamePropertyChange

}//GEN-LAST:event_txtMNamePropertyChange

    private void txtMNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMNameKeyPressed

}//GEN-LAST:event_txtMNameKeyPressed

    private void cmdPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPrevActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","admin");
            if (rs.previous()) {
                String Mno = rs.getString("memb_no");
                String MName = rs.getString("memb_name");
                String MAdd = rs.getString("memb_add");
                String MPh1 = rs.getString("memb_phone");
                String MDate = rs.getString("mdate");
                String MEDate = rs.getString("medate");
                String MFee = rs.getString("mfee");
                String MStatus = rs.getString("mem_status");
                String MIssue = rs.getString("mem_issue");
                // Displaying the contents in respective text boxes.
                txtMNo.setText(Mno);
                txtMName.setText(MName);
                txtMAdd.setText(MAdd);
                txtMPh.setText(MPh1);
                txtMDate.setText(MDate);
                txtMFee.setText(MFee);
                txtMStatus.setText(MStatus);
                txtMIssue.setText(MIssue);
                cmdFirst.setEnabled(true);
                cmdNext.setEnabled(true);
                cmdPrev.setEnabled(true);
                cmdLast.setEnabled(true);
            } else {
                cmdPrev.setEnabled(false);
                JOptionPane.showMessageDialog(this, "You are at first position", "Student",0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_cmdPrevActionPerformed

    private void cmdLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLastActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","admin");
            if (rs.last()) {
                String Mno = rs.getString("memb_no");
                String MName = rs.getString("memb_name");
                String MAdd = rs.getString("memb_add");
                String MPh1 = rs.getString("memb_phone");
                String MDate = rs.getString("mdate");
                String MEDate = rs.getString("medate");
                String MFee = rs.getString("mfee");
                String MStatus = rs.getString("mem_status");
                String MIssue = rs.getString("mem_issue");
                // Displaying the contents in respective text boxes.
                txtMNo.setText(Mno);
                txtMName.setText(MName);
                txtMAdd.setText(MAdd);
                txtMPh.setText(MPh1);
                txtMDate.setText(MDate);
                txtMFee.setText(MFee);
                txtMStatus.setText(MStatus);
                txtMIssue.setText(MIssue);
                cmdFirst.setEnabled(true);
                cmdNext.setEnabled(false);
                cmdPrev.setEnabled(true);
                cmdLast.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this, "You are already at last record", "Student",0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_cmdLastActionPerformed

    private void cmdNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNextActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","admin");
            if (rs.next()) {
                String Mno = rs.getString("memb_no");
                String MName = rs.getString("memb_name");
                String MAdd = rs.getString("memb_add");
                String MPh1 = rs.getString("memb_phone");
                String MDate = rs.getString("mdate");
                String MEDate = rs.getString("medate");
                String MFee = rs.getString("mfee");
                String MStatus = rs.getString("mem_status");
                String MIssue = rs.getString("mem_issue");
                // Displaying the contents in respective text boxes.
                txtMNo.setText(Mno);
                txtMName.setText(MName);
                txtMAdd.setText(MAdd);
                txtMPh.setText(MPh1);
                txtMDate.setText(MDate);
                txtMFee.setText(MFee);
                txtMStatus.setText(MStatus);
                txtMIssue.setText(MIssue);
                cmdFirst.setEnabled(true);
                cmdNext.setEnabled(true);
                cmdPrev.setEnabled(true);
                cmdLast.setEnabled(true);
            } else {
                cmdNext.setEnabled(false);
                JOptionPane.showMessageDialog(this, "You are at last record position", "Student",0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_cmdNextActionPerformed

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_cmdExitActionPerformed

    private void cmdFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdFirstActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","admin");
            if (rs.first()) {
                String Mno = rs.getString("memb_no");
                String MName = rs.getString("memb_name");
                String MAdd = rs.getString("memb_add");
                String MPh1 = rs.getString("memb_phone");
                String MDate = rs.getString("mdate");
                String MEDate = rs.getString("medate");
                String MFee = rs.getString("mfee");
                String MStatus = rs.getString("mem_status");
                String MIssue = rs.getString("mem_issue");
                // Displaying the contents in respective text boxes.
                txtMNo.setText(Mno);
                txtMName.setText(MName);
                txtMAdd.setText(MAdd);
                txtMPh.setText(MPh1);
                txtMDate.setText(MDate);
                txtMFee.setText(MFee);
                txtMStatus.setText(MStatus);
                txtMIssue.setText(MIssue);
                cmdFirst.setEnabled(false);
                cmdNext.setEnabled(true);
                cmdPrev.setEnabled(false);
                cmdLast.setEnabled(true);
            } else {
                cmdFirst.setEnabled(false);
                cmdNext.setEnabled(false);
                cmdPrev.setEnabled(false);
                cmdLast.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Rhere is no record in table", "Student",0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_cmdFirstActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        disable_textfields();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","admin");
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            if (rs.first())
            {
                String Mno = rs.getString("memb_no");
                String MName = rs.getString("memb_name");
                String MAdd = rs.getString("memb_add");
                String MPh1 = rs.getString("memb_phone");
                String MDate = rs.getString("mdate");
                String MEDate = rs.getString("medate");
                String MFee = rs.getString("mfee");
                String MStatus = rs.getString("mem_status");
                String MIssue = rs.getString("mem_issue");
                // Displaying the contents in respective text boxes.
                txtMNo.setText(Mno);
                txtMName.setText(MName);
                txtMAdd.setText(MAdd);
                txtMPh.setText(MPh1);
                txtMDate.setText(MDate);
                txtMFee.setText(MFee);
                txtMStatus.setText(MStatus);
                txtMIssue.setText(MIssue);
                cmdFirst.setEnabled(false);
                cmdNext.setEnabled(true);
                cmdPrev.setEnabled(false);
                cmdLast.setEnabled(true);
            }
            else
            {
                cmdFirst.setEnabled(false);
                cmdNext.setEnabled(false);
                cmdPrev.setEnabled(false);
                cmdLast.setEnabled(false);
                JOptionPane.showMessageDialog(this, "Rhere is no record in table", "Student",0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_formWindowGainedFocus

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MembNavUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdExit;
    private javax.swing.JButton cmdFirst;
    private javax.swing.JButton cmdLast;
    private javax.swing.JButton cmdNext;
    private javax.swing.JButton cmdPrev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtMAdd;
    private javax.swing.JTextField txtMDate;
    private javax.swing.JTextField txtMFee;
    private javax.swing.JTextField txtMIssue;
    private javax.swing.JTextField txtMName;
    private javax.swing.JTextField txtMNo;
    private javax.swing.JTextField txtMPh;
    private javax.swing.JTextField txtMStatus;
    // End of variables declaration//GEN-END:variables

}