public class SerVivo {
    private int edad;

    public SerVivo(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public SerVivo mayor(SerVivo otro) {
        if (this.edad >= otro.getEdad()) {
            return this;
        } else {
            return otro;
        }
    }


    public String toString() {
        return "SerVivo {edad=" + edad + "}";
    }


    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        SerVivo serVivo = (SerVivo) obj;
        return edad == serVivo.edad;
    }
}





class Humano extends SerVivo {
    private String nombre;
    public Humano(String nombre, int edad) {
        super(edad);
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }


    public Humano mayor(SerVivo otro) {
        if (otro instanceof Humano) {
            Humano otroHumano = (Humano) otro;
            if (this.getEdad() > otroHumano.getEdad()) {
                return this;
            } else if (this.getEdad() == otroHumano.getEdad()) {
                return (this.nombre.length() > otroHumano.getNombre().length()) ? this : otroHumano;
            }
        }
        return (Humano) super.mayor(otro);
    }


    public String toString() {
        return "Humano {nombre='" + nombre + "', edad=" + getEdad() + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Humano humano = (Humano) obj;
        return nombre.equals(humano.nombre);
    }
}
