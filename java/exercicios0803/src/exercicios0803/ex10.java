package exercicios0803;
import java.util.Scanner;

public class ex10 extends ex1{

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o número em binário: ");
		String bin = entrada.next();
		int numero = Integer.parseInt(bin, 2);
		System.out.println("-----------------------------------------");
		System.out.printf("O número binario %s em decimal corresponde a: %d", bin, numero);
		
		
	}

}
