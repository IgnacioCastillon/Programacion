public class Prueba {
    public static void main(String[] args) {
        PuestoTrabajo jefe = new PuestoTrabajo("S1124","Pene",3000);
        Empleado E1 = new Empleado("77665380S","Ignacio","Castillon Salguero","Juan Valera 2","29017","Malaga","Recepcionista");
        Administrativo A1 = new Administrativo("77665380S","Ignacio","Castillon Salguero","Juan Valera 2","29017","Malaga","Recepcionista", 2);
        Consultor C1 = new Consultor("77665380S","Ignacio","Castillon Salguero","Juan Valera 2","29017","Malaga","Recepcionista","Digamos que si");
        E1.getAtributos();

    }
}
