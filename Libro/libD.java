package Libro;

public class libD extends Lib {
    public String formato;
    public double tamanioMB;

    public libD(String titulo, String autor, int anio, String formato, double tamanioMB) {
        super(titulo, autor, anio);
        this.formato = formato;
        this.tamanioMB = tamanioMB;
    }   
}