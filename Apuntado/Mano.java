package apuntado;
import java.util.List;

public class Mano {
    private List<Carta> cartas;
    private int puntajeMano;
    private Jugador jugador;

    public Mano(Jugador jugador) {
        this.cartas = null;
        this.puntajeMano = 0;
        this.jugador = jugador;
    }

    public int setPuntajeMano() {
        // Implementa la lógica para calcular el puntaje de la mano
        return puntajeMano;
    }

    public String setJugadorMano() {
        return jugador.getNombre();
    }
}
