import java.util.Scanner;

public class Ejercicio3 {
    private String titulo;
    private String Autor;
    private int numerodepaginas;
    private int paginaactual=0;

    public Ejercicio3(String titulo, String autor, int numerodepaginas, int paginaactual) {
        this.titulo = titulo;
        Autor = autor;
        this.numerodepaginas = numerodepaginas;
        this.paginaactual = paginaactual;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getNumerodepaginas() {
        return numerodepaginas;
    }

    public void setNumerodepaginas(int numerodepaginas) {
        this.numerodepaginas = numerodepaginas;
    }

    public int getPaginaactual() {
        return paginaactual;
    }

    public void setPaginaactual(int paginaactual) {
        this.paginaactual = paginaactual;
    }
    public void paginaactual(int aumentarpagina){
        int contador = 0;
        while (contador < aumentarpagina){
            paginaactual++;
            contador++;
        }

    }
    public void paginaactual2(int disminuirpagina){
        int contador = 0;
        while (contador < disminuirpagina){
            paginaactual--;
            contador++;
        }
    }
    public void mostrarinfo(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+getAutor());
        System.out.println("Numero paginas: "+numerodepaginas);
        System.out.println("Pagina actual: "+paginaactual);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Titulo: ");
        String titulo = sc.nextLine();
        System.out.println("Autor: ");
        String autor = sc.nextLine();
        System.out.println("Numero de paginas: ");
        int numerodepaginas = sc.nextInt();
        System.out.println("Pagina Actual: ");
        int paginaactual = sc.nextInt();
        Ejercicio3 libro = new Ejercicio3(titulo,autor,numerodepaginas,paginaactual);
        libro.mostrarinfo();
        System.out.println("Cuantas quieres avanzar?");
        int aumentarpagina = sc.nextInt();
        libro.paginaactual(aumentarpagina);
        System.out.println("Cuantas quieres retroceder?");
        int disminuirpagina = sc.nextInt();
        libro.paginaactual2(disminuirpagina);
        libro.mostrarinfo();
    }
}

