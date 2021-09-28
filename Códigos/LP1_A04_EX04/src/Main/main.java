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
        double raio = entrada.lerDouble("Digite o raio do circulo: ");

        //Processamento
        Processamento processamento = new Processamento();
        double area = processamento.calcularAreaCirculo(raio);

        //Saida
        Saida saida = new Saida();
        saida.imprimirNumeroDouble("A área do circulo é de ", area);

    }
}
