package exercicios0803;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double velocidade, tempo, gasolina, distancia;
		
		System.out.print("Qual foi sua velocidade média em km/h? ");
		velocidade = entrada.nextDouble();
		
		System.out.print("Quantas horas durou? ");
		tempo = entrada.nextDouble();
		
		distancia = (velocidade * tempo);
		gasolina =  distancia  / 10.5;
		
		System.out.println("------------------------------------------");
		
		System.out.printf("Você gastou %.2f litros de gasolina para percorrer %.1fkm", gasolina, distancia);
		
	}

}
