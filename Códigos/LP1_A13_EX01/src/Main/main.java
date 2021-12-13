package Main;

import java.util.Date;
import tools.ConverteDatas;

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
        Date data = entrada.lerData2("Insira uma data no formato dd/mm/aaaa");
        
        //Processamento
        Processamento processamento = new Processamento();

        //Saida
        Saida saida = new Saida();
    }
    
}
