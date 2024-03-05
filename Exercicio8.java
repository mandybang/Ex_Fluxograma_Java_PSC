import java.util.Scanner;

 /** Escreva um programa que converte uma quantidade de metros para centímetros.*/

public class Exercicio8 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        double metros;
        double centimetros;

      System.out.print("Digite a quantidade de metros que deseja converter: ");
      metros = input.nextDouble();
        
      centimetros = metros * 100;
      
      System.out.println("A quantidade de metros inserida, equivale a " + centimetros + " centímetros.");
      
      input.close();

    }
}
