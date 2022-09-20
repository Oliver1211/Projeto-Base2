package TreinamentoSelenium;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteValores {
    @Test
    public void testeSoma(){
        Assertions.assertEquals(4, 2+2);
    }
    @Test
    public void testeVlrDif(){
        Assertions.assertEquals(4, 3+3);
    }

}
