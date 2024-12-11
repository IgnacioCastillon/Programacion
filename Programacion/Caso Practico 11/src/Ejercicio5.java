import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cientos = 0;
        int dieces = 0;
        int miles = 0;
        System.out.print("Escribe un numero: ");
        int n1 = sc.nextInt();
        int n2 = n1;
        while (n1>=1000){
            miles++;
            n1-=1000;
        }
        while (n1>=100){
            cientos++;
            n1-=100;
        }
        while (n1>=10){
            dieces++;
            n1-=10;
        }
        int digitos;
        if (miles>0){
            digitos = 4;
        }else if (cientos>0){
            digitos = 3;
        }else if (dieces>0){
            digitos = 2;
        }else if (n2>10){
            digitos = 1;
        }else{
            digitos = 0;
        }

        double narcisista = Math.pow(miles,digitos)+Math.pow(cientos,digitos)+Math.pow(dieces,digitos)+Math.pow(n1,digitos);
        if (n2==narcisista){
            System.out.print(n2+ " si es un numero narcisista");
        }else {
            System.out.print(n2+ " no es un numero narcisista");
        }
    }
}
