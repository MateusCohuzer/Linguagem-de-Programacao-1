package Main;

import java.util.Scanner;

/**
 *
 * @author Mateus CohuzEr
 */
class Entrada {
    
    Scanner teclado = new Scanner(System.in);
    
    public int lerInteiro(String mensagem){
        System.out.print(mensagem);
        int inteiro = teclado.nextInt();
        return inteiro;
    
    }
}
