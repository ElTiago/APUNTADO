package apuntado;


public class Ronda {
    private int idRonda;
    private Jugador ganadorRonda;
    private Mazo mazoRonda;
    private Baraja barajaRonda;
    private boolean estadoRonda;

    public Ronda(int idRonda) {
        this.idRonda = idRonda;
        this.ganadorRonda = null;
        this.mazoRonda = null;
        this.barajaRonda = null;
        this.estadoRonda = false;
    }

    public Mazo getMazo() {
        return mazoRonda;
    }

    public void setMazo(Mazo mazoRonda) {
        this.mazoRonda = mazoRonda;
    }

    public Baraja getBaraja() {
        return barajaRonda;
    }

    public void setBaraja(Baraja barajaRonda) {
        this.barajaRonda = barajaRonda;
    }

    public boolean setEstadoRonda(boolean estadoRonda) {
        this.estadoRonda = estadoRonda;
        return this.estadoRonda;
    }

    public void setGanadorRonda(Jugador ganadorRonda) {
        this.ganadorRonda = ganadorRonda;
    }
}
