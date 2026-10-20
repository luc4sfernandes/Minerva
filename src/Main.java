import pacotes.*;

public class Main {
	public static void main(String[] args){
		Tabuleiro tabuleiro = new Tabuleiro();

		System.out.println("// Represetação das Peças //");
		tabuleiro.imprimir(tabuleiro.pecas);

		System.out.println("\n// Represetação das Cores //");
		tabuleiro.imprimir(tabuleiro.cor);
	}
}
