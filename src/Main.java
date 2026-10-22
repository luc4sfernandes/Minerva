import java.util.Scanner;
import pacotes.*;

public class Main {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		Tabuleiro t1 = new Tabuleiro();

		System.out.println("// Tabuleiro //");
		t1.imprimir(t1.tabuleiro);

		String notacaoPeca = entrada.nextLine();
		t1.posicaoPeca(t1.tabuleiro, notacaoPeca.charAt(0), Character.getNumericValue(notacaoPeca.charAt(1)));
	}
}
