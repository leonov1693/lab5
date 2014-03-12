package ru.leonov.lab5;
/**
Дочерний класс - прямая
 */
public class StrLine extends Line {

    private double b;

    public StrLine(double a, double b) {
        this.setName("Прямая");
        setA(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public int degree() {
        return 1;
    }

    @Override
    public boolean isBelong(Point p) {
        return p.y == getA() * p.x + getB();
    }

    @Override
    public String toString() {
        return this.getTime() + "; " + "id=" + getId() + ", " + getName() + "; y=" + getA()
                + "x+" + getB() + "; степень x=" + degree();
    }

    @Override
    public void moveX(double x) {
        if (x > 0) {
            this.b += getA() * x;
        }
        if (x < 0) {
            this.b -= getA() * x;
        }
    }

    @Override
    public void moveY(double y) {
        this.b += y;
    }
}
