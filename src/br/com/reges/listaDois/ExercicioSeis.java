package br.com.reges.listaDois;

import java.util.Scanner;

public class ExercicioSeis extends exercicioUm {
	
	public static void main(String[] args) {
		
		
		Scanner tecla = new Scanner(System.in);
		
		System.out.println("Insira sua senha: ");
		String senha = tecla.nextLine();
		
		
		if(senha.equals("batatafrita")){
			System.out.println("Acesso Liberado.");
		}else{
			System.out.println("Acesso Negado.");
		}
		
	}
	
}
