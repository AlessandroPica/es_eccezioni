public class NumeroPositivo {
    private int numero;

    public NumeroPositivo(int numero) throws NegativeException {
        setNumero(numero);
    }

    public void setNumero(int numero) throws NegativeException, EsclusoException, IntervalException {
        if (numero < 0) {
            throw new NegativeException("Il numero non può essere negativo: " + numero);
        }
        if (numero <1 || numero > 30){
            throw new IntervalException("Il numero deve essere compreso tra 1 e 30");
        }
        if (numero == 20){
            throw new EsclusoException("Il numero non può essere 20");
        }

        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}