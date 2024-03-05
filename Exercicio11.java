import java.util.Scanner;

/**Crie um programa que calcula a média simples de três notas fornecidas pelo usuário. */

public class Exercicio11 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        int nota1;
        int nota2;
        int nota3;
        float média;

        System.out.println("Digite sua primeira nota:");
        nota1 = input.nextInt();
    
        System.out.println("Digite sua segunda nota:");
        nota2 = input.nextInt();
        
        System.out.println("Digite sua terceira nota:");
        nota3 = input.nextInt();
        
        média = (nota1+nota2+nota3)/3;
        System.out.println("A média das notas inseridas é:" + média);
        input.close();

    }
}
