import java.util.Scanner;

public class Ejercicio1 {
    private String nombre;
    private int edad;
    private String genero;

    public Ejercicio1(String nombre, int edad, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    public void mostrarinfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Genero: "+genero);
    }
    public void edad(int aumentaredad){
        edad=edad+aumentaredad;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas personas se añadiran?");
        int npersonas = sc.nextInt();
        sc.nextLine();
        String[] nombre = new String[npersonas];
        int[] edad = new int[npersonas];
        String[] genero = new String[npersonas];
        for (int i = 0; i < npersonas; i++) {
            System.out.println("Nombre persona "+i+":");
            nombre[i] = sc.nextLine();
            System.out.println("Edad persona " +i+":");
            edad[i]=sc.nextInt();
            sc.nextLine();
            System.out.println("Genero persona "+i+":");
            genero[i]= sc.nextLine();
            Ejercicio1 info = new Ejercicio1(nombre[i], edad[i], genero[i]);
            info.mostrarinfo();
            System.out.println("Cuantos años quieres aumentar?");
            int aumentaredad = sc.nextInt();
            sc.nextLine();
            info.edad(aumentaredad);
            info.mostrarinfo();
        }


    }
}