/*9)Desenvolva uma tabela que registre a matrícula de 40 alunos em um curso livre, faça a entrada dos dados RA, NOME, 
IDADE, SEXO, TEL, EMAIL. Se o aluno for Menor de 18 anos insira também o nome do RESPONSÁVEL. Imprima a tabela gerada.*/
package ex09_cadastrodealunos;
import java.util.Scanner;
public class Ex09_CadastroDeAlunos {
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        String matriz[][] = new String[40][7];
        int idade = 0;
        
        System.out.println("Sistema de cadastro de alunos");
        for(int lin=0; lin<40; lin++){
            for(int col=0; col<7; col++){
                if(col == 0){
                    System.out.println("Digite o nome do " +(lin+1)+ "° aluno:");
                    matriz[lin][col] = aux.nextLine();
                }else if(col == 1){
                    System.out.println("Digite o RA do aluno:");
                    matriz[lin][col] = aux.nextLine();
                }else if(col == 2){
                    System.out.println("Digite o telefone:");
                    matriz[lin][col] = aux.nextLine();
                }else if(col == 3){
                    System.out.println("Digite o email:");
                    matriz[lin][col] = aux.nextLine();
                }else if(col == 4){
                    System.out.println("Digite o sexo:(F)Feminino (M)Masculino");
                    matriz[lin][col] = aux.nextLine();
                }else if(col == 5){
                    System.out.println("Digite a idade:");
                    matriz[lin][col] = aux.nextLine();
                    idade = Integer.parseInt(matriz[lin][col]);
                    if(idade < 18){
                        System.out.println("Digite o nome do responsável:");
                        matriz[lin][6] = aux.nextLine();
                    }
                }
            }
        } 
        
        for(int lin=0; lin<40; lin++){
            for(int col=0; col<7; col++){
                System.out.println(matriz[lin][col]);
            }
        }
        System.out.println("");
    }
}
