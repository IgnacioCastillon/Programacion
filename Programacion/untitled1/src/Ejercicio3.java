import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.println("Di un numero positivo: ");
        n1= sc.nextInt();
        while (n1<0){
            System.out.println("Inconrrecto, prueba de nuevo");
            n1 = sc.nextInt();
        }
        if (n1>=0){
            System.out.println("Exacto, " +n1+ " es un numero positivo.");
        }
    }
}
