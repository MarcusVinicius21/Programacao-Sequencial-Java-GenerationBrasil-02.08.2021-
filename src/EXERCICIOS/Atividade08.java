package EXERCICIOS;

import java.util.Scanner;

public class Atividade08 {

	public static void main(String[] args) {
		
		double custoconsum, custofabric;
		double porcdistribuidor, porimposto;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o custo de fabrica: ");
			custofabric = entrada.nextInt();
	
			porcdistribuidor = (custofabric *28)/100;
			porimposto = (custofabric*45)/100;
			custoconsum = custofabric + porimposto + porcdistribuidor;
	
		System.out.println("O custo do carro ao consumidor é: " + custoconsum);

			entrada.close();
	
	
	}

}
