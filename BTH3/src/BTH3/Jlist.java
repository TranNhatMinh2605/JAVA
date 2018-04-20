/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTH3;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author NhatMinh
 */
public class Jlist extends javax.swing.JFrame {

    DefaultListModel ListTrai;
    DefaultListModel ListPhai;
    /**
     * Creates new form JList
     */
    public Jlist() {
        initComponents();
        ListTrai = new DefaultListModel();
        listSports.setModel(ListTrai);

        ListTrai.addElement("Bóng Đá");
        ListTrai.addElement("Bóng chuyền");
        ListTrai.addElement("Karatedo");
        ListTrai.addElement("Cầu lông");
        ListTrai.addElement("Bóng rổ");
        ListTrai.addElement("Taekwondo");
        ListTrai.addElement("Điền kinh");

        ListPhai = new DefaultListModel();
        listFavorite.setModel(ListPhai);
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
        listSports = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listFavorite = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnPick = new javax.swing.JButton();
        btnPickAll = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnDelAll = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listSports);

        jScrollPane2.setViewportView(listFavorite);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Danh sách các môn thể thao");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Môn yêu thích");

        btnPick.setText(">");
        btnPick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickActionPerformed(evt);
            }
        });

        btnPickAll.setText(">>");
        btnPickAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickAllActionPerformed(evt);
            }
        });

        btnDel.setText("<");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnDelAll.setText("<<");
        btnDelAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelAllActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelAll, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(btnPickAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPick, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPickAll, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelAll, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickActionPerformed
        // TODO add your handling code here:
        int[] indexs = listSports.getSelectedIndices();
        for (int i = indexs.length - 1; i >= 0; i--) {
            ListPhai.addElement(ListTrai.get(indexs[i]));
            ListTrai.remove(indexs[i]);
        }
    }//GEN-LAST:event_btnPickActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
       String sTheThao = JOptionPane.showInputDialog("Nhập tên môn thể thao: ");
       ListTrai.addElement(sTheThao);
//        ListModel mTrai = listSports.getModel();

//        List<String> listTrai = new ArrayList<>();
//        for (int i = 0; i < mTrai.getSize(); i++) {
//            listTrai.add(mTrai.getElementAt(i).toString());
//        }
//        listTrai.add(sTheThao);
//        //Chuyển sang kiểu mảng để đưa vào JList
//        String[] arData = listTrai.toArray(new String[0]);
//        listSports.setListData(arData);

       btnPickAll.setEnabled(true);
       btnPick.setEnabled(true);
       btnDel.setEnabled(true);
       btnDelAll.setEnabled(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnPickAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickAllActionPerformed
        // TODO add your handling code here:
        int m = ListTrai.getSize();
        for (int i = 0; i < m; i++) {
            ListPhai.addElement(ListTrai.get(i));
        }
            ListTrai.clear();
            
            btnPickAll.setEnabled(false);
            btnPick.setEnabled(false);
            btnDel.setEnabled(true);
            btnDelAll.setEnabled(true);
    }//GEN-LAST:event_btnPickAllActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        // TODO add your handling code here:
        int[] indexs = listFavorite.getSelectedIndices();
        for (int i = indexs.length - 1; i >= 0; i--) {
            ListTrai.addElement(ListPhai.get(indexs[i]));
            ListPhai.remove(indexs[i]);
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnDelAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelAllActionPerformed
        // TODO add your handling code here:
       int n = ListPhai.getSize();
       for(int i = 0; i < n; i++){
           ListTrai.addElement(ListPhai.get(i));
       }
       ListPhai.clear();
       btnPickAll.setEnabled(true);
       btnPick.setEnabled(true);
       btnDel.setEnabled(false);
       btnDelAll.setEnabled(false);
    }//GEN-LAST:event_btnDelAllActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnDelAll;
    private javax.swing.JButton btnPick;
    private javax.swing.JButton btnPickAll;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listFavorite;
    private javax.swing.JList<String> listSports;
    // End of variables declaration//GEN-END:variables
}
