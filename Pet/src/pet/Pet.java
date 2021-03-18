package pet;
public class Pet {
    public static void main(String[] args) {
        /* declaração de objeto*/
       ObjPet pet1;
       ObjPet pet2;
       
       /* instanciar o objeto */
       pet1 = new ObjPet();
       pet2 = new ObjPet();
       
       /*chamada dos metodos da classe criada*/
       pet1.dadosPet();
       pet1.informacaoPet();
       
       pet2.dadosPet();
       pet2.informacaoPet();
    }
    
}
