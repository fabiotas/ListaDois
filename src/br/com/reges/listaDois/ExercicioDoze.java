package br.com.reges.listaDois;

import java.util.*;

public class ExercicioDoze {
		
	public double CalculaSalario(double salario){
		
		if(salario <= 600){
			salario = salario + (salario * 0.30);
		}else if(salario >= 600.01 && salario < 1100){
			salario = salario +(salario * 0.25);
		}else if(salario >= 1100.01 && salario < 2400.0){
			salario = salario +(salario * 0.20);
		}else if(salario >= 2400.01 && salario < 3550.0){
			salario = salario +(salario * 0.15);
		}else if(salario >= 3550.0){
			salario = salario +(salario * 0.10);
		}
		
		return salario;
	}
	
	public static void main(String[] args) {

		Scanner tecla = new Scanner(System.in);
		ExercicioDoze exer = new ExercicioDoze();
		
		System.out.println("Insira o valor do Salario: ");
		double salario = tecla.nextDouble();
		
		double result = exer.CalculaSalario(salario);
		
		System.out.println("Valor do salario final: R$"+result);
		
	}

}
