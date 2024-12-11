import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un numero: ");
        int n1 = sc.nextInt();
        String resultado = convertirARomano(n1);
        System.out.println("El número " + n1 + " en números romanos es: " + resultado);
    }




    public static String convertirARomano(int n1) {
        String resultado = "";
        while (n1 >= 1000) {
            resultado += "M";
            n1 -= 1000;
        }
        if (n1 >= 900) {
            resultado += "CM";
            n1 -= 900;
        }
        else if (n1 >= 500) {
            resultado += "D";
            n1 -= 500;
        }
        else if (n1 >= 400) {
            resultado += "CD";
            n1 -= 400;
        }
        while (n1 >= 100) {
            resultado += "C";
            n1 -= 100;
        }
        if (n1 >= 90) {
            resultado += "XC";
            n1 -= 90;
        }
        else if (n1 >= 50) {
            resultado += "L";
            n1 -= 50;
        }
        else if (n1 >=40) {
            resultado += "XL";
            n1 -=40;
        }while (n1 >=10) {
            resultado += "X";
            n1 -=10;
        }if (n1 >=9) {
            resultado += "IX";
            n1 -=9;
        }else if (n1 >=5) {
            resultado += "V";
            n1 -=5;
        }else if (n1 >=4) {
            resultado += "IV";
            n1 -=4;
        }while (n1 >=1) {
            resultado += "I";
            n1 -=1;
        }
        return resultado;
    }
}