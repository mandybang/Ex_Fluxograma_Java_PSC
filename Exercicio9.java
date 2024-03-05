import java.util.Scanner;

 /** Desenvolva um programa que calcula a área de um círculo, onde o raio é fornecido pelo usuário.*/

 public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float area;
        float raio;

        System.out.print("Digite o valor do raio do círculo: ");
        raio = input.nextFloat();

        area = (float) (Math.PI * Math.pow(raio, 2));

        System.out.println("A área do círculo é: " + area);
        
        input.close();
    }
}