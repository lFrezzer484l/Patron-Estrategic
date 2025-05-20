package transporte;

public class IrEnAuto implements EstrategiaTransporte {
    public void viajar(String destino) {
        System.out.println("Voy en auto hasta " + destino);
    }
}
