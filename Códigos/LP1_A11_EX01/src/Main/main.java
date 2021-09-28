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
        int N = entrada.lerInteiro("Quantidade de idades a serem analisadas: ");
        int[] idades = entrada.lerVetorInteiro("Insira a idade: ", N);
        int soma;
        double media;
        double percentual_17;
        double percentual_35;
        double percentual_50;
        double percentual_65;
        double percentual_idosos;
        int contador_17 = 0;
        int contador_35 = 0;
        int contador_50 = 0;
        int contador_65 = 0;
        int contador_idosos = 0;
        
        //Processamento
        Processamento processamento = new Processamento();
        soma = processamento.somatoriaVetorInt(idades);
        media = processamento.calculaDivisao(soma, idades.length);
        
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] >= 0 && idades[i] <= 17) {
                contador_17 = processamento.calculaSomaInt(contador_17, 1);
            } else if (idades[i] <= 35) {
                contador_35 = processamento.calculaSomaInt(contador_35, 1);
            } else if (idades[i] <= 50) {
                contador_50 = processamento.calculaSomaInt(contador_50, 1);
            } else if (idades[i] <= 65) {
                contador_65 = processamento.calculaSomaInt(contador_65, 1);
            } else if (idades[i] > 65) {
                contador_idosos = processamento.calculaSomaInt(contador_idosos, 1);
            }
        }

        percentual_17 = processamento.calculaDivisao(contador_17*100, idades.length);
        percentual_35 = processamento.calculaDivisao(contador_35*100, idades.length);
        percentual_50 = processamento.calculaDivisao(contador_50*100, idades.length);
        percentual_65 = processamento.calculaDivisao(contador_65*100, idades.length);
        percentual_idosos = processamento.calculaDivisao(contador_idosos*100, idades.length);
        
        //Saida
        Saida saida = new Saida();
        saida.imprimirNumeroInteiro("a)", soma);
        saida.imprimirNumeroDouble("b)", media);
        saida.imprimirNumeroDouble("c) 17", percentual_17);
        saida.imprimirNumeroDouble("c) 35", percentual_35);
        saida.imprimirNumeroDouble("c) 50", percentual_50);
        saida.imprimirNumeroDouble("c) 65", percentual_65);
        saida.imprimirNumeroDouble("c) Idosos", percentual_idosos);
    }
}
