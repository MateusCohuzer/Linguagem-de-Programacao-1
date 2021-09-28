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
            System.out.print(mensagem);
            n_int = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("Erro");

        }
        return n_int;
    }

    public double lerDouble(String mensagem) {
        double n_double = 0;
        try {
            System.out.print(mensagem);
            n_double = teclado.nextDouble();
        } catch (Exception e) {
            System.out.println("Erro");
        }
        return n_double;
    }
}
