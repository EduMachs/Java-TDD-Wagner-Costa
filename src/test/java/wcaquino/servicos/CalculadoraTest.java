package wcaquino.servicos;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import wcaquino.exceptions.NaoPodeDividirPorZeroException;

public class CalculadoraTest {

    private Calculadora calc;

    @Before
    public void setup(){
        calc = new Calculadora();
    }

    @Test
    public void deveSomarDoisValores() {
        //CENARIO
            int a = 5;
            int b = 3;

        //ACAO
        int resultado = calc.somar(a,b);


        //VERIFICACAO
        Assert.assertEquals(8, resultado);
    }

    @Test
    public void deveSubtrairDoisValores() {
        //CENARIO
        int a = 5;
        int b = 3;

        //ACAO
        int resultado = calc.subtrair(a,b);


        //VERIFICACAO
        Assert.assertEquals(2, resultado);
    }

    @Test
    public void deveDividirDoisValores() throws NaoPodeDividirPorZeroException {
        //CENARIO
        int a = 6;
        int b = 3;

        //ACAO
        int resultado = calc.divide(a,b);


        //VERIFICACAO
        Assert.assertEquals(2, resultado);
    }

    @Test(expected = NaoPodeDividirPorZeroException.class)
    public void deveLancarExcecaoAoDividirPorZero() throws NaoPodeDividirPorZeroException {
        int a = 10;
        int b = 0;

        calc.divide(a,b);
    }
}
