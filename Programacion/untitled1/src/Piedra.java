import java.util.Random;
import java.util.Scanner;
public class Piedra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random=new Random();
        int r2;
        r2 = random.nextInt(3);
        int r1;
        System.out.print("Elige entre piedra(1), papel(2) o tijeras(3): ");
        r1 = sc.nextInt();
        while (r1>3||r1<1) {
            System.out.println("Prueba otra vez");
            r1 = sc.nextInt();
        }
        while (r2>3||r2<1) {
            r2 = random.nextInt(3);

        }

        while (r1==r2) {
            System.out.println("Empate, prueba de nuevo " + r1 + " contra " + r2);
            r1 = sc.nextInt();
            r2 = random.nextInt(3);
            while (r2>3||r2<1) {
                r2 = random.nextInt(3);

            }

        } if (r1==1&&r2==3){
            System.out.println("Ganaste: "+r1+" gana a " +r2+".");
        } else if (r1==2&&r2==1) {
            System.out.println("Ganaste: "+r1+" gana a " +r2+".");
        } else if (r1==3&&r2==2) {
            System.out.println("Ganaste: "+r1+" gana a " +r2+".");
        }else{
            System.out.println("Perdiste, "+r1+ " pierde contra "+r2+".");
        }









    }

}
