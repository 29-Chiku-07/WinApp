
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vivek kumar
 */
public class shop_cart extends javax.swing.JFrame {

    /**
     * Creates new form shop_cart
     */
    public shop_cart() {
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

        t5 = new javax.swing.JTextField();
        c1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t5ActionPerformed(evt);
            }
        });
        getContentPane().add(t5, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 110, 117, 32));

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TV", "HEADPHONE", "CAMERA", "LAPTOP", " ", "TSHIRT", "SPORTS SHOE", "LEATHER JACKET", "SUNGLASSES", " ", "SAREE", "SALWAR SUIT", "LEHENGA", "HEELS", "PURSE", "WATCH", " ", "BAT", "BALL", "FOOTBALL", "PADS" }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 45, 117, 26));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("price");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 81, 32));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("product name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 39, 81, 32));

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 204, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/b.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 400, 300));

        setSize(new java.awt.Dimension(421, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t5ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        if(c1.getSelectedItem().equals("TV"))
        {
            t5.setText("Rs. 11,990");
        }

        if(c1.getSelectedItem().equals("HEADPHONE"))
        {
            t5.setText("Rs. 2,680");
        }

        if(c1.getSelectedItem().equals("CAMERA"))
        {
            t5.setText("Rs. 2,83,990");
        }
        if(c1.getSelectedItem().equals("LAPTOP"))
        {
            t5.setText("Rs. 1,28,000");
        }

        if(c1.getSelectedItem().equals("TSHIRT"))
        {
            t5.setText("Rs. 439");
        }

        if(c1.getSelectedItem().equals("SPORTS SHOE"))
        {
            t5.setText("Rs. 1,199");
        }

        if(c1.getSelectedItem().equals("LEATHER JACKET"))
        {
            t5.setText("Rs. 2,499");
        }

        if(c1.getSelectedItem().equals("SUNGLASSES"))
        {
            t5.setText("Rs. 734");
        }

        if(c1.getSelectedItem().equals("SAREE"))
        {
            t5.setText("Rs. 1,050");
        }

        if(c1.getSelectedItem().equals("SALWAR SUIT"))
        {
            t5.setText("Rs. 618");
        }

        if(c1.getSelectedItem().equals("LEHENGA"))
        {
            t5.setText("Rs. 1,740");
        }

        if(c1.getSelectedItem().equals("HEELS"))
        {
            t5.setText("Rs. 490");
        }

        if(c1.getSelectedItem().equals("PURSE"))
        {
            t5.setText("Rs. 2,204");
        }

        if(c1.getSelectedItem().equals("WATCH"))
        {
            t5.setText("Rs. 5,495");
        }

        if(c1.getSelectedItem().equals("BAT"))
        {
            t5.setText("Rs. 11,728");
        }

        if(c1.getSelectedItem().equals("BALL"))
        {
            t5.setText("Rs. 699");
        }

        if(c1.getSelectedItem().equals("FOOTBALL"))
        {
            t5.setText("Rs. 545");
        }

        if(c1.getSelectedItem().equals("PADS"))
        {
            t5.setText("Rs. 2,990");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 try
        { Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/lib","root","admin");
            Statement st=con.createStatement();
            
            String e=t5.getText();
            String f=(String) c1.getSelectedItem();

            int x=st.executeUpdate("insert into cart values('"+f+"','"+e+"') ;");
            ResultSet rs=st.executeQuery("select * from cart;");
           
            while(rs.next())
            {
                
                
                   }
        }catch (Exception e)
        {
        }
        
        
        JOptionPane.showMessageDialog(null," PRODUCT SUCCESSFULLY ADDED TO CART","Success",JOptionPane.PLAIN_MESSAGE);
                




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
            java.util.logging.Logger.getLogger(shop_cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(shop_cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(shop_cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(shop_cart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new shop_cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> c1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}
