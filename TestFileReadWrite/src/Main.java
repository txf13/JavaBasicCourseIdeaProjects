import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Float> massiv = new ArrayList<>();

    }
       /* massiv.add(1f);
        massiv.add(2f);
        massiv.add(3f);
        massiv.add(4f);
        massiv.add(5f);*/
       /* int count = Integer.valueOf(args[0]);

        for (int i = 0; i < count; i++) {

            float num = (float)Math.random();
            massiv.add(num);
            System.out.println(massiv.get(i));
        }

        massiv.s


    }*/
    /*
    // FileOutputStream and FileInputStream

     public static void main(String[] args) {

        System.out.println("Start read and write: FileOutputStream and FileInputStream!");

        try (FileOutputStream fileOutputStream = new FileOutputStream("test3.txt")){
            String str = "TEST3: Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

            fileOutputStream.write(str.getBytes());

        } catch (Exception e){
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream("test3.txt")){

            int i;
            while( (i = fileInputStream.read()) != -1){
                System.out.print((char)i);
            }

            System.out.println("\nFinish read bytes!");

        } catch (Exception e){
            e.printStackTrace();
        }

     }
     */

   /* public static void main(String[] args) {
        System.out.println("Start read and write: BufferedReader and BufferedWriter!");

        //String fileName = "test1.txt";
        String inputFileName = "C:\\Users\\Rinat\\Desktop\\IdeaProjects\\TestFileReadWrite\\russian_text.txt";

        try (BufferedReader reader =new BufferedReader(new FileReader(inputFileName))){

            String line;

            while( (line = reader.readLine()) !=null ){
                System.out.println(line);
            }

        } catch (Exception e){
            e.printStackTrace();
        }

        String outputFileName = "C:\\Users\\Rinat\\Desktop\\IdeaProjects\\TestFileReadWrite\\test1_output.txt";
        //String str = "Hellow buffered writer!";
        String[] mas= {"red", "green", "blue"};

        try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName, true))){
            for(String str: mas) {

                writter.write(str + "\n");
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }*/

    // FileReader and FileWriter
    /* public static void main(String[] args) {

        System.out.println("Start read and write: FileReader and FileWriter!");

        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        File file = null;
        try {

            file = new File("test1.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(str);
            writer.flush();
            writer.close();

        } catch (Exception e){
            e.printStackTrace();
        }

        try {

            char [] mas = new char[1000];
            FileReader reader = new FileReader(file);
            reader.read(mas);

            for (int i = 0; i < 1000 ; i++) {
                if(mas[i] == 0){
                    break;
                }
                System.out.print(mas[i]);
            }

            reader.close();

        } catch (Exception e){

        }

    }*/
}