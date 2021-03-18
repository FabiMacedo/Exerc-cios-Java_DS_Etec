package conversor_idade;
import java.util.Scanner;
public class Conversor_Idade {
    public static void main(String[] args) {
        
       Scanner aux = new Scanner(System.in);
       String nome = null;
       int idadeAno = 0, mes = 0, dia = 0; 
       int idadeDias = 0;
       
       System.out.println("Conversor de idade para dias de idade");
       System.out.println ("Digite seu nome:" );
       nome = aux.nextLine();
       System.out.println("Para converter a sua de idade de anos para dias de idade, é necessário que você informe: ");
       System.out.println ("Sua idade em anos:" );
       idadeAno = aux.nextInt();
       System.out.println ("Os meses:" );
       mes = aux.nextInt();
       System.out.println ("Os dias:" );
       dia = aux.nextInt();
       
       idadeDias = (365 * idadeAno) + (30 * mes) + dia;
       System.out.println("Você tem aproximadamente" +idadeDias+ " dias de idade.");
    }    
}

  
