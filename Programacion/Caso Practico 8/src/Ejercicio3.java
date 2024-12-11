import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A cuantas consultas ha asistido el paciente? ");
        int numeroconsulta = sc.nextInt();
        int preciototal = 0;
        for (int i = 0; i <= numeroconsulta; i++) {
            if (i>0 && i <= 3) {
                int precioconsulta = 150;
                System.out.println("El precio de la consulta número "+i+" es de "+precioconsulta+"€");
                preciototal = preciototal + precioconsulta;
            } else if (i > 3 && i <= 5) {
                int precioconsulta = 100;
                System.out.println("El precio de la consulta número "+i+" es de "+precioconsulta+"€");
                preciototal = preciototal + precioconsulta;
            } else if (i > 5 && i <= 8) {
                int precioconsulta = 90;
                System.out.println("El precio de la consulta número "+i+" es de "+precioconsulta+"€");
                preciototal = preciototal + precioconsulta;
            } else if (i > 8) {
                int precioconsulta = 50;
                System.out.println("El precio de la consulta número "+i+" es de "+precioconsulta+"€");
                preciototal = preciototal + precioconsulta;
            }
        }
        System.out.print("EL precio total es de "+preciototal+"€");
    }
}
