package Classes;

import Telas.Login;
import Telas.Principal;
import javax.swing.JOptionPane;

public class Cl_Login {
/*Declarar atributos*/
    private String usuario;
    private int senha;
    
    /*Inicializar atributos*/
    public Cl_Login(){
        this("", 0); 
    }
    
    /*ATRIBUIÇÃO  DE ACESSO AOS ARIBUTOS*/
    public Cl_Login(String user, int key){
        this.usuario = user;
        this.senha = key;
    }
    
    /*Construtores GETTERS SETTERS*/
    /*Construtores de Usuário*/
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String user){
        this.usuario = user;
    }
    public int getSenha(){
        return senha;
    }
    public void setSenha(int key){
        this.senha = key;
    }
    
    
    /*Definiçõa dos métodos da Classe Cl_Login*/
    public void recebeDados(String user, int key){
        setUsuario(user);
        setSenha(key);
        
        /*teste verificação
        System.out.println("Usuário: " +this.getUsuario());
        System.out.println("Senha: " +this.getSenha());*/
        
        /*processo dos dados recebidos*/
        if(this.getUsuario().equals("admin") && this.getSenha() == 1234){
            JOptionPane.showMessageDialog(null, "Acesso liberado. Usuário e senha reconhecidos.");
            
            /*chama a tela principal*/
            Principal principal = new Principal(); //Instancia o form Principal
            principal.setVisible(true);   //o objeto da class Principal chama o método setVisible
            
            /*oculta a tela Login*/
            Login lg = new Login();   //Instancia o form Login
            lg.dispose(); // Oculta a tela de Splash
            
        }else{
            JOptionPane.showMessageDialog(null, "Acesso negado. Usuário e senha não conferem.");
        }
    }
    
}
