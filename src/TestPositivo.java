public class TestPositivo {
    public static void main(String[] args) {
        try {
            NumeroPositivo numeroPositivo = new NumeroPositivo(-5);
            System.out.println("Numero memorizzato: " + numeroPositivo.getNumero());
        } catch (NegativeException e) {
            System.err.println("Eccezione catturata: " + e.getMessage());
        }
        System.out.println("Fine programma");
    }
}