public class Electrodomestico {
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
        this.precioBase = 100;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 5;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra){
        switch (letra){
            case "a" -> this.consumoEnergetico= Consumo.a;
            case "b" -> this.consumoEnergetico = Letra.a;
        }
        if (letra>='a'&&letra<='f'){
            return letra;
        }else{
            return 'f';
        }
    }

    private void comprobarColor(String color){
        if (color.equalsIgnoreCase("blanco")||color.equalsIgnoreCase("Negro")||color.equalsIgnoreCase("Rojo")||color.equalsIgnoreCase("azul")||color.equalsIgnoreCase("gris")){
            return color;
        }else{
            return "Blanco";
        }
    }

    public double precioFinal(){
        double precioFinal = this.precioBase;
        if (consumoEnergetico=='A'){
            precioFinal+=100;
        } else if (consumoEnergetico=='B'){
            precioFinal+=80;
        } else if (consumoEnergetico=='C'){
            precioFinal+=60;
        } else if (consumoEnergetico=='D'){
            precioFinal+=50;
        } else if (consumoEnergetico=='E'){
            precioFinal+=30;
        } if (consumoEnergetico=='F'){
            precioFinal+=10;
        }

        if (peso>0&&peso<=19){
            precioFinal += 10;
        } else if (peso>=20&&peso<=49){
            precioFinal += 50;
        } else if (peso>=50&&peso<=79){
            precioFinal += 80;
        } else if (peso>80){
            precioFinal += 100;
        }
        return precioFinal;
    }
}
