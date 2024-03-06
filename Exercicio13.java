/**Escreva um programa que calcula o salário líquido de um funcionário. 
 * O programa deve solicitar o valor da hora de trabalho, o número de horas 
 * trabalhadas no mês e o percentual de desconto do INSS */

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salarioLiquido;
        double valorHora;
        int numeroHoras;
        double percentualINSS;
        double salarioBruto;
        double descontoINSS;
        

        System.out.print("Digite o valor da sua hora trabalhada: ");
        valorHora = input.nextDouble();

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        numeroHoras = input.nextInt();

        System.out.print("Digite o percentual de desconto do INSS (%): ");
        percentualINSS = input.nextDouble();

        salarioBruto = valorHora * numeroHoras;
        descontoINSS = (salarioBruto * percentualINSS) / 100;
         salarioLiquido = salarioBruto - descontoINSS;

        System.out.println("Seu salário líquido de funcionário é: R$" + salarioLiquido);

        input.close();
    }
}
