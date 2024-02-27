package Incode;

import java.util.Scanner;

public class reajusteSalarial {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o saldo: ");
		double saldo = entrada.nextDouble();
		
		double reajuste = saldo*0.01;
		
		double saldoR = (saldo+reajuste);
		
		System.out.println("O saldo com reajuste de 1% é " + saldoR);
		entrada.close();
	}
}
