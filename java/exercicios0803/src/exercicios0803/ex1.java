package exercicios0803;
import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		
		double valor1, valor2;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor de um lado: ");
		valor1 = entrada.nextDouble();
		
		System.out.print("Digite o valor do outro lado: ");
		valor2 = entrada.nextDouble();
		
		System.out.println("-------------------------------");
		
		double area, perimetro;
		
		area = valor1 * valor2;
		perimetro = 2 * (valor1 + valor2);
		
		System.out.println("O valor da área é: "+ area);
		
		System.out.print("O valor do perímetro é: "+ perimetro);
	}

}
