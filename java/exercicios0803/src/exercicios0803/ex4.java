package exercicios0803;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double salario = 1412.00;
		double quilowatt = (salario / 7) / 100;
		
		System.out.printf("O valor do quilowatt está em %.2f reais", quilowatt);
		
		System.out.println();
		System.out.println();
		
		System.out.print("Quantos quilowatt foram consumidos em sua residência? ");
		double consumo = entrada.nextDouble();
		
		
		System.out.println();
		
		double contaLuz = consumo * quilowatt; 
		
		System.out.printf("O valor da sua conta de luz seria de %.2f reais", contaLuz );
		
		System.out.println();
		System.out.println();
		
		double contaLuzDesconto = contaLuz - (contaLuz * 0.1);
		
		System.out.printf("Com o desconto passará a ser %.2f reais", contaLuzDesconto);
		
		
	}

}
