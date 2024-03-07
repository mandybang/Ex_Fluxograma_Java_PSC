/**Escreva um programa que calcule os quadrados e cubos dos números de 0 a 10 e 
 * imprima os valores resultantes em formato de tabela como a seguir: (Tabela presente no arquivo da atv)*/

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Número   Quadrado   Cubo");
        int numero0 = 0;
        int quadrado0 = numero0 * numero0;
        int cubo0 = numero0 * numero0 * numero0;
        System.out.printf("%-9d%-11d%d%n", numero0, quadrado0, cubo0);
        // %-9d e %-11d indicam números inteiros alinhados à esquerda com larguras de
        // 9 e 11 caracteres, respectivamente, %d é usado para outro número inteiro e %n é um caractere de nova linha.

        int numero1 = 1;
        int quadrado1 = numero1 * numero1;
        int cubo1 = numero1 * numero1 * numero1;
        System.out.printf("%-9d%-11d%d%n", numero1, quadrado1, cubo1);
        
        int numero2 = 2;
        int quadrado2 = numero2 * numero2;
        int cubo2 = numero2 * numero2 * numero2;
        System.out.printf("%-9d%-11d%d%n", numero2, quadrado2, cubo2);
        
        int numero3 = 3;
        int quadrado3 = numero3 * numero3;
        int cubo3 = numero3 * numero3 * numero3;
        System.out.printf("%-9d%-11d%d%n", numero3, quadrado3, cubo3);
        
        int numero4 = 4;
        int quadrado4 = numero4 * numero4;
        int cubo4 = numero4 * numero4 * numero4;
        System.out.printf("%-9d%-11d%d%n", numero4, quadrado4, cubo4);
        
        int numero5 = 5;
        int quadrado5 = numero5 * numero5;
        int cubo5 = numero5 * numero5 * numero5;
        System.out.printf("%-9d%-11d%d%n", numero5, quadrado5, cubo5);
        
        int numero6 = 6;
        int quadrado6 = numero6 * numero6;
        int cubo6 = numero6 * numero6 * numero6;
        System.out.printf("%-9d%-11d%d%n", numero6, quadrado6, cubo6);
        
        int numero7 = 7;
        int quadrado7 = numero7 * numero7;
        int cubo7 = numero7 * numero7 * numero7;
        System.out.printf("%-9d%-11d%d%n", numero7, quadrado7, cubo7);
        
        int numero8 = 8;
        int quadrado8 = numero8 * numero8;
        int cubo8 = numero8 * numero8 * numero8;
        System.out.printf("%-9d%-11d%d%n", numero8, quadrado8, cubo8);
        
        int numero9 = 9;
        int quadrado9 = numero9 * numero9;
        int cubo9 = numero9 * numero9 * numero9;
        System.out.printf("%-9d%-11d%d%n", numero9, quadrado9, cubo9);
        
        int numero10 = 10;
        int quadrado10 = numero10 * numero10;
        int cubo10 = numero10 * numero10 * numero10;
        System.out.printf("%-9d%-11d%d%n", numero10, quadrado10, cubo10);
    
        input.close();
    }
}