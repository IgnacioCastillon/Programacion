import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minutos=0;
        int horas=0;
        System.out.print("Escribe una cantidad de segundos:");
        int segundos = sc.nextInt();
        while (segundos<0){
            System.out.print("Respuesta no valida. No puedes dar numeros segundos: ");
            segundos=sc.nextInt();
        }
        sc.nextLine();
        int segundos2 = segundos;
        while (segundos2>=60){
            minutos++;
            segundos2 = segundos2-60;
        }
        while (minutos>=60){
            horas++;
            minutos= minutos-60;
        }
        System.out.print(segundos+" son "+horas+" horas y "+minutos+" minutos y "+segundos2+" segundos.");
    }
}
