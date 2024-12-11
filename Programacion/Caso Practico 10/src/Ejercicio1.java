import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer lado: ");
        int lado = sc.nextInt();
        System.out.print("Segundo lado: ");
        int lado2 = sc.nextInt();
        System.out.print("Tercer lado: ");
        int lado3 = sc.nextInt();

        if (lado == lado2 && lado2 == lado3) {
            System.out.print("El triangulo es equilatero");
        } else if (lado == lado3 && lado != lado2) {
            System.out.print("El triangulo es isosceles");
        } else if (lado2 == lado && lado != lado3) {
            System.out.print("El triangulo es isosceles");
        } else if (lado2 == lado3 && lado2 != lado) {
            System.out.print("El triangulo es isosceles");
        } else if (Math.pow(lado, 2) + Math.pow(lado2, 2) == Math.pow(lado3, 2)) {
            System.out.print("El triangulo es rectangular");
        } else if (lado != lado2 && lado != lado3) {
            System.out.print("El triangulo es escaleno");

        }
    }
}