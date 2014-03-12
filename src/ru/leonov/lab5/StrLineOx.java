package ru.leonov.lab5;

import ru.leonov.lab5.MoveOx;

import ru.leonov.lab5.MoveOy;
/**
Дочерний класс - прямая, параллельная оси Ох
 */
public class StrLineOx extends Line {

    public StrLineOx(double a) {
        setA(a);
        this.setName("Прямая, параллельная Ox");
    }

    @Override
    public int degree() {
        return 0;
    }

    @Override
    public boolean isBelong(Point p) {
        return p.y == getA();
    }

    @Override
    public String toString() {
        return this.getTime() + "; " + "id=" + getId() + ", " + getName() + "; y=" + getA() + "; степень x=" + degree();
    }

    @Override
    public void moveX(double x) {
    }

    @Override
    public void moveY(double y) {
        double aa;
        aa = getA();
        aa += y;
        setA(aa);
    }
}
