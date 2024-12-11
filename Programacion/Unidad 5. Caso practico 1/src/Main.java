import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Sexo: ");
        String sexo = sc.nextLine();
        char c = sexo.charAt(0);

        System.out.println("Peso: ");
        double peso = sc.nextDouble();
        sc.nextLine();

        System.out.println("Altura: ");
        double altura = sc.nextDouble();

        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona p2 = new Persona(nombre, edad, sexo);
        Persona p3 = new Persona();
        p1.calcularIMC();
        p2.calcularIMC();
        p3.calcularIMC();
        p1.esMayorDeEdad();
        p2.esMayorDeEdad();
        p3.esMayorDeEdad();
        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();
    }
}
