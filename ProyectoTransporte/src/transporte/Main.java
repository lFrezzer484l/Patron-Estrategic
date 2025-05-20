package transporte;

public class Main {
    public static void main(String[] args) {
        Viajero viajero = new Viajero();

        viajero.setEstrategia(new IrCaminando());
        viajero.irAlDestino("el parque");

        viajero.setEstrategia(new IrEnBicicleta());
        viajero.irAlDestino("el trabajo");

        viajero.setEstrategia(new IrEnAuto());
        viajero.irAlDestino("el supermercado");
    }
}
