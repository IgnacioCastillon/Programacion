import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dia de la semana: ");
        String dia = sc.nextLine();
        switch (dia.toLowerCase()){
            case "lunes" -> System.out.print("Dia laborable");
            case "martes" -> System.out.print("Dia laborable");
            case "miercoles" -> System.out.print("Dia laborable");
            case "jueves" -> System.out.print("Dia laborable");
            case "viernes" -> System.out.print("Dia laborable");
            case "sabado" -> System.out.print("Dia no laboral");
            case "domingo" -> System.out.print("Dia no laboral");

        }
        sc.close();
    }
}
