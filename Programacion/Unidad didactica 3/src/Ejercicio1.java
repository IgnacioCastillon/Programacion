import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int contador2 = 0;
        int numero;
        int suma= 0;
        int suma2= 0;
        int media=0;
        for (int i = 0; i <= 10; i++) {
            System.out.print("Numero entero:");
            numero = sc.nextInt();
            if (numero%2==0) {
                contador++;
                suma = suma + numero;
            }else{
                contador2++;
                suma2 = suma2 + numero;
                media=suma2/contador2;
            }



        }
        System.out.println("Hay "+contador+ " numeros pares");
        System.out.println("La suma de los numeros pares es: "+suma);
        System.out.print("El promedio de los numeros impares es : "+media);

        sc.close();
    }
}
