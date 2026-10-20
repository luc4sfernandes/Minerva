package pacotes;

public class Tabuleiro extends Pecas {
	public int[] pecas = new int[] {
	    TORRE, CAVALO, BISPO, RAINHA, REI,   BISPO, CAVALO, TORRE,
	    PEAO,  PEAO,   PEAO,  PEAO,   PEAO,  PEAO,  PEAO,   PEAO,
	    VAZIO, VAZIO,  VAZIO, VAZIO,  VAZIO, VAZIO, VAZIO,  VAZIO,
	    VAZIO, VAZIO,  VAZIO, VAZIO,  VAZIO, VAZIO, VAZIO,  VAZIO,
	    VAZIO, VAZIO,  VAZIO, VAZIO,  VAZIO, VAZIO, VAZIO,  VAZIO,
	    VAZIO, VAZIO,  VAZIO, VAZIO,  VAZIO, VAZIO, VAZIO,  VAZIO,
	    PEAO,  PEAO,   PEAO,  PEAO,   PEAO,  PEAO,  PEAO,   PEAO,
	    TORRE, CAVALO, BISPO, RAINHA, REI,   BISPO, CAVALO, TORRE
	};
	
	public int[] cor = new int[] {
	    PRETO, PRETO, PRETO, PRETO, PRETO, PRETO, PRETO, PRETO,
	    PRETO, PRETO, PRETO, PRETO, PRETO, PRETO, PRETO, PRETO,
	    VAZIO, VAZIO, VAZIO, VAZIO, VAZIO, VAZIO, VAZIO, VAZIO,
	    VAZIO, VAZIO, VAZIO, VAZIO, VAZIO, VAZIO, VAZIO, VAZIO,
	    VAZIO, VAZIO, VAZIO, VAZIO, VAZIO, VAZIO, VAZIO, VAZIO,
	    VAZIO, VAZIO, VAZIO, VAZIO, VAZIO, VAZIO, VAZIO, VAZIO,
	    BRANCO, BRANCO, BRANCO, BRANCO, BRANCO, BRANCO, BRANCO, BRANCO,
	    BRANCO, BRANCO, BRANCO, BRANCO, BRANCO, BRANCO, BRANCO, BRANCO
	};

	public void imprimir(int arrayPecas[], int arrayCor[]){
		char[] letras = {'p', 'n', 'b', 'r', 'q', 'k', '.'}; // Cada posição do array bate com valor da peça, ex: letras[0] = 'p' --> PEAO = 0

		for(int j = 0, i = 0; i < 64; i++, j++){
		
			if(j == 8){
				System.out.println();
				j = 0;
			}

			if(arrayCor[i] == 0){
				char temp = Character.toUpperCase(letras[arrayPecas[i]]);
				System.out.printf("%c ", temp);	
			}	

			if(arrayCor[i] == 1){
				System.out.printf("%c ", letras[arrayPecas[i]]);	
			}

			if(arrayCor[i] == 6 && arrayPecas[i] == 6){
				System.out.printf("%c ", letras[arrayPecas[i]]);
			}	
			
		}
		System.out.println();
	}
}

