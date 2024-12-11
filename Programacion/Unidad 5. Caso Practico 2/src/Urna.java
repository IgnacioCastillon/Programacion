import java.util.Random;

public class Urna {
    protected int negras;
    protected int blancas;

    static private Random rd = new Random();
    public Urna(int negras, int blancas) {
        this.negras = negras;
        this.blancas = blancas;
    }

    public int getNegras() {
        return negras;
    }

    public void setNegras(int negras) {
        this.negras = negras;
    }

    public int getBlancas() {
        return blancas;
    }

    public void setBlancas(int blancas) {
        this.blancas = blancas;
    }

    public int totalBolas(){
        return blancas+negras;
    }
    public void bola(){
        int totalbolas = totalBolas();
        int aleatorio = rd.nextInt(totalBolas())+1;
        if (aleatorio<=blancas){
            String bola= "Blanca";
            System.out.println("Blanca");
            blancas--;
        }else {
            String bola = "Negra";
            System.out.println("Negra");
            negras--;
        }
    }
    public int ponerBlanca(){
        return getBlancas()+1;
    }
    public int ponerNegra(){
        return getNegras()+1;
    }
}
