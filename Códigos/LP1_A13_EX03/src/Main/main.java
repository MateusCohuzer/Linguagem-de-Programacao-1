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

        ConverteDatas converteDatas = new ConverteDatas();
        
        //Entrada
        Entrada entrada = new Entrada();
        Date data = entrada.lerData2("Insira uma data no formato dd/mm/aaaa");
        String data_string = converteDatas.converteDeDateParaString(data).substring(3, 5);
        int mes = Integer.valueOf(data_string);
        int max;
        String mes_string;
        
        //Processamento
        Processamento processamento = new Processamento();
        max = processamento.encontraMaxDiasMes(mes);
        mes_string = processamento.encontraMes(mes);
        
        //Saida
        Saida saida = new Saida();
        saida.imprimirMensagem(mes_string + " tem no maximo " + max + " dias");
    }
    
}
