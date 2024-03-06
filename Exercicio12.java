/**Escreva um algoritmo para ler um valor e escrever o seu antecessor e o seu sucessor. */
    import java.util.Scanner;

    public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int antecessor;
        int sucessor;
       
        System.out.print("Escreva um número: ");
        numero = input.nextInt();

        antecessor = numero - 1;
        sucessor = numero + 1;


        System.out.println("Seu antecessor" + " é: " + antecessor);
        System.out.println("Já o sucessor " + "é: " + sucessor);

        input.close();
    }
}