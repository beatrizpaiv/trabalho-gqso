package gqso.banco;

public class Banco {

    public class SaldoInsuficiente extends Exception{
        private static final long serialVersionUID = 1L;
    }


    private double saldo = 100;

    public double deposito(double valor) throws SaldoInsuficiente {
        if(saldo() < valor) {
            throw new SaldoInsuficiente();
        }
        this.saldo += valor;
        return saldo();
    }

    public double saque(double valor) {
        this.saldo -= valor;
        return saldo();
    }

    public double saldo() {
        return this.saldo;
    }

}