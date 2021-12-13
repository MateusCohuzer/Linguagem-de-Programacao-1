package Main;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    public void imprimirVetorDeInteiros(String mensagem, int[] vetor) {
        System.out.println(mensagem);
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    public void imprimirData(Date data, String mensagem, String formatacao) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatacao);
        String sdf = simpleDateFormat.format(data);
        System.out.println(mensagem + " " + sdf);
    }
}
