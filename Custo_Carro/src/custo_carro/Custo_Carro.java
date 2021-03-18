/*2)O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem
do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do 
distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica
de um carro, calcular e escrever o custo final ao consumidor.*/
package custo_carro;
import java.util.Scanner;
public class Custo_Carro {
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        double custoCarro = 0, totalCarro = 0;
        double perDistribuidor = 0, perImposto = 0;
        
        System.out.println("Cálculo do custo final ao consumidor de um veículo.");
        System.out.print("Informe o valor de fábrica do veículo: R$");
        custoCarro = aux.nextDouble();
        
        perDistribuidor = custoCarro * 28/100;
        perImposto = custoCarro * 45/100;
        totalCarro = custoCarro + perDistribuidor + perImposto;
        
        System.out.println("O valor final do veículo ao consumidor é R$" + totalCarro);
    }
    
}
