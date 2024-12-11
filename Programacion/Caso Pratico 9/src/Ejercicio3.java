import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de articulos: ");
        int articulos = sc.nextInt();
        sc.nextLine();
        float[] precio= new float[articulos];
        float[] precioart= new float[articulos];
        float[] descuento= new float[articulos];
        float[] preciofinal= new float[articulos];
        String[] articulo = new String[articulos];
        float preciototal= 0;
        int[] cantidad = new int[articulos];
        for (int i = 0; i<articulos;i++){
            System.out.print("Nombre articulo "+i+": ");
            articulo[i] = sc.nextLine();
            System.out.print("Precio articulo "+i+": ");
            precioart[i] = sc.nextFloat();
            sc.nextLine();
            System.out.print("Cantidad de producto: ");
            cantidad[i] = sc.nextInt();
            sc.nextLine();
            precio[i] = precioart[i]*cantidad[i];
            if (precio[i]>=200){
            descuento[i] = precio[i] * 0.15F;
            preciofinal[i] = precio[i] * 0.85F;
            preciototal = preciototal + preciofinal[i];
            } else if (precio[i]>100&&precio[i]<200) {
                descuento[i] = precio[i] * 0.12F;
                preciofinal[i] = precio[i] * 0.88F;
                preciototal = preciototal + preciofinal[i];
            } else if (precio[i]>0&&precio[i]<=100) {
                descuento[i] = precio[i] * 0.10F;
                preciofinal[i] = precio[i] * 0.90F;
                preciototal = preciototal + preciofinal[i];
            }
        }

        for (int i = 0; i<articulos;i++){
            System.out.println("--------------------------------------");
            System.out.println("Articulo "+i+ ": " +articulo[i] );
            System.out.println("Cantidad: "+cantidad[i]);
            System.out.println("Precio unidad: "+precioart[i]);
            System.out.println("Precio inicial: " +precio[i] );
            System.out.println("Descuento: " +descuento[i] );
            System.out.println("Precio final: " +preciofinal[i] );
        }
        System.out.println("Precio total: " +preciototal);
    }
}