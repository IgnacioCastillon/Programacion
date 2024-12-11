import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Primer numero: "); //Pedimos el primer numero
        float n1 = sc.nextFloat();
        System.out.printf("Segundo numero: "); //Pedimos el segundo numero
        float n2 = sc.nextFloat();
        if (n1==n2){ //si n1 y n2 son iguales,se multiplican y se imprime el resultado
            float mult = n1*n2;
            System.out.printf("El resultado de la multiplicacion da: "+mult);
        } else if (n1>n2) {  //si n1 es mayor que n2, se resta n2 a n1 y se imprime el resultado
            float resta = n1-n2;
            System.out.printf("El resultado de la resta es: "+resta);
        } else { // si n2 es mayor a n1, se suman y se imprime el resultado
            float suma = n1+n2;
            System.out.printf("El resultado de la suma es: "+suma);
        }
        sc.close(); // cerramos escaner
    }
}
