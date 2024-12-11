
import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia = LocalDate.now().getDayOfMonth();
        int mes = LocalDate.now().getMonthValue();
        int anoactual= LocalDate.now().getYear();
        System.out.println("Hoy es "+dia+"/"+mes+"/"+anoactual);
        System.out.print("Introduce un año: ");
        int ano = sc.nextInt();
        if (ano%100!=0&&ano%4==0&&ano%400==0){
            System.out.println("El año "+ano+" si es bisiesto");
        }else{
            System.out.println("El año "+ano+" no es bisiesto");
        }
    }
}