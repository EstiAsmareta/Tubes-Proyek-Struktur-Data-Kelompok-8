package tubes;

import Data.Data;

/**
 *
 * @author ASUS
 */
public class MenuAbout extends javax.swing.JFrame {
    static Data dataMhs;
    
    public MenuAbout(Data data) {
        initComponents();
        this.dataMhs = data;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tombolKembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tombolKembali.setText("Kembali");
        tombolKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolKembaliMouseClicked(evt);
            }
        });
        tombolKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolKembaliActionPerformed(evt);
            }
        });
        jPanel1.add(tombolKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/Image/aboutClass.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 722));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1025, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombolKembaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolKembaliMouseClicked
        
    }//GEN-LAST:event_tombolKembaliMouseClicked

    private void tombolKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKembaliActionPerformed
        //membuat kode jika kita menekan tombol kembali maka layar akan dikembalikan menjadi layar menu utama
        setVisible(false);
         new MenuDashboard(dataMhs).setVisible(true);
    }//GEN-LAST:event_tombolKembaliActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAbout(dataMhs).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton tombolKembali;
    // End of variables declaration//GEN-END:variables
}
