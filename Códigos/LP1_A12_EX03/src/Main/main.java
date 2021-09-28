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
        String nome_completo = entrada.lerString("Insira seu nome completo");
        String nome_formatado;
        
        //Processamento
        Processamento processamento = new Processamento();
        nome_formatado = processamento.formataNomeIngles(nome_completo);
        
        //Saida
        Saida saida = new Saida();
        saida.imprimirMensagem("Nome: " + nome_formatado);

    }

}
