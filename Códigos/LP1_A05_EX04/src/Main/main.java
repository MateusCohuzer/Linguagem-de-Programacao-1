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
        double valor_cofre = entrada.lerDouble("Valor no cofre: ");
        double cotacao_dolar = entrada.lerDouble("Cotação do Dólar hoje: ");

        //Processamento
        Processamento processamento = new Processamento();
        double valor_final = processamento.calculaMultiplicacao(valor_cofre, cotacao_dolar);

        //Saida
        Saida saida = new Saida();
        saida.imprimirNumeroDouble("O valor em reais no cofre é", valor_final);

    }
}
