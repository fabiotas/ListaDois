package br.com.reges.listaDois;


public class exercicioDois extends exercicioUm {
	

	public static void main(String[] args) {
		
		int a;
		
		exercicioDois exer = new exercicioDois();
		
		a = exer.receberNumeros();
		
		if(a%2==0){
			System.out.println("PAR");
		}else{
			System.out.println("IMPAR");
		}
		
		
	}
}
