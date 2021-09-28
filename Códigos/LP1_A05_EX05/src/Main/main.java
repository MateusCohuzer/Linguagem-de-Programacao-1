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
        double valor_cofreUS = entrada.lerDouble("Valor em Dolares no cofre: ");
        double cotacao_dolar = entrada.lerDouble("Cotação do Dólar hoje: ");
        double valor_cofreEU = entrada.lerDouble("Valor em Euros no cofre: ");
        double cotacao_euro = entrada.lerDouble("Cotação do Euro hoje: ");

        //Processamento
        Processamento processamento = new Processamento();
        double valor_finalUS = processamento.calculaMultiplicacao(valor_cofreUS, cotacao_dolar);
        double valor_finalEU = processamento.calculaMultiplicacao(valor_cofreEU, cotacao_euro);
        double valor_finalRS = processamento.calculaSoma(valor_finalUS, valor_finalEU);

        //Saida
        Saida saida = new Saida();
        saida.imprimirNumeroDouble("O valor dos dolares em reais no cofre é", valor_finalUS);
        saida.imprimirNumeroDouble("O valor dos euros em reais no cofre é", valor_finalEU);
        saida.imprimirNumeroDouble("O valor total em reais no cofre é", valor_finalRS);
    }
}
