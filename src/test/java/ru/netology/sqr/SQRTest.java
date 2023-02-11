package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRTest {

    @Test
    public void testFewSqr() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testOneSQR(){
        SQRService service = new SQRService();

        int actual = service.calc(100, 101);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testZeroSQR() {
        SQRService service = new SQRService();

        int actual = service.calc(90, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

}
