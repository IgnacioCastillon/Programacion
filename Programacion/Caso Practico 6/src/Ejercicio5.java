import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        for (int i= 0; i<=10;i++) {
            for (int j=i; j<=9;j++){
                System.out.print(j);
                if (j<9){
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
