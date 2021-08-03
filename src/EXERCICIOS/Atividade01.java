package EXERCICIOS;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		
		int anos, meses, dia, dias, diasconcatenados;
		
		Scanner entrada = new Scanner(System.in);
		
			System.out.println("Digite a idade em anos: ");
		anos = entrada.nextInt();
		
			System.out.println("Digite a idade em meses: ");
		meses = entrada.nextInt();
		
			System.out.println("Digite a idade em dias: ");
		dias = entrada.nextInt();
		
		anos = anos * 365;
		meses = (meses * 30);
		diasconcatenados = anos + meses + dias;
		
			System.out.println("A idade em dias é: " + diasconcatenados);
		
	
		entrada.close();

	}

}
