package Libro;

public class Lib {
    public String titulo;
    public String autor;
    public int anio;

    public Lib(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }
    public void mostrarInfo() {
    System.out.println("Título: " + this.titulo);
    System.out.println("Autor: " + this.autor);
    System.out.println("Año: " + this.anio);
}
}