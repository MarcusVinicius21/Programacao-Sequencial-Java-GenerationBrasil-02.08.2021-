package EXERCICIOS;

import java.util.Scanner;

public class Atividade06 {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, p1, p2, d;
		
	Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de X do primeiro ponto: ");
			x1 = entrada.nextInt();
			
		System.out.println("Digite o valor de Y do primeiro ponto: ");
			y1 = entrada.nextInt();
			
		System.out.println("Digite o valor de X do segundo ponto: ");
			x2 = entrada.nextInt();	
			
		System.out.println("Digite o valor de Y do segundo ponto: ");
			y2 = entrada.nextInt();	
			
			p1 = Math.pow((x2-x1), 2.0);
			p2 = Math.pow((y2-y1), 2.0);
			d = Math.sqrt(p1 + p2);
			
			System.out.println("A distância entre os pontos é: " + Math.ceil(d));
		
		entrada.close();
	}

}
