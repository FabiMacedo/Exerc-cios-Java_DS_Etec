
package Telas;
import Classes.Cl_Login; /*Importando o pacote Classes e a classe Cl_Login*/
public class Login extends javax.swing.JFrame {
    Cl_Login enviarDados;
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_limpar = new javax.swing.JButton();
        btn_logar = new javax.swing.JButton();
        tf_senha = new javax.swing.JTextField();
        tf_usuario = new javax.swing.JTextField();
        lb_senha = new javax.swing.JLabel();
        lb_usuario = new javax.swing.JLabel();
        lb_acesso = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        Sair = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        bg_login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de login");
        setMaximumSize(new java.awt.Dimension(400, 500));
        setMinimumSize(new java.awt.Dimension(400, 500));
        setPreferredSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        btn_limpar.setBackground(new java.awt.Color(0, 102, 255));
        btn_limpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_limpar.setForeground(new java.awt.Color(0, 0, 102));
        btn_limpar.setText("Limpar");
        btn_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limparActionPerformed(evt);
            }
        });
        getContentPane().add(btn_limpar);
        btn_limpar.setBounds(230, 390, 72, 30);

        btn_logar.setBackground(new java.awt.Color(0, 102, 255));
        btn_logar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_logar.setForeground(new java.awt.Color(0, 0, 102));
        btn_logar.setText("Logar");
        btn_logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logar);
        btn_logar.setBounds(120, 390, 72, 30);

        tf_senha.setBackground(new java.awt.Color(0, 102, 255));
        getContentPane().add(tf_senha);
        tf_senha.setBounds(120, 330, 180, 30);

        tf_usuario.setBackground(new java.awt.Color(0, 102, 255));
        getContentPane().add(tf_usuario);
        tf_usuario.setBounds(120, 280, 180, 30);

        lb_senha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_senha.setForeground(new java.awt.Color(0, 0, 102));
        lb_senha.setText("Senha");
        getContentPane().add(lb_senha);
        lb_senha.setBounds(60, 330, 70, 20);

        lb_usuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_usuario.setForeground(new java.awt.Color(0, 0, 102));
        lb_usuario.setText("Usuário");
        getContentPane().add(lb_usuario);
        lb_usuario.setBounds(60, 280, 60, 20);

        lb_acesso.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_acesso.setForeground(new java.awt.Color(0, 51, 102));
        lb_acesso.setText("Informe os dados de acesso");
        getContentPane().add(lb_acesso);
        lb_acesso.setBounds(60, 240, 200, 20);

        titulo.setBackground(new java.awt.Color(255, 255, 255));
        titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 102));
        titulo.setText("JOGO LEGO");
        getContentPane().add(titulo);
        titulo.setBounds(100, 150, 200, 50);

        Sair.setBackground(new java.awt.Color(255, 255, 0));
        Sair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Sair.setForeground(new java.awt.Color(0, 51, 102));
        Sair.setText("Sair");
        Sair.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        getContentPane().add(Sair);
        Sair.setBounds(310, 450, 60, 30);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/logo_lego.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(290, 20, 100, 80);

        bg_login.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bg_login.setForeground(new java.awt.Color(0, 0, 102));
        bg_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/bg_login.png"))); // NOI18N
        bg_login.setText("Jogo Lego");
        getContentPane().add(bg_login);
        bg_login.setBounds(0, 0, 400, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void btn_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limparActionPerformed
        tf_usuario.setText("");
        tf_senha.setText("");
    }//GEN-LAST:event_btn_limparActionPerformed

    private void btn_logarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logarActionPerformed
        /*Instanciando a classe e o Objeto*/
        enviarDados = new Cl_Login();
        enviarDados.recebeDados(tf_usuario.getText().toLowerCase(), Integer.parseInt(tf_senha.getText()));
        /*toLowerCase() transforma caracteres em minusculos*/
        tf_usuario.setText("");
        tf_senha.setText("");
    }//GEN-LAST:event_btn_logarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sair;
    private javax.swing.JLabel bg_login;
    private javax.swing.JButton btn_limpar;
    private javax.swing.JButton btn_logar;
    private javax.swing.JLabel lb_acesso;
    private javax.swing.JLabel lb_senha;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField tf_senha;
    private javax.swing.JTextField tf_usuario;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
