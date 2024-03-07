/**Cada degrau de uma escada tem X de altura. 
 * Faça um programa que receba essa altura e a altura que o usuário deseja alcançar subindo a escada,
 *  calcule e mostre quantos degraus ele deverá subir para atingir seu objetivo, 
 * sem se preocupar com a altura do usuário. Todas as medidas fornecidas devem estar em metros.*/
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Qual a altura dos degraus? ");
        double alturaDegrau = input.nextDouble();
        
        System.out.print("Quantos metros de altura você deseja alcançar? ");
        double alturaDesejada = input.nextDouble();
        
        int numeroDegraus = (int) Math.ceil(alturaDesejada / alturaDegrau); 
        //Math.ceil() é usado para arredondar um número para cima para o próximo número inteiro.
         
        System.out.println("Para alcançar " + alturaDesejada + " metros, você deve subir " + numeroDegraus + " degraus.");
        
        input.close();
    }
    
}
