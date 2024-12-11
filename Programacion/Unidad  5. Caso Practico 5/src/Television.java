public class Television extends Electrodomestico {
    private int resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(double precioBase, double peso, int pulgadas, boolean sintonizadorTDT) {
        super(precioBase, peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(double precioBase, String color, char consumoEnergetico, double peso, int pulgadas, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getPulgadas() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if (resolucion > 40) {
            precioFinal *= 1.30;
        }
        if (sintonizadorTDT){
            precioFinal += 50;
        }
        return precioFinal;
    }
}
