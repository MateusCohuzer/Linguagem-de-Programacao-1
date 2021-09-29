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
        String[] data = entrada.lerData("Insira uma data (formato dia/mes/ano)");
        String mes_extenso;
        int mes = Integer.valueOf(data[1]);

        //Processamento
        Processamento processamento = new Processamento();
        mes_extenso = processamento.encontraMes(mes);

        //Saida
        Saida saida = new Saida();
        saida.imprimirMensagem("O mês " + mes + " escrito por extenso fica: " + mes_extenso);
    }
    
}
