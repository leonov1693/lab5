package ru.leonov.lab5;

/**
Дочерний класс - кубическая парабола
 */
public class CubicParabola extends Line {

    private double b, c, d;

    public CubicParabola(double a, double b, double c, double d) {
        this.setName("Кубическая парабола");
        setA(a);
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    @Override
    public int degree() {
        return 3;
    }

    @Override
    public boolean isBelong(Point p) {
        return p.y == getA() * Math.pow(p.x, 3) + getB() * Math.pow(p.x, 2) + getC() * p.x + getD();
    }

    @Override
    public String toString() {
        return "id=" + getId() + ", " + getName() + "; y=" + getA() + "x^3+" + getB() + "x^2+" + getC() + "x+" + getD() + "; степень x=" + degree();
    }

    @Override
    public void moveX(double x) {
        if (x > 0) {
            this.b += 3 * getA() * x;
            this.c += 3 * getA() * x * x + 2 * this.b * x;
            this.d += getA() * Math.pow(x, 3) + this.b * x * x + this.c * x;
        }
        if (x < 0) {
            this.b -= 3 * getA() * x;
            this.c += 3 * getA() * x * x - 2 * this.b * x;
            this.d += this.b * x * x - getA() * Math.pow(x, 3) - this.c * x;
        }
    }

    @Override
    public void moveY(double y) {
        this.d += y;
    }
}
