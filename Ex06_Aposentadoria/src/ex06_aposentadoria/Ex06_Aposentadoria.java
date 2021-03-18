/*6)	Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não. 
Para estar em condições, um dos seguintes requisitos deve ser satisfeito: - Para Homem: Ter no 
mínimo 65 anos de idade. - Ter trabalhado no mínimo 30 anos. Para Mulher:  Ter no mínimo 60 anos
e ter trabalhado no mínimo 25 anos. Com base nas informações acima, faça um algoritmo que leia: o 
número do empregado (código), o ano de seu nascimento e o ano de seu ingresso na empresa, o sexo, 
nome. O programa deverá escrever a idade e o tempo de trabalho do empregado e a mensagem Nome e 
'Requerer aposentadoria' ou 'Não requerer'.*/
package ex06_aposentadoria;
import java.util.Scanner;
public class Ex06_Aposentadoria {
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in); 
        String nome = null, sexo = null, codFuncionario = null;
        int anoNasc = 0, anoAdmissao = 0, anoAtual = 0;
        int idade = 0, tempoTrab = 0;
        
        System.out.println("Bem-vindo ao Sistema de Requerimento para Aposentadoria");
        System.out.println("Informe os dados do funcionário:\nNome:");
        nome = aux.nextLine();
        System.out.println("Informe o sexo:(F)Feminino (M)Masculino");
        sexo  = aux.nextLine().toUpperCase();
        System.out.println("Informe o código do funcionário:");
        codFuncionario = aux.nextLine();
        System.out.println("Informe o ano de nascimento:");
        anoNasc = aux.nextInt();
        System.out.println("Informe o ano da admissão:");
        anoAdmissao = aux.nextInt();
        System.out.println("Informe o ano atual:");
        anoAtual = aux.nextInt();
        
        idade = anoAtual - anoNasc;
        tempoTrab = anoAtual - anoAdmissao;
        
        System.out.println("Funcionário(a) " + nome + "\nCódigo do funcionário(a): " + codFuncionario + "\n"
        +"Sexo: "+ sexo +"\nIdade: "+ idade + "\nTempo de trabalho: "+ tempoTrab);
        
        switch(sexo){
            case "F":
                if(idade >= 60 && tempoTrab >= 25){
                    System.out.println("Funcionário apto a requerer aposentadoria");
                }else{
                    System.out.println("Funcionário inapto a requerer aposentadoria");
                }
            break;
            case "M":
                if(idade >= 65 && tempoTrab >= 30){
                    System.out.println("Funcionário apto a requerer aposentadoria");
                }else{
                    System.out.println("Funcionário inapto a requerer aposentadoria");
                }
            break;
            default:
                System.out.println("Ocorreu um erro, tente novamente!");
        }
    } 
}
