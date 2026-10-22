package pacotes;

public class Tabuleiro extends Pecas {
	
    public int[][] tabuleiro = new int[][] {
        {TORRE_PRETO, CAVALO_PRETO, BISPO_PRETO, RAINHA_PRETO, REI_PRETO, BISPO_PRETO, CAVALO_PRETO, TORRE_PRETO},
        {PEAO_PRETO,  PEAO_PRETO,   PEAO_PRETO,  PEAO_PRETO,   PEAO_PRETO,  PEAO_PRETO,  PEAO_PRETO,   PEAO_PRETO},
        {VAZIO, VAZIO,  VAZIO, VAZIO,  VAZIO, VAZIO, VAZIO,  VAZIO},
        {VAZIO, VAZIO,  VAZIO, VAZIO,  VAZIO, VAZIO, VAZIO,  VAZIO},
        {VAZIO, VAZIO,  VAZIO, VAZIO,  VAZIO, VAZIO, VAZIO,  VAZIO},
        {VAZIO, VAZIO,  VAZIO, VAZIO,  VAZIO, VAZIO, VAZIO,  VAZIO},
        {PEAO_BRANCO,  PEAO_BRANCO,   PEAO_BRANCO,  PEAO_BRANCO,   PEAO_BRANCO,  PEAO_BRANCO,  PEAO_BRANCO,   PEAO_BRANCO},
        {TORRE_BRANCO, CAVALO_BRANCO, BISPO_BRANCO, RAINHA_BRANCO, REI_BRANCO,   BISPO_BRANCO, CAVALO_BRANCO, TORRE_BRANCO}
    };

    public void imprimir(int arrayTabuleiro[][]) {

		// Cada posição do array bate com valor da peça, ex: letras[0] = 'p' --> PEAO = 0
        char[] letras = {'p', 'n', 'b', 'r', 'q', 'k', 'P', 'N', 'B', 'R', 'Q', 'K', '.'}; 

        for (int i = 0; i < 8; i++) {
        	for(int j = 0; j < 8; j++){
        		System.out.printf("%c ", letras[arrayTabuleiro[i][j]]);
        	}
        	System.out.println();
        }
     }

    // Notação do xadrez, Ex: a1, b2 etc...
    // public void casaTabuleiro(int arrayPecas[], char letra, int numero) {}
}
