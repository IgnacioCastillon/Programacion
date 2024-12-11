import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas filas tendra: ");
        int filas = sc.nextInt();
        for (int i = 1; i<=filas;i++){
            for (int j= 0; j<i; j++){
                System.out.print(j);
            }
            System.out.println();

        }

    }
}