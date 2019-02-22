package aulasOnline;

public class Aula10a16TomadaDeDecisao {

	public static void main (String[] args) {
		
	// Aqui a variavel exemplo perguntamos, 1 � diferente de 1?
	boolean exemplo = 1!=1; // � falso
	System.out.println(exemplo);
	
	boolean exemplo2= 1==1; // sim � verdadeiro
	System.out.println(exemplo2);
	
	
	//aqui comparamos uma vari�vel falsa, e uma verdadeira para perguntar se elas s�o iguais., � falso.
	boolean exemplo3 = exemplo==exemplo2; // � falso
	System.out.println(exemplo3);
	
	
	//Quando usamos uma constante precisamos atender a alguns detalhes
	// uma constante s� existe no bloco que � inicializada, e o valor dela � imut�vel
	// tamb�m tem o endere�o na mem�ria protegido
	
	// para declarar uma constante basta dizer no in�cio que ela tem o tipo final
	
	final int constante = 33;
	
	// e se voc� disse que ela � final, ent�o voc� n�o pode atribuir outro valor a ela
	
	// exemplo que d� erro: 
	// int constante = 333;
	
	}
}
