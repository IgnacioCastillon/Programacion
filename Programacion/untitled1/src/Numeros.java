import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        System.out.println("Primer numero: ");
        n1 = sc.nextInt();
        System.out.println("Segundo numero: ");
        n2 = sc.nextInt();
        System.out.println("Tercer numero: ");
        n3 = sc.nextInt();
        if (n1 == n2 && n1 == n3) {
            System.out.println("Todos los numeros son iguales");


        }else if (n1 > n2 && n1 > n3) {
                System.out.println(n1 + " es el numero mayor");
            } else if (n2 > n1 && n2 > n3) {
                System.out.println(n2 + " es el numero mayor");
            } else if (n3 > n1 && n3 > n2) {
                System.out.println(n3 + " es el numero mayor");
            }
        else if (n2 == n1 && n3 != n1) {
        System.out.println("Los dos primeros numeros son iguales");
    } else if (n2 == n3) {
        System.out.println("Los dos ultimos numeros son iguales");
    } else if (n1 == n3) {
        System.out.println("El primer y ultimo numero son iguales");
    }
        }
    }



