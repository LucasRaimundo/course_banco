package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Account account = new Account();

		System.out.print("Enter account number: ");
		account.setNumber(ler.nextInt());
		System.out.println("Enter account holder: ");
		account.setHolder(ler.next());
		
		System.out.print("Is there initial deposit value? (y/n) ");
		char op = ler.next().charAt(0);
		
		if (op == 'y') {
			System.out.print("Enter initial deposit value: ");
			account.setDeposit(ler.nextDouble());
		} 
		
		System.out.println("Account data:");
		System.out.println("Account " + account.getNumber() + ", " + "Holder: " + account.getHolder() + ", " + "Balance: " + account.getDeposit());
		System.out.println();
		
		System.out.print("Enter a deposite value: ");
		double sac = ler.nextDouble();
		account.depositeValue(sac);
		
		System.out.println("Account update:");
		System.out.println("Account " + account.getNumber() + ", " + "Holder: " + account.getHolder() + ", " + "Balance: " + account.getDeposit());
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = ler.nextDouble();
		account.withdrawValue(withdraw);
		
		System.out.println("Account update:");
		System.out.println("Account " + account.getNumber() + ", " + "Holder: " + account.getHolder() + ", " + "Balance: " + account.getDeposit());
		System.out.println();
		
		
		ler.close();
	}

}
