package gqso.banco;

public class Banco {

    public class SaldoInsuficiente extends Exception{
        private static final long serialVersionUID = 1L;
    }


    private double saldo = 100;

    public double saque(double valor) throws SaldoInsuficiente {
        if(saldo() < valor) {
            throw new SaldoInsuficiente();
        }
        setSaldo(saldo() - valor);
        return saldo();
    }

    public double deposito(double valor) {
        setSaldo(saldo() + valor);
        return saldo();
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double saldo() {
        return this.saldo;
    }

}