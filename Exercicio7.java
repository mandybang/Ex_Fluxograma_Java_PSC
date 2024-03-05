import java.util.Scanner;
/**Crie um algoritmo que lê o salário de um funcionário, reajusta o salário em 7% e mostra o resultado. */
public class Exercicio7 {
    
    public static void main (String[]args) {
        Scanner input = new Scanner(System.in);
        String funcionario;
        double salario;
        double reajuste;
        double novoSalario;

        System.out.println("Digite seu nome: ");
        funcionario = input.nextLine();

        System.out.println("Digite seu salario: ");
        salario = input.nextDouble();

        reajuste = salario * 0.07;
        novoSalario = salario + reajuste;

        System.out.println("Olá, " + funcionario + "! Seu novo salário após o reajuste de 7% é de R$: " + novoSalario);

        input.close();
    }
}
