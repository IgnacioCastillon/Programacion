import java.net.ServerSocket;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos numeros quieres introducir: "); //se pide los numeros a introducir
        int numeros = sc.nextInt();
        int numero[] = new int[numeros]; // se crea un array, por lo que la i se tendra que igualar a este numero
        for (int i = 0; i < numeros; i++) {
            System.out.print("Numero " + i + ": ");
            numero[i]= sc.nextInt(); //por cada i hasta que llegue la numero indicado, se pedira un numero
            if (numero[i]<0){
                System.out.print("El numero no es valido, escribe otro: ");
                numero[i]= sc.nextInt();
            }
        }
        int mayor = numero[0]; //se crea la variable mayor y se indica que el primer numero escrito es el mayor
        for (int i=1;i<numeros;i++){
            if (numero[i]>mayor){ // se comprueba cada numero sea mayor a la variable mayor
                mayor=numero[i]; // se sustituye el mayor
            }
        }
        System.out.print("El numero mayor es: "+mayor);
    }
}
