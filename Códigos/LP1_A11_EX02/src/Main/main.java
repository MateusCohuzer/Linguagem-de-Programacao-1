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
        int controle = entrada.lerInteiro("Quantidade de pessoas a serem analisadas");
        double max_altura = 0;
        double max_peso = 0;
        double min_altura = Double.MAX_VALUE;
        double min_peso = Double.MAX_VALUE;
        double media_altura;
        double soma_altura = 0;
        double media_peso;
        double soma_peso = 0;
        double altura;
        double peso;
        
        //Processamento
        Processamento processamento = new Processamento();
        
        for (int i = 0; i < controle; i++) {
            System.out.println((i+1)+"° pessoa -->");
            altura = entrada.lerDouble("Altura");
            peso = entrada.lerDouble("Peso");
            
            soma_altura = processamento.calculaSoma(soma_altura, altura);
            soma_peso = processamento.calculaSoma(soma_peso, peso);
            
            max_altura = processamento.escolheSe(max_altura, altura, 0);
            max_peso = processamento.escolheSe(max_peso, peso, 0);
            min_altura = processamento.escolheSe(min_altura, altura, 1);
            min_peso = processamento.escolheSe(min_peso, peso, 1);
        }
        
        media_altura = processamento.calculaDivisao(soma_altura, controle);
        media_peso = processamento.calculaDivisao(soma_peso, controle);
        
        //Saida
        Saida saida = new Saida();
        saida.imprimirNumeroDouble("A menor altura foi", min_altura);
        saida.imprimirNumeroDouble("A maior altura foi", max_altura);
        saida.imprimirNumeroDouble("O menor peso foi", min_peso);
        saida.imprimirNumeroDouble("O maior peso foi", max_peso);
        saida.imprimirNumeroDouble("A media das altura foi", media_altura);
        saida.imprimirNumeroDouble("A media dos pesos foi", media_peso);

    }
}
