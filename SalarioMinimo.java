package Incode;

import java.util.Scanner;

public class SalarioMinimo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double sm = 788.00;
		System.out.print("Digite quando você salarialmente: ");
		double smu = entrada.nextDouble();
		double qsm = (smu/sm);
		System.out.printf("Você recebe %.1f salarios minimos", qsm);
		entrada.close();
	}
}
