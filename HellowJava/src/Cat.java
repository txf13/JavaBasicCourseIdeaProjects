
public class Cat extends Animal {


    public Cat(String type) {
        super(type);
    }

    @Override
    public boolean eat(float weigth, String food) {
        return false;
    }

    @Override
    public int sleep() {
        return 0;
    }

    @Override
    public void alertError(int num) {
        System.out.println("some error in class cat occured");
    }

    @Override
    public void alertWarning(int num) {
        System.out.println("some warning in class cat occured");
    }


}
