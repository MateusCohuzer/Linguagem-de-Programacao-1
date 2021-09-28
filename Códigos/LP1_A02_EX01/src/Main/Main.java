package Main;

import java.util.Scanner;

public class Main {

    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //entrada
        System.out.print("Digite o primeiro Cateto: ");
        int a = teclado.nextInt();
        System.out.print("Digite o segundo Cateto: ");
        int b = teclado.nextInt();

        //processamento
        double hipotenusa = Math.sqrt((a*a)+(b*b));

        //saída
        System.out.println("O valor da hipotenusa é "+ hipotenusa);

    }
}
