package pet;

import javax.swing.JOptionPane;

public class ObjPet {
    /*Declaração dos atributos(variáveis)*/
    private String nome;
    private String raca;
    private String porte;
    private String genero;
    private int idade;
    
    /*Declaração dos valores iniciais dos atributos*/
    public ObjPet(){
        this("","","","",0);
    }
    /*manipulçaos dos atributos*/
    public ObjPet(String nome, String raca, String porte, String genero, int idade){
        this.nome = nome;
        this.raca = raca;
        this.porte = porte;
        this.genero = genero;
        this.idade = idade;
        
    }
    
    /*chamada dos operadores  get e set */
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
       
    public String getRaca(){
        return raca;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    public String getPorte(){
        return porte;
    }
    public void setPorte(String porte){
        this.porte = porte;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    /* metodo 1 */
    public void dadosPet(){
        String nome = JOptionPane.showInputDialog("Informe o nome do seu pet:");
        setNome(nome);
        
        String raca = JOptionPane.showInputDialog("Informe a raça do seu pet:");
        setRaca(raca);
        
        String porte = JOptionPane.showInputDialog("Informe o porte do seu pet:");
        setPorte(porte);
        
        String genero = JOptionPane.showInputDialog("Informe o gênero do seu pet:");
        setGenero(genero);
        
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do seu pet:"));
        setIdade(idade);
               
    }
    
    /* metodo 2 */
    public void informacaoPet(){
        System.out.println("Confira os dados do seu Pet");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Raca: " + this.getRaca());
        System.out.println("Porte: " + this.getPorte());
        System.out.println("Sexo: " + this.getGenero());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("");
    }
}
