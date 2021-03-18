/*4)Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade
mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade média = quantidade máxima
+ quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem 
'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.*/
package ex04_estoque;
import java.util.Scanner;
public class Ex04_Estoque {
    public static void main(String[] args) {
        Scanner aux = new Scanner(System.in);
        int qdeEstoque = 0, qdeMaxEstoque = 0, qdeMinEstoque = 0, qdeMediaEstoque = 0;
        
        System.out.println("Sistema gerenciador de estoque");
        System.out.println("Informe a quantidade atual de produtos no estoque:");
        qdeEstoque = aux.nextInt();
        System.out.println("Informe a capacidade máxima de produtos no estoque:");
        qdeMaxEstoque = aux.nextInt();
        System.out.println("Informe a capacidade mínima de produtos no estoque:");
        qdeMinEstoque = aux.nextInt();
      
        qdeMediaEstoque = (qdeMaxEstoque +  qdeMinEstoque)/2;
        
        if (qdeEstoque >= qdeMediaEstoque){
            System.out.println("Média do estoque:"+qdeMediaEstoque+"\nNão é necessário efetuar novas compras!");
        }else{
            System.out.println("Média do estoque:"+qdeMediaEstoque+"\nÉ necessário efetuar novas compras!");
        }
    } 
}
