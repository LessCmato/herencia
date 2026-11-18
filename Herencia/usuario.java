package Herencia;

public class usuario extends persona {
    public String usuario;
    public String contraseña;

    public usuario(String nombre, String edad, String sexo, String usuario, String contraseña) {
        super(nombre, edad, sexo);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    public void mostrarInfo() {
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Edad: " + this.edad);
    System.out.println("Sexo: " + this.sexo);
    System.out.println("Usuario: " + this.usuario);
    System.out.println("Contraseña: " + this.contraseña);
    }
}