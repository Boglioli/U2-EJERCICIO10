public class Vuelo {
    private String codigo;
    private Asiento asiento1;
    private Asiento asiento2;
    private Asiento asiento3;
    public  Vuelo(String codigo) {
        this.codigo = codigo;
    }
    public void agregarAsiento(Asiento asiento1, Asiento asiento2, Asiento asiento3) {
        this.asiento1 = asiento1;
        this.asiento2 = asiento2;
        this.asiento3 = asiento3;
    }
    public boolean reservarAsiento(String numero) {
        if (asiento1.getNumero().equals(numero) && !asiento1.estaOcupado()) {
            asiento1.ocupar();
            return true;
        } else if (asiento2.getNumero().equals(numero) && !asiento2.estaOcupado()) {
            asiento2.ocupar();
            return true;
        } else if (asiento3.getNumero().equals(numero) && !asiento3.estaOcupado()) {
            asiento3.ocupar();
            return true;
        }
        return false;
    }
    public String getCodigo() {
        return codigo;
    }
}
