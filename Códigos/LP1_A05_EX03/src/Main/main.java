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
        double valor_original = entrada.lerDouble("Valor do produto: ");
        double porcentagem = entrada.lerDouble("Porcentagem do desconto (em 100%): ");

        //Processamento
        Processamento processamento = new Processamento();
        double porcentagem_pronta = processamento.transformaPorcentagem(porcentagem);
        double desconto = processamento.calculaMultiplicacao(valor_original, porcentagem_pronta);
        double valor_final = processamento.calculaSubtracao(valor_original, desconto);

        //Saida
        Saida saida = new Saida();
        saida.imprimirNumeroDouble("O produto saira por R$", valor_final);
        saida.imprimirNumeroDouble("O produto tera desconto de R$", desconto);

    }
}
