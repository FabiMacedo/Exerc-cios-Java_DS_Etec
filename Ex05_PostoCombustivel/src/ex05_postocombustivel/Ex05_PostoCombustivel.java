/*5)	Um posto está vendendo combustíveis com a seguinte tabela de descontos:
 Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível 
(codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser 
pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
*/
package ex05_postocombustivel;
import java.util.Scanner;
public class Ex05_PostoCombustivel {
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        String combustivel = null;
        double gasolina = 3.30, alcool = 2.90;
        double totPag = 0, qdeLitros = 0;      

        System.out.println("Posto de combustível BR");
        System.out.println("Escolha o combustível:");
        System.out.println("(A)Álcool (G)Gasolina");
        combustivel = aux.nextLine().toUpperCase();
        System.out.println("Informe quantos litros de combustível deseja comprar:");
        qdeLitros = aux.nextDouble(); 
        
        switch(combustivel){
            case "A":
                combustivel = "Ácool";
                if(qdeLitros <= 20){
                    alcool = alcool - (alcool * 3/100);
                }else if(qdeLitros > 20){
                     alcool = alcool - (alcool * 5/100);
                }
               totPag = (qdeLitros * alcool);
            break;
            case "G":
                combustivel = "Gasolina";
                if(qdeLitros <= 20){
                    gasolina = gasolina - (gasolina * 4/100);
                }else if(qdeLitros > 20){
                     gasolina = gasolina - (gasolina * 6/100);
                }
               totPag = (qdeLitros * gasolina);
            break;    
        }
        System.out.println("Combustível selecionado: "+combustivel);
        System.out.println("Total a pagar: "+ totPag);
    }
}
