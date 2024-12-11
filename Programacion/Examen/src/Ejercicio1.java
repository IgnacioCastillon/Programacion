import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Abrimos escaner
        System.out.println("¿Hasta que numero quieres realizar la suma de todos los numeros enteros empezando por 1?");
        int n = sc.nextInt();
        int n1 = 1;
        int suma = 0;
        for (int i = 0; i < n; i++) { //Se realiza un for para que mientras i sea menor al numero escrito se realice la suma y despues se le sume 1 al numero
            suma = suma + n1; //Operacion
            n1++; //Se le añade una unidad al numero inicial que en este caso es 1, y asi hasta llegar al numero escrito
        }
        System.out.println("La suma de los numeros enteros del 1 al " + n + " es " + suma); //Se imprime la solucion
        sc.close();
    }
}
