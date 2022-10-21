package ru.umkonline.geometricfigures;

public class Rectangle extends Figure{

    private float width;
    private float height;

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Rectangle(float x, float y) {
        super(x, y);
    }

    public Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public float getPerimeter() {
        return  (width*2 + height*2);
    }

    @Override
    public float getArea() {
        return width*height;
    }

    @Override
    public void drawOnScreen() {
        System.out.println("Rectangle here");
    }

    public void drawOnScreen(float scale){

        System.out.println("Rectangle with scale here: "+ scale);
    }

    public void drawOnScreen(int type, String colorFill, String colorBorder){
        System.out.println("Rectangle with colors here");
    }
}
