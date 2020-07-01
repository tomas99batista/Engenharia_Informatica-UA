/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class animacao extends javax.swing.JFrame {
    
    // Nao esquecer de ver este erro
    private Timer timer;
    int valor = 0;

    public animacao() {
        initComponents();
        jLabelDuke1.setVisible(false);
        jLabelDuke2.setVisible(false);
        jLabelDuke3.setVisible(false);
        jLabelDuke4.setVisible(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelDuke4 = new javax.swing.JLabel();
        jLabelDuke3 = new javax.swing.JLabel();
        jLabelDuke2 = new javax.swing.JLabel();
        jLabelDuke1 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButtonIniciar = new javax.swing.JButton();
        jButtonParar = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Animação Duke");

        jPanel1.setLayout(null);

        jLabelDuke4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atividade04/imagens/duke_flip1.gif"))); // NOI18N
        jPanel1.add(jLabelDuke4);
        jLabelDuke4.setBounds(270, 80, 70, 70);

        jLabelDuke3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atividade04/imagens/duke_flip2.gif"))); // NOI18N
        jPanel1.add(jLabelDuke3);
        jLabelDuke3.setBounds(200, 80, 60, 70);

        jLabelDuke2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atividade04/imagens/duke_flip3.gif"))); // NOI18N
        jPanel1.add(jLabelDuke2);
        jLabelDuke2.setBounds(120, 80, 70, 70);

        jLabelDuke1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atividade04/imagens/duke_flip4.gif"))); // NOI18N
        jPanel1.add(jLabelDuke1);
        jLabelDuke1.setBounds(50, 80, 70, 80);

        jProgressBar1.setStringPainted(true);
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(70, 160, 260, 20);

        jButtonIniciar.setText("Iniciar");
        jButtonIniciar.setToolTipText("Clique para iniciar");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonIniciar);
        jButtonIniciar.setBounds(70, 190, 61, 23);

        jButtonParar.setText("Parar");
        jButtonParar.setToolTipText("Clique para parar");
        jButtonParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPararActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonParar);
        jButtonParar.setBounds(270, 190, 59, 23);

        jSlider1.setMajorTickSpacing(10);
        jSlider1.setMinorTickSpacing(1);
        jSlider1.setPaintLabels(true);
        jSlider1.setPaintTicks(true);
        jSlider1.setToolTipText("Ajustar a Velocidade");
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });
        jPanel1.add(jSlider1);
        jSlider1.setBounds(40, 230, 320, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPararActionPerformed
        timer.stop();

    }//GEN-LAST:event_jButtonPararActionPerformed

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        if (timer == null) {
            criarTimer();
            timer.start();
        } else if (!timer.isRunning()) { //perguntar ao professor porque nao reconhece o timer
            timer.restart();
        }
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        int valorSlider = jSlider1.getValue();
        timer.setDelay(100-valorSlider); //Delay a dar muitos erros confirmar
    }//GEN-LAST:event_jSlider1StateChanged

    private void criarTimer() {
        timer = new javax.swing.Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tarefa();
            }
        });
    }

    private void tarefa() {
        jLabelDuke1.setVisible(valor % 4 == 0);
        jLabelDuke2.setVisible(valor % 4 == 1);
        jLabelDuke3.setVisible(valor % 4 == 2);
        jLabelDuke4.setVisible(valor % 4 == 3);
        valor++;
        jProgressBar1.setValue(valor);
        if (valor >= 100) {
            valor = 0;
            timer.stop();
        }
    }

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
            java.util.logging.Logger.getLogger(animacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(animacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(animacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(animacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Ver erro que está a dar */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new animacao().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JButton jButtonParar;
    private javax.swing.JLabel jLabelDuke1;
    private javax.swing.JLabel jLabelDuke2;
    private javax.swing.JLabel jLabelDuke3;
    private javax.swing.JLabel jLabelDuke4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
