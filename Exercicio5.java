import java.util.Scanner;

/**Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais. Considere que a cotação é US$ 1 = R$ 4,95.**/

public class Exercicio5 {
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        float dolar;
        float real;

        System.out.print("Digite o valor que você possui em dolar: " +"US$" );
        dolar = input.nextFloat();
        
        real = dolar * 4.95f;
        System.out.printf("O valor possuido em real é: " + "R$"+ "%.2f",real);

        input.close();
        
    }
}
