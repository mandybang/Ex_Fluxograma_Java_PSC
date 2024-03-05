/** 1- Crie um programa que solicita ao usuário dois números e, 
 * em seguida, mostra a soma desses números.**/
import java.util.Scanner;

public class Exercicio1 {
    public static void main (String[]args) {
    Scanner input = new Scanner(System.in);
    int n1;
    int n2;
    int total;

    System.out.println("Digite um número:");
    n1 = input.nextInt();

    System.out.println("Digite outro número:");
    n2 = input.nextInt();
    
    total = n1 + n2;
    System.out.println("A soma dos números inseridos é:" + total);
    input.close();



    }
}
