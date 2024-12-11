import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("saldo anterior: ");
        float saldoant = sc.nextFloat();
        System.out.print("Compras del mes: ");
        float compras = sc.nextFloat();
        System.out.print("Cantidad que se debe: ");
        float debe = sc.nextFloat();
        System.out.println("Ultimo pago: ");
        float ultimopago = sc.nextFloat();
        float comprastotales = debe + compras;
        float pagominimo = 0.15F * comprastotales;
        float pagominimosininteres = 0.85F * comprastotales;
        System.out.println("Cual es el pago de este mes: ");
        float pago = sc.nextFloat();

        if (pago<=pagominimosininteres){
            pago = pago * 1.12F;
        }else if(pago<pagominimo){
            pago=+200;
        }
        float saldoactual = saldoant - ultimopago - pago;
        float pendiente = debe + compras - pago;

        //Imprimos soluciones
        System.out.println("Saldo anterior del cliente: "+saldoant+"€");
        System.out.println("Pago del mes anterior: " +ultimopago+"€");
        System.out.println("Cantidad que se debe: "+debe+"€");
        System.out.println("Compras del mes: "+compras+"€");
        System.out.println("Pago minimo a realizar: "+pagominimo+"€");
        System.out.println("Pago minimo para evitar impuestos: "+pagominimosininteres+"€");
        System.out.println("Pago del mes actual: "+pago+"€");
        System.out.println("Saldo actual tras el pago: "+saldoactual+"€");
        System.out.println("Cantidad pendiente de pago restante: "+pendiente+"€");
    }
}
