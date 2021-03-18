package classeprofessor;

public class ClasseProfessor {

    public static void main(String[] args) {
        /* declaração de objeto*/
        Professor prof1;
        
        /* instanciar o objeto */
        prof1 = new Professor();
        
        /*chamada dos metodos da classe criada*/
        prof1.dadosProf();
        prof1.saidaProf();
        prof1.FalarMaisAlto();
    }
    
}
