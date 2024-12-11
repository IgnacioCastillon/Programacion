import java.util.Scanner;

public class Pablo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Hola Pablo como estas? ");
        String respuesta = sc.nextLine();
        System.out.print("Me la suda, te recomiendo comprar el de 128 GB. Lo vas a hacer? (SI/NO)");
        String respuesta2 = sc.nextLine();
        while (!respuesta2.toLowerCase().equals("si")&&!respuesta2.toLowerCase().equals("no")){
            System.out.print("Respuesta no valida. Contesta con si o no, tan dificil es? ");
            respuesta2 = sc.nextLine();
        }
        if (respuesta2.toLowerCase().equals("no")){
            System.out.println("Vas a ser asi de mongolo, te lo digo enserio");
            System.out.println("Piensatelo si no me haces caso despues te daras cuenta de que te equivocas.");
            System.out.print("Escribe soy gilipollas o no podras salir de aqui: ");
            String respuesta3= sc.nextLine();
            while (!respuesta3.equalsIgnoreCase("Soy gilipollas")){
                System.out.print("Venga tu puedes, ponlo: ");
                respuesta3= sc.nextLine();
            }if (respuesta3.equalsIgnoreCase("Soy gilipollas")){
                System.out.print("Todo el mundo lo sabia");
            }
        } else if (respuesta2.toLowerCase().equals("si")) {
            System.out.print("Es la opcion mas inteligente, de nada");
        }
        sc.close();
    }
}
