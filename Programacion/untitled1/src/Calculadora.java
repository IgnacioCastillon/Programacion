import java.util.Scanner;

class Calculadora {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Primer numero: ");
         double n1 = sc.nextDouble();
         System.out.println("Que operacion quieres realizar: ");
         char r = sc.next().charAt(0);
         double resultado = 0;
         String resultado2 = "eres retrasado";

         System.out.println("Segundo numero: ");
         double n2 = sc.nextDouble();
         switch (r) {
             case '+' -> resultado = n1 + n2;
             case '-' -> resultado = n1 - n2;
             case '*' -> resultado = n1 * n2;
             case '/' -> {
                 if (n2 > 0) {
                     resultado = n1 / n2;
                 } else {
                     System.out.println("Segundo numero no valido");
                     return;
                 }
             }
         }


         System.out.println("El resultado es: "+resultado);
         sc.close();

}
}