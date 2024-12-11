import java.util.Random;
import java.util.Scanner;

public class Veoveo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int numero = rd.nextInt(14) + 1;
        int pista = 1;
        String pista2 = "";


        String respuesta="";
        int intentos = 0;
        boolean acierto = false;
        if (numero == 1) {
            respuesta = "Ordenador";
        } else if (numero == 2) {
            respuesta = "Silla";
        } else if (numero == 3) {
            respuesta = "Aire";
        } else if (numero == 4) {
            respuesta = "Teclado";
        } else if (numero == 5) {
            respuesta = "Frikis";
        } else if (numero == 6) {
            respuesta = "Monitor";
        } else if (numero == 7) {
            respuesta = "Raton";
        } else if (numero == 8) {
            respuesta = "Pantalla";
        } else if (numero == 9) {
            respuesta = "Mesas";
        } else if (numero == 10) {
            respuesta = "Ventana";
        } else if (numero == 11) {
            respuesta = "Puerta";
        } else if (numero == 12) {
            respuesta = "Persiana";
        } else if (numero == 13) {
            respuesta = "Tablon";
        } else if (numero == 14) {
            respuesta = "Tripode";
        }
        System.out.println("Cuantos intentos quieres?");
        int intentosmax = sc.nextInt();
        sc.nextLine();
        String comienzo = String.valueOf(respuesta.charAt(0));
        System.out.println("Veo veo");
        String respuesta2 = sc.nextLine();
        while (!respuesta2.equalsIgnoreCase("Que ves")) {
            System.out.print("Contesta bien. ");
            respuesta2 = sc.nextLine();
        }
        System.out.println("Una cosita");
        String respuesta3 = sc.nextLine();
        while (!respuesta3.equalsIgnoreCase("y que cosita es")) {
            System.out.print("Contesta bien. ");
            respuesta3 = sc.nextLine();
        }

        System.out.println("Empieza por la letra: "+comienzo);
        while (intentos<intentosmax&!acierto) {
            String respuesta4 = sc.nextLine();
            intentos++;
            if (pista==1){
                pista2 = "segunda";
            } else if (pista==2) {
                pista2 = "tercera";
            }
            if (respuesta4.equalsIgnoreCase("Pista")&&pista<3) {
                System.out.println("La " + pista2 + " letra es: " + respuesta.charAt(pista));
                System.out.println("Intentos restantes: "+(intentosmax-intentos));
                pista++;
            } else if (respuesta4.equalsIgnoreCase("Pista")&&pista>=2) {
                System.out.println("No te quedan mas pistas");
            }
            if (!respuesta4.equalsIgnoreCase(respuesta)&&!respuesta4.equalsIgnoreCase("Pista")) {
                System.out.println("No es esa palabra");
                System.out.println("Intentos restantes: "+(intentosmax-intentos));
            }else if (respuesta4.equalsIgnoreCase(respuesta)){
                System.out.print("Has acertado");
                acierto = true;
            }
        }
        if (!acierto){
            System.out.println("Ya no tienes mas intentos");
            System.out.println("La respuesta era "+respuesta);
        }
    }
}
