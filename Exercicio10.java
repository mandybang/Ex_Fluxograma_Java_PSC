import java.util.Scanner;

 /** Faça um programa que converta a temperatura dada em Fahrenheit para Celsius.
  * Para testar se a sua resposta está correta saiba que 100ºC = 212F. Considere C/5 = (F-32)/9 */

public class Exercicio10 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para entrada de dados
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;

        System.out.print("Digite a temperatura em Fahrenheit: ");
        fahrenheit = input.nextDouble();
        
        celsius = (fahrenheit - 32) / 1.8;
        
        System.out.println("Convertendo " + fahrenheit + " graus Fahrenheit correspondem a " + celsius + " graus Celsius.");
        input.close();
    }
}
