package ExFixacao;

import java.util.Locale;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Program {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Account account;
		System.out.print("Enter accont number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder:  ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.nextLine().charAt(0);
		if(response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: " );
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.print("Updated account data: " );
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: " );
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		
		System.out.print("Updated account data: " );
		System.out.println(account);
		
		
		sc.close();
		
	}

}
