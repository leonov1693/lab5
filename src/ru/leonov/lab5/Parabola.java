package ru.leonov.lab5;
/**
Дочерний класс - парабола
 */
public class Parabola extends Line {

    private double b, c;

    public Parabola(double a, double b, double c) {
        setA(a);
        this.setName("Парабола");
        this.b = b;
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public int degree() {
        return 2;
    }

    @Override
    public boolean isBelong(Point p) {
        return p.y == getA() * p.x * p.x + getB() * p.x + getC();
    }

    @Override
    public String toString() {
        return "id=" + getId() + ", " + getName() + "; y=" + getA() + "x^2+" + getB() + "x+" + getC() + "; степень x=" + degree();
    }

    @Override
    public void moveX(double x) {
        if (x > 0) {
            this.b += 2 * getA() * x;
            this.c += getA() * x * x + this.b * x;
        }
        if (x < 0) {
            this.b += 2 * getA() * x;
            this.c = this.c + getA() * x * x - this.b * x;
        }
    }

    @Override
    public void moveY(double y) {
        this.c += y;
    }
}
