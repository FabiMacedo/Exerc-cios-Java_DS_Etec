/*8)	Faça um algoritmo para ler 50 números e armazenar em um vetor VET, verificar e escrever se existem números 
repetidos no vetor VET e em que posições se encontram.*/
package ex08_verificarvetor;
import java.util.Scanner;
public class Ex08_VerificarVetor {
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        int VET[] = new int[5];
        int a = 0;
        
        System.out.println("Sistema verificador de números repetidos");
        System.out.println("Por favor, digite 50 números inteiros");
        for(int i=0; i<5; i++){
            System.out.println("Digite o "+(i+1)+"° número do vetor:");
            VET[i] = aux.nextInt(); 
        }
        
        for(int i=0; i<5; i++){
            System.out.println("VET["+(i)+"]= "+VET[i] );
        }
        
        for(int i=0; i<5;i++){
            a = i;
            System.out.println("\n"+(a+1)+"° sequencia de comparações:");
            for(int x=0; x<4; x++){
                if(a != x){
                    if(VET[a] == VET[x]){
                        System.out.println("O VET["+a+"] com o valor "+VET[a]+" é igual ao VET["+x+"]com o valor "+VET[x]+".");
                    }
                }
            }
            a++;
            System.out.println("");
        }
    }   
}
