package apuntado;
import java.util.Stack;

public class Baraja {
    private Stack<Carta> pilaBaraja;
    private Carta topeBaraja;

    public Baraja() {
        pilaBaraja = new Stack<>();
        topeBaraja = null;
    }

    public void setTopeBaraja(Carta topeBaraja) {
        this.topeBaraja = topeBaraja;
    }
}
