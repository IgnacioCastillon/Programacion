import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0;
        System.out.println("Al pulsar enter aumentara 1 numero: "+x);


        while (true){
            System.out.print("Contador: "+x+"  ");
            String imput = sc.nextLine();
            if (imput.equalsIgnoreCase("Salir")){
                break;
            }
            x++;

        }
        System.out.print("Contador Final:" +x);

    }
}