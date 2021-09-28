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

    public void imprimirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

}
