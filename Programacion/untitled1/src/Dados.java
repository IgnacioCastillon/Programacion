import java.util.Random;
import java.util.Scanner;
public class Dados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random(7);
        int d1;
        int d2;
        d1 = random.nextInt(7);
        d2  = random.nextInt(7);
        String n1;
        System.out.print("Nombre del jugador 1: ");
        n1 = sc.nextLine();
        String n2;
        System.out.print("Nombre del jugador 2: ");
        n2 = sc.nextLine();
        System.out.println(n1+ " ha sacado un "+d1);
        System.out.println(n2+ " ha sacado un "+d2);
        if (d1>d2) {
            System.out.println(n1 + " ha ganado!!");
        }else{
            System.out.println(n2+" ha ganado!!");
        }

    }

}
