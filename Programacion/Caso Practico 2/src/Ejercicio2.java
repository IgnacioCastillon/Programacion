import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int altura;
        System.out.print("Base: ");
        base = sc.nextInt();
        System.out.print("Altura: ");
        altura = sc.nextInt();
        int area = base*altura/2;
        System.out.printf("El area de este triangulo es "+area);
    }
}
