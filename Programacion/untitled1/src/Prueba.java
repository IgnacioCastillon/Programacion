import java.time.LocalDate;
import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        int dia = LocalDate.now().getDayOfMonth();
        int año = LocalDate.now().getYear();
        int mes = LocalDate.now().getMonthValue();
        System.out.println("Saludos desde Cesur. "+dia+"/"+mes+"/"+año);
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Bienvenido a Cesur " + nombre + " caraculo");
        System.out.print("Cuantos años tienes caraalmendra?");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Que mayor eres con tus " + edad + " añitos maquina");
        System.out.print("Juegas a algun juego, en caso positivo cual? ");
        String juego = sc.nextLine();
        if (juego.equalsIgnoreCase("rainbow")) {
        System.out.println("Tu si que sabes");
        }else {
            System.out.println(juego+ " vaya puta mierda de juego puto retrasado de los cojones");
        }
        sc.close();

    }
}
