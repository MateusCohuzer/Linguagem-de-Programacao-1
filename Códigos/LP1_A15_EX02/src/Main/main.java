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

        //ConverteDatas converteDatas = new ConverteDatas();

        Entrada entrada = new Entrada();
        Processamento processamento = new Processamento();
        Saida saida = new Saida();
        int opcao = 0;
        while (true) {
            System.out.println("1 - Adicionar pessoa na lista");//*
            System.out.println("2 - Listar pessoas e mostrar IMC calculado");
            System.out.println("3 - Sair");
            opcao = entrada.lerNumeroInteiro("Qual opção? ");
            switch (opcao) {
                case 1:
                    processamento.listPessoa.add(entrada.adicionarPessoa());
                    break;
                case 2:
                    processamento.calcularImcParaTodasAsPessoas();
                    saida.listarPessoas(processamento.getListaPessoa());
                    entrada.pausaEnter();
                    break;
                case 3:
                    System.out.println("Fim do programa");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção errada");
            }
        }
    }
}
