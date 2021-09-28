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
        int numero = entrada.lerInteiro("Insira um número inteiro");
        String numero_extenso;
        
        //Processamento
        Processamento processamento = new Processamento();
        numero_extenso = processamento.transformaNumeroExtenso(numero);
        
        //Saida
        Saida saida = new Saida();
        saida.imprimirMensagem("Número por extenso: " + numero_extenso);
        
    }

}
