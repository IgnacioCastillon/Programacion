public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Suma de todos los numeros entre 20 y 3500 que cumplan la condicion n*(n+1)/2=multiplo de 7"); //Se imprime la funcion del codigo
        int suma = 0;
        int contador = 0;

        for (int n = 20; n <= 3500; n++) { //mientras n sea menor a 3500, se añade uno y se repite el bucle
            if ((n * (n + 1) / 2)%7 == 0) {
                suma = n + suma;
                contador++;
                System.out.println(n+" si es multiplo de 7");
            }else{
                System.out.println(n+" no es multiplo de 7");
            }
        }     System.out.println("Numeros que cumplen la condición: "+contador);
        System.out.println("La suma de estos numeros es "+suma);

    }
}

