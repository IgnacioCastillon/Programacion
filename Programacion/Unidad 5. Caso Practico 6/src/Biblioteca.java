import java.util.Scanner;

public class Biblioteca {
    private int capacidadMaxima;
    private Ejemplar[] ejemplares;
    private int capacidadActual;

    public Biblioteca(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public boolean agregarEjemplar(Ejemplar ejemplar) {
        if (capacidadActual < capacidadMaxima) {
            ejemplares[capacidadActual] = ejemplar;
            capacidadActual++;
            System.out.println("Ejemplar agregado correctamente");
            return true;
        } else {
            System.out.println("La biblioteca está llena");
            return false;
        }
    }
    public boolean eliminarEjemplar(String titulo){
        for (int i = 0; i < capacidadActual; i++){
            if (ejemplares[i].getTitulo().equalsIgnoreCase(titulo)){
                for (int j = i; j<capacidadActual; j++){
                    ejemplares[j] = ejemplares[j+1];
                }
                ejemplares[capacidadActual-1]= null;
                capacidadActual--;
                System.out.println("Ejemplar eliminado: "+titulo);
                return true;
            }
        }
            System.out.println("El ejemplar con titulo "+titulo+" no se encuentra en la biblioteca");
            return false;
        }

        public void mostrarEjemplares(){
        if (capacidadActual==0){
            System.out.println("La biblioteca esta vacia");
        }else{
            System.out.println("Ejemplares en la biblioteca");
            for (int i = 0; i< capacidadActual;i++){
                System.out.println(ejemplares[i].mostrarInfo());
            }
        }
    }
}
