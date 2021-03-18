
package Telas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Splash extends javax.swing.JFrame {

    public Splash() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/imagem/logo_lego.png")).getImage());
        
        new Thread(){
            public void run(){
                for(int i = 0; i <= 100; i++){
                    try{
                        sleep(50);
                        progress.setValue(i);
                        
                        if(progress.getValue() <= 30){
                            mensagem.setText("Iniciando o sistema");
                        }else if(progress.getValue() <= 60){
                            mensagem.setText("Carregando dispositivo de drivers sistema");
                        }else if(progress.getValue() <= 90){
                            mensagem.setText("Carregando o banco de dados do sistema");
                        }else{
                             mensagem.setText("Carregamento concluido");
                        }
                    }catch (InterruptedException ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao carregar.");                  
                     
                    }
                
                }
                
                Login lg = new Login();
                lg.setVisible(true);
                dispose(); // Oculta a tela de Splash
            }
           
        }.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mensagem = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();
        direitos = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        logo_lego = new javax.swing.JLabel();
        backgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo-v1.0");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        mensagem.setBackground(new java.awt.Color(255, 255, 255));
        mensagem.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(mensagem);
        mensagem.setBounds(100, 450, 380, 30);

        status.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("Status");
        getContentPane().add(status);
        status.setBounds(30, 444, 70, 40);

        progress.setBackground(new java.awt.Color(102, 102, 102));
        progress.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        progress.setForeground(new java.awt.Color(51, 51, 51));
        progress.setStringPainted(true);
        getContentPane().add(progress);
        progress.setBounds(30, 420, 340, 22);

        direitos.setText("® Todos os direitos reservados.");
        getContentPane().add(direitos);
        direitos.setBounds(10, 570, 190, 20);

        titulo.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 204, 0));
        titulo.setText("JOGO LEGO");
        getContentPane().add(titulo);
        titulo.setBounds(40, 150, 340, 50);

        logo_lego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/logo_lego.png"))); // NOI18N
        getContentPane().add(logo_lego);
        logo_lego.setBounds(20, 10, 100, 90);

        backgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/lego_bg.jpg"))); // NOI18N
        backgroud.setText("nnn");
        getContentPane().add(backgroud);
        backgroud.setBounds(0, 0, 800, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroud;
    private javax.swing.JLabel direitos;
    private javax.swing.JLabel logo_lego;
    private javax.swing.JLabel mensagem;
    private javax.swing.JProgressBar progress;
    private javax.swing.JLabel status;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
