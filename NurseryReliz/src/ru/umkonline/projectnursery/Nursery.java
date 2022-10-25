
package ru.umkonline.projectnursery;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Nursery  {

    public static final String fileArrayJSON = "fileAnimalsJSON.json";
    public static Scanner in;
    public static void addNewDog(int i, Dog[] dogs){

        String breed = "", size = "",color = "";
        int age = 0;
        try {
            System.out.println("Enter breed:");
            breed = in.nextLine();
            System.out.println("Enter size:");
            size = in.nextLine();
            System.out.println("Enter age:");
            age = in.nextInt();
            if(age < 0){
                throw new NegativeAgeException(age);
            }

        } catch(InputMismatchException e){
            e.printStackTrace();
            System.out.println("Error: InputMismatchException occured!");

        } catch (NegativeAgeException e){
            e.printStackTrace();
            System.out.println("Error: ArithmeticException occured!");
            age = 0;
        }  catch (Exception e){
            System.out.println("Error: Exception occured!");
        }

        public static Scanner in;
        age = in.nextInt();
                in.nextLine();
        System.out.println("Enter color:");
        color = in.nextLine();
        dogs[i] = new Dog(breed,size, age, color, "dog");

        JSONObject jsonObj = new JSONObject();
        jsonObj.put("type","dog");
        jsonObj.put("breed",breed);
        jsonObj.put("size",size);
        jsonObj.put("age",age);
        jsonObj.put("color",color);

        File file = new File(fileArrayJSON);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (Exception e){
                e.printStackTrace();
            }
        }

        JSONArray animalsList;
        Object obj;
        JSONParser jsonParser = new JSONParser();

        try(FileReader reader = new FileReader(fileArrayJSON)) {
            if (file.length() > 2) {
                obj = jsonParser.parse(reader);
                animalsList = (JSONArray) obj;
            } else{
                animalsList = new JSONArray();
            }
            animalsList.add(jsonObj);

            try (FileWriter writer = new FileWriter(fileArrayJSON)){
                writer.write(animalsList.toJSONString());

            } catch (Exception e){
                e.printStackTrace();
            }

        } catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void showAllDogs(int size, Dog[] dogs){

        for(int i = 0; i<size; i++){
            System.out.println((i+1)+") "+dogs[i].getBreed()+" "+ dogs[i].getSize() +" "+ dogs[i].getAge() +" "+ dogs[i].getColor());
            System.out.println((i+1)+") count of days (seconds) sit in nursety:"+dogs[i].sit());

        }
    }

    public static void editDogFields(int count, Dog[] dogs){

        int i = 0;
        System.out.println("Enter number of dog:");
        i = in.nextInt();
        in.nextLine();
        //i++;
        if(i>=0 && i<count){

            System.out.println("OLD data:"+(i+1)+") "+dogs[i].getBreed()+" "+ dogs[i].getSize() +" "+ dogs[i].getAge() +" "+ dogs[i].getColor());
            String breed, size, color;
            int age;

            System.out.println("Enter new size:");
            size = in.nextLine();
            dogs[i].setSize(size);

            try {
                System.out.println("Enter new age:");
                age = in.nextInt();
                if(age < 0){
                    throw new NegativeAgeException(age);
                }
            } catch(InputMismatchException e){
                //e.printStackTrace();
                System.out.println("Error: InputMismatchException occured!");
                age = 0;
            }
            catch (NegativeAgeException e){
                e.printStackTrace();
                System.out.println("Error: arithmetic!");
                age = 0;
            }
            in.nextLine();
            dogs[i].setAge(age);

        }
        else{
            System.out.println("error: number of dog incorrect");
        }

    }

    public static int readJSONFromFile(Dog[] dogs){

        int count = 0;
        File file = new File(fileArrayJSON);
        if(!file.exists() || file.length() < 2){
           return 0;
        }
        JSONArray animalsList;
        Object obj;
        JSONParser jsonParser = new JSONParser();

        try(FileReader reader = new FileReader(fileArrayJSON)) {
            obj = jsonParser.parse(reader);
            animalsList = (JSONArray) obj;
            count = animalsList.size();

            if(count > 10){
                count = 10;
            }

            for (int i = 0; i < count; i++) {
                JSONObject objJSON = (JSONObject) animalsList.get(i);
                dogs[i] = new Dog((String)objJSON.get("breed"), (String)objJSON.get("size"), (int)(long) objJSON.get("age"),(String)objJSON.get("color"),(String)objJSON.get("type") );
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println("Nursery project");
        in = new Scanner(System.in);
        String command;

        Dog[] dogs=new Dog[10];
        int count = 0;
        count = readJSONFromFile(dogs);

        // считываем команды от пользователя: add, list, exit
        while(true) {
            System.out.println("Enter command:");
            command = in.nextLine();
            switch (command){
                case "add":
                    System.out.println("Add new dog");
                    if(count<10) {
                        addNewDog(count, dogs);
                        count++;
                        System.out.println("New dog was added");
                    }
                    else{
                        System.out.println("Nursery is full!");
                    }
                    break;
                case "list":
                    System.out.println("Show all dogs");

                   if(count>0) {
                        showAllDogs(count, dogs);
                    }
                    else{
                        System.out.println("Nursery is empty");
                    }
                    break;
                case "edit":
                    System.out.println("Edit data for some dog");
                    if(count>0) {
                        editDogFields(count, dogs);
                    }
                    else{
                        System.out.println("Nursery is empty");
                    }
                    break;
                case "exit":
                    in.close();
                    return;
                default:
                    System.out.println("Unknown command");
            }
        }

    }
}




