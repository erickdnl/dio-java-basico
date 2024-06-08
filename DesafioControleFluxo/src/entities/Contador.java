package entities;

import java.util.Scanner;

import exception.ParametroInvalidoException;

public class Contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = sc.nextInt();
		System.out.print("Digite o  segundo parâmetro: ");
		int parametroDois = sc.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		}
		catch (ParametroInvalidoException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		
		sc.close();
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException{
		if(parametroUm > parametroDois) {
			throw new ParametroInvalidoException();
		}
		int contagem = parametroDois - parametroUm;
		
		for(int i=1; i<=contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	
	}
	
}
