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
        String frase = entrada.lerString("Insira uma frase");
        String comparativo = String.valueOf(entrada.lerString("Insira uma letra").charAt(0));
        int ocorrencias;
        
        //Processamento
        Processamento processamento = new Processamento();
        ocorrencias = processamento.contaOcorrencias(frase, comparativo);
        
        //Saida
        Saida saida = new Saida();
        saida.imprimirNumeroInteiro("Vezes que a letra " + comparativo + " se repetiu na frase: ", ocorrencias);
        
    }

}
