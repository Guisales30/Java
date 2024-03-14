package exercicios0803;
import java.util.Scanner;
public class ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroEntrada, dezena, centena, unidade;
		System.out.print("Digite um número com 3 dígitos: ");
		numeroEntrada = entrada.nextInt();
		unidade = (numeroEntrada%100)%10;
		dezena = (numeroEntrada%100)/10;
		centena = numeroEntrada/100;
		System.out.print(unidade);
		System.out.print(dezena);
		System.out.print(centena);
	}

}
