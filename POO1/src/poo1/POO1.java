package poo1;

public class POO1 {
    public static void main(String[] args) {
       /* declaração de objeto*/
       Automotivo auto;
       Automotivo auto1;
       
       /* instanciar o objeto */
       auto = new Automotivo();
       auto1 = new Automotivo();
       
       /*chamada dos metodos da classe criada*/
       auto.entraDados();
       auto.provarExistencia();
       
       auto1.entraDados();
       auto1.provarExistencia();
    }
    
}
