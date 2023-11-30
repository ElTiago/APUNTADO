package apuntado;

public class Jugador {
    private String nombre;
    private Mano mano;
    private int puntajeJugador;
    private boolean turno;
    private int edad;
    private boolean estadoJugador;

    public Jugador(String nombre, int edad) {
        this.nombre = nombre;
        this.mano = null;
        this.puntajeJugador = 0;
        this.turno = false;
        this.edad = edad;
        this.estadoJugador = true;
    }

    public void ingresarCuenta() {
        // Implementa la lógica para ingresar la cuenta
    }

    public void cuenta(String nombre, String contraseña, int fichas, int saldo) {
        // Implementa la lógica para gestionar la cuenta del jugador
    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
