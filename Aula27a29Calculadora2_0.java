package aulasOnline;

import java.util.Scanner;

public class Aula27a29Calculadora2_0 {
	public static void main(String args[]) {
		
//		int x=0;
//		
//		do {
//			System.out.println(x);
//			x++;
//		}while(x<=10);

		
		//Calculadora 2.0
		
		int opcao = 0;
		double num1,num2,resultado;
		
		Scanner usuarioDigita = new Scanner(System.in); 
			
		do { 
			
			System.out.println("Digite uma opção");
			System.out.println("1-Somar");
			System.out.println("2-Substrair o num1 por num2");
			System.out.println("3-Multiplicar");
			System.out.println("4-Dividir o num1 por num2");
			System.out.println("0-Sair");
			System.out.println("Digite uma opção:");
			opcao = usuarioDigita.nextInt();
			
			if(opcao==0) {
				System.out.println("Obrigado por usar nosso programa!");
				break;
			}
			
			System.out.println("Digite o num1: ");
			num1=usuarioDigita.nextDouble();
			
			System.out.println("Digite o num2:");
			num2=usuarioDigita.nextDouble();
			
			if (opcao==1) {
				resultado=num1+num2;
				System.out.println("O resultado é: "+resultado);
			}
			
			if(opcao==2) {
				resultado=num1-num2;
				System.out.println("O resultado é: "+resultado);
			}
			
			if(opcao==3) {
				resultado=num1*num2;
				System.out.println("O resultado é: "+resultado);
				
			}
			if(opcao==4) {
				resultado=num1/num2;
				System.out.println("O resultado é: "+resultado);	
			}			
			}while(opcao !=0);
		
		}	
}

