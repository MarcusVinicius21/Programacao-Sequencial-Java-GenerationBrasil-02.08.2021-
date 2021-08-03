package EXERCICIOS;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		
		int tempo, hora, minuto, segundo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Tempo de duração do evento em uma fábrica (segundos): ");
			tempo = entrada.nextInt();
			
			hora = (tempo / 3600);
			minuto = (tempo - (hora * 3600)) / 60;
			segundo = (tempo - (hora * 3600)) % 60;
			
			
		System.out.println(hora + " horas\n" + minuto + " minutos\n" + segundo + " segundos");	
			

	}

}
