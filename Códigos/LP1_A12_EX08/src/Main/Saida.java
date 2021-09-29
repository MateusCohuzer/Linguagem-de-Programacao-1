package Main;

import java.text.DecimalFormat;

/**
 *
 * @author Mateus CohuzEr
 */
class Saida {

    public void imprimirNumeroInteiro(String mensagem, int inteiro) {
        System.out.println(mensagem + ": " + inteiro);
    }

    public void imprimirNumeroDouble(String mensagem, double n_double) {
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        System.out.println(mensagem + ":" + decimalFormat.format(n_double));
    }

    void imprimirVetorInteiro(String mensagem, int[] contador, String[] universo_resposta) {
        System.out.println(mensagem);
        try {
            for (int i = 0; i < contador.length; i++) {
                System.out.println(universo_resposta[i] + " --> " + contador[i]);
            }
        } catch (Exception e) {
            System.out.println("Erro detectado: " + e);
        }
    }
}
