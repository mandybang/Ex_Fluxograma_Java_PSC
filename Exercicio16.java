/**Faça um programa que receba de entrada a distância total (em km) 
 * percorrida por um automóvel e a quantidade de combustível (em litros) 
 * consumida para percorrê-la, calcule e imprima o consumo médio de combustível. 
 * Fórmula: distância/litro. */

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a distancia percorrida em km: ");
        double distancia = input.nextDouble(); 
        //não há necessidade de criar a variavel antes, pode realizar dessa forma
        
        System.out.print("Agora digite a quantidade de combustivel consumido: ");
        double combustivel = input.nextDouble();
        
        double consumoMedio = distancia / combustivel;

        System.out.println("O consumo médio de combustível foi de: " + consumoMedio + " km/l");
        
        input.close();
    }
}
