import java.util.Scanner;

/**Crie um algoritmo que leia a idade de uma pessoa e calcule quantos dias essa pessoa já viveu. */

public class Exercicio6 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        int idade;
        int diasVividos;

        System.out.println("Digite sua idade:" );
        idade = input.nextInt();

        diasVividos = idade*365;
        System.out.println("Você já viveu: " +diasVividos+ " dias.");
        
        input.close();
    }
}
