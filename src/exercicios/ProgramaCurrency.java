package exercicios;

import java.util.Scanner;

public class ProgramaCurrency {
	public static void main (String [] arg) {
		System.out.println("Enter with your amount");
		Scanner teclado = new Scanner(System.in);
		double valor = teclado.nextDouble();
		
		double r = CurrencyConverter.dolarReal;
		double v = CurrencyConverter.Conversao(valor);
		
		System.out.println("What is the dollar price? " + r);
		System.out.println("How many dollars will be bought? " + valor);
		System.out.println("Amount to be paid in reais: " + v);
		
		teclado.close();
	}

}
