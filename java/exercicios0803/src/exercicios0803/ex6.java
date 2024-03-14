package exercicios0803;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double valorX, valorY;
		System.out.print("Digite o valor de x: ");
		valorX = entrada.nextDouble();
		valorY = Math.sqrt( Math.cbrt((valorX-1/2)));
		System.out.println("----------------------");
		System.out.printf("o resultado é: %.3f", valorY);

	}

}
