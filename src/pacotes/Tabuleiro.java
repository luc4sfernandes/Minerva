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

	public void imprimir(int array[]){
		for(int j = 0, i = 0; i < 64; i++, j++){
			if(j == 8){
				System.out.println();
				j = 0;
			}
			System.out.printf("%d ", array[i]);
		}

		System.out.println();
	}
}

