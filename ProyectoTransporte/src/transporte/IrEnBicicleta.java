package transporte;

public class IrEnBicicleta implements EstrategiaTransporte {
    public void viajar(String destino) {
        System.out.println("Voy en bicicleta hasta " + destino);
    }
}
