package Main;

import java.util.Scanner;

public class Main {

    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //entrada
        System.out.print("Digite a temperatura em Celcius: ");
        int temp_celcius = teclado.nextInt();

        //processamento
        double temp_farenheit = 9*(temp_celcius/5)+32;

        //saída
        System.out.println("A temperatura em Farenheit é "+temp_farenheit);

    }  

}
