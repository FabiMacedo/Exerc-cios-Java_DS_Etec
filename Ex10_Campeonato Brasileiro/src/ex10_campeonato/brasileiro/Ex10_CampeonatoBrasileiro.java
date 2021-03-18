/*10)	  Desenvolva uma tabela do campeonato brasileiro, cadastre os 20 times e informe os times, os pontos, a quantidade de jogos realizados, número de vitórias, empates e derrotas. Imprima a tabela gerada.*/
package ex10_campeonato.brasileiro;
import java.util.Scanner;
public class Ex10_CampeonatoBrasileiro {
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        String matriz[][] = new String[20][7];
        
        System.out.println("CAMPEONATO BRASILEIRO DE FUTEBOL");
        for(int lin=0; lin<20; lin++){
            for(int col=0; col<7; col++){
                switch(col){
                    case 0:
                    System.out.println("Digite o nome do " +(lin+1)+ "° time:");
                    matriz[lin][col] = aux.nextLine();
                    break;
                    case 1:
                    System.out.println("Digite quantidade de pontos feitos:");
                    matriz[lin][col] = aux.nextLine();
                    break;
                    case 2:
                    System.out.println("Digite a quantidade de jogos realizados:");
                    matriz[lin][col] = aux.nextLine();
                    break;
                    case 3:
                    System.out.println("Digite o número de vitórias:");
                    matriz[lin][col] = aux.nextLine();
                    break;
                    case 4:
                    System.out.println("Digite o número de empates");
                    matriz[lin][col] = aux.nextLine();
                    break;
                    case 5:
                    System.out.println("Digite o número de derrotas:");
                    matriz[lin][col] = aux.nextLine();
                    break;
                }
                
            }
        } 
        
        for(int lin=0; lin<20; lin++){
            for(int col=0; col<7; col++){
                System.out.println(matriz[lin][col]);
            }
        }
        
    }
}
        

