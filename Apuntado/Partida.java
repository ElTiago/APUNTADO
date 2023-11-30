package apuntado;

public class Paquete {
    private String descripcion;
    private int precio;
    private int idPaquete;
    private int cantidadFichas;

    public Paquete() {
        this.descripcion = null;
        this.precio = 0;
        this.idPaquete = 0;
        this.cantidadFichas = 0;
    }

    public Paquete(String descripcion, int precio, int cantidadFichas) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadFichas = cantidadFichas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadFichas() {
        return cantidadFichas;
    }

    public void setCantidadFichas(int cantidadFichas) {
        this.cantidadFichas = cantidadFichas;
    }
}
