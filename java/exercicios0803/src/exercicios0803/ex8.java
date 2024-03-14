package exercicios0803;
import java.util.Scanner;
public class ex8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numeroEntrada;
		System.out.print("Digite um número com 3 dígitos: ");
		numeroEntrada = entrada.nextInt();
		double dezena = ((numeroEntrada%100)%10)    ;

		System.out.println(dezena);
	}

}
