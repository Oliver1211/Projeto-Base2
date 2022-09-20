package TreinamentoSelenium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TesteFruta {
    @Test
    public void meuPrimeiroTeste(){
        String fruta = "Pera";
        Assert.assertTrue(fruta.equals("Pera"));
    }
}
