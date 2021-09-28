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
        int caracteres;
        int num_palavras;
        
        //Processamento
        Processamento processamento = new Processamento();
        caracteres = processamento.contaCaracteres(frase);
        num_palavras = processamento.contaPalavras(frase);

        //Saida
        Saida saida = new Saida();
        saida.imprimirNumeroInteiro("Total de Caracteres: ", caracteres);
        saida.imprimirNumeroInteiro("Total de Palavras: ", num_palavras);

    }

}
