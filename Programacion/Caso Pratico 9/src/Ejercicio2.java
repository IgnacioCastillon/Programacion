import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas horas va a trabajar el empleado: ");
        double horas = sc.nextDouble();
        while (horas<0){
            System.out.println("Respuesta no valida.");
            horas = sc.nextDouble();
        }
        sc.nextLine();
        double tarifa;
        System.out.print("Horas diurnas o nocturnas: ");
        String respuesta = sc.nextLine();
        while (!respuesta.equalsIgnoreCase("Diurnas") && !respuesta.equalsIgnoreCase("Nocturnas")) {
            System.out.println("Respuesta no valida.");
            respuesta = sc.nextLine();
        }
        System.out.print("Es festivo: ");
        String festivo = sc.nextLine();
        while (!festivo.equalsIgnoreCase("Si") && !festivo.equalsIgnoreCase("No")) {
            System.out.println("Respuesta no valida.");
            festivo = sc.nextLine();
        }
        if (respuesta.equalsIgnoreCase("diurnas")){
            tarifa = 10;
        }else{
            tarifa = 13.5F;
        }
        if (festivo.equalsIgnoreCase("Si")){
            if (respuesta.equalsIgnoreCase("diurnas")){
                tarifa = tarifa * 1.1;
            }else{
                tarifa = tarifa * 1.15;
            }
        }
        if (respuesta.equalsIgnoreCase("diurnas")){
            respuesta = "Diurno";
        }else{
            respuesta = "Nocturno";
        }
        double sueldo = horas * tarifa;
        System.out.println("____________________________________________________");
        System.out.println("Numero de horas: "+horas);
        System.out.println("Turno: "+respuesta);
        System.out.println("Festivo: "+festivo);
        System.out.print("El sueldo a cobrar sera de: "+sueldo);
    }
}
