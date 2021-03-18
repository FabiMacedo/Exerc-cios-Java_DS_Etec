/*7)	Faça um algoritmo para ler um vetor de 20 números. Após isto, deverá ser lido mais um número
qualquer e verificar se esse número existe no vetor ou não. Se existir, o algoritmo deve gerar um novo
vetor sem esse número. (Considere que não haverá números repetidos no vetor).*/
package ex07_vetorcomparacao;
import java.util.Scanner;
public class EX07_VetorComparacao {
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        int numVet[] = new int[20];
        int num = 0, igual = 0;
        
        System.out.println("Sistema Comparador de números");
        System.out.println("Digite 20 números diferentes");
        for (int i=0; i<20; i++){
            System.out.println("Digite o " +(i+1)+ "º número inteiro:");
            numVet[i] = aux.nextInt();
        }
        
        System.out.println("Agora digite mais um número inteiro qualquer:");
        num = aux.nextInt();
        
        System.out.println("Se o último número digitado for igual a algum dos 20 anteriores, ele não será exibido.");
        for (int i=0; i<20; i++) {
            if (numVet[i] != num) {
                System.out.println("O "+(i+1)+"°  número é: " + numVet[i]);
            }     
        }
    }
    
}
