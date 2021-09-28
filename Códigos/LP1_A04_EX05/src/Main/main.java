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
        double azulejo = 1.5;
        double comprimento = entrada.lerDouble("Insira o comprimento: ");
        double largura = entrada.lerDouble("Insira a largura: ");
        double altura = entrada.lerDouble("Insira a altura: ");
        azulejo = entrada.lerDouble("Insira o tamanho de cada caixa de azulejos: ");
        
        //Processamento
        Processamento processamento = new Processamento();
        double tamanho = processamento.calculaTamanho(altura, comprimento, largura);
        double caixas = processamento.divisao(tamanho, azulejo);

        //Saida
        Saida saida = new Saida();
        saida.imprimirNumeroDouble("Serão necessarias", caixas);

    }
}
