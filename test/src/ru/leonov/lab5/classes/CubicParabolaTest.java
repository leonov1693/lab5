package ru.leonov.lab5.classes;

import org.junit.Test;
import ru.leonov.lab5.CubicParabola;

import static org.junit.Assert.*;
public class CubicParabolaTest{

@Test
public void testDegree() {
        System.out.println("Проверка метода degree()");
        CubicParabola c = new CubicParabola(3, 4, 2, 1);
        assertEquals(3, c.degree(), 0.00001);
    }
}
