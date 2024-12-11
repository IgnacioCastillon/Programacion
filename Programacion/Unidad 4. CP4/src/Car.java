public class Car {
    private int speed;
    private double regularPrice;
    private String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", color='" + color + '\'' +
                '}'+super.toString();
    }
    double getSalePrice(){
        return regularPrice;
    }
}

class Truck extends Car {
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                '}' + super.toString();
    }

    double getSalePrice() {
        double finalprice = getRegularPrice();
        if (weight > 2000)
            finalprice *= 0.90;
        else
            finalprice *= 0.80;
        return finalprice;
    }
}
class Ford extends Car{
    private int year;
    private int Descuentomanufacturado;

    public Ford(int speed, double regularPrice, String color, int year, int descuentomanufacturado) {
        super(speed, regularPrice, color);
        this.year = year;
        Descuentomanufacturado = descuentomanufacturado;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDescuentomanufacturado() {
        return Descuentomanufacturado;
    }

    public void setDescuentomanufacturado(int descuentomanufacturado) {
        Descuentomanufacturado = descuentomanufacturado;
    }


    @Override
    public String toString() {
        return "Ford{" +
                "year=" + year +
                ", Descuentomanufacturado=" + Descuentomanufacturado +
                '}'+super.toString();
    }
    double getSalePrice(){
        return super.getSalePrice();
    }
}
class Sedan extends Car{
    private int longitud;

    public Sedan(int speed, double regularPrice, String color, int longitud) {
        super(speed, regularPrice, color);
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }


    @Override
    public String toString() {
        return "Sedan{" +
                "longitud=" + longitud +
                '}'+super.toString();
    }

    @Override
    double getSalePrice() {
        double finalPrice = getRegularPrice();
        if (longitud>20)
            finalPrice*=0.95;
        else
            finalPrice*=0.9;
            return finalPrice;
    }
}