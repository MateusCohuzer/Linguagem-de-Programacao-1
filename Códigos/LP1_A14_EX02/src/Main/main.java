package Main;

import java.util.Date;
import tools.ConverteDatas;

/**
 *
 * @author Mateus CohuzEr
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //ConverteDatas converteDatas = new ConverteDatas();

        Entrada entrada = new Entrada();
        Processamento processamento = new Processamento();
        Saida saida = new Saida();

        int maxLinhas = 2;
        int maxColunas = 3;
        saida.separador("-");
        int[][] matriz = entrada.lerMatrizDeNumerosInteiros("Digite os valores para a matriz", "valor", maxLinhas, maxColunas);
        saida.separador("=");
        int somaDasLinhas[] = processamento.somaDosValoresDeCadaLinhaDaMatriz(matriz);
        int somaDasColunas[] = processamento.somaDosValoresDeCadaColunaDaMatriz(matriz);

        saida.imprimirMatriz("Matriz armazenada na memória do computador", matriz);
        saida.separador("*");
        saida.imprimirVetorDeInteiros("Soma das linhas da matriz", somaDasLinhas);
        saida.separador("-x");
        saida.imprimirVetorDeInteiros("Soma das colunas da matriz", somaDasColunas);
    }
}
