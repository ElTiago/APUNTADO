package apuntado;
import java.util.List;

public class Administrador {
    private List<PuntajePartida> conteoPuntos;
    private List<Carta> baraja;
    

    public Administrador() {
        this.conteoPuntos = null;
        this.baraja = null;
    }

    public void crearCuenta() {

    }
    public static class PuntajePartida {

        public PuntajePartida() {
        }
    }
    public List<Carta> barajarCartas() {

        return baraja;
    }
    public List<Carta> repartirCartas() {

        return baraja;
    }

    public boolean terminarRonda() {
  
        return false;
    }

    public void crearRonda() {

    }

    public boolean validarMontoPartida() {

        return false;
    }

    public boolean validarCrearPartida() {

        return false;
    }

    public boolean terminarPartida() {

        return false;
    }

    public List<PuntajePartida> realizarConteo() {

        return conteoPuntos;
    }

    public boolean validarAbandonoJugador() {

        return false;
    }

    public void eliminarJugador() {

    }

    public List<Jugador> getPuntajeMano() {

        return null;
    }

    public boolean validarAñadirJugador() {

        return false;
    }

    public boolean validarCompraFichas() {

        return false;
    }

    public boolean validarRetiroSaldo() {

        return false;
    }

    public boolean validarBajarCartas() {

        return false;
    }

    public List<PuntajePartida> getPuntajePartida() {

        return conteoPuntos;
    }

    public boolean validarTocarCarta() {

        return false;
    }


}
