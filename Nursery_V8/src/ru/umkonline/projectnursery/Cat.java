package ru.umkonline.projectnursery;

public class Cat extends Animal{

    public Cat(String type) {
        super(type);
    }

    @Override
    boolean eat(float weigth, String food) {
        // ...
        return true;
    }

    @Override
    int sleep() {
        // ...
        return 6;
    }
}
