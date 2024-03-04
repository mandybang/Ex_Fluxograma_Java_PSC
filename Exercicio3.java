/**Crie um algoritmo que leia o primeiro nome do usuário e escreva uma saudação para ele.**/

import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        String nome;

        System.out.println("Digite seu nome: ");
        nome = input.nextLine();

        System.out.println("Seja bem-vindo(a)" + nome);
        input.close();
    }
}
