package exercicios0803;
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double valorHoraAula, salarioBruto, salarioLiquido, descontoINSS;
		int horasDeAula;

		valorHoraAula = 22;
		System.out.print("Quantas horas você trabalhou este mês? ");
		horasDeAula = entrada.nextInt();
		salarioBruto = valorHoraAula * horasDeAula;
		descontoINSS = salarioBruto * 0.1;
		salarioLiquido = salarioBruto - descontoINSS;
		System.out.println("-------------------------------------------");
		System.out.printf("Seu salário líquido este més é de: %.2f", salarioLiquido);

	}

}
