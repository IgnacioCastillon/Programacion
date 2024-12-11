import java.util.Scanner;

public class Ejecicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Numero de notas: ");
        int nnotas = sc.nextInt();
        float sum= 0;
        for (int i=1; i<=nnotas;i++){
            System.out.print("Nota "+i+ ":");
            float nota = sc.nextInt();
            sum = sum + nota;

        }
        float media = sum/nnotas;

        System.out.printf("El promedio de estas notas:" +media);
    }
    }