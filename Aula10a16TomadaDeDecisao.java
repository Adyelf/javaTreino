package aulasOnline;

public class Aula10a16TomadaDeDecisao {

	public static void main (String[] args) {
		
	// Aqui a variavel exemplo perguntamos, 1 é diferente de 1?
	boolean exemplo = 1!=1; // é falso
	System.out.println(exemplo);
	
	boolean exemplo2= 1==1; // sim é verdadeiro
	System.out.println(exemplo2);
	
	
	//aqui comparamos uma variável falsa, e uma verdadeira para perguntar se elas são iguais., é falso.
	boolean exemplo3 = exemplo==exemplo2; // é falso
	System.out.println(exemplo3);
	
	
	//Quando usamos uma constante precisamos atender a alguns detalhes
	// uma constante só existe no bloco que é inicializada, e o valor dela é imutável
	// também tem o endereço na memória protegido
	
	// para declarar uma constante basta dizer no início que ela tem o tipo final
	
	final int constante = 33;
	
	// e se você disse que ela é final, então você não pode atribuir outro valor a ela
	
	// exemplo que dá erro: 
	// int constante = 333;
	
	}
}
