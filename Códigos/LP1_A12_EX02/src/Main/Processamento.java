package Main;

/**
 *
 * @author Mateus CohuzEr
 */
class Processamento {

    public double calcularHipotenusa(int a, int b) {
        double hipotenusa = Math.sqrt((a * a) + (b * b));
        return hipotenusa;
    }

    public double calcularNota(int N1, int N2, int N3, int N4) {
        double media = (N1 + N2 * 2 + N3 * 3 + N4 * 4) / 10;
        return media;
    }

    public double calculaSubtracao(double a, double b) {
        double retorno = a - b;
        return retorno;
    }

    public int calculaSubtracaoInt(int a, int b) {
        int retorno = a - b;
        return retorno;
    }

    double calculaSoma(double a, double b) {
        double retorno = a + b;
        return retorno;
    }

    public double calculaMultiplicacao(double a, double b) {
        double retorno = a * b;
        return retorno;
    }

    public double calculaDivisao(double a, double b) {
        double retorno = a / b;
        return retorno;
    }

    public double calcularAreaCirculo(double raio) {
        double area = Math.PI * (raio * raio);
        return area;
    }

    public double calculaRaiz(double entrada) {
        double retorno = Math.sqrt(entrada);
        return retorno;
    }

    public double calculaElevado(double base, double expoente) {
        double retorno = Math.pow(base, expoente);
        return retorno;
    }

    public double transformaPorcentagem(double base) {
        double retorno = base / 100;
        return retorno;
    }

    public int somatoriaVetorInt(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }
        return soma;
    }

    public double escolheSe(double antigo, double novo, int escolha) {
        double retorno = antigo;
        if (escolha == 0) {
            if (antigo < novo) {
                retorno = novo;
            }
        } else if (escolha == 1) {
            if (antigo > novo) {
                retorno = novo;
            }
        }
        return retorno;
    }

    public boolean escolheSeBool(double antigo, double novo, int escolha) {
        boolean retorno = false;
        if (escolha == 0) {
            if (antigo < novo) {
                retorno = true;
            }
        } else if (escolha == 1) {
            if (antigo > novo) {
                retorno = true;
            }
        }
        return retorno;
    }

    public String limparEspacos(String frase) {
        String[] frases = frase.split(" ");
        String retorno = "";
        for (int i = 0; i < frases.length; i++) {
            retorno += frases[i];
        }
        return retorno;
    }

    public int contaCaracteres(String frase) {
        int caracteres = frase.length();
        return caracteres;
    }

    public int contaPalavras(String palavra) {
        int quant;
        String[] arraystring = palavra.split(" ");
        quant = arraystring.length;
        return quant;
    }
}
