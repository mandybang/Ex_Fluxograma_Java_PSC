/**Faça um programa para o seguinte problema:
 * Compraram-se N canetas iguais, que foram pagas com uma nota de Z reais, 
 * obtendo-se Y reais como troco. Quanto custou cada caneta? */
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantas canetas foram compradas? ");
        int nCanetas = input.nextInt();

        System.out.print("Qual nota foi utilizada para pagar o valor cobrado? ");
        double zReais = input.nextDouble();

        System.out.print("Qual foi o troco recebido: ");
        double yTroco = input.nextDouble();
        
        double custoTotal = zReais - yTroco;
        double unitCaneta = custoTotal / nCanetas;
        
        System.out.println("Cada caneta custou: R$" + unitCaneta);
        
        input.close();
    }
}
