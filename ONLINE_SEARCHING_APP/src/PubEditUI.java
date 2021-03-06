import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PubEditUI.java
 *
 * Created on May 2, 2010, 1:43:56 PM
 */

/**
 *
 * @author xp_system
 */
public class PubEditUI extends javax.swing.JFrame {

    /** Creates new form PubEditUI */
    public PubEditUI() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
     Statement stmt = null;
    ResultSet rs = null;
    String SQL = "SELECT * FROM Publisher";
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        txtPName = new javax.swing.JTextField();
        txtPAdd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPh1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPh2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        cmdUpdate = new javax.swing.JButton();
        cmdExit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Publisher Data Modification");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Select a Publisher");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 156, -1));

        jList1.setModel(new DefaultListModel());
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 36, 146, 218));

        txtPName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPNameActionPerformed(evt);
            }
        });
        txtPName.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtPNamePropertyChange(evt);
            }
        });
        txtPName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPNameKeyPressed(evt);
            }
        });
        getContentPane().add(txtPName, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 49, 154, -1));
        getContentPane().add(txtPAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 98, 220, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Address");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Phone/Mobile");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 147, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Pbone/Mobile");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 183, -1, -1));
        getContentPane().add(txtPno, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 11, 47, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Publisher No./ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 13, -1, -1));
        getContentPane().add(txtPh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 145, 98, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 51, -1, -1));
        getContentPane().add(txtPh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 183, 98, -1));

        jLabel7.setText("Status");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 224, -1, -1));
        getContentPane().add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 221, 33, -1));

        cmdUpdate.setText("Update");
        cmdUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(cmdUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 252, -1, -1));

        cmdExit.setText("Exit");
        cmdExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExitActionPerformed(evt);
            }
        });
        getContentPane().add(cmdExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 252, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.PNG"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 550, 300));

        setSize(new java.awt.Dimension(568, 342));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        txtPno.setEditable(false);
        // Creating a ListModel object dModel to perform DefaultListModel
        // method operations
        DefaultListModel dModel = (DefaultListModel) jList1.getModel();
        // Method to add elements into jList1 control
        dModel.clear();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","admin");
             stmt = null;
            rs = null;


            String SQL = "SELECT * FROM Publisher";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                String Pno = rs.getString("pub_id");
                String PName = rs.getString("pub_name");
                // To make the publisher no. as 4 digit because we will extract 4 digit from list value
		// in mouse click event.

                if (Pno.length() < 4)
                {
                    int x = Pno.length();
                    int nl = 4 - x;
                    while (nl > 0){
                        Pno = Pno + " ";
                        nl--;
                    }
                }
                dModel.addElement(Pno + "- " + PName);
            }
            jList1.setModel(dModel);
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowGainedFocus

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // getSelectedValue() method extracts the current cursor location value into a variable
        String MPub = (String) jList1.getSelectedValue();
        // Extract the first 4 characters as publisher ID into a variable
        String PubN =MPub.trim().substring(0, 3);
        String query = "SELECT * FROM Publisher WHERE pub_Id = " + PubN + ";";
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","admin");
            // Create SQL statement and execute query.
             stmt = con.createStatement();
             rs = stmt.executeQuery(query);

            if (rs.next()) {
                //PubN = rs.getString("pub_no");
                String PubName = rs.getString("pub_name");
                String PubAdd = rs.getString("pub_address");
                String PubPh1 = rs.getString("pub_phone1");
                String PubPh2 = rs.getString("pub_phone2");
                String PStatus = rs.getString("status");
                // Displaying the contents in respective text boxes.
                txtPno.setText(PubN);
                txtPName.setText(PubName);
                txtPAdd.setText(PubAdd);
                txtPh1.setText(PubPh1);
                txtPh2.setText(PubPh2);
                txtStatus.setText(PStatus);
                txtPno.setEditable(false);
                // Close the operational object for Student
                con.close();
                stmt.close();
                rs.close();
            } else {
                JOptionPane.showMessageDialog(null, "Record does not found in Publisher table");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void txtPNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPNameActionPerformed

}//GEN-LAST:event_txtPNameActionPerformed

    private void txtPNamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtPNamePropertyChange

}//GEN-LAST:event_txtPNamePropertyChange

    private void txtPNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPNameKeyPressed

}//GEN-LAST:event_txtPNameKeyPressed

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExitActionPerformed
        this.setVisible(false);
        //new MainUI().setVisible(true);
    }//GEN-LAST:event_cmdExitActionPerformed

    private void cmdUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateActionPerformed
        try {
            // Connect to MySQL database
            // Don't forget to import the two packages
            //  import java.sql.*;
            //  import javax.swing.JOptionPane;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection)
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","admin");
            Statement stmt = null;
            ResultSet rs = null;
            String SQL = "SELECT * FROM Publisher";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);

            int pno = Integer.parseInt(txtPno.getText().trim());
            String PubName = txtPName.getText();
            String PubAdd = txtPAdd.getText();
            String PubPh1 = txtPh1.getText();
            String PubPh2 = txtPh2.getText();
            String PStatus = txtStatus.getText();

            String strSQL = "Update publisher set pub_name ='"+(PubName)+"',pub_address = '"+(PubAdd)+"', pub_phone1 = '"+(PubPh1)+"', pub_phone2 = '"+(PubPh2)+"', status = '"+(PStatus)+"' where pub_id = " + (pno);
            int rowsEffected = stmt.executeUpdate(strSQL);
            if (rowsEffected == 0)
                JOptionPane.showMessageDialog(this, "Record does not exists");
            else
                JOptionPane.showMessageDialog(this,"Record modified");
            con.close();
            stmt.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_cmdUpdateActionPerformed

    /**
    * @param args the command line arguments
    */
    /*public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PubEditUI().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdExit;
    private javax.swing.JButton cmdUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtPAdd;
    private javax.swing.JTextField txtPName;
    private javax.swing.JTextField txtPh1;
    private javax.swing.JTextField txtPh2;
    private javax.swing.JTextField txtPno;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables

}
