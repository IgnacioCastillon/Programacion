import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Presupuesto: ");
        int presupuesto = sc.nextInt();
        if (presupuesto>0 && presupuesto<=10){
            System.out.println("El regalo indicado sería la tarjeta de regalo");
        } else if (presupuesto>10&&presupuesto<=20) {
            System.out.println("El regalo indicado serían unos bombones");
        } else if (presupuesto>20&&presupuesto<=50) {
            System.out.println("El regalo indicado serían unas flores");
        } else if (presupuesto>50) {
            System.out.println("El regalo indicado sería un anillo");
        }

    }
}
