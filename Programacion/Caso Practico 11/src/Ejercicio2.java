import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int contador=0;
        int contador2=0;
        int contador3=0;
        int contador4=0;
        int contador5=0;
        int contador6=0;
        System.out.print("Cuantas veces quieres tirar: ");
        int tiros = sc.nextInt();
        for (int i = 1; i<=tiros;i++){
            int aleatorio = random.nextInt(7);
            while (aleatorio==0){
                aleatorio = random.nextInt(7);
            }
            if (aleatorio==1){
                contador++;
            } else if (aleatorio==2) {
                contador2++;
            } else if (aleatorio==3) {
                contador3++;
            } else if (aleatorio==4) {
                contador4++;
            } else if (aleatorio==5) {
                contador5++;
            } else if (aleatorio==6) {
                contador6++;
            }
        }
        System.out.println("Ha salido el 1 "+contador+" veces");
        System.out.println("Ha salido el 2 "+contador2+" veces");
        System.out.println("Ha salido el 3 "+contador3+" veces");
        System.out.println("Ha salido el 4 "+contador4+" veces");
        System.out.println("Ha salido el 5 "+contador5+" veces");
        System.out.println("Ha salido el 6 "+contador6+" veces");


    }
}
