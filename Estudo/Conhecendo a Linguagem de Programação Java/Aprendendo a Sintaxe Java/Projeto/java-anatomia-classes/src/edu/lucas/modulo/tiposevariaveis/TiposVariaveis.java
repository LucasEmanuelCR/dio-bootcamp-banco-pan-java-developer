package edu.lucas.modulo.tiposevariaveis;

public class TiposVariaveis {
	public static void main(String[] args) {
		
		short numeroUm = 1;
		int numeroUmInt = numeroUm;
		numeroUm = (short) numeroUmInt;
		
		byte numeroPequeno = 1;
		
		System.out.println("Valor da variável: " + numeroPequeno);
		
		numeroPequeno = 2;
		
		System.out.println("Valor da variável: ".concat("" + numeroPequeno));
		
		final int NUMERO_CONSTANTE = 1;
		System.out.println("Valor da constante: ".concat("" + NUMERO_CONSTANTE));
		
//		NUMERO_CONSTANTE = 1;
		
		
		
		
		
	}

}
