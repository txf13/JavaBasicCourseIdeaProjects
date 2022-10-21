package ru.umkonline.geometricfigures;

public class Square extends Rectangle{

    private float size;

    public Square(float x, float y, float size) {
        super(x,y);
        this.size = size;
    }

    @Override
    public float getPerimeter() {
        return (size*4);
    }

    @Override
    public float getArea() {
        return size*size;
    }
}
