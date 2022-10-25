package ru.umkonline.projectnursery;

public class Dog {

    // поля класса
    String breed;
    String size;
    int age;
    String color;

    // конструкторы класса
    Dog(){
        this.breed = "unknown";
        this.size = "medium";
        this.age = 0;
    }
    Dog(String breed, String size, int age, String color){

        this.breed = breed;
        this.size = size;
        this.age = age;
        if(color != null){
            this.color = color;
        }
    }

    // методы класса
    boolean eat (float weigth, String food){
        // ...
        return true;
    }

    int sleep(){
        // ...
        return 5;
    }

    int sit(){
        // возвращает сколько дней собака находится в питомнике
        // ...
        return 42;
    }

    float run(int task){
        // выполняем упражнение
        return 0.42f;
    }

}
