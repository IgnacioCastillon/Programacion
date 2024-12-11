import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas personas se van a introducir?");
        int personas = sc.nextInt();
        for (int i = 0; i < personas; i++) {
            int contador = 1;
            Prueba persona[i] = new Prueba(sc.nextLine(), sc.nextInt(), sc.nextLine(), sc.nextLine());
            persona[i].info();

        }
    }
}
