import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 50; i>=20; i--){
            if (i%2==0){
                suma = i + suma;
                System.out.println("La suma de estes numeros da: "+suma);
            }

        }
    }
}
