package Incode;

import java.util.Scanner;

public class DiasDeVida {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o seu ano de nascimeto: ");
		int nas = entrada.nextInt();
		
		int idade = (2023 - nas);
		int diasA = (idade * 365);
		
		System.out.print("Digite o seu mês de nascimento: ");
		int MesdeNas = entrada.nextInt();
		System.out.print("E digite o mês que estamos: ");
		int MesAtual = entrada.nextInt();
			
		int mesi = (12 - MesdeNas) + MesAtual;
		int dmes = (mesi * 30);
		
		System.out.print("Digite o seu dia de nascimento: ");
		int nasc = entrada.nextInt();
		
		int diasv = ((30 - nasc)- 5);
		int diasi = (30 - diasv);
		
		System.out.println("Você tem "+(diasi +  dmes +  diasA)+ " dias de vida.");
		
		entrada.close();
		
	}

}
