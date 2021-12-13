package Main;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

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
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
    }

    public void imprimirData(Date data, String mensagem, String formatacao) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatacao);
        String sdf = simpleDateFormat.format(data);
        System.out.println(mensagem + " " + sdf);
    }

    public void separador(String separador) {
        int ctrl = 30;
        String[] separador2 = new String[ctrl];
        String[] escopo = separador.split("");
        int j = 0;
        int max = escopo.length;
        for (int i = 0; i < ctrl; i++) {
            separador2[i] = escopo[j];
            j++;
            if (j == max) {
                j = 0;
            }
        }
        for (int i = 0; i < ctrl; i++) {
            System.out.print(separador2[i]);
        }
        System.out.print("\n");
    }

    public void imprimirMatriz(String mensagem, int matriz[][]) {
        System.out.println(mensagem);

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {

                System.out.print(matriz[i][j] + " ");

            }

            System.out.println("");

        }

    }

    public void listarPessoas(Pessoa[] vetorPessoa, int i) {
        for (int j = 0; j < i; j++) {
            System.out.println(vetorPessoa[j]);
        }
    }

    public void listarPessoas(List listaPessoa) {
        for (int i = 0; i < listaPessoa.size(); i++) {
            System.out.println(listaPessoa.get(i));
        }
    }
}
