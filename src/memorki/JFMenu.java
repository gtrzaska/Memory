/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorki;

/**
 *
 * @author Grzegorz Trzaska
 */
public class JFMenu extends javax.swing.JFrame {

    /**
     * Tworzenie klasy JFMenu
     */
    public JFMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        TfPlayer1Name = new javax.swing.JTextField();
        BtStart = new javax.swing.JButton();
        P1err = new javax.swing.JLabel();
        P2err = new javax.swing.JLabel();
        BtEasy = new javax.swing.JButton();
        BtMedium = new javax.swing.JButton();
        BtHard = new javax.swing.JButton();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nazwa gracza:");

        TfPlayer1Name.setName("TfPlayer1"); // NOI18N

        BtStart.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtStart.setText("Start");
        BtStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtStartActionPerformed(evt);
            }
        });

        P1err.setForeground(new java.awt.Color(255, 0, 0));

        P2err.setForeground(new java.awt.Color(255, 0, 0));

        BtEasy.setText("Łatwe");
        BtEasy.setAlignmentX(1.0F);
        BtEasy.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtEasy.setVerifyInputWhenFocusTarget(false);
        BtEasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEasyActionPerformed(evt);
            }
        });

        BtMedium.setText("Średnie");
        BtMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMediumActionPerformed(evt);
            }
        });

        BtHard.setText("Trudne");
        BtHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtHardActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label1.setText("Poziom trudności");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(P1err))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(BtEasy)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtMedium, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(BtHard))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(P2err)))
                .addContainerGap(171, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TfPlayer1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(191, 191, 191))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(136, 136, 136)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(349, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(P1err)
                .addGap(5, 5, 5)
                .addComponent(TfPlayer1Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(P2err, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtEasy)
                    .addComponent(BtMedium)
                    .addComponent(BtHard))
                .addGap(47, 47, 47)
                .addComponent(BtStart, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(392, Short.MAX_VALUE)))
        );

        jLabel2.getAccessibleContext().setAccessibleName("LPlayer1");
        BtStart.getAccessibleContext().setAccessibleName("BtStart");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Nazwa gracza
     */
    public static String P1name = null;

    /**
     * uruchominie gry
     */
    private void BtStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtStartActionPerformed
        int pom = 0;
        if (IleKart != 0) {
            if (TfPlayer1Name.getText().equals("")) {
                P1err.setText("Nazwa Wymagana");
            } else {
                P1name = TfPlayer1Name.getText();
                P1err.setText("");
                pom += 1;
            }

            if (pom == 1) {
                System.out.println(Integer.toString(IleKart));
                super.dispose();
                JFPlansza plansza = new JFPlansza();
                plansza.setVisible(true);
            }
        }
    }//GEN-LAST:event_BtStartActionPerformed
    /**
     * Ilość par
     */
    public static int IleKart = 0;

    /**
     * Ustawienie poziomu trudności na łatwy
     */
    private void BtEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEasyActionPerformed
        IleKart = 8;
        BtEasy.setBackground(new java.awt.Color(204, 204, 255));
        BtMedium.setBackground(new java.awt.Color(240, 240, 240));
        BtHard.setBackground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_BtEasyActionPerformed
    /**
     * Ustawienie poziomu trudności na średni
     */
    private void BtMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMediumActionPerformed
        IleKart = 12;
        BtEasy.setBackground(new java.awt.Color(244, 240, 240));
        BtMedium.setBackground(new java.awt.Color(204, 204, 255));
        BtHard.setBackground(new java.awt.Color(240, 240, 240));
    }//GEN-LAST:event_BtMediumActionPerformed
    /**
     * Ustawienie poziomu trudności na ciężki
     */
    private void BtHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtHardActionPerformed
        IleKart = 15;
        BtEasy.setBackground(new java.awt.Color(240, 240, 240));
        BtMedium.setBackground(new java.awt.Color(240, 240, 240));
        BtHard.setBackground(new java.awt.Color(204, 204, 255));
    }//GEN-LAST:event_BtHardActionPerformed

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
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtEasy;
    private javax.swing.JButton BtHard;
    private javax.swing.JButton BtMedium;
    private javax.swing.JButton BtStart;
    private javax.swing.JLabel P1err;
    private javax.swing.JLabel P2err;
    private javax.swing.JTextField TfPlayer1Name;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
