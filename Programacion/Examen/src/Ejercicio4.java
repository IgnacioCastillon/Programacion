public class Ejercicio4 {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            //Se da por hecho que todos los numeros entre el 2 y el 100 son primos.
            boolean primo1 = true;
            boolean primo2 = true;
            //Realizamos un for para comprobar si i no es primo (ya que todos son dados como primos), y si i es divisible entre j (numero del 2 a uno inferior a i) no es primo
            for (int j = 2; j <= i-1; j++) {
                if (i % j == 0) {
                    primo1 = false;
                }
            }
            //Se comprueba si el numero que tiene dos de diferencia con el anterior primo, tambien es primo.
            for (int j = 2; j <= i+1; j++) {
                if ((i + 2) % j == 0) {
                    primo2 = false;
                }
            }
            //En el caso de que ambos sean primos se imprime el resultado
            if (primo1 && primo2) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
}
