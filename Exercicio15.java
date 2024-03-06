/**Construa um programa que calcule as raízes de uma equação de 2º grau (Ax2+Bx+C). 
 * Sendo que os valores A,B e C são fornecidos pelo usuário. 
 * Considere que tem duas raízes. */

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double A = input.nextDouble();

        System.out.print("Digite o valor de B: ");
        double B = input.nextDouble();

        System.out.print("Digite o valor de C: ");
        double C = input.nextDouble();

        double delta = (B * B) - (4 * A * C);


        if (delta < 0) { //Há necessidade do 'if' no código, pois ele verifica se a equação possui raízes reais com base no discriminante. /
            System.out.println("A equação não possui raízes reais.");
        } 
        
            else { //Há necessidade do `else`, pois ele calcula e exibe as raízes se existirem, senão informa que não há raízes reais./
       
            double raiz1 = (-B + Math.sqrt(delta)) / (2 * A);
            double raiz2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.println("As raízes da equação são:");
            System.out.println("Raiz 1 = " + raiz1);
            System.out.println("Raiz 2 = " + raiz2);
                }

        input.close();
    }
    
}
