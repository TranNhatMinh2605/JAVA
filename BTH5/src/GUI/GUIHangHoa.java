/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.FormHangHoa;
import javax.swing.JOptionPane;

/**
 *
 * @author NhatMinh
 */
public class GUIHangHoa extends javax.swing.JFrame {

    /**
     * Creates new form GUIHangHoa
     */
    public GUIHangHoa() {
        initComponents();
        Screen.setModel(FormHangHoa.HangModel());
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtMH = new javax.swing.JTextField();
        txtTH = new javax.swing.JTextField();
        txtMCL = new javax.swing.JTextField();
        txtSL = new javax.swing.JTextField();
        txtDGN = new javax.swing.JTextField();
        txtDGB = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtGC = new javax.swing.JTextField();
        txtAnh = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Screen = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Mã Hàng");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 14, -1, -1));

        jLabel2.setText("Tên Hàng");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 52, -1, -1));

        jLabel3.setText("Mã Chất Liệu");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 95, -1, -1));

        jLabel4.setText("Số Lượng");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 133, -1, -1));

        jLabel5.setText("Đơn Giá Nhập");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 171, -1, -1));

        jLabel6.setText("Đơn Giá Bán");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 209, -1, -1));
        getContentPane().add(txtMH, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 11, 120, -1));
        getContentPane().add(txtTH, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 49, 120, -1));
        getContentPane().add(txtMCL, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 92, 120, -1));
        getContentPane().add(txtSL, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 130, 120, -1));
        getContentPane().add(txtDGN, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 168, 120, -1));
        getContentPane().add(txtDGB, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 206, 120, -1));

        jLabel7.setText("Ảnh");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        jLabel8.setText("Ghi Chú");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));
        getContentPane().add(txtGC, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 210, 30));
        getContentPane().add(txtAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 190, 100));

        Screen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Screen);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, 90));

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        btnDel.setText("Xoá");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        getContentPane().add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 60, -1));

        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 60, -1));

        btnBack.setText("Quay Lại");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int n = FormHangHoa.InsertHang(txtMH.getText(), txtTH.getText(), txtMCL.getText(), Float.parseFloat(txtSL.getText()), Float.parseFloat(txtDGN.getText()), Float.parseFloat(txtDGB.getText()), txtAnh.getText(), txtGC.getText());
        if(n==0){
            JOptionPane.showMessageDialog(rootPane,"Mã chất liệu không tồn tại","ERROR: ",JOptionPane.ERROR_MESSAGE);
        }
           Screen.setModel(FormHangHoa.HangModel());
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        int n = Screen.getSelectedRow();
        String MaH = FormHangHoa.HangModel().getValueAt(n, 0).toString();
        FormHangHoa.DeleteHang(MaH);
        Screen.setModel(FormHangHoa.HangModel());
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        FormHangHoa.UpdateHang(txtMH.getText(), txtTH.getText(), txtMCL.getText(), Float.parseFloat(txtSL.getText()), Float.parseFloat(txtDGN.getText()), Float.parseFloat(txtDGB.getText()), txtAnh.getText(), txtGC.getText());
        Screen.setModel(FormHangHoa.HangModel());
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();
        new QLBH().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(GUIHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIHangHoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Screen;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAnh;
    private javax.swing.JTextField txtDGB;
    private javax.swing.JTextField txtDGN;
    private javax.swing.JTextField txtGC;
    private javax.swing.JTextField txtMCL;
    private javax.swing.JTextField txtMH;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtTH;
    // End of variables declaration//GEN-END:variables
}
