import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];
        electrodomesticos[0] = new Electrodomestico(200, "blanco", 'A', 10);
        electrodomesticos[1] = new Lavadora(300, "azul", 'B', 40, 35);
        electrodomesticos[2] = new Television(400, "negro", 'C', 15, 50, true);
        electrodomesticos[3] = new Electrodomestico(150, "gris", 'D', 5);
        electrodomesticos[4] = new Lavadora(200, 200, 299);
        electrodomesticos[5] = new Television(500, "rojo", 'A', 25, 45, false);
        electrodomesticos[6] = new Electrodomestico(100, "negro", 'E', 8);
        electrodomesticos[7] = new Lavadora(200, "blanco", 'F', 20, 10);
        electrodomesticos[8] = new Television(600, "gris", 'B', 30, 32, true);
        electrodomesticos[9] = new Electrodomestico(300, "rojo", 'C', 50);


        double totalElectrodomesticos = 0;
        double totalLavadoras = 0;
        double totalTelevisores = 0;

        for (Electrodomestico e :electrodomesticos){
            double precio = e.precioFinal();

            if (e instanceof Lavadora) {
                totalLavadoras += precio;
            } else if (e instanceof Television) {
                totalTelevisores += precio;
            }
            totalElectrodomesticos += precio;
        }


        System.out.println("Precio total de las lavadoras: " + totalLavadoras);
        System.out.println("Precio total de los televisores: " + totalTelevisores);
        System.out.println("Precio total de los electrodomésticos: " + totalElectrodomesticos);
        }
    }