import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer numero: ");
        float n1 = sc.nextFloat();
        System.out.print("Segundo numero: ");
        float n2 = sc.nextFloat();
        if (n1>n2){
            float division = n1/n2;
            System.out.printf("El cociente de "+n1+ " entre "+n2+ " es "+division);

        }else{
            float division = n2/n1;
            System.out.printf("El cociente de "+n2+ " entre "+n1+ " es "+division);

        }
    }
}
