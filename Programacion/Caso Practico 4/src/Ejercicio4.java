import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Primer numero: ");
        int a= sc.nextInt();
        sc.nextLine();
        System.out.print("Segundo numero: ");
        int b = sc.nextInt();
        sc.nextLine();
        int suma = 0;
        int suma2 = 1;
        double suma3= 0;
        int resta=(b-a);
        if (a>b){
            for (int n =100;n<=1000;n++){
                if ((n*(n+1)/5)%5==0){
                    suma= suma +n;
                }
            }System.out.println("La suma de los numeros N entr 100 y 1000 que cumplan la condicion ((n*(n+1)/5)%5==0) es: "+suma);

        } else if (a==b) {
            for (int n = 1; n <=45; n+=4){
                int operacion = n/a;
                suma = suma+operacion;
            }
            System.out.print("El resultado de la suma es: "+suma);

        }else if (a<b){
            int n2 = 3;
            for (int n=2;n<=20;n+=2){
                double operacion= Math.pow(n,n2);
                suma3 = suma3 + operacion;
                n2+=3;
            }
            double operacion2 = resta*suma3;
            System.out.print(operacion2);
        }

    }
}
