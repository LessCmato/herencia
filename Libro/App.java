package Libro;
public class App {
    public static void main(String[] args) {
        Lib libro1 = new Lib("libro1", "yo xd", 2026);
        libro1.mostrarInfo();
        libD libro2 = new libD("libro2", "otra vez yo", 2025, "PDF", 1.5);
        libro2.mostrarInfo();
    }
}