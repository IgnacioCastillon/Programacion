import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        for (int numero = 1; numero <=100 ; numero++){
            if (numero%2==0||numero%3==0){
                System.out.println(numero);
                contador++;
            }
        }
        System.out.println("Hay "+contador+" multiplos de 2 o de 3 entre el 1 y el 100");
    }
}

