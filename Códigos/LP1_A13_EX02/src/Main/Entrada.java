package Main;

import java.util.Scanner;
import java.util.Date;
import tools.ConverteDatas;

/**
 *
 * @author Mateus CohuzEr
 */
class Entrada {

    Scanner teclado = new Scanner(System.in);
    ConverteDatas converteDatas = new ConverteDatas();

    public int lerInteiro(String mensagem) {
        int n_int = 0;
        try {
            System.out.print(mensagem + ": ");
            n_int = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("Erro, digite um número inteiro");
        }
        return n_int;
    }

    public double lerDouble(String mensagem) {
        double n_double = 0;
        try {
            System.out.print(mensagem + ": ");
            n_double = teclado.nextDouble();
        } catch (Exception e) {
            System.out.println("Erro");
        }
        return n_double;
    }

    int[] lerVetorInteiro(String mensagem, int N) {
        int[] retorno = new int[N];
        for (int i = 0; i < N; i++) {
            retorno[i] = lerInteiro(mensagem + ": ");
        }
        return retorno;
    }

    public String lerString(String mensagem) {
        String s = "";
        while (true) {
            System.out.print(mensagem + ": ");
            s = teclado.nextLine();
            s = s.trim();
            if (!s.equals("")) {
                break;
            } else {
                System.out.println("Digite uma string não vazia");
            }
        }
        return s;
    }

    public String[] lerData(String mensagem) {
        String s = "";
        String[] data_separada; // 0-d; 1-m; 2-y
        int mes;
        while (true) {
            System.out.print(mensagem + ": ");
            s = teclado.nextLine();
            s = s.trim();
            if (s.contains("/")) {
                data_separada = s.split("/");
                mes = Integer.parseInt(data_separada[1]);
                if (mes <= 12 && mes > 0) {
                    break;
                } else {
                    System.out.println("Digite um formato de data valido (dia(01)/mes(01)/ano(2001))");
                }
            } else {
                System.out.println("Digite uma data valida");
            }
        }
        return data_separada;
    }

    public String lerStringEmString(String mensagem, String frase_original) {
        String s = "";
        String aux1 = frase_original.toLowerCase();
        while (true) {
            System.out.print(mensagem + ": ");
            s = teclado.nextLine();
            s = s.trim();
            String aux0 = s.toLowerCase();
            if (!s.equals("")) {
                if (aux1.contains(aux0)) {
                    break;
                } else {
                    System.out.println("Insira uma palavra existente na frase!");
                }
            } else {
                System.out.println("Digite uma string não vazia");
            }
        }
        return s;
    }

    public char lerChar(String mensagem) {
        char retorno;
        char aux = " ".charAt(0);
        while (true) {
            System.out.print(mensagem + ": ");
            retorno = teclado.nextLine().charAt(0);
            if (retorno != aux) {
                break;
            } else {
                System.out.println("Digite uma string não vazia");
            }
        }
        return retorno;
    }

    public Date lerData2 (String mensagem) {
        String data_string = lerString(mensagem);
        Date data;
        boolean tuner = converteDatas.verificaData(data_string);
        while (true) {
            if (tuner) {
                data = converteDatas.converteDeStringParaDate(data_string);
                break;
            }else{
                System.out.println("Data Invalida, insira uma data valida!");
                data_string = lerString(mensagem);
                tuner = converteDatas.verificaData(data_string);
            }
        }
        return data;
    }

}
