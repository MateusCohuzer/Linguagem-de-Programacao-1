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
        String[] vogais = {"A", "E", "I", "O", "U"};
        int[] contador_vogais;//0-A; 1-E; 2-I; 3-O; 4-U
        
        //Processamento
        Processamento processamento = new Processamento();
        contador_vogais = processamento.contaVogais(frase);
        
        //Saida
        Saida saida = new Saida();
        saida.imprimirVetorInteiro("Quantia de letras na frase: ", contador_vogais, vogais);
        
    }

}
