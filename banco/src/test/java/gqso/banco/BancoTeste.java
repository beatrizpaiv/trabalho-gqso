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
    public void testeSaque() throws SaldoInsuficiente{
        assertEquals(0, banco.saque(100));
        assertThrows(Banco.SaldoInsuficiente.class, () -> banco.saque(100));
    }

    @Test
    public void testeDeposito() {
        assertEquals(200, banco.deposito(100));
    }
}