import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos numeros vas a usar? ");
        int numeros = sc.nextInt();
        int[] numero = new int[numeros];
        int contador = 0;
        int medio=0;


        for (int i = 0; i < numeros; i++) {
            System.out.print("Di un numero: ");
            numero[i] = sc.nextInt();
        }
        int mayor = numero[0];
        int menor = numero[0];
        int suma = 0;

        for (int i = 0; i < numeros; i++) {
            if (numero[i] > mayor) {
                mayor = numero[i];
            } else if (numero[i] < menor) {
                menor = numero[i];

            } else if (numero[i] % 2 == 0) {
                contador++;
                suma = suma + numero[i];
                medio = suma / contador;

            }
        }
        System.out.println("El numero mayor es " + mayor);
        System.out.println("El numero menor es " + menor);
        System.out.print("El valor medio de los numeros pares es " +medio);


        sc.close();
    }
}
