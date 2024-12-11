import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1;
        double n2;
        double n3;
        System.out.print("Primera nota: ");
        n1 = sc.nextDouble();
        System.out.print("Segunda nota: ");
        n2 = sc.nextDouble();
        System.out.print("Tercera nota: ");
        n3 = sc.nextDouble();

        //String txt;
        //System.out.println("Nota: ");
        //nota = sc.nextInt();
        while (n1>10||n1<0){
            System.out.print("Primera nota no permitida, reescribela: ");
            n1 = sc.nextDouble();
        }
        while (n2>10||n2<0){
            System.out.print("Segunda nota no permitida, reescribela: ");
            n2 = sc.nextDouble();
        }
        while (n3>10||n3<0){
            System.out.print("Tercera nota no permitida, reescribela: ");
            n3 = sc.nextDouble();
        }
        double media = ((n1+n2+n3)/3);
        if (media>=0||media<4){
            System.out.println("Insuficiente: "+media);
        }else if (media>=4||media<6){
            System.out.println("Regular: "+media);
        }else if (media>=7){
            System.out.println("Bien: "+media);
        }else if (media>=7||media<9){
            System.out.println("Notable: "+media);
        }else if (media>=9||media<=10){
            System.out.println("Sobresaliente: "+media);
        }


        // (media){
            //case 0,1,2,3 -> System.out.println(+media+" :Insuficiente");
            //case 4,5 -> System.out.println(+media+" :Regular");
            //case 6 -> System.out.println(+media+" :Bien");
            //case 7,8 -> System.out.println(+media+" :Notable");
            //case 9,10 -> System.out.println(+media+" :Sobresaliente");
        //}
    }
}
