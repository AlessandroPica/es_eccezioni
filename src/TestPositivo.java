public class TestPositivo {
    public static void main(String[] args) {
        try {
            NumeroPositivo numeroPositivo = new NumeroPositivo(-5);
            System.out.println("Numero memorizzato: " + numeroPositivo.getNumero());
        } catch (NegativeException e) {
            System.out.println("Eccezione catturata: " + e.getMessage());
        } catch (IntervalException e) {
            System.out.println("Eccezione catturata: " + e.getMessage());
        } catch (EsclusoException e) {
            System.out.println("Eccezione catturata: " + e.getMessage());
        }
        System.out.println("Fine programma");
    }
}