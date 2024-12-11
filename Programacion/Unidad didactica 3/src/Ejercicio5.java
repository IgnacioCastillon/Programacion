import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de niños: ");
        float niños = sc.nextInt();
        System.out.print("Numero de niñas: ");
        float niñas = sc.nextInt();
        float suma = niños + niñas;
        float procentaje1 = (niños/suma)*100;
        float procentaje2 = (niñas/suma)*100;
        System.out.println("El porcetaje de niños es de " +procentaje1+"%");
        System.out.println("El porcetaje de niñas es de " +procentaje2+"%");

        sc.close();
    }
}
