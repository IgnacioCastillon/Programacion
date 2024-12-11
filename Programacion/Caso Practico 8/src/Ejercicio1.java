    import java.util.Scanner;

    public class Ejercicio1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingresa un numero: ");
            int n1 = sc.nextInt();
            boolean esPrimo = true;
            if (n1 <= 0) {
                System.out.println(n1 + " no es primo");
            } else if (n1 == 2) {
                System.out.println(n1 + " es primo");
            }else if (n1==5){
                System.out.println(n1 + " es primo");
            } else if (n1 % 2 == 0) {
                System.out.println(n1 + " no es primo");
            } else if (n1 % 5 == 0) {
                System.out.println(n1 + " no es primo");
            } else if (!(n1%2==0)&&!(n1%5==0)&&!(n1%3==0)) {
                System.out.println(n1 + " si es primo");
            } else System.out.println("No es primo");
        }
    }
