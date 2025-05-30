package edu.lucas.modulo.anatomiadasclasses;

public class MinhaClasse {
	public static void main(String[] args) {
		
		String primeiroNome = "Lucas Emanuel";
		
		String segundoNome = "de Carvalho Rodrigues";
		
		int idade = 21;
		
		String dadosFormatados = concaternarNomeCompletoIdade(primeiroNome, segundoNome, idade);
		
		System.out.println(dadosFormatados);
		
	}
	
	public static String concaternarNomeCompletoIdade (String primeiroNome, String segundoNome, int idade) {
		return "Nome: ".concat(primeiroNome).concat(" ").concat(segundoNome).concat(" ").concat("\nIdade: " + idade);
	}

}
