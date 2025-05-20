package transporte;

public class IrCaminando implements EstrategiaTransporte {
    public void viajar(String destino) {
        System.out.println("Voy caminando hasta " + destino);
    }
}
