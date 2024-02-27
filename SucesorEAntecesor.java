package Incode;

import java.util.Scanner;

public class SucesorEAntecesor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = entrada.nextInt();
		
		int sucessor = num+1;
		int antecessor = num-1;
		
		System.out.println("O sucessor do número informado é: "+ sucessor);
		System.out.println("E o antecessor do número é: "+ antecessor);
		entrada.close();
	}
}
