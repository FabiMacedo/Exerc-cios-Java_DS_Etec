
package classeprofessor;

import javax.swing.JOptionPane;

public class Professor {
    /*Declaração dos atributos(variáveis)*/
    private String nome;
    private int cpf;
    private int datNasc;
    private int regProf;      
            
    public Professor(){
        this("", 0, 0, 0);
    }
    
    public Professor(String nome, int cpf, int datNasc, int regProf){
        this.nome = nome;
        this.cpf = cpf;
        this.datNasc = datNasc;
        this.regProf = regProf;
    }
    
    /*chamada dos operadores  get e set */
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getCpf(){
        return cpf;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public int getDatNasc(){
        return datNasc;
    }
    public void setDatNasc(int datNasc){
        this.datNasc = datNasc;
    }
    public int getRegProf(){
        return regProf;
    }
    public void setRegProf(int regProf){
        this.regProf = regProf;
    }
     public void dadosProf(){
        String nome = JOptionPane.showInputDialog("Nome:");
        setNome(nome);
        
        int cpf = Integer.parseInt(JOptionPane.showInputDialog("CPF:"));
        setCpf(cpf);
        
        int datNasc = Integer.parseInt(JOptionPane.showInputDialog("Data de nascimento:"));
        setDatNasc(datNasc);
        
        int regProf = Integer.parseInt(JOptionPane.showInputDialog("RP:"));
        setRegProf(regProf);
     }
     
    public void saidaProf(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Data de nascimento: " + this.getDatNasc());
        System.out.println("RP: " + this.getRegProf());
    }
    public void FalarMaisAlto(){
        System.out.println("OLÁ PESSOAL!");
    }
}
