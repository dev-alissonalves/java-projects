/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package code.cursoem.video;
public class GenioGame extends javax.swing.JFrame {
    public GenioGame() {
        initComponents();
        setLocationRelativeTo(null);
        LbMostraMensagem.setText("<html>Estou pensando em um número entre <strong>1 e 10</strong>. Tente adivinhar!.</html>");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LbGenio = new javax.swing.JLabel();
        LbTitle = new javax.swing.JLabel();
        LbMostraMensagem = new javax.swing.JLabel();
        LbBalaoMensagem = new javax.swing.JLabel();
        LbValorEscolhido = new javax.swing.JLabel();
        SpnValorInformado = new javax.swing.JSpinner();
        BtJogarPalpite = new javax.swing.JButton();
        LbJogadaGenio = new javax.swing.JLabel();
        LbPalpiteJogador = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LbGenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/cursoem/video/genio200.png"))); // NOI18N
        getContentPane().add(LbGenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        LbTitle.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        LbTitle.setText("Gênio da Lâmpada...");
        getContentPane().add(LbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, -1));

        LbMostraMensagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LbMostraMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbMostraMensagem.setText("FRASE");
        getContentPane().add(LbMostraMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 130, 70));

        LbBalaoMensagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/cursoem/video/balao200.png"))); // NOI18N
        getContentPane().add(LbBalaoMensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, -1));

        LbValorEscolhido.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        LbValorEscolhido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbValorEscolhido.setText("Valor escolhido");
        getContentPane().add(LbValorEscolhido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        SpnValorInformado.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        SpnValorInformado.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        getContentPane().add(SpnValorInformado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 70, 30));

        BtJogarPalpite.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtJogarPalpite.setText("Palpite!");
        BtJogarPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtJogarPalpiteActionPerformed(evt);
            }
        });
        getContentPane().add(BtJogarPalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 110, 40));

        LbJogadaGenio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbJogadaGenio.setText("Jogada do Gênio: ");
        getContentPane().add(LbJogadaGenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 210, -1));

        LbPalpiteJogador.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LbPalpiteJogador.setText("Sua Jogada: ");
        getContentPane().add(LbPalpiteJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jLabel3.setText("Desenvolvido por: Álisson Alves");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 240, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtJogarPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtJogarPalpiteActionPerformed
        double numeroAleatorio = 1 + Math.random() * (11 - 1);
        int numeroAleatorioInt = (int) numeroAleatorio;
        int numeroJogador = Integer.parseInt(SpnValorInformado.getValue().toString());
        String frase1 = "<html>Você é um gênio! Acertooou!</html>";
        String frase2 = "<html>Hahaha... Você não conseguiu! Eu pensei no valor " + numeroAleatorioInt +"</html>";
        String resposta = (numeroAleatorioInt == numeroJogador)?frase1:frase2;
        LbMostraMensagem.setText(resposta);
        LbJogadaGenio.setText("Jogada do Gênio: " + numeroAleatorioInt);
        LbPalpiteJogador.setText("Sua Jogada: "+ numeroJogador);
    }//GEN-LAST:event_BtJogarPalpiteActionPerformed

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
            java.util.logging.Logger.getLogger(GenioGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenioGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenioGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenioGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenioGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtJogarPalpite;
    private javax.swing.JLabel LbBalaoMensagem;
    private javax.swing.JLabel LbGenio;
    private javax.swing.JLabel LbJogadaGenio;
    private javax.swing.JLabel LbMostraMensagem;
    private javax.swing.JLabel LbPalpiteJogador;
    private javax.swing.JLabel LbTitle;
    private javax.swing.JLabel LbValorEscolhido;
    private javax.swing.JSpinner SpnValorInformado;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
