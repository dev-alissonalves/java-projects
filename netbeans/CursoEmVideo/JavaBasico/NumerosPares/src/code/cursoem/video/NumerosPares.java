/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package code.cursoem.video;

/**
 *
 * @author Alisson Alves
 */
public class NumerosPares extends javax.swing.JFrame {

    /**
     * Creates new form NumerosPares
     */
    public NumerosPares() {
        initComponents();
        setLocationRelativeTo(null);
        LbNumeroPar.setVisible(false);
        LbRestoDivisao.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        LbImagem = new javax.swing.JLabel();
        LbTitlePrincipal = new javax.swing.JLabel();
        CampoInsiraValor = new javax.swing.JTextField();
        LbInsiraValor = new javax.swing.JLabel();
        LbNumeroPar = new javax.swing.JLabel();
        LbRestoDivisao = new javax.swing.JLabel();
        LbDeveloper = new javax.swing.JLabel();
        BtAnalise = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jLabel3.setText("Desenvolvido por: Álisson Alves");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LbImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/code/cursoem/video/numeros.png"))); // NOI18N

        LbTitlePrincipal.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        LbTitlePrincipal.setText("NÚMEROS PARES E ÍMPARES");

        CampoInsiraValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoInsiraValorActionPerformed(evt);
            }
        });

        LbInsiraValor.setText("Insira um número:");

        LbNumeroPar.setText("É um número Par ou Ímpar?");

        LbRestoDivisao.setText("Resto da divisão = ");

        LbDeveloper.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        LbDeveloper.setText("Desenvolvido por: Álisson Alves");

        BtAnalise.setText("Fazer Análise");
        BtAnalise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAnaliseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LbTitlePrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BtAnalise, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(LbInsiraValor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(CampoInsiraValor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(LbNumeroPar)
                            .addComponent(LbRestoDivisao))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LbImagem)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(LbDeveloper)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LbTitlePrincipal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoInsiraValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LbInsiraValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtAnalise)
                        .addGap(18, 18, 18)
                        .addComponent(LbNumeroPar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LbRestoDivisao))
                    .addComponent(LbImagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(LbDeveloper))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoInsiraValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoInsiraValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoInsiraValorActionPerformed

    private void BtAnaliseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAnaliseActionPerformed
        int valor = Integer.parseInt(CampoInsiraValor.getText());
        int resto = 0;
        LbNumeroPar.setVisible(true);
        LbRestoDivisao.setVisible(true);
        if(valor % 2 == 0){
            LbNumeroPar.setText("<html>É um número Par ou Ímpar? <strong>("+valor+") é um número par!</strong></html>");
            LbRestoDivisao.setText("<html>Resto da divisão de <strong> "+valor+" por 2</strong> é = " + resto+"</html>");
        }else{
            LbNumeroPar.setText("<html>É um número Par ou Ímpar? <strong>("+valor+") é um número ímpar!</strong></html>");
            resto = valor % 2;
            LbRestoDivisao.setText("<html>Resto da divisão de <strong> " +valor+ " por 2</strong> é = <strong>"+ resto+"</strong></html>");
        }        
    }//GEN-LAST:event_BtAnaliseActionPerformed

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
            java.util.logging.Logger.getLogger(NumerosPares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumerosPares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumerosPares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumerosPares.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumerosPares().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAnalise;
    private javax.swing.JTextField CampoInsiraValor;
    private javax.swing.JLabel LbDeveloper;
    private javax.swing.JLabel LbImagem;
    private javax.swing.JLabel LbInsiraValor;
    private javax.swing.JLabel LbNumeroPar;
    private javax.swing.JLabel LbRestoDivisao;
    private javax.swing.JLabel LbTitlePrincipal;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}