package gqso.banco;

public class Banco {
    private double saldo;

    public double deposito(double valor) {
        this.saldo -= valor;
        return saldo();
    }

    public double saldo() {
        return this.saldo;
    }
}