package Main;

/**
 *
 * @author Mateus CohuzEr
 */
class Processamento {

    Entrada entrada = new Entrada();

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

    String formataNomeIngles(String nome_completo) {
        String[] array_nome = nome_completo.split(" ");
        String nome_final = "Error";
        while (array_nome.length < 1) {
            nome_completo = entrada.lerString("Insira no minimo nome e sobrenome: ");
            array_nome = nome_completo.split(" ");
        }
        for (int i = (array_nome.length - 1); i >= 0; i--) {
            if (i == (array_nome.length - 1)) {
                nome_final = array_nome[i];
            } else {
                nome_final = nome_final + ' ' + array_nome[i];
            }
        }
        return nome_final;
    }

    String inciaisNome(String nome) {
        String conectivos[] = {"DE", "DA", "DI", "DO", "DU", "E", "DES", "DAS", "DOS", "VAN", "VON"};
        nome = nome.toUpperCase();
        String retorno = "";
        boolean tuner;
        String[] array_nome = nome.split(" ");
        for (int i = 0; i < array_nome.length; i++) {
            tuner = true;
            for (int j = 0; j < conectivos.length; j++) {
                if (array_nome[i].equals(conectivos[j])) {
                    tuner = false;
                }
            }
            if (tuner) {
                retorno = retorno + array_nome[i].charAt(0);
            }
        }
        return retorno;
    }

    String tiraEspacos(String frase) {
        String[] escopo = frase.split(" ");
        String frase_final = "";
        for (int i = 0; i < escopo.length; i++) {
            if (!(escopo[i].contains(" ") || escopo[i].equals(""))) {
                if (i == (escopo.length - 1)) {
                    frase_final = frase_final + escopo[i];
                } else {
                    frase_final = frase_final + escopo[i] + " ";
                }
            }
        }
        return frase_final;
    }

    String transformaNumeroExtenso(int numero) {
        String numeros_extenso[] = {"zero", "um", "dois", "tr??s", "quatro", "cinco", "seis", "sete", "oito", "nove"};
        String numeros_entrada = String.valueOf(numero);
        String[] array_numeros_entrada = numeros_entrada.split("");
        String retorno = "";
        int aux;
        for (int i = 0; i < numeros_entrada.length(); i++) {
            if (array_numeros_entrada[i].equals("-")) {
                retorno = retorno + "menos ";
            } else {
                aux = Integer.parseInt(array_numeros_entrada[i]);
                retorno = retorno + numeros_extenso[aux];
                if (i != (numeros_entrada.length() - 1)) {
                    retorno = retorno + ", ";
                } else {
                    retorno = retorno + ".";
                }
            }
        }
        return retorno;
    }

    int[] contaVogais(String frase) {
        frase = frase.toLowerCase();
        String[] frase_separada = frase.split("");
        int[] contador_vogais = {0, 0, 0, 0, 0};
        String[] vogais = {"a", "??", "??", "??", "??",
            "e", "??", "??", "??",
            "i", "??", "??", "??",
            "o", "??", "??", "??", "??",
            "u", "??", "??", "??"};
        for (int i = 0; i < frase_separada.length; i++) {
            for (int j = 0; j < vogais.length; j++) {
                if (frase_separada[i].equals(vogais[j])) {
                    if (j <= 4) {
                        contador_vogais[0]++;
                    } else if (j <= 8) {
                        contador_vogais[1]++;
                    } else if (j <= 12) {
                        contador_vogais[2]++;
                    } else if (j <= 17) {
                        contador_vogais[3]++;
                    } else {
                        contador_vogais[4]++;
                    }
                }
            }
        }
        return contador_vogais;
    }
}
