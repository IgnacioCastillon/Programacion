import java.util.Scanner;

public class Ejercicio2 {
    private int numcuenta;
    private double saldo = 0;

    public Ejercicio2(double saldo) {
        this.numcuenta = numcuenta;
        this.saldo = saldo;
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarinfo(){
        System.out.println("Saldo: "+getSaldo());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de cuenta: ");
        int numcuenta = sc.nextInt();
        System.out.println("Saldo inicial: ");
        double saldo = sc.nextDouble();
        System.out.println("Depositar: ");
        double depositar = sc.nextDouble();
        saldo = saldo + depositar;
        System.out.println("Retirar: ");
        double retirar = sc.nextDouble();
        saldo = saldo - retirar;
        Ejercicio2 info = new Ejercicio2(saldo);
        info.mostrarinfo();
    }
}

