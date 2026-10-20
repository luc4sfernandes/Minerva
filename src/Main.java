import pacotes.*;

public class Main {
	public static void main(String[] args){
		Tabuleiro tabuleiro = new Tabuleiro();

		System.out.println("// Tabuleiro //");
		tabuleiro.imprimir(tabuleiro.pecas, tabuleiro.cor);

	}
}
