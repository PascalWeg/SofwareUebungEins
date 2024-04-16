package test;

import UebungEins.RomanNumberTransformer;
import org.junit.jupiter.api.*;

class GermanFormatNumberTransformerTest {
RomanNumberTransformer rom = new RomanNumberTransformer();

    @Test
    void testEins() {
        Assertions.assertEquals(rom.transformNumber(5),"V");
        Assertions.assertEquals(rom.transformNumber(8),"VIII");
        Assertions.assertEquals(rom.transformNumber(153),"CLIII");
        Assertions.assertEquals(rom.transformNumber(0),"ERROR");
        Assertions.assertEquals(rom.transformNumber(3001),"ERROR");


    }

 }