package transporte;

public class Viajero {
    private EstrategiaTransporte estrategia;

    public void setEstrategia(EstrategiaTransporte estrategia) {
        this.estrategia = estrategia;
    }

    public void irAlDestino(String destino) {
        if (estrategia != null) {
            estrategia.viajar(destino);
        } else {
            System.out.println("No se ha seleccionado un medio de transporte.");
        }
    }
}
