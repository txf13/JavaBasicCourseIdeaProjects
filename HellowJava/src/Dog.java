public class Dog extends Animal{

    // поля класса
    private String breed;
    private String size;
    private int age;
    private String color;

    // конструкторы класса
    Dog(String type){
        super(type);
        this.breed = "unknown";
        this.size = "medium";
        this.age = 0;
    }
    Dog(String breed, String size, int age, String color, String type){

        super(type);
        this.breed = breed;
        this.size = size;
        this.age = age;
        if(color != null){
            this.color = color;
        }
        if(size.equals("big")){
            this.alertWarning(1);
        }
    }

    // методы класса
    public boolean eat (float weigth, String food){
        // ...
        return true;
    }

    public int sleep(){
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

    @Override
    public void alertError(int num) {
        System.out.println("error in class dog occured:"+this.convertAreltNum(num));

    }

    @Override
    public void alertWarning(int num) {
        System.out.println("warning in class dog occured:"+this.convertWarningNum(num));
    }
}
