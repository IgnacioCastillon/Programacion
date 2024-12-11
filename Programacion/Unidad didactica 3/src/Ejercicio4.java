import java.util.Scanner;
import java.util.concurrent.TransferQueue;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer numero: ");
        int n1 = sc.nextInt();
        System.out.print("Segundo numero: ");
        int n2 = sc.nextInt();

        int n3;
        n3=n1;
        n2=n1;
        System.out.println("El primer numero vale "+n3);
        System.out.println("El segundo numero vale "+n2);
        sc.close();
    }
}
