import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos alumnos hay?");
        int alumnos = sc.nextInt();
        sc.nextLine();
        String  nombre[]= new String[alumnos];
        int edad[] = new int[alumnos];
        String  clase[]= new String[alumnos];
        double nota[]= new double[alumnos];
        alumno alumno[] = new alumno[alumnos];
        double sumanotas=0;
        double media=0;

        for (int i = 0; i<alumnos;i++){
            System.out.println("Nombre: ");
            nombre[i] = sc.nextLine();
            System.out.println("Edad: ");
            edad[i] = sc.nextInt();
            sc.nextLine();
            System.out.println("Clase: ");
            clase[i] = sc.nextLine();
            System.out.println("Nota: ");
            nota[i] = sc.nextDouble();
            sc.nextLine();
            sumanotas = sumanotas+nota[i];
            media = sumanotas/alumnos;
            alumno[i] = new alumno(nombre[i],edad[i],clase[i],nota[i]);
        }
        for (int i = 0; i<alumnos;i++){
            System.out.println("Nombre: "+nombre[i]+"\nEdad: "+edad[i]+"\nClase: "+clase[i]+"\nNota: "+nota[i]+"\n");
        }
        System.out.println("Media: "+media);
    }
}
