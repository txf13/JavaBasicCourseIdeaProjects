

// программа обрабатыавает массив из 100 дробных чисел
public class Main {

    public static void main(String[] args) {

        int n = 100;
        double[] array = new double[n];

        for(int i = 0; i<array.length; i++){
            array[i] = Math.random();
        }
        double max = array[0];
        double min = array[0];
        double avg = 0;

        for(int i = 0; i<array.length; i++){
            if(max < array[i])
                max = array[i];
            if(min > array[i])
                min = array[i];
            avg = avg + array[i];
        }
        avg = avg / array.length;
        System.out.println("max = "+max);
        System.out.println("min = "+min);
        System.out.println("avg = "+avg);
    }
}

/*
public class Main {

    public static void main(String[] args) {

        //float[] array = {1f,2.4f,3,4,5};
        int[] array = new int[5];

        array[0] = 42;
        array[1] = 42;
        array[2] = 21;
        array[3] = 42;
        array[4] = 21;

        int sum=0;

        for(int i=0;i<5;i++){
            sum=sum+array[i];
        }
        int len = array.length;

        System.out.println("summ = "+ sum+", len= "+len);

    }

}
*/


/*
// программа находит факториал числа
public class Main {

    public static void main(String[] args) {

        int n, factorial = 1, i;
        n = 5;
        i = 1;
        for(i=1; i<=n; i++){
            factorial = factorial*i;
        }

        System.out.println("factorial n(5) = "+factorial);
    }
}
*/



 /*while(i<=n){
            factorial = factorial*i;
            i++;
        }*/

/*
// программа находит минимум из двух чисел
public class Main {

    public static void main(String[] args) {
        double a, b, c;

        a = 102.0;
        b = 67.8;
        c = 105;

        if(a<b && a<c ) {
            System.out.println("min a");
        }
        if(b<a && b<c) {
            System.out.println("min b");
        }
        if(c<a && c<b) {
            System.out.println("min c");
        }


    }
}

 */



   /* if(a<b) {
            if(a<c) {
                System.out.println("min a");
            }
            else{
                System.out.println("min c");
            }
        }
        else{
            if(b<c) {
                System.out.println("min b");
            }
            else{
                System.out.println("min c");
            }
        }*/

/*
public class Main {

    public static void main(String[] args) {

        // объявление переменных
        int a=42;
        int b = -56;
        int c;
        c = a + b;

        System.out.println("a+b="+c);
    }
}

 */