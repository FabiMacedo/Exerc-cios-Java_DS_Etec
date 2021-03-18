package poo1;
import javax.swing.JOptionPane;
public class Automotivo {
    /*Declaração dos atributos(variáveis)*/
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    
    /*Declaração dos valores iniciais dos atributos*/
    public Automotivo(){
        this("","",0,"");
    }
    /*manipulçaos dos atributos*/
    public Automotivo(String marca, String modelo, int ano, String cor){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }
    
    /*chamada dos operadores  get e set */
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
       
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    
    /* metodo 1 */
    public void entraDados(){
        String marca = JOptionPane.showInputDialog("Digite a marca do veiculo:");
        setMarca(marca);
        
        String modelo = JOptionPane.showInputDialog("Digite o modelo do veiculo:");
        setModelo(modelo);
        
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do veiculo:"));
        setAno(ano);
        
        String cor = JOptionPane.showInputDialog("Digite a cor do veiculo:");
        setCor(cor);        
    }
    
    /* metodo 2 */
    
    public void provarExistencia(){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Cor: " + this.getCor());
    }
    
 
    
}
