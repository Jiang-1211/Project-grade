/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade;


import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tom13
 */
public class grade extends javax.swing.JFrame {
    
     String[] colname = {
        "名字", "國文", "英文", "數學", "總分", "平均"
    };
    Object[][] data = {};
    public DefaultTableModel myModel = null;
    public int x=0;
    
    public grade() {
        initComponents();
        myModel = (DefaultTableModel) jTable1.getModel();
        jTable1.setShowGrid(true);
       String[] ar1;

        try {
           FileReader fr = new FileReader("成績.txt");
            BufferedReader br = new BufferedReader(fr);
            String data;           
            while ((data = br.readLine()) != null) {
                ar1 = data.split(",");
                myModel.addRow(ar1);             
            }
        } catch (IOException e) {
            System.out.println(e);
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

        jTextField4 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtenglish = new javax.swing.JTextField();
        txtchinese = new javax.swing.JTextField();
        txtmath = new javax.swing.JTextField();
        lblsum = new javax.swing.JLabel();
        lblaverage = new javax.swing.JLabel();
        btn寫 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jTextField4.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jTextField4.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jLabel1.setText("名字:");

        jLabel2.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jLabel2.setText("國文:");

        jLabel3.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jLabel3.setText("數學:");

        jLabel4.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jLabel4.setText("英文:");

        jLabel5.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jLabel5.setText("總分:");

        jLabel6.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jLabel6.setText("平均:");

        txtname.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtenglish.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        txtenglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtenglishActionPerformed(evt);
            }
        });

        txtchinese.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        txtchinese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtchineseActionPerformed(evt);
            }
        });

        txtmath.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        txtmath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmathActionPerformed(evt);
            }
        });

        lblsum.setBackground(new java.awt.Color(204, 255, 204));
        lblsum.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        lblsum.setOpaque(true);

        lblaverage.setBackground(new java.awt.Color(204, 255, 204));
        lblaverage.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        lblaverage.setOpaque(true);

        btn寫.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        btn寫.setText("寫入");
        btn寫.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn寫ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn寫)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtchinese, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtenglish, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtmath, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(lblsum, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(lblaverage, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtchinese)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblsum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtenglish)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblaverage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtmath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(btn寫)
                .addGap(58, 58, 58))
        );

        jTabbedPane1.addTab("寫", jPanel2);

        jPanel1.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            data,
            colname
        ));
        jScrollPane2.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("新細明體", 0, 24)); // NOI18N
        jButton1.setText("讀");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("讀", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtname.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void txtmathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmathActionPerformed
        if (Integer.parseInt(txtmath.getText()) > 100 || Integer.parseInt(txtmath.getText()) < 0) {
            JOptionPane.showMessageDialog(null, "數學分數輸入錯誤");
            txtmath.selectAll();
        } else {
            btn寫ActionPerformed(evt);
        }
    }//GEN-LAST:event_txtmathActionPerformed

    private void txtchineseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtchineseActionPerformed
        if (Integer.parseInt(txtchinese.getText()) > 100 || Integer.parseInt(txtchinese.getText()) < 0) {
            JOptionPane.showMessageDialog(null, "國文分數輸入錯誤");
            txtchinese.selectAll();
        } else {
            txtenglish.requestFocus();
        }
    }//GEN-LAST:event_txtchineseActionPerformed

    private void txtenglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtenglishActionPerformed
        if (Integer.parseInt(txtenglish.getText()) > 100 || Integer.parseInt(txtenglish.getText()) < 0) {
            JOptionPane.showMessageDialog(null, "英文分數輸入錯誤");
            txtenglish.selectAll();
        } else {
            txtmath.requestFocus();
        }
    }//GEN-LAST:event_txtenglishActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        txtchinese.requestFocus();
    }//GEN-LAST:event_txtnameActionPerformed

    private void btn寫ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn寫ActionPerformed
        int sum = 0, average = 0;

        if (Integer.parseInt(txtchinese.getText()) > 100 || Integer.parseInt(txtchinese.getText()) < 0) {
            JOptionPane.showMessageDialog(null, "國文分數輸入錯誤");
            txtchinese.selectAll();
        }
        if (Integer.parseInt(txtenglish.getText()) > 100 || Integer.parseInt(txtenglish.getText()) < 0) {
            JOptionPane.showMessageDialog(null, "英文分數輸入錯誤");
            txtenglish.selectAll();
        }
        if (Integer.parseInt(txtmath.getText()) > 100 || Integer.parseInt(txtmath.getText()) < 0) {
            JOptionPane.showMessageDialog(null, "數學分數輸入錯誤");
            txtmath.selectAll();
        }

        sum = Integer.parseInt(txtchinese.getText()) + Integer.parseInt(txtenglish.getText()) + Integer.parseInt(txtmath.getText());
        average = sum / 3;
        lblsum.setText(String.valueOf(sum));
        lblaverage.setText(String.valueOf(average));
        try {
            FileWriter fw = new FileWriter("成績.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(txtname.getText() + "," + txtchinese.getText() + "," + txtenglish.getText() + "," + txtmath.getText() + "," + sum + "," + average);

            pw.flush();
            pw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btn寫ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  
        String[] ar1;

        try {
           FileReader fr = new FileReader("成績.txt");
            BufferedReader br = new BufferedReader(fr);
            String data;           
            while ((data = br.readLine()) != null) {
                ar1 = data.split(",");
                myModel.addRow(ar1);             
            }
        } catch (IOException e) {
            System.out.println(e);
        }

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
            java.util.logging.Logger.getLogger(grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(grade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new grade().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn寫;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblaverage;
    private javax.swing.JLabel lblsum;
    private javax.swing.JTextField txtchinese;
    private javax.swing.JTextField txtenglish;
    private javax.swing.JTextField txtmath;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}