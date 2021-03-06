import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ReturnUI.java
 *
 * Created on May 13, 2010, 1:27:38 PM
 */

/**
 *
 * @author xp_system
 */
public class ReturnUI extends javax.swing.JFrame {

    /** Creates new form ReturnUI */
    public ReturnUI() {
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

        jLabel1 = new javax.swing.JLabel();
        txtMName = new javax.swing.JTextField();
        txtMNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMStatus = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();
        cmdExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtAcno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBTitle = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAuth = new javax.swing.JTextField();
        cmdReturn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Library book return form");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Member No.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 45, -1, -1));

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
        getContentPane().add(txtMName, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 74, 178, -1));
        getContentPane().add(txtMNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 43, 47, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 76, -1, -1));

        txtMStatus.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        getContentPane().add(txtMStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 141, 31, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Status");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 142, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Membership Date");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 105, -1, -1));

        txtMDate.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        getContentPane().add(txtMDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 104, 100, -1));

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 33, 138, 151));

        jLabel6.setFont(new java.awt.Font("Helvetica", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Select a Member");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 11, 104, -1));

        cmdExit.setText("Exit");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });
        getContentPane().add(cmdExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 268, -1, -1));

        jLabel3.setText("Accession No. ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 206, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 459, -1));
        getContentPane().add(txtAcno, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 203, 89, -1));

        jLabel4.setText("Title");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 206, -1, -1));
        getContentPane().add(txtBTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 203, 204, -1));

        jLabel8.setText("Author");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 237, -1, -1));
        getContentPane().add(txtAuth, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 234, 220, -1));

        cmdReturn.setText("Return");
        cmdReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdReturnActionPerformed(evt);
            }
        });
        getContentPane().add(cmdReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 268, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 234, 103, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.PNG"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 300));

        setSize(new java.awt.Dimension(495, 341));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
Statement stmt = null;
    ResultSet rs = null;
    char st1 = 'Y';
    String SQL = "SELECT * FROM Member WHERE mem_issue = '" + st1 + "';";

    Statement stmt1 = null;
    ResultSet rs1 = null;
    char st = 'Y';  // Lib table
    String SQL1 = "SELECT * FROM Lib WHERE status = '" + st + "';";


    Statement stmt2 = null;
    ResultSet rs2 = null;
    String SQL2 = "SELECT * FROM Missue";

    Statement stmt3 = null;
    ResultSet rs3 = null;
    String SQL3 = "SELECT * FROM Tissue";

    private void txtMNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMNameActionPerformed

}//GEN-LAST:event_txtMNameActionPerformed

    private void txtMNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtMNamePropertyChange

}//GEN-LAST:event_txtMNamePropertyChange

    private void txtMNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMNameKeyPressed

}//GEN-LAST:event_txtMNameKeyPressed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
                String MembNo = (String) jList1.getSelectedValue();
        String Mno =MembNo.trim().substring(0, 3);
        String query = "SELECT * FROM Member WHERE memb_no = " + (Mno) + ";";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","admin");
            // Create SQL statement and execute query.
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            if (rs.next()) {
                String MName = rs.getString("memb_name");
                String MDate = rs.getString("mdate");
                String MStatus = rs.getString("mem_status");
                // Displaying the contents in respective text boxes.
                txtMNo.setText(Mno);
                txtMName.setText(MName);
                txtMDate.setText(MDate);
                txtMStatus.setText(MStatus);
            } else {
                JOptionPane.showMessageDialog(null, "Record does not found in Member table");
            }
            
            
            // Extrating the Acc_no from Tissue table to find book details in Lib table
            String query1 = "SELECT * FROM Tissue WHERE memb_no = " + (Mno) + ";";
            // Create SQL statement and execute query.
            stmt3 = con.createStatement();
            rs3 = stmt3.executeQuery(query1);
            int ACno = 0;
            if (rs3.next()) {
                ACno = rs3.getInt("acc_no");
                txtAcno.setText(String.valueOf(ACno));
            }
            // Extrating the Library details for Acc_no from Lib table
            String query2 = "SELECT * FROM Lib WHERE acc_no = " + (ACno) + ";";
            // Create SQL statement and execute query.
            stmt1 = con.createStatement();
            rs1 = stmt1.executeQuery(query2);
            String BTitle, Auth;
            if (rs1.next()) {
                BTitle = rs1.getString("btitle");
                Auth = rs1.getString("author1");
                txtBTitle.setText(BTitle);
                txtAuth.setText(Auth);
                jLabel9.setText("Issued");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
}//GEN-LAST:event_jList1MouseClicked

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        txtMNo.setEditable(false);
        txtMName.setEditable(false);
        txtMDate.setEditable(false);
        txtMStatus.setEditable(false);
        txtAcno.setEditable(false);
        txtBTitle.setEditable(false);
        txtAuth.setEditable(false);
        // dModel to perform DefaultListModel for Member
        // method operations
        DefaultListModel dModel = (DefaultListModel) jList1.getModel();
        // Method to add elements into jList1 control for member
        dModel.clear();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","admin");

            // Listing Members
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                String Mno = rs.getString("memb_no");
                String MName = rs.getString("memb_name");
                // To make the Member no. as 4 digit because we will extract 4 digit from list value
		// in mouse click event.

                if (Mno.length() < 4)
                {
                    int x = Mno.length();
                    int nl = 4 - x;
                    while (nl > 0){
                        Mno = Mno + " ";
                        nl--;
                    }
                }
                dModel.addElement(Mno + "- " + MName);
            }
            jList1.setModel(dModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        this.setVisible(false);
}//GEN-LAST:event_cmdExitActionPerformed

    private void cmdReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdReturnActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","admin");
            // Missue table
            int Mno = 0, Acno = 0;
            Mno = Integer.parseInt(txtMNo.getText().trim());
            Acno = Integer.parseInt(txtAcno.getText().trim());
            // Steps to confirm return
            int opt = JOptionPane.showConfirmDialog(null, "Are you sure to return this book ?");
            if (opt == JOptionPane.YES_OPTION)
            {
                String strSQLr = "Delete from Tissue where memb_no = " + (Mno);
                stmt3.executeUpdate(strSQLr);
                // Change the status as library book issued
                char sta = 'Y';  // Lib table
                String strSQLa = "Update Lib set status ='"+(sta)+"' where acc_no = " + (Acno);
                stmt1.executeUpdate(strSQLa);
                // Change the status as Member has a book
                char stb = 'N';  // Member table
                String strSQLb = "Update Member set mem_issue ='"+(stb)+"' where memb_no = " + (Mno);
                stmt.executeUpdate(strSQLb);
                JOptionPane.showMessageDialog(this, "Thanks for returning book");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_cmdReturnActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdExit;
    private javax.swing.JButton cmdReturn;
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
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtAcno;
    private javax.swing.JTextField txtAuth;
    private javax.swing.JTextField txtBTitle;
    private javax.swing.JTextField txtMDate;
    private javax.swing.JTextField txtMName;
    private javax.swing.JTextField txtMNo;
    private javax.swing.JTextField txtMStatus;
    // End of variables declaration//GEN-END:variables

}
