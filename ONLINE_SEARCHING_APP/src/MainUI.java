

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainUI.java
 *
 * Created on May 2, 2010, 11:03:33 AM
 */

/**
 *
 * @author xp_system
 */
public class MainUI extends javax.swing.JFrame {

    /** Creates new form MainUI */
    public MainUI() {
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

        AboutMe = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuPub = new javax.swing.JMenuItem();
        mnuPMod = new javax.swing.JMenuItem();
        mnuPDel = new javax.swing.JMenuItem();
        mnuPNav = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuLib = new javax.swing.JMenuItem();
        mnuLibEdit = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuIssue = new javax.swing.JMenuItem();
        mnuReturn = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuMemb = new javax.swing.JMenuItem();
        mnuMMod = new javax.swing.JMenuItem();
        mnuMDel = new javax.swing.JMenuItem();
        mnuMNav = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuABList = new javax.swing.JMenuItem();
        mnuIBList = new javax.swing.JMenuItem();
        mnuMList = new javax.swing.JMenuItem();

        AboutMe.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        AboutMe.setMinimumSize(new java.awt.Dimension(400, 200));

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Name: ");

        jLabel5.setText("Class:");

        jLabel6.setText("Application: ");

        jLabel7.setText("Guide Name:");

        jLabel8.setText("School Name:");

        jLabel9.setText("ABC");

        jLabel10.setText("XII(Sc)");

        jLabel11.setText("Java NetBean & MySQL");

        jLabel12.setText("Mr.Rajesh Kumar Mishra");

        jLabel13.setText("KV No.1, AFS, Suratgarh (Raj)");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("LibSys- Library Management System");

        javax.swing.GroupLayout AboutMeLayout = new javax.swing.GroupLayout(AboutMe.getContentPane());
        AboutMe.getContentPane().setLayout(AboutMeLayout);
        AboutMeLayout.setHorizontalGroup(
            AboutMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutMeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AboutMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AboutMeLayout.createSequentialGroup()
                        .addGroup(AboutMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AboutMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(AboutMeLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)))
                    .addComponent(jLabel14))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        AboutMeLayout.setVerticalGroup(
            AboutMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AboutMeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(AboutMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AboutMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AboutMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AboutMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addGap(5, 5, 5)
                .addGroup(AboutMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel8)
                    .addComponent(jButton1))
                .addGap(17, 17, 17))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Library Management");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("E  - LIBRARY");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 460, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" Library Management System");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 500, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, 659, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library 3.PNG"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 660, 400));

        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 13, 90, 40));

        jMenuBar1.setMaximumSize(new java.awt.Dimension(219, 327));

        jMenu1.setForeground(new java.awt.Color(204, 0, 0));
        jMenu1.setText("     PUBLISHER     ");

        mnuPub.setText("Publisher Console");
        mnuPub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPubActionPerformed(evt);
            }
        });
        jMenu1.add(mnuPub);

        mnuPMod.setText("Modification");
        mnuPMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPModActionPerformed(evt);
            }
        });
        jMenu1.add(mnuPMod);

        mnuPDel.setText("Deletion");
        mnuPDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPDelActionPerformed(evt);
            }
        });
        jMenu1.add(mnuPDel);

        mnuPNav.setText("Record Navigation");
        mnuPNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPNavActionPerformed(evt);
            }
        });
        jMenu1.add(mnuPNav);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(255, 0, 0));
        jMenu2.setText("      BOOK");

        mnuLib.setText("Book Console");
        mnuLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLibActionPerformed(evt);
            }
        });
        jMenu2.add(mnuLib);

        mnuLibEdit.setText("Modification");
        mnuLibEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLibEditActionPerformed(evt);
            }
        });
        jMenu2.add(mnuLibEdit);

        jMenuItem1.setText("Deletion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);
        jMenu2.add(jSeparator2);

        mnuIssue.setText("Book Issue");
        mnuIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIssueActionPerformed(evt);
            }
        });
        jMenu2.add(mnuIssue);

        mnuReturn.setText("Book Return");
        mnuReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuReturnActionPerformed(evt);
            }
        });
        jMenu2.add(mnuReturn);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(255, 0, 0));
        jMenu3.setText("         MEMBER");

        mnuMemb.setText("Member Console");
        mnuMemb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMembActionPerformed(evt);
            }
        });
        jMenu3.add(mnuMemb);

        mnuMMod.setText("Modification");
        mnuMMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMModActionPerformed(evt);
            }
        });
        jMenu3.add(mnuMMod);

        mnuMDel.setText("Deletion");
        mnuMDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMDelActionPerformed(evt);
            }
        });
        jMenu3.add(mnuMDel);

        mnuMNav.setText("Navigation");
        mnuMNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMNavActionPerformed(evt);
            }
        });
        jMenu3.add(mnuMNav);

        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(null);
        jMenu4.setForeground(new java.awt.Color(204, 0, 0));
        jMenu4.setText("            REPORT          ");

        mnuABList.setText("Available Book List");
        mnuABList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuABListActionPerformed(evt);
            }
        });
        jMenu4.add(mnuABList);

        mnuIBList.setText("Issued Book List");
        mnuIBList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIBListActionPerformed(evt);
            }
        });
        jMenu4.add(mnuIBList);

        mnuMList.setText("Member List");
        mnuMList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMListActionPerformed(evt);
            }
        });
        jMenu4.add(mnuMList);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(679, 510));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void mnuPubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPubActionPerformed
        //this.setVisible(false);
        new lhinli().setVisible(true);
        new lhinli().getAlignmentX();
        
    }//GEN-LAST:event_mnuPubActionPerformed

    private void mnuPModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPModActionPerformed
        new PubEditUI().setVisible(true);
    }//GEN-LAST:event_mnuPModActionPerformed

    private void mnuPDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPDelActionPerformed
        new PubDelUI().setVisible(true);
    }//GEN-LAST:event_mnuPDelActionPerformed

    private void mnuPNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPNavActionPerformed
        new PubNavUI().setVisible(true);
    }//GEN-LAST:event_mnuPNavActionPerformed

    private void mnuLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLibActionPerformed
        new LibUI().setVisible(true);
    }//GEN-LAST:event_mnuLibActionPerformed

    private void mnuMembActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMembActionPerformed
        new MembUI().setVisible(true);
    }//GEN-LAST:event_mnuMembActionPerformed

    private void mnuMModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMModActionPerformed
        new MembEditUI().setVisible(true);
    }//GEN-LAST:event_mnuMModActionPerformed

    private void mnuMDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMDelActionPerformed
        new MembDelUI().setVisible(true);
    }//GEN-LAST:event_mnuMDelActionPerformed

    private void mnuMNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMNavActionPerformed
        new MembNavUI().setVisible(true);
    }//GEN-LAST:event_mnuMNavActionPerformed

    private void mnuIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIssueActionPerformed
        new IssueUI().setVisible(true);
    }//GEN-LAST:event_mnuIssueActionPerformed

    private void mnuReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuReturnActionPerformed
        new ReturnUI().setVisible(true);
    }//GEN-LAST:event_mnuReturnActionPerformed

    private void mnuABListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuABListActionPerformed
        new ABListUI().setVisible(true);
    }//GEN-LAST:event_mnuABListActionPerformed

    private void mnuIBListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIBListActionPerformed
        new IBListUI().setVisible(true);
    }//GEN-LAST:event_mnuIBListActionPerformed

    private void mnuMListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMListActionPerformed
        new MListUI().setVisible(true);
    }//GEN-LAST:event_mnuMListActionPerformed

    private void mnuLibEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLibEditActionPerformed
        // TODO add your handling code here:
        new LibEditUI().setVisible(true);
    }//GEN-LAST:event_mnuLibEditActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new LibDelUI().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AboutMe.setVisible(false);
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new allapp().setVisible(true);



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
                

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AboutMe;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem mnuABList;
    private javax.swing.JMenuItem mnuIBList;
    private javax.swing.JMenuItem mnuIssue;
    private javax.swing.JMenuItem mnuLib;
    private javax.swing.JMenuItem mnuLibEdit;
    private javax.swing.JMenuItem mnuMDel;
    private javax.swing.JMenuItem mnuMList;
    private javax.swing.JMenuItem mnuMMod;
    private javax.swing.JMenuItem mnuMNav;
    private javax.swing.JMenuItem mnuMemb;
    private javax.swing.JMenuItem mnuPDel;
    private javax.swing.JMenuItem mnuPMod;
    private javax.swing.JMenuItem mnuPNav;
    private javax.swing.JMenuItem mnuPub;
    private javax.swing.JMenuItem mnuReturn;
    // End of variables declaration//GEN-END:variables
}
