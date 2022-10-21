import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello ArrayList!");

        ArrayList<Float> mas = new ArrayList<>();

        int size =  Integer.valueOf(args[0]);

        for (int i = 0; i < size; i++) {

            float num = (float)Math.random();

            mas.add(num);

            System.out.println(mas.get(i));
        }

        Iterator<Float> iter = mas.iterator();

        System.out.println("Hello Iterator!");
        while(iter.hasNext()){

            System.out.println(iter.next());
        }

    }
}