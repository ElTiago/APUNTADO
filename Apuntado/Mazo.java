package apuntado;
import java.util.Stack;

public class Mazo {
    private Stack<Carta> pilaMazo;
    private Carta topeMazo;

    public Mazo() {
        pilaMazo = new Stack<>();
        topeMazo = null;
    }

    public void setTopeMazo(Carta topeMazo) {
        this.topeMazo = topeMazo;
    }
}
