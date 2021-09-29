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
        String palavra = entrada.lerStringEmString("Insira uma palavra da frase digitada anteriormente", frase);
        int[] index;
        String[] universo_resposta = {"Inicio da palavra na frase na posição", "Fim da palavra na frase na posição"};
        
        //Processamento
        Processamento processamento = new Processamento();
        index = processamento.encontraIndex(frase, palavra);
        
        //Saida
        Saida saida = new Saida();
        saida.imprimirVetorInteiro("Os indices da palavra na frase são:", index, universo_resposta);
        
    }

}
