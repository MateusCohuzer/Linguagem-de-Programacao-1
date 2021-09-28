package Main;

/**
 *
 * @author Mateus CohuzEr
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Entrada
        Entrada entrada = new Entrada();
        String frase = entrada.lerString("Insira uma frase");
        String frase_limpa;
        int diferenca;
        
        //Processamento
        Processamento processamento = new Processamento();
        frase_limpa = processamento.limparEspacos(frase);
        diferenca = processamento.calculaSubtracaoInt(frase.length(), frase_limpa.length());

        //Saida
        Saida saida = new Saida();
        saida.imprimirNumeroInteiro("Quantia de espacos vazios na frase", diferenca);

    }
}
