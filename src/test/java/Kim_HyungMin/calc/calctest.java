package Kim_HyungMin.calc;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class calctest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAdd()
    {
        calc c = new calc();
        assertEquals(30,c.add(10, 20));
    }
}
