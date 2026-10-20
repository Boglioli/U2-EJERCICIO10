public class Main {
    public static void main(String[] args) {
        Vuelo vuelo = new Vuelo("ARG123");
        Asiento asiento1 = new Asiento("1A", "economica");
        Asiento asiento2 = new Asiento("1B", "economica");
        Asiento asiento3 = new Asiento("2A", "ejecutiva");
        vuelo.agregarAsiento(asiento1, asiento2, asiento3);
        Pasajero pasajero = new Pasajero("Juan Perez");
        pasajero.solicitarReserva(vuelo, "1A");
    }
}
