import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int n1 = sc.nextInt();
        String resultado = Resultadoejercicio(n1);
        String resultado2 = Resultadoejercicio2(n1);
        String resultado3 = Resultadoejercicio3(n1);
        System.out.println("El resultado es " + resultado);
        System.out.println("El resultado es " + resultado2);
        System.out.println("El resultado es " + resultado3);
    }


    public static String Resultadoejercicio(int n1) {
        String resultado = "";
        if (n1/2==0) {
            return "0";
        }
        while (n1 > 2) {
            int division = n1 % 2;
            resultado = division + resultado;
            n1 = n1 / 2;
        }
        resultado= n1+resultado;
        return resultado;
    }
    public static String Resultadoejercicio2(int n1) {
        String resultado2 = "";
        if (n1/8==0) {
            return "0";
        }
        while (n1 > 8) {
            int division = n1 % 8;
            resultado2 = division + resultado2;
            n1 = n1 / 8;
        }
        resultado2= n1+resultado2;
        return resultado2;
    }
    public static String Resultadoejercicio3(int n1) {
        String resultado3 = "";
        if (n1/16==0) {
            return "0";
        }
        while (n1 > 16) {
            int division = n1 % 16;

            switch (division){
                case 1,2,3,4,5,6,7,8,9 -> resultado3= n1 + resultado3;
                case 10 -> resultado3 = "A"+resultado3;
                case 11 -> resultado3 = "B"+resultado3;
                case 12 -> resultado3 = "C"+resultado3;
                case 13 -> resultado3 = "D"+resultado3;
                case 14 -> resultado3 = "E"+resultado3;
                case 15 -> resultado3 = "F"+resultado3;
            }
            n1 = n1 / 16;
        }
        switch (n1) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9 -> resultado3 = n1 + resultado3;
            case 10 -> resultado3 = "A" + resultado3;
            case 11 -> resultado3 = "B" + resultado3;
            case 12 -> resultado3 = "C" + resultado3;
            case 13 -> resultado3 = "D" + resultado3;
            case 14 -> resultado3 = "E" + resultado3;
            case 15 -> resultado3 = "F" + resultado3;
        }
        return resultado3;
    }
}

