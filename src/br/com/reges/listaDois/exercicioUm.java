package br.com.reges.listaDois;

import java.util.*;

public class exercicioUm {
	
	
	public int receberNumeros(){
		Scanner tecla = new Scanner(System.in);
		int a;
		System.out.println("Insira o primeiro numero: ");
		a = tecla.nextInt();
		return a;
	}
	
	public int Output(String teste){
		
		Scanner tecla = new Scanner(System.in);
		
		System.out.println(teste);
		 int valor = tecla.nextInt();
		 return valor;
	}
	
	public static void main(String[] args) {
	
		int a,b;

		exercicioUm exer = new exercicioUm();
		
		a = exer.receberNumeros();
		b = exer.receberNumeros();
		
		if(a == b){
			System.out.println("Numeros iguais.");
		}else{
			System.out.println("Os numeros são diferentes");
		}
		
		
		
	}

}
