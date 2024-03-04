import java.util.Scanner;

/**Crie um algoritmo que solicite o nome, o endereço e o telefone do usuário e
 * depois mostre os dados digitados.**/

public class Exercicio4 {
     public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        String nome;
        String end;
        String num;

        System.out.println("Digite seu nome: ");
        nome = input.nextLine();

        System.out.println("Digite seu endereço: ");
        end = input.nextLine();

        System.out.println("Digite seu telefone: ");
        num = input.nextLine();

        System.out.println("Seus dados são:" + nome +","+ end + ","+ num);
 
        input.close();
    }
}
