package Incode;

import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {
		System.out.println("Codigo de Produtos: Caneta R$2,50(01)|Lapis R$1,00(02)|pincel R$5,00(03)");
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o IPI do produto: ");
		double IPI = entrada.nextDouble();
		
		System.out.println("Insira o codigo do produto 1: ");
		int codigo1 = entrada.nextInt();
		
		System.out.println("O Valor do produto 1:  ");
		double valor1 = entrada.nextDouble();
		
		System.out.println("E a quantidade do produto 1: ");
		double quant1 = entrada.nextDouble();
		
		System.out.println("Insira o codigo do produto 2: ");
		int codigo2 = entrada.nextInt();
		
		System.out.println("O Valor do produto 2:  ");
		double valor2 = entrada.nextDouble();
		
		System.out.println("E a quantidade do produto 2: ");
		double quant2 = entrada.nextDouble();
		
		
		double formula = ((valor1*quant1)+(valor2*quant2))*(IPI/100 + 1);
		
		System.out.println("O valor total dos produtos " + codigo1 + " e "+ codigo2 + " deu ao todo " + formula);
		entrada.close();
	}
}
