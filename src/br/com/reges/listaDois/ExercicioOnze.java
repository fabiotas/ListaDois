package br.com.reges.listaDois;

import java.util.*;

public class ExercicioOnze {
	
	public static void main(String[] args) {
	
		Scanner tecla = new Scanner(System.in);
				
		System.out.println("Informe o nome do produto: ");	
		String nomeprod = tecla.nextLine();
		System.out.println("Informe o valor: ");
		double result, valor = tecla.nextFloat();
		
		
		if(valor < 20){
			result = valor * 0.45;
			result = valor + result;
			System.out.println("O produto: "+nomeprod+" valor de compra: R$"+valor+" e o valor final é: R$"+result);
		}else{
			result = valor * 0.20;
			result = valor + result;
			System.out.println("O produto: "+nomeprod+" valor de compra: R$"+valor+" e o valor final é: R$"+result);
		}
	}

}
