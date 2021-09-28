package Main;

import java.util.Scanner;

/**
 *
 * @author Mateus CohuzEr
 */
class Entrada {

    Scanner teclado = new Scanner(System.in);

    public int lerInteiro(String mensagem) {
        int n_int = 0;
        try {
            System.out.print(mensagem + ": ");
            n_int = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("Erro, digite um número inteiro");
        }
        return n_int;
    }

    public double lerDouble(String mensagem) {
        double n_double = 0;
        try {
            System.out.print(mensagem + ": ");
            n_double = teclado.nextDouble();
        } catch (Exception e) {
            System.out.println("Erro");
        }
        return n_double;
    }

    int[] lerVetorInteiro(String mensagem, int N) {
        int[] retorno = new int[N];
        for (int i = 0; i < N; i++) {
            retorno[i] = lerInteiro(mensagem + ": ");
        }
        return retorno;
    }

    public String lerString(String mensagem) {
        String s = "";
        while (true) {
            System.out.print(mensagem + ": ");
            s = teclado.nextLine();
            s = s.trim();
            if (!s.equals("")) {

                break;
            } else {
                System.out.println("Digite uma string não vazia");
            }
        }
        return s;
    }

}
