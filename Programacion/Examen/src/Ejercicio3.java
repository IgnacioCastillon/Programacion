import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para comprobar si es capicuo:");
        int n1 = sc.nextInt();
        while (n1 < 0) {
            System.out.println("El numero debe ser positivo.");
            n1 = sc.nextInt();
        }
        //Se pasa el numero a texto para asi poder invertirlo
        String n2 = Integer.toString(n1);
        String numeroinvertido = "";

        //Se hace un for para que a la variable antes creada se le añadan los numeros en orden contrario
        //Se le resta 1 a la longitud porque i debe llegar a 0
        for (int i = n2.length() - 1; i >= 0; i--) {
            numeroinvertido += n2.charAt(i);
        }


        if (n2.equals(numeroinvertido)) {
            System.out.println("El número es capicuo.");
        } else {
            System.out.println("El número no es capicuo.");
        }
        sc.close();
    }
}