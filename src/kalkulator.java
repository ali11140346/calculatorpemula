public class kalkulator extends javax.swing.JFrame {
    String angka;
    double jumlah,angka1,angka2;
    int pilihan;
    /**
     * Creates new form kalkulator
     */
    public kalkulator() {
        initComponents();
        angka="";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton13 = new javax.swing.JButton();
        tombol1 = new javax.swing.JButton();
        tombol2 = new javax.swing.JButton();
        tombol3 = new javax.swing.JButton();
        tombolplus = new javax.swing.JButton();
        tombolmin = new javax.swing.JButton();
        tombol6 = new javax.swing.JButton();
        tombol5 = new javax.swing.JButton();
        tombol4 = new javax.swing.JButton();
        tombolkali = new javax.swing.JButton();
        tombolplusmin = new javax.swing.JButton();
        tombol8 = new javax.swing.JButton();
        tombol7 = new javax.swing.JButton();
        tombol9 = new javax.swing.JButton();
        tombolsamadengan = new javax.swing.JButton();
        tombolbagi = new javax.swing.JButton();
        tombol0 = new javax.swing.JButton();
        tomboltitik = new javax.swing.JButton();
        tombolC = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jButton13.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tombol1.setText("1");
        tombol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol1ActionPerformed(evt);
            }
        });

        tombol2.setText("2");
        tombol2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol2ActionPerformed(evt);
            }
        });

        tombol3.setText("3");
        tombol3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol3ActionPerformed(evt);
            }
        });

        tombolplus.setText("+");
        tombolplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolplusActionPerformed(evt);
            }
        });

        tombolmin.setText("-");
        tombolmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolminActionPerformed(evt);
            }
        });

        tombol6.setText("6");
        tombol6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol6ActionPerformed(evt);
            }
        });

        tombol5.setText("5");
        tombol5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol5ActionPerformed(evt);
            }
        });

        tombol4.setText("4");
        tombol4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol4ActionPerformed(evt);
            }
        });

        tombolkali.setText("X");
        tombolkali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolkaliActionPerformed(evt);
            }
        });

        tombolplusmin.setText("+/-");
        tombolplusmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolplusminActionPerformed(evt);
            }
        });

        tombol8.setText("8");
        tombol8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol8ActionPerformed(evt);
            }
        });

        tombol7.setText("7");
        tombol7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol7ActionPerformed(evt);
            }
        });

        tombol9.setText("9");
        tombol9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol9ActionPerformed(evt);
            }
        });

        tombolsamadengan.setText("=");
        tombolsamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolsamadenganActionPerformed(evt);
            }
        });

        tombolbagi.setText("/");
        tombolbagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolbagiActionPerformed(evt);
            }
        });

        tombol0.setText("0");
        tombol0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol0ActionPerformed(evt);
            }
        });

        tomboltitik.setText(".");
        tomboltitik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomboltitikActionPerformed(evt);
            }
        });

        tombolC.setText("C");
        tombolC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolCActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tombol4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tombol5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tombol6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tombolmin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tombol1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tombol2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tombol3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tombolplus, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tombolplusmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(tombol7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tombol8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tombol9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(tombolkali, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(tombolsamadengan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(tomboltitik, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tombol0, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tombolC, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(tombolbagi, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombol1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombol2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombol3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolplus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombol4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombol5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombol6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolmin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombol7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombol8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolkali, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombol9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tomboltitik, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombol0, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolbagi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolplusmin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombolsamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void tombol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol1ActionPerformed
        angka +="1";
        jTextField1.setText(angka);
    }//GEN-LAST:event_tombol1ActionPerformed

    private void tombol2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol2ActionPerformed
        angka +="2";
        jTextField1.setText(angka);
    }//GEN-LAST:event_tombol2ActionPerformed

    private void tombol3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol3ActionPerformed
        angka +="3";
        jTextField1.setText(angka);
    }//GEN-LAST:event_tombol3ActionPerformed

    private void tombol4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol4ActionPerformed
        angka +="4";
        jTextField1.setText(angka);
    }//GEN-LAST:event_tombol4ActionPerformed

    private void tombol5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol5ActionPerformed
        angka +="5";
        jTextField1.setText(angka);
    }//GEN-LAST:event_tombol5ActionPerformed

    private void tombol6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol6ActionPerformed
        angka +="6";
        jTextField1.setText(angka);
    }//GEN-LAST:event_tombol6ActionPerformed

    private void tombol7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol7ActionPerformed
        angka +="7";
        jTextField1.setText(angka);
    }//GEN-LAST:event_tombol7ActionPerformed

    private void tombol8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol8ActionPerformed
        angka +="8";
        jTextField1.setText(angka);
    }//GEN-LAST:event_tombol8ActionPerformed

    private void tombol9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol9ActionPerformed
        angka +="9";
        jTextField1.setText(angka);
    }//GEN-LAST:event_tombol9ActionPerformed

    private void tomboltitikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomboltitikActionPerformed
       angka +=".";
        jTextField1.setText(angka);
    }//GEN-LAST:event_tomboltitikActionPerformed

    private void tombol0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol0ActionPerformed
        angka +="0";
        jTextField1.setText(angka);
    }//GEN-LAST:event_tombol0ActionPerformed

    private void tombolCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolCActionPerformed
        jTextField1.setText("");
        angka1=0.0;
        angka2=0.0;
        jumlah=0.0;
        angka="";
    }//GEN-LAST:event_tombolCActionPerformed

    private void tombolplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolplusActionPerformed
        angka1=Double.parseDouble(angka);
        jTextField1.setText("+");
        angka="";
        pilihan=1;
    }//GEN-LAST:event_tombolplusActionPerformed

    private void tombolminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolminActionPerformed
        angka1=Double.parseDouble(angka);
        jTextField1.setText("-");
        angka="";
        pilihan=2;
    }//GEN-LAST:event_tombolminActionPerformed

    private void tombolkaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolkaliActionPerformed
        angka1=Double.parseDouble(angka);
        jTextField1.setText("X");
        angka="";
        pilihan=3;
    }//GEN-LAST:event_tombolkaliActionPerformed

    private void tombolbagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolbagiActionPerformed
        angka1=Double.parseDouble(angka);
        jTextField1.setText("/");
        angka="";
        pilihan=4;
    }//GEN-LAST:event_tombolbagiActionPerformed

    private void tombolsamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolsamadenganActionPerformed
        switch(pilihan){
        case 1:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 + angka2;
            angka = Double.toString(jumlah);
            jTextField1.setText(angka);
            break;
        case 2:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 - angka2;
            angka = Double.toString(jumlah);
            jTextField1.setText(angka);
            break;
        case 3:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 * angka2;
            angka = Double.toString(jumlah);
            jTextField1.setText(angka);
            break;
        case 4:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 / angka2;
            angka = Double.toString(jumlah);
            jTextField1.setText(angka);
            break;
            default:
            break;
    }
    }//GEN-LAST:event_tombolsamadenganActionPerformed

    private void tombolplusminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolplusminActionPerformed
        angka +="-";
        jTextField1.setText(angka);
    }//GEN-LAST:event_tombolplusminActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton13;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton tombol0;
    private javax.swing.JButton tombol1;
    private javax.swing.JButton tombol2;
    private javax.swing.JButton tombol3;
    private javax.swing.JButton tombol4;
    private javax.swing.JButton tombol5;
    private javax.swing.JButton tombol6;
    private javax.swing.JButton tombol7;
    private javax.swing.JButton tombol8;
    private javax.swing.JButton tombol9;
    private javax.swing.JButton tombolC;
    private javax.swing.JButton tombolbagi;
    private javax.swing.JButton tombolkali;
    private javax.swing.JButton tombolmin;
    private javax.swing.JButton tombolplus;
    private javax.swing.JButton tombolplusmin;
    private javax.swing.JButton tombolsamadengan;
    private javax.swing.JButton tomboltitik;
    // End of variables declaration//GEN-END:variables
}
