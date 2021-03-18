/*3)A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que
trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com 
um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, 
o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas
extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas)*/
package ex03_salariofuncionario;
import java.util.Scanner;
public class Ex03_SalarioFuncionario {
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        double quantHoraTrab = 0, salHora = 0;
        double salTot = 0, horaMes = 160, horaExtra = 0;
        
        System.out.println("Sistema de cálculo de Salário");
        System.out.println("Informe o valor do salário por hora R$");
        salHora = aux.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas em um mês:");
        quantHoraTrab = aux.nextDouble();
        
        if (quantHoraTrab > horaMes){
            horaExtra =  salHora + (salHora * 50/100);
            salTot = quantHoraTrab *   horaExtra;
        }else{
            salTot = quantHoraTrab * salHora;
        }
        System.out.println("O sálario total é R$" + salTot);  
    }
}
