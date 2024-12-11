import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int far = 0;far<=100;far+=5){

            int celsius = (far -32) * 5/9;
            System.out.println(far+" ª fahrenheit en ª celsius son: "+celsius+"ª");
        }

    }
}
