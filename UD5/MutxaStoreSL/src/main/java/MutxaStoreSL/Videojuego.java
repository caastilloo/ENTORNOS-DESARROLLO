package MutxaStoreSL;

public class Videojuego {

    private String titulo;
    private String plataforma;
    private String genero;
    private int anyoNacimiento;
    private double precio;
    private int stockDispo;

    public Videojuego(String titulo, String plataforma, String genero, int anyoNacimiento, double precio, int stockDispo) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.genero = genero;
        this.anyoNacimiento = anyoNacimiento;
        this.precio = precio;
        this.stockDispo = stockDispo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStockDispo() {
        return stockDispo;
    }

    public void setStockDispo(int stockDispo) {
        this.stockDispo = stockDispo;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", genero='" + genero + '\'' +
                ", anyoNacimiento=" + anyoNacimiento +
                ", precio=" + precio +
                ", stockDispo=" + stockDispo +
                '}';
    }
}
