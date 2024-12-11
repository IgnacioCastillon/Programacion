import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lado del cuadrado: ");
        int lado = sc.nextInt();
        for (int i = 0; i<lado; i++){
            System.out.print("*");
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("*");
        }

    }
}
