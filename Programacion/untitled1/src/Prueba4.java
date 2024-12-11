import java.util.Scanner;

public class Prueba4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos alumnos hay: ");
        int alumnos = sc.nextInt();
        sc.nextLine();
        String[] nombre = new String[alumnos];
        int[] edad = new int[alumnos];
        int[] dni = new int[alumnos];
        int[] numero = new int[alumnos];
        String[] clase = new String[alumnos];
        int[] hermanos = new int[alumnos];
        String[][] nombre2 = new String[alumnos][];
        for (int i=0;i<alumnos;i++){
            System.out.print("Nombre alumno: ");
            nombre[i]= sc.nextLine();
            System.out.print("Edad alumno: ");
            edad[i]= sc.nextInt();
            sc.nextLine();
            System.out.print("DNI alumno: ");
            dni[i]= sc.nextInt();
            sc.nextLine();
            System.out.print("Telefono alumno: ");
            numero[i]= sc.nextInt();
            sc.nextLine();
            System.out.print("Clase alumno: ");
            clase[i]= sc.nextLine();
            System.out.print("Numero de hermanos: ");
            hermanos[i] = sc.nextInt();
            sc.nextLine();
            if (hermanos[i]>0) {
                nombre2[i] = new String[hermanos[i]];
                for (int j = 0; j < hermanos[i]; j++) {
                    System.out.printf("Nombre hermano " + i + ": ");
                    nombre2[i][j]=sc.nextLine();
                }
            }
        }
        for (int i=0;i<alumnos;i++) {
            System.out.println("--------------------------------------------------------");
            System.out.println("Alumno: " + nombre[i]);
            System.out.println("Edad: " + edad[i]);
            System.out.println("DNI: " + dni[i]);
            System.out.println("Telefono: " + numero[i]);
            System.out.println("Clase: " + clase[i]);
            System.out.println("Numero de hermanos: " + hermanos[i]);
            if (hermanos[i] > 0) {
                for (int j = 0; j < hermanos[i]; j++) {
                    System.out.println("Nombre hermano " + j + ":" +nombre2[i][j]);
                }
            }
        }
    }

}
