import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radio: ");
        float radio = sc.nextInt();
        double area = radio*radio*Math.PI;
        System.out.printf("El area de este circulo es: "+area);

    }
}
