package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest {

    @Test
    public void testAddition() {
        Calc c = new Calc();
        assertEquals(4, c.add(2, 2));
    }

    @Test
    public void testSubtraction() {
        Calc c = new Calc();
        assertEquals(2, c.subtract(4, 2));
    }
}