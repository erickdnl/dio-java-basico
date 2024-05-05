package program;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Por favor, digite seu nome! ");
		String nome = sc.nextLine();
		
		System.out.print("Por favor, digite um valor inicial! ");
		double saldo = sc.nextDouble();
		
		System.out.print("Por favor, digite o número da Agência! ");
		int numero = sc.nextInt();
		String agencia = "067-8";
		
		System.out.println("Olá " + nome 
							+ " ,obrigado por criar uma conta em nosso banco, sua agência é " + agencia 
							+ " ,conta " + numero 
							+ " e seu saldo R$" + saldo + " já está disponível para saque.");
		
		sc.close();
	}

}
