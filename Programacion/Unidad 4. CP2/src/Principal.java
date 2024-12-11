import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona p1 = new Persona("Pepe", "Camara", 634824724);
        Cuenta Cuenta1 = new Cuenta("Pepe", "Camara", 634824724, 564728, 10000);
        Cuenta Cuenta2 = new Cuenta("Pablo", "Craven", 634824724, 564728, 7000);


        System.out.println("Que transaccion quiere realizar?");
        String tipoTransaccion = sc.nextLine();
        while (!tipoTransaccion.equalsIgnoreCase("reintegro")&&!tipoTransaccion.equalsIgnoreCase("ingreso")){
            System.out.println("Transaccion no valida, pruebe de nuevo");
            tipoTransaccion = sc.nextLine();
        }
        System.out.println("Cuanto desea "+tipoTransaccion+"?");
        double cantidad = sc.nextDouble();
        sc.nextLine();
        Cuenta1.transaccion(tipoTransaccion, cantidad);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Que transaccion quiere realizar?");
        tipoTransaccion = sc.nextLine();
        while (!tipoTransaccion.equalsIgnoreCase("reintegro")&&!tipoTransaccion.equalsIgnoreCase("ingreso")){
            System.out.println("Transaccion no valida, pruebe de nuevo");
            tipoTransaccion = sc.nextLine();
        }
        System.out.println("Cuanto desea "+tipoTransaccion+"?");
        cantidad = sc.nextDouble();
        Cuenta2.transaccion(tipoTransaccion, cantidad);
        System.out.println("\n");
        Cuenta1.info();
        System.out.println("-----------------------------------------------------------");
        Cuenta2.info();
    }
}
