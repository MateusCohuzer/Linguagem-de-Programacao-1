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
        String frase_final;
        
        //Processamento
        Processamento processamento = new Processamento();
        frase_final = processamento.tiraEspacos(frase);
        
        //Saida
        Saida saida = new Saida();
        saida.imprimirMensagem("Frase sem os espaços adicionais: " + frase_final);

    }

}
