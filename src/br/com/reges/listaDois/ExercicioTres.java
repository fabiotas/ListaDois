package br.com.reges.listaDois;


public class ExercicioTres extends exercicioUm{

	public static void main(String[] args) {

		int a, b;

		ExercicioTres exer = new ExercicioTres();
		
		a = exer.receberNumeros();
		b = exer.receberNumeros();
		
		if(a%b==0){
			System.out.println("Os numeros s�o divisiveis.");
		}else{
			System.out.println("Os numeros n�o s�o divisiveis.");
		}

	}

}
