import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de alumnos: ");
        int alumnos = sc.nextInt();
        if (alumnos>=100){
            int preciototal=alumnos*65;
            System.out.println("Los alumnos pagaran 65€ cada uno y el pago a la compañia de autobuses es de "+preciototal);
        } else if (alumnos>50&&alumnos<100) {
            int preciototal = alumnos*70;
            System.out.println("Los alumnos pagaran 70€ cada uno y el pago a la compañia de autobuses es de "+preciototal);
        }else if (alumnos>30&&alumnos<50) {
            int preciototal = alumnos * 95;
            System.out.println("Los alumnos pagaran 95€ cada uno y el pago a la compañia de autobuses es de "+preciototal);
        }else if (alumnos<30) {
            int preciototal = 3000/alumnos;
            System.out.println("Los alumnos pagaran "+preciototal+" cada uno y el pago a la compañia de autobuses es de 3000€");

        }
    }
}
