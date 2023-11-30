package apuntado;

public class Cuenta {
    private String nombre;
    private String contraseña;
    private int edad;

    public Cuenta(String nombre, String contraseña, int edad) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.edad = edad;
    }

    public boolean verificarCredenciales() {
        // Implementa la lógica para verificar las credenciales
        return false;
    }

    public boolean crearCuenta() {
        // Implementa la lógica para crear una cuenta
        return false;
    }
}
