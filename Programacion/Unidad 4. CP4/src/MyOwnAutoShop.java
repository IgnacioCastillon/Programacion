public class MyOwnAutoShop {
    public static void main(String[] args) {
        Truck Camion = new Truck(120,200000,"Rosa",5000);
        Ford Ford = new Ford(200,10000,"Morado",2014,1000);
        Sedan Sedan = new Sedan(500,9000, "Azul",11000);
        System.out.println(Camion.getSalePrice());
        System.out.println(Ford.getSalePrice());
        System.out.println(Sedan.getSalePrice());
    }
}
