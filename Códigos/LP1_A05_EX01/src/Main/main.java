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
        double salario_fixo = entrada.lerDouble("Insira o Salário fixo: ");
        double vendas = entrada.lerDouble("Total em vendas no mês: ");
        
        //Processamento
        Processamento processamento = new Processamento();
        double fixo_porcentagem = processamento.calculaMultiplicacao(salario_fixo, 0.06);
        double vendas_porcentagem = processamento.calculaMultiplicacao(vendas, 0.05);
        double fixo_final = processamento.calculaSoma(fixo_porcentagem, salario_fixo);
        double rs_final = processamento.calculaSoma(fixo_final, vendas_porcentagem);

        //Saida
        Saida saida = new Saida();
        saida.imprimirNumeroDouble("O salário final do vendedor será", rs_final);

    }
}
