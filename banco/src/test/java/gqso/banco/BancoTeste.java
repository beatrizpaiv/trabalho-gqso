package gqso.banco;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gqso.banco.Banco.SaldoInsuficiente;

public class BancoTeste {
    Banco banco;

    @BeforeEach
    public void setUp() {
        banco = new Banco();
    }

    @Test
    public void testeDeposito() throws SaldoInsuficiente{
        assertEquals(0, banco.deposito(100));
        assertThrows(Banco.SaldoInsuficiente.class, () -> banco.deposito(100));
    }
}