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

    public double calcularGasto(double litros, double preco_litro) {
        double valor = litros * preco_litro;
        return valor;
    }

    public double calcularKmL(double Km, double Litros) {
        double KmL = Km / Litros;
        return KmL;
    }

    public double calcularLucroLiquido(double lucro, double gasto) {
        double lucro_liquido = lucro - gasto;
        return lucro_liquido;
    }
}
