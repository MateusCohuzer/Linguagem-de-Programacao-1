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
        double x1 = entrada.lerDouble("Eixo X do ponto 1: ");
        double x2 = entrada.lerDouble("Eixo X do ponto 2: ");
        double y1 = entrada.lerDouble("Eixo Y do ponto 1: ");
        double y2 = entrada.lerDouble("Eixo Y do ponto 2: ");

        //Processamento
        Processamento processamento = new Processamento();
        double ponto1 = processamento.calculaSubtracao(x2, x1);
        double ponto2 = processamento.calculaSubtracao(y2, y1);
        double ponto1_ao_quadrado = processamento.calculaElevado(ponto1, 2);
        double ponto2_ao_quadrado = processamento.calculaElevado(ponto2, 2);
        double distancia = Math.sqrt(processamento.calculaSoma(ponto1_ao_quadrado, ponto2_ao_quadrado));

        //Saida
        Saida saida = new Saida();
        saida.imprimirNumeroDouble("Distancia", distancia);

    }
}
