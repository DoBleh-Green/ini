import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Perpustakaan extends javax.swing.JFrame {

    /**
     * Creates new form Perpustakaan
     */
    public Perpustakaan() {
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

        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        iBuku = new javax.swing.JTextField();
        jBuku = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        eS = new javax.swing.JButton();
        tPengembalian = new javax.swing.JTextField();
        tPeminjam = new javax.swing.JTextField();
        eDenda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nPeminjam = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bTabel = new javax.swing.JTable();
        btnDelete = new javax.swing.JToggleButton();
        btnRefresh = new javax.swing.JToggleButton();
        btnEdit = new javax.swing.JToggleButton();
        btnExit = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        eNim = new javax.swing.JTextField();

        jToggleButton4.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("id BUKU");

        jLabel2.setText("Judul Buku");

        iBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iBukuActionPerformed(evt);
            }
        });

        jBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBukuActionPerformed(evt);
            }
        });

        jLabel5.setText("Tgl.Pemijaman");

        jLabel6.setText("Tgl.Pengembalian");

        pTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "id BUKU", "Judul Buku", "Tgl.Peminjaman", "Tgl.Pengembalian"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        pTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(pTable);

        jLabel7.setText("Denda");

        eS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eS.setText("save");
        eS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eSActionPerformed(evt);
            }
        });

        tPengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPengembalianActionPerformed(evt);
            }
        });

        tPeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPeminjamActionPerformed(evt);
            }
        });

        eDenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eDendaActionPerformed(evt);
            }
        });

        jLabel8.setText("Nama Peminjam");

        nPeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nPeminjamActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Perpustakaan");

        bTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A1", "Java", "ceyo", "Tunas Media", "2001"},
                {"A2", "C++", "ilham", "SMK Alhasra", "2023"},
                {"A3", "Python", "Oby", "Padang", "2040"}
            },
            new String [] {
                "Kode Buku", "Judul Buku", "Pengarang", "Penerbit", "Tahun Terbit"
            }
        ));
        jScrollPane1.setViewportView(bTabel);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel3.setText("NIM");

        eNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eNimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eNim, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jBuku)
                        .addComponent(iBuku)
                        .addComponent(nPeminjam, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eDenda, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(tPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(eS, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btnRefresh)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)))
                        .addGap(99, 99, 99))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(tPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eNim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(tPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(eDenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(iBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(jBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(nPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnRefresh)
                                    .addComponent(btnDelete))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnEdit)
                                    .addComponent(btnExit)
                                    .addComponent(eS, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iBukuActionPerformed
        // TODO add your handling code here:
        String id = iBuku.getText();
        
        if (id.equals("1")){
            jBuku.setText("E Book C++");
        }else{
            jBuku.setText("Ga Ada !");
        }
    }//GEN-LAST:event_iBukuActionPerformed

    private void jBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBukuActionPerformed

    private void nPeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nPeminjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nPeminjamActionPerformed

    private void tPeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPeminjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPeminjamActionPerformed

    private void tPengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPengembalianActionPerformed
        String tglPeminjaman = tPeminjam.getText();
        String tglPengembalian = tPengembalian.getText();
        
        int dipinjam = Integer.parseInt(tglPeminjaman);
        int dibalikkan = Integer.parseInt(tglPengembalian);
        
        if(dibalikkan > dipinjam+3) {
            eDenda.setText("Rp. 10.000,00");
        }else if(dibalikkan > dipinjam+4){
            eDenda.setText("Rp. 12.000,00");
        }
        else {
            eDenda.setText("");
        }
        


    }//GEN-LAST:event_tPengembalianActionPerformed

    private void pTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pTableMouseClicked
        // TODO add your handling code here:
        int row = pTable.getSelectedRow();
        
        if(row >= 0){
            DefaultTableModel model = (DefaultTableModel) pTable.getModel();
            String NamaBaris = model.getValueAt(row,1).toString();
            String iBukuBaris = model.getValueAt(row,2).toString();
            String jBukuBaris = model.getValueAt(row,3).toString();
            String tPeminjamBaris = model.getValueAt(row,4).toString();
            String tPengembalianBaris = model.getValueAt(row,5).toString();
            
            nPeminjam.setText(NamaBaris);
            iBuku.setText(iBukuBaris);
            jBuku.setText(jBukuBaris);
            tPeminjam.setText(tPeminjamBaris);
            tPengembalian.setText(tPengembalianBaris);
        }
        
    }//GEN-LAST:event_pTableMouseClicked

    private void eDendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eDendaActionPerformed
        
    }//GEN-LAST:event_eDendaActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        eNim.setText("");
        nPeminjam.setText("");
        iBuku.setText("");
        jBuku.setText("");
        tPeminjam.setText("");
        tPengembalian.setText("");
        eDenda.setText("");
        
        DefaultTableModel model = (DefaultTableModel) pTable.getModel();
        model.setRowCount(0);
        
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int row = pTable.getSelectedRow();
        
        if(row >= 0){
        if(btnEdit.getText().equals ("edit")){
            DefaultTableModel model = (DefaultTableModel) pTable.getModel();
            nPeminjam.setText(model.getValueAt(row, 0).toString());
            eNim.setText(model.getValueAt(row, 1).toString());
            iBuku.setText(model.getValueAt(row, 2).toString());
            jBuku.setText(model.getValueAt(row, 3).toString());
            tPeminjam.setText(model.getValueAt(row, 4).toString());
            tPengembalian.setText(model.getValueAt(row, 5).toString());
            
            btnEdit.setText("Update");
        }else{
            DefaultTableModel model = (DefaultTableModel) pTable.getModel();
            model.setValueAt(nPeminjam.getText(), row, 0);
            model.setValueAt(eNim.getText(), row, 1);
            model.setValueAt(iBuku.getText(), row, 2);
            model.setValueAt(jBuku.getText(), row, 3);
            model.setValueAt(tPeminjam.getText(), row, 4);
            model.setValueAt(tPengembalian.getText(), row, 5);
            
            nPeminjam.setText("");
            eNim.setText("");
            iBuku.setText("");
            jBuku.setText("");
            tPeminjam.setText("");
            tPengembalian.setText("");
            
            btnEdit.setText("Edit");
            row = -1;
        }
    }
    }//GEN-LAST:event_btnEditActionPerformed

    private void eSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eSActionPerformed
        // TODO add your handling code here:
        String id = iBuku.getText();
        String judul = jBuku.getText();
        String nama = nPeminjam.getText();
        String peminjaman = tPeminjam.getText();
        String pengembalian = tPengembalian.getText();

        DefaultTableModel model = (DefaultTableModel) pTable.getModel();

        model.addRow(new Object[]{nama, id, judul, peminjaman, pengembalian});

        
        
        nPeminjam.setText("");
        iBuku.setText("");
        jBuku.setText("");
        tPeminjam.setText("");
        tPengembalian.setText("");
        eDenda.setText("");
    }//GEN-LAST:event_eSActionPerformed

    private void eNimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eNimActionPerformed
        // TODO add your handling code here:
        String nim = eNim.getText();
        
        if(nim.equals("585010525")){
            nPeminjam.setText("Muhamad Agus Saputra");
        }else if(nim.equals("577080321")){
            nPeminjam.setText("Aldi Saepul");
        }else{
            nPeminjam.setText("Ga ada ");
        }
    }//GEN-LAST:event_eNimActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int row = pTable.getSelectedRow();
        
        if(row != -1){
            DefaultTableModel model = (DefaultTableModel) pTable.getModel();
            model.removeRow(row);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(Perpustakaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perpustakaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perpustakaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perpustakaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perpustakaan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bTabel;
    private javax.swing.JToggleButton btnDelete;
    private javax.swing.JToggleButton btnEdit;
    private javax.swing.JToggleButton btnExit;
    private javax.swing.JToggleButton btnRefresh;
    private javax.swing.JTextField eDenda;
    private javax.swing.JTextField eNim;
    private javax.swing.JButton eS;
    private javax.swing.JTextField iBuku;
    private javax.swing.JTextField jBuku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JTextField nPeminjam;
    private javax.swing.JTable pTable;
    private javax.swing.JTextField tPeminjam;
    private javax.swing.JTextField tPengembalian;
    // End of variables declaration//GEN-END:variables
}
