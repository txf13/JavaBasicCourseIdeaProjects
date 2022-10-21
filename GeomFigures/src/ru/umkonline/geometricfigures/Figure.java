package ru.umkonline.geometricfigures;

public abstract class Figure {

    private float x;
    private float y;

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public abstract float getPerimeter();

    public abstract float getArea();

    public abstract void drawOnScreen();

}
