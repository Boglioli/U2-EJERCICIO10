public class Pasajero {
    private String nombre;
    public Pasajero(String nombre) {
        this.nombre = nombre;
    }
    public void solicitarReserva(Vuelo vuelo, String numeroAsiento) {
        boolean reserva = vuelo.reservarAsiento(numeroAsiento);
        if (reserva) {
            System.out.println("reserva realizada correctamente ");
            System.out.println("el pasajero: " + nombre);
            System.out.println("vuelo: " + vuelo.getCodigo());
            System.out.println("asiento: " + numeroAsiento);
        } else {
            System.out.println("reserva no realizada correctamente ");
            System.out.println("el asiento no esta  disponible");
        }
    }
}
