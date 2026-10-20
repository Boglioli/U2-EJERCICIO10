public class Asiento {
    private String numero;
    private String clase;
    private boolean ocupado;
    public Asiento(String numero, String clase) {
        this.numero = numero;
        this.clase = clase;
        this.ocupado = false;
    }
    public String getNumero() {
        return numero;
    }
    public boolean estaOcupado() {
        return ocupado;
    }
    public void ocupar() {
        ocupado = true;
    }
}
