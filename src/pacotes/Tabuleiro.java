package pacotes;

public class Tabuleiro extends Pecas {
	
    public int[][] tabuleiro = new int[][] {
    	{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
    	{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}, // 1
        {-1, -1, TORRE_PRETO, CAVALO_PRETO, BISPO_PRETO, RAINHA_PRETO, REI_PRETO, BISPO_PRETO, CAVALO_PRETO, TORRE_PRETO, -1, -1},
        {-1, -1, PEAO_PRETO,  PEAO_PRETO,   PEAO_PRETO,  PEAO_PRETO, PEAO_PRETO,  PEAO_PRETO,  PEAO_PRETO,   PEAO_PRETO, -1, -1},
        {-1, -1, VAZIO, VAZIO,  VAZIO, VAZIO,  VAZIO, VAZIO, VAZIO,  VAZIO, -1, -1},
        {-1, -1, VAZIO, VAZIO,  VAZIO, VAZIO,  VAZIO, VAZIO, VAZIO,  VAZIO, -1, -1},
        {-1, -1, VAZIO, VAZIO,  VAZIO, VAZIO,  VAZIO, VAZIO, VAZIO,  VAZIO, -1, -1},
        {-1, -1, VAZIO, VAZIO,  VAZIO, VAZIO,  VAZIO, VAZIO, VAZIO,  VAZIO, -1, -1},
        {-1, -1, PEAO_BRANCO, PEAO_BRANCO, PEAO_BRANCO, PEAO_BRANCO, PEAO_BRANCO,  PEAO_BRANCO,  PEAO_BRANCO,   PEAO_BRANCO, -1, -1},
        {-1, -1, TORRE_BRANCO, CAVALO_BRANCO, BISPO_BRANCO, RAINHA_BRANCO, REI_BRANCO, BISPO_BRANCO, CAVALO_BRANCO, TORRE_BRANCO, -1, -1},
        {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
        {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}
    };

    public void imprimir(int arrayTabuleiro[][]) {

		// Cada posição do array bate com valor da peça, ex: letras[0] = 'p' --> PEAO = 0
        char[] letras = {'p', 'n', 'b', 'r', 'q', 'k', 'P', 'N', 'B', 'R', 'Q', 'K', '.'}; 

        for (int i = 2; i < 10; i++) {
        	for(int j = 2; j < 10; j++){
        		System.out.printf("%c ", letras[arrayTabuleiro[i][j]]);
        		// System.out.printf("%d ", arrayTabuleiro[i][j]);
        	}
        	System.out.println();
        }
     }

    // Notação do xadrez, Ex: a1, b2 etc...
    public void posicaoPeca(int arrayTabuleiro[][], char fileira, int coluna) {
    	char[] letras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    	int fileiraNumero = 0;

    	for(int i = 0; i < 8; i++){
    		if(fileira == letras[i]){
    			fileiraNumero = i;
    			break;
    		}
    	}

		// System.out.printf("Fileira: %d\nColuna: %d\n\n", fileiraNumero, coluna);

    	for(int i = 0; i < 8; i++){
    		for(int j = 0; j < 8; j++){
    			if(j == fileiraNumero && i == 7 - (coluna - 1)){
    				System.out.printf("Peça achada: %d\n", arrayTabuleiro[i + 2][j + 2]); // Pecorre o tabueleiro 8x8 apos achar os indices eu somo +2 para ajustar para o 10x12
					System.out.printf("local: [%d][%d]\n", i + 2, j + 2);
    				break;
    			}
    		}
    	}
    }
}
