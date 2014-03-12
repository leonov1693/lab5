package ru.leonov.lab5.classes;

import org.junit.Test;
import ru.leonov.lab5.Parabola;
import static org.junit.Assert.*;
public class ParabolaTest{

@Test
public void testDegree() {
        System.out.println("Проверка метода degree()");
        Parabola p = new Parabola(4, 2, -1);
        assertEquals(2, p.degree(), 0.00001);
    }
}
