/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Fase1;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author usuario
 */
public class Fase1 extends javax.swing.JFrame {
    Random generador = new Random();
    int letra;
    
    /**
     * Creates new form Fase1
     */
    public Fase1() {
        initComponents();
        jToggleButton1.setEnabled(false);
        jToggleButton2.setEnabled(false);
        jToggleButton3.setEnabled(false);
        jToggleButton4.setEnabled(false);
        jToggleButton5.setEnabled(false);
        jToggleButton6.setEnabled(false);
        jToggleButton7.setEnabled(false);
        jToggleButton8.setEnabled(false);
        jToggleButton9.setEnabled(false);
        jToggleButton10.setEnabled(false);
        jToggleButton11.setEnabled(false);
        jToggleButton12.setEnabled(false);
        jToggleButton13.setEnabled(false);
        jToggleButton14.setEnabled(false);
        jToggleButton15.setEnabled(false);
        jToggleButton16.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelImagen1 = new javax.swing.JLabel();
        jLabelImagen3 = new javax.swing.JLabel();
        jLabelImagen4 = new javax.swing.JLabel();
        jLabelImagen2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton13 = new javax.swing.JToggleButton();
        jToggleButton14 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255)));

        jLabelImagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fase1/imagenes/Z.png"))); // NOI18N

        jLabelImagen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fase1/imagenes/Z.png"))); // NOI18N

        jLabelImagen4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fase1/imagenes/Z.png"))); // NOI18N

        jLabelImagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fase1/imagenes/Z.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelImagen1)
                .addGap(18, 18, 18)
                .addComponent(jLabelImagen2)
                .addGap(18, 18, 18)
                .addComponent(jLabelImagen3)
                .addGap(18, 18, 18)
                .addComponent(jLabelImagen4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelImagen3)
                    .addComponent(jLabelImagen1)
                    .addComponent(jLabelImagen4)
                    .addComponent(jLabelImagen2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255)));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255)));

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fase1/imagenes/Z.png"))); // NOI18N

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fase1/imagenes/Z.png"))); // NOI18N

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fase1/imagenes/Z.png"))); // NOI18N

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fase1/imagenes/Z.png"))); // NOI18N

        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fase1/imagenes/Z.png"))); // NOI18N

        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fase1/imagenes/Z.png"))); // NOI18N

        jToggleButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fase1/imagenes/Z.png"))); // NOI18N

        jToggleButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fase1/imagenes/Z.png"))); // NOI18N

        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fase1/imagenes/Z.png"))); // NOI18N

        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fase1/imagenes/Z.png"))); // NOI18N

        jToggleButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fase1/imagenes/Z.png"))); // NOI18N

        jToggleButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fase1/imagenes/Z.png"))); // NOI18N

        jToggleButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fase1/imagenes/Z.png"))); // NOI18N

        jToggleButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fase1/imagenes/Z.png"))); // NOI18N

        jToggleButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fase1/imagenes/Z.png"))); // NOI18N

        jToggleButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fase1/imagenes/Z.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton1)
                            .addComponent(jToggleButton11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jToggleButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton7))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jToggleButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToggleButton4))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jToggleButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton9))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jToggleButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton4)
                    .addComponent(jToggleButton3)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton7)
                    .addComponent(jToggleButton5)
                    .addComponent(jToggleButton6)
                    .addComponent(jToggleButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton8)
                    .addComponent(jToggleButton9)
                    .addComponent(jToggleButton10)
                    .addComponent(jToggleButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton13)
                    .addComponent(jToggleButton14)
                    .addComponent(jToggleButton15)
                    .addComponent(jToggleButton16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String letraImagen="";
        for(int i=0;i<4;i++){
                    letra = generador.nextInt(15)+65;
                    letraImagen+=(char)letra;
        }
        try {
            jLabelImagen1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("imagenes/"+ letraImagen.charAt(0) +".png"))));
            jLabelImagen2.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("imagenes/"+ letraImagen.charAt(1) +".png"))));
            jLabelImagen3.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("imagenes/"+ letraImagen.charAt(2) +".png"))));
            jLabelImagen4.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("imagenes/"+ letraImagen.charAt(3) +".png"))));
               
        } catch (IOException ex) {
           Logger.getLogger(Fase1.class.getName()).log(Level.SEVERE, null, ex);
        }
           
       
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //botones
        jToggleButton1.setEnabled(true);
        jToggleButton2.setEnabled(true);
        jToggleButton3.setEnabled(true);
        jToggleButton4.setEnabled(true);
        jToggleButton5.setEnabled(true);
        jToggleButton6.setEnabled(true);
        jToggleButton7.setEnabled(true);
        jToggleButton8.setEnabled(true);
        jToggleButton9.setEnabled(true);
        jToggleButton10.setEnabled(true);
        jToggleButton11.setEnabled(true);
        jToggleButton12.setEnabled(true);
        jToggleButton13.setEnabled(true);
        jToggleButton14.setEnabled(true);
        jToggleButton15.setEnabled(true);
        jToggleButton16.setEnabled(true);
        
        String letraImagen="";
        for(int n=0;n<16;n++){   
             letra = generador.nextInt(15)+65;
             letraImagen+=(char)letra;
        }
        try {
            jToggleButton1.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("imagenes/"+ letraImagen.charAt(0) +".png"))));
             jToggleButton2.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("imagenes/"+ letraImagen.charAt(1) +".png"))));
             jToggleButton3.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("imagenes/"+ letraImagen.charAt(2) +".png"))));
             jToggleButton4.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("imagenes/"+ letraImagen.charAt(3) +".png"))));
             jToggleButton5.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("imagenes/"+ letraImagen.charAt(4) +".png"))));
             jToggleButton6.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("imagenes/"+ letraImagen.charAt(5) +".png"))));
             jToggleButton7.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("imagenes/"+ letraImagen.charAt(6) +".png"))));
             jToggleButton8.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("imagenes/"+ letraImagen.charAt(7) +".png"))));
             jToggleButton9.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("imagenes/"+ letraImagen.charAt(8) +".png"))));
             jToggleButton10.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("imagenes/"+ letraImagen.charAt(9) +".png"))));
             jToggleButton11.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("imagenes/"+ letraImagen.charAt(10) +".png"))));
             jToggleButton12.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("imagenes/"+ letraImagen.charAt(11) +".png"))));
             jToggleButton13.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("imagenes/"+ letraImagen.charAt(12) +".png"))));
             jToggleButton14.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("imagenes/"+ letraImagen.charAt(13) +".png"))));
             jToggleButton15.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("imagenes/"+ letraImagen.charAt(14) +".png"))));
             jToggleButton16.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("imagenes/"+ letraImagen.charAt(15) +".png"))));
             
        } catch (IOException ex) {
                 Logger.getLogger(Fase1.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Fase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fase1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fase1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelImagen1;
    private javax.swing.JLabel jLabelImagen2;
    private javax.swing.JLabel jLabelImagen3;
    private javax.swing.JLabel jLabelImagen4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JToggleButton jToggleButton14;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables
}
