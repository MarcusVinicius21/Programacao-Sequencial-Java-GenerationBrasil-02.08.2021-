package EXERCICIOS;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double no1, no2, no3;
		double pe1, pe2, pe3;
		double medponderada;
		
		System.out.println("Digite a nota 01: ");
		no1 = entrada.nextInt();
		
		System.out.println("Digite o peso 01: ");
		pe1 = entrada.nextInt();
		
		System.out.println("Digite a nota 02: ");
		no2 = entrada.nextInt();
		
		System.out.println("Digite o peso 02: ");
		pe2 = entrada.nextInt();
		
		System.out.println("Digite a nota 03: ");
		no3 = entrada.nextInt();
		
		System.out.println("Digite o peso 03: ");
		pe3 = entrada.nextInt();
		
		medponderada = ((no1*pe1) +(no2*pe2)) / (pe1 + pe2 + pe3);
		
		System.out.println("A média ponderada é: " + Math.ceil(medponderada));
		
		entrada.close();

	}

}
