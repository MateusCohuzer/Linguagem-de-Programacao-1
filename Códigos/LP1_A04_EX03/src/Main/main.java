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
        double odometro = entrada.lerDouble("Odometro no inicio do dia: ");
        double fimKm = entrada.lerDouble("Odometro no fim do dia: ");
        double preco_litro = 3.90;
        double Rrecebido = entrada.lerDouble("Lucro Bruto no fim do dia: ");
        double Lgastos = entrada.lerDouble("Litros gastos no fim do dia: ");

        //Processamento
        Processamento processamento = new Processamento();
        double gastoLitro = processamento.calcularGasto(Lgastos, preco_litro);
        double KM_por_Litro = processamento.calcularKmL((fimKm - odometro), Lgastos);
        double lucro_liquido = processamento.calcularLucroLiquido(Rrecebido, gastoLitro);

        //Saida
        Saida saida = new Saida();
        saida.imprimirNumeroDouble("A média de Km/L é ", KM_por_Litro);
        saida.imprimirNumeroDouble("O lucro liquido é ", lucro_liquido);

    }
}
