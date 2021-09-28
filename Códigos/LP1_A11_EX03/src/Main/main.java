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
        int numero_cnh;
        int quantidade_multas = entrada.lerInteiro("Quantidade de multas");
        double valor_multa;
        double somatorio_multas = 0;
        int ze_multinha = 0;
        double maior_multa = 0;

        //Processamento
        Processamento processamento = new Processamento();

        for (int i = 0; i < quantidade_multas; i++) {
            numero_cnh = entrada.lerInteiro("Insira o número da sua CNH (Negativos para cancelar)");
            if (numero_cnh < 0) {
                break;
            }
            valor_multa = entrada.lerDouble("Valor da multa");
            somatorio_multas = processamento.calculaSoma(somatorio_multas, valor_multa);
            if (maior_multa < valor_multa) {
                ze_multinha = numero_cnh;
                maior_multa = valor_multa;
            }
        }

        //Saida
        Saida saida = new Saida();
        saida.imprimirNumeroInteiro("O zé multinha foi ", ze_multinha);
        saida.imprimirNumeroDouble("A maior multa foi R$", maior_multa);

    }
}
