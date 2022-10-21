import java.time.temporal.ChronoUnit;
import java.util.Date;

public abstract class Animal implements Alertable, ConvertAlertMessage {

    private String type;

    private String size;
    private String color;
    private int age;
    private Date dateArrived; // = new Date();

    public Animal(String type) {
        this.type = type;
        // хранит дату в миллисекундах, которые прошли с 1 января 1970 года (UNIX время)
        this.dateArrived = new Date();
    }
    public abstract boolean eat(float weigth, String food);
    public abstract int sleep ();

    public final int sit(){

        Date currentDate = new Date();
        //int days = (int) ((currentDate.getTime() - this.dateArrived.getTime())) / (24 * 60 * 60 * 1000);
        int days = (int) ((currentDate.getTime() - this.dateArrived.getTime())) / (1000);
        return days;
    }
    public final String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String convertAreltNum(int num) {

        return ListErrorsWarnings.listErrors[num];
    }

    @Override
    public String convertWarningNum(int num) {
        return ListErrorsWarnings.listWarnings[num];
    }
}
