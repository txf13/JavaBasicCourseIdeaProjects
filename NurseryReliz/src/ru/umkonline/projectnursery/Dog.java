package ru.umkonline.projectnursery;

public class Dog extends Animal{

    // поля класса
    private String breed;

    // конструкторы класса
    Dog(String type){
        super(type);
        this.breed = "unknown";
    }
    Dog(String breed, String size, int age, String color, String type){

        super(size, age, color, type);
        this.breed = breed;
        if(size.equals("big")){
            this.alertWarning(1);
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

    float run(int task){
        // выполняем упражнение
        return 0.42f;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }



}
