package ru.umkonline.geometricfigures;

public class Circle  extends Figure{

    private float radius;
    private final float PI = 3.14159f;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public float getPerimeter() {
        return (radius * 2* PI);
    }

    @Override
    public float getArea() {
        return (radius*radius*PI);
    }

    @Override
    public void drawOnScreen() {
        System.out.println("Circle here");
    }
}
