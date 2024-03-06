/**Desenvolva um programa que, dados dois valores A e B, 
 * troque os valores de forma que A passe a ter o valor de B e vice-versa. 
 * Exiba os valores após a troca.
 */
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temp;
        int A;
        int B;


        System.out.print("Digite o valor de A: ");
        A = input.nextInt();

        System.out.print("Digite o valor de B: ");
        B = input.nextInt();

        System.out.println("Valores originais:");

        System.out.println("A = " + A);

        System.out.println("B = " + B);

        temp = A;
        A = B;
        B = temp;

        System.out.println("Valores após a troca:");

        System.out.println("A = " + A);

        System.out.println("B = " + B);
        
        input.close();
    }
    
}
