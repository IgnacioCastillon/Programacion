import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int contador= 0; //par
        int contador2= 0; //impar
        int contador3= 0; //Positivo
        int contador4= 0; //Negativo
        for (int i=1; i<=10;i++) { // mientras la variable i sea menor a 10 se repetira el interior del for, sumandole +1 a i cada vez que se repita hasta que llegue a 10
            System.out.printf("Numero " + i + ": ");
            num = sc.nextInt(); //pedimos un numero
            if (num % 2 == 0) { //si el numero dividido entre 2 da de resto 0, seria par
                contador++;
            }else{
                contador2++;
            }if (num>0){
                contador3++;
            } else{
                contador4++;
            }
        } //imprimimos resultados
        System.out.println("Hay " + contador + " numeros pares");
        System.out.println("Hay " + contador2 + " numeros impares");
        System.out.println("Hay " + contador3 + " numeros positivos");
        System.out.print("Hay " + contador4 + " numeros negativos");
    sc.close(); //cerramos escaner
    }
    }
