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
        int dias_ano = converteDatas.getDiaDoAno(data);
        System.out.println(dias_ano);
        String isBissexto;
        
        //Processamento
        Processamento processamento = new Processamento();
        isBissexto = processamento.isBissexto(dias_ano);
        
        //Saida
        Saida saida = new Saida();
        saida.imprimirMensagem(isBissexto);

    }
    
}
