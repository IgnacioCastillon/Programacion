import java.util.Scanner;

public class Ejercicio4 {
    private double ancho;
    private double alto;

    public Ejercicio4(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        if (ancho>0)
        return ancho;
        else
            return ancho=0;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        if (alto>0)
        return alto;
        else
            return alto=0;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    public double calcularArea(){
        return alto*ancho;
    }
    public double calcularPerimetro(){
        return 2*alto+2*ancho;
    }
    public void mostrarresultado(){
        System.out.println("Area: "+calcularArea());
        System.out.println("Perimetro: "+calcularPerimetro());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Alto del rectangulo: ");
        double alto = sc.nextDouble();
        System.out.println("Ancho del rectangulo: ");
        double ancho = sc.nextDouble();
        Ejercicio4 resultado= new Ejercicio4(ancho, alto);
        resultado.mostrarresultado();
    }
}
