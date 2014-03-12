package ru.leonov.lab5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
Родительский класс(абстрактный) - линия
 */
public abstract class Line implements MoveOx, MoveOy {

    private String name;
    private int id;
    private double a;
    private static int nextId = 1;

    {
        id = nextId++;
    }

    public String getTime() 
    {
	DateFormat dateFormat = new SimpleDateFormat("dd.MM.YYYY HH:mm:ss");
	Date date = new Date();
        return dateFormat.format(date);
    }
    
    
    public abstract int degree();

    public abstract boolean isBelong(Point p);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
