import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mayor = 0;
        int n1;
        int n2;
        int n3;
        int n4;
        int n5;

        System.out.println("Escribe el primer numero: ");
        n1 = sc.nextInt();

        System.out.println("Escribe el segundo numero: ");
        n2 = sc.nextInt();

        System.out.println("Escribe el tercer numero: ");
        n3 = sc.nextInt();

        System.out.println("Escribe el cuarto numero: ");
        n4 = sc.nextInt();

        System.out.println("Escribe el quinto numero: ");
        n5 = sc.nextInt();

        //Se comprueba todos los numeros para ver si son mayores a la variable mayor, en el caso de que se verdad el valor de la variable mayor cambia a la de tal numero
        if (n1 > mayor) {
            mayor = n1;
        }
        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }
        if (n4 > mayor) {
            mayor = n4;
        }
        if (n5 > mayor) {
            mayor = n5;
        }
        System.out.println("El numero mayor es " + mayor);
        sc.close();
    }
}
