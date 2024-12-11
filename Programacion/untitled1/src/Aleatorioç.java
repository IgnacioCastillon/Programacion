import java.util.Random;
import java.util.Scanner;
public class Aleatorioç {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        double n1 = rd.nextInt(1000000);
        double solucion= n1/2;
        while (n1%2!=0){
            ++n1;
            break;
        }

        System.out.println("Cuanto es la mitad de este numero: "+n1+" (000 para respuesta correcta)");
        double respuesta = sc.nextInt();
        while (respuesta!=n1/2&&respuesta!=000) {
            System.out.println("Incorrecto, prueba de nuevo: ");
            respuesta = sc.nextInt();
        }
        if (respuesta==n1/2){
            System.out.println("Correcto la mitad de "+n1+" es "+respuesta);
        }
        if (respuesta==000){
            System.out.println("La mitad de "+n1+ " es " +solucion);
        }




    }

}
