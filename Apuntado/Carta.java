package apuntado;

public class Carta {
    private String pinta;
    private String valor;
    private int numero;
    private boolean custom;

    public Carta(String pinta, String valor, int numero, boolean custom) {
        this.pinta = pinta;
        this.valor = valor;
        this.numero = numero;
        this.custom = custom;
    }

    public String getPinta() {
        return pinta;
    }

    public void setPinta(String pinta) {
        this.pinta = pinta;
    }

    public String getValor() {
        return valor;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean getCustom() {
        return custom;
    }

    public void setCustom(boolean custom) {
        this.custom = custom;
    }
}
