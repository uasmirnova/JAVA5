package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @Test

    public void testFrom200to300() {
        SQRService service = new SQRService();
        int actual = service.calculateSQR(200, 300);
        int expected = 3;

        assertEquals(expected, actual);

    }

    @Test

    public void testFrom200to201() {
        SQRService service = new SQRService();
        int actual = service.calculateSQR(200, 201);
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test

    public void testFrom0to0() {
        SQRService service = new SQRService();
        int actual = service.calculateSQR(0, 0);
        int expected = 0;

        assertEquals(expected, actual);

    }
}
