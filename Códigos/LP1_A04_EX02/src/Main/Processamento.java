package Main;

/**
 *
 * @author Mateus CohuzEr
 */
class Processamento {

    public double calcularHipotenusa(int a, int b) {
        double hipotenusa = Math.sqrt((a*a)+(b*b));
        return hipotenusa;
    }
    public double calcularNota(int N1, int N2, int N3, int N4) {
        double media = (N1 + N2*2 + N3*3 + N4*4)/10;
        return media;
    }
}
