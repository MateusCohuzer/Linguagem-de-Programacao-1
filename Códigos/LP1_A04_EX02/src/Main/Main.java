package Main;
/**
 *
 * @author Mateus CohuzEr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Entrada
        Entrada entrada = new Entrada();
        int N1 = entrada.lerInteiro("Digite a primeira nota: ");
        int N2 = entrada.lerInteiro("Digite a segunda nota: ");
        int N3 = entrada.lerInteiro("Digite a terceira nota: ");
        int N4 = entrada.lerInteiro("Digite a qaurta nota: ");
        
        //Processamento
        Processamento processamento = new Processamento();
        double media = processamento.calcularNota(N1, N2, N3, N4);
        
        
        //Saida
        Saida saida = new Saida();
        saida.imprimirNumeroDouble("A media é ", media);
    }
}
