import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private String sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String DNI, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
    public double calcularIMC(){
        double pesoideal = peso/(Math.pow(altura,2));
        if (pesoideal<18.50){
            return -1;
        }else if (pesoideal>=18.5&&pesoideal<25){
            return 0;
        }else return 1;
    }
    public void esMayorDeEdad(){
        if (edad>=18)
            System.out.println("Es mayor de edad.");
        else System.out.println("Es menor de edad.");
    }
    public void comprobarSexo(char sexo){
        if (sexo!='H'&&sexo!='M'){
            comprobarSexo('H');
        }
    }
    public void generarDNI(){
        DNI = "";
        Random rd = new Random();
        for (int i = 0; i<8; i++){
            DNI += rd.nextInt(10);
        }
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int numero = Integer.parseInt(DNI);
        int letra = letras.charAt(numero % 23);

        DNI += letra;
        this.dni = DNI;
        System.out.println("DNI generado: " + DNI);

        }
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"Sexo: "+sexo+"\nPeso: "+peso+"\nAltura: "+altura);
    }
}
