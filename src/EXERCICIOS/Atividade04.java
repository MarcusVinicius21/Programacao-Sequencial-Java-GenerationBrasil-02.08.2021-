package EXERCICIOS;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		
		double a, b, c, r, d, s;
		
	Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
			a = entrada.nextInt();
			
		System.out.println("Digite o valor de B: ");
			b = entrada.nextInt();
			
		System.out.println("Digite o valor de C: ");
			c = entrada.nextInt();	
			
			r = Math.pow(a+b, 2.0);
			s = Math.pow(b+c, 2.0);
			d = ((r + s)/2.0);
			
			System.out.println("O valor de R �: " + r + "\nO valor de S �: " + s + "\nO valor de D �: " + d);
		
		entrada.close();
	}

}
