package exercicios0803;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double tempC, tempF;
		
		System.out.print("Indique a temperatura em Celsius: ");
		tempC = entrada.nextDouble();
		
		System.out.println("-----------------------------------");
		
		tempF = tempC * 9/5 + 32;
		
		System.out.println("Em Fahrenheit é equivalente a: " + tempF + "°" );
	
	}

}
