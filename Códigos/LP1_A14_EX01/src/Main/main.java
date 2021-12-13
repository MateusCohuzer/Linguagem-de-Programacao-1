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

        ConverteDatas converteDatas = new ConverteDatas();

        Entrada entrada = new Entrada();
        Processamento processamento = new Processamento();
        Saida saida = new Saida();
        int max = 10;
        int[] vetor = entrada.lerVetorDeNumerosInteiros("valor", max);
        int pares[] = processamento.vetorComNumerosPares(vetor);
        int impares[] = processamento.vetorComNumerosImpares(vetor);
        saida.imprimirVetorDeInteiros("Todos os valores lidos", vetor);
        saida.imprimirVetorDeInteiros("Somente os pares", pares);
        saida.imprimirVetorDeInteiros("Somente os ímpares", impares);
    }

}
