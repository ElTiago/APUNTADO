package apuntado;
import java.util.List;

public class Apuestas {
    private List<Paquete> paquetes;
    private int saldo;

    public Apuestas() {
        this.paquetes = null;
        this.saldo = 0;
    }

    public void Paquete() {

    }

    public void Paquete(String descripcion, int precio, int cantidadFichas) {

    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}
