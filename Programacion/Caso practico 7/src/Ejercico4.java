import java.util.Scanner;

public class Ejercico4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador500 = 0;
        int contador200 = 0;
        int contador100 = 0;
        int contador50 = 0;
        int contador20 = 0;
        int contador10 = 0;
        int contador5 = 0;
        int contador2 = 0;
        int contador1 = 0;

        System.out.print("Cantidad de dinero: ");
        int dinero = sc.nextInt();
        while (dinero >= 500) {
            contador500++;
            dinero= dinero-500;
        } while (dinero >= 200) {
            contador200++;
            dinero= dinero-200;
        } while (dinero >= 100) {
            contador100++;
            dinero= dinero-100;
        } while (dinero >= 50) {
            contador50++;
            dinero= dinero-50;
        } while (dinero >= 20) {
            contador20++;
            dinero= dinero-20;
        } while (dinero >= 10) {
            contador10++;
            dinero= dinero-10;
        } while (dinero >= 5) {
            contador5++;
            dinero= dinero-5;
        } while (dinero >= 2) {
            contador2++;
            dinero= dinero-2;
        } while (dinero >= 1) {
            contador1++;
            dinero= dinero-1;
        }
        System.out.println("Billetes de 500€: "+contador500);
        System.out.println("Billetes de 200€: "+contador200);
        System.out.println("Billetes de 100€: "+contador100);
        System.out.println("Billetes de 50€: "+contador50);
        System.out.println("Billetes de 20€: "+contador20);
        System.out.println("Billetes de 10€: "+contador10);
        System.out.println("Billetes de 5€: "+contador5);
        System.out.println("Monedas de 2€: "+contador2);
        System.out.println("Monedas de 1€: "+contador1);
    }
}
