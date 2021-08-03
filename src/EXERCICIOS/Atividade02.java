package EXERCICIOS;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		
		int ano, meses, dia, dias;
		
		Scanner entrada = new Scanner(System.in);
		
			System.out.println("Digite a idade em dias: ");
		dias = entrada.nextInt();
		
		
		ano = dias / 365;
		meses = (dias % 365) / 30;
		dia = dias % 365 % 30;
		
			System.out.println("A idade em dias, meses e anos é: " + "\nDias: " + dia + "\nMeses: " + meses + "\nAnos: " + ano);
	
		entrada.close();

	}

}
