/** 2- Crie um algoritmo que lê dois números, X e Y, e mostra o resto da divisão entre eles.**/
import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int total;
    
        System.out.println("Digite um número:");
        x = input.nextInt();
    
        System.out.println("Digite outro número:");
        y = input.nextInt();
        
        total = x/y;
        System.out.println("A divisão dos números inseridos é:" + total);
        input.close();
    }
}
