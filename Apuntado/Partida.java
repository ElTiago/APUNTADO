package apuntado;
import java.util.List;

public class Partida {
    private int idPartida;
    private int montoApostadoPartida;
    private Jugador ganadorPartida;
    private List<Ronda> rondas;
    private List<Jugador> jugadores;
    private int puntajePartida;
    private boolean estadoPartida;
    private boolean cartasCustom;
    
    

    public Partida(int idPartida, int montoApostadoPartida) {
        this.idPartida = idPartida;
        this.montoApostadoPartida = montoApostadoPartida;
        this.ganadorPartida = null;
        this.rondas = null;
        this.jugadores = null;
        this.puntajePartida = 0;
        this.estadoPartida = false;
        this.cartasCustom = false;
    }

    public void tocarCarta() {
    }

    public void recogerCarta() {
    }

    public boolean abandonarPartida() {
        return false;
    }

    public void soltarCarta() {
    }

    public void añadirJugador() {
    }

    public void bajarCartas() {
    }
}

