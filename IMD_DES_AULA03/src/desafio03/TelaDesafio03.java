// Agradeço a Deus pelo dom do conhecimento
// Eduardo Marçal
// Código fonte criado em: 02/11/14
package desafio03;

import javax.swing.Timer;

/**
 *
 * @author Eduardo
 */
public class TelaDesafio03 extends javax.swing.JFrame {

    /**
     * Creates new form TelaDesafio03
     */
    public TelaDesafio03() {
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

        jLabelDescricaoNome = new javax.swing.JLabel();
        jTextFieldNomeCompleto = new javax.swing.JTextField();
        jLabelDescricaoQtdTotalCaracteres = new javax.swing.JLabel();
        jLabelDescricaoQtdTotalConsoantes = new javax.swing.JLabel();
        jLabelDescricaoQtdTotalVogais = new javax.swing.JLabel();
        jLabelDescricaoVogaisNome = new javax.swing.JLabel();
        jLabelDescricaoConsoantesNome = new javax.swing.JLabel();
        jLabelQtdTotalCaracteres = new javax.swing.JLabel();
        jLabelQtdTotalCaracteresConsoantes = new javax.swing.JLabel();
        jLabelQtdTotalCaracteresVogais = new javax.swing.JLabel();
        jLabelVogaisNome = new javax.swing.JLabel();
        jLabelConsoantesNome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelDescricaoNome.setText("Nome:");

        jTextFieldNomeCompleto.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextFieldNomeCompletoInputMethodTextChanged(evt);
            }
        });
        jTextFieldNomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCompletoActionPerformed(evt);
            }
        });

        jLabelDescricaoQtdTotalCaracteres.setText("Quantidade de caracteres:");

        jLabelDescricaoQtdTotalConsoantes.setText("Quantidade de caracteres que representam consoantes");

        jLabelDescricaoQtdTotalVogais.setText("Quantidade de caracteres que representam vogais");

        jLabelDescricaoVogaisNome.setText("Vogais que estão no nome: ");

        jLabelDescricaoConsoantesNome.setText("Consoantes que estão no nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDescricaoQtdTotalVogais)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelQtdTotalCaracteresVogais))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDescricaoQtdTotalConsoantes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelQtdTotalCaracteresConsoantes))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelDescricaoConsoantesNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelConsoantesNome))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelDescricaoVogaisNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelVogaisNome))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelDescricaoNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDescricaoQtdTotalCaracteres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelQtdTotalCaracteres)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricaoNome)
                    .addComponent(jTextFieldNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricaoQtdTotalCaracteres)
                    .addComponent(jLabelQtdTotalCaracteres))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricaoQtdTotalConsoantes)
                    .addComponent(jLabelQtdTotalCaracteresConsoantes))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricaoQtdTotalVogais)
                    .addComponent(jLabelQtdTotalCaracteresVogais))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricaoVogaisNome)
                    .addComponent(jLabelVogaisNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescricaoConsoantesNome)
                    .addComponent(jLabelConsoantesNome))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCompletoActionPerformed
       
        
        
    }//GEN-LAST:event_jTextFieldNomeCompletoActionPerformed

    private void jTextFieldNomeCompletoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextFieldNomeCompletoInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeCompletoInputMethodTextChanged

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
            java.util.logging.Logger.getLogger(TelaDesafio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDesafio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDesafio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDesafio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDesafio03().setVisible(true);
          }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelConsoantesNome;
    private javax.swing.JLabel jLabelDescricaoConsoantesNome;
    private javax.swing.JLabel jLabelDescricaoNome;
    private javax.swing.JLabel jLabelDescricaoQtdTotalCaracteres;
    private javax.swing.JLabel jLabelDescricaoQtdTotalConsoantes;
    private javax.swing.JLabel jLabelDescricaoQtdTotalVogais;
    private javax.swing.JLabel jLabelDescricaoVogaisNome;
    private javax.swing.JLabel jLabelQtdTotalCaracteres;
    private javax.swing.JLabel jLabelQtdTotalCaracteresConsoantes;
    private javax.swing.JLabel jLabelQtdTotalCaracteresVogais;
    private javax.swing.JLabel jLabelVogaisNome;
    private javax.swing.JTextField jTextFieldNomeCompleto;
    // End of variables declaration//GEN-END:variables
}
