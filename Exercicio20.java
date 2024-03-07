/**Escrever um algoritmo que lê: - a porcentagem do IPI a ser acrescido no valor das peças - 
 * o código da peça 1, valor unitário da peça 1, quantidade de peças 1 - o código da peça 2, valor unitário da peça 2, 
 * quantidade de peças 2. O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
*/
import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Informe a porcentagem do IPI a ser acrescido no valor das peças: ");
        double porcentagemIPI = input.nextDouble();
        
        System.out.println("Peça 1:");
        System.out.print("Informe o código da peça: ");
        int codigoPeca1 = input.nextInt();

        System.out.print("O valor unitário da peça que possui o código" + codigoPeca1 + " é: ");
        double valorUnitarioPeca1 = input.nextDouble();

        System.out.print("Informe a quantidade de peças: ");
        int quantidadePeca1 = input.nextInt();
        

        System.out.println("Peça 2:");
        System.out.print("Informe o código da peça: ");
        int codigoPeca2 = input.nextInt();

        System.out.print("O valor unitário da peça que possui o código" + codigoPeca2 + " é: ");
        double valorUnitarioPeca2 = input.nextDouble();

        System.out.print("Informe a quantidade de peças: ");
        int quantidadePeca2 = input.nextInt();
        

        double totalValorPecas = (valorUnitarioPeca1 * quantidadePeca1) + (valorUnitarioPeca2 * quantidadePeca2);
        

        double valorIPI = (totalValorPecas * porcentagemIPI) / 100;
        

        double valorTotalPago = totalValorPecas + valorIPI;
        

        System.out.println("O valor total a ser pago é: R$" + valorTotalPago);
        
        input.close();
    }
}