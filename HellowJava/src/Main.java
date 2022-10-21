


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.util.Scanner;

public class Main  {

    public static Scanner in;
    public static final String fileJSONData = "arrayAnimals.json";

    public static void addNewDog(int i, Dog[] dogs){
        // in = new Scanner(System.in);
       JSONObject jsonObj = new JSONObject();
        String breed, size,color;
        int age;
        System.out.println("Enter breed:");
        breed = in.nextLine();
        System.out.println("Enter size:");
        size = in.nextLine();

        System.out.println("Enter age:");
        age = in.nextInt();
        in.nextLine();

        System.out.println("Enter color:");
        color = in.nextLine();
        dogs[i] = new Dog(breed,size, age, color, "Dog");

        jsonObj.put("type", "dog");
        jsonObj.put("breed", breed);
        jsonObj.put("size", size);
        jsonObj.put("size", size);
        jsonObj.put("age", age);
        jsonObj.put("color", color);
        //Add employees to list


        try(FileReader reader = new FileReader(fileJSONData)){

            File file = new File(fileJSONData);


            JSONParser jsonParser = new JSONParser();

            Object obj ;
            JSONArray employeeList;
            if ( file.length()>4) {
                obj = jsonParser.parse(reader);
                employeeList = (JSONArray) obj;
            }
            else{
                employeeList = new JSONArray();
            }
            employeeList.add(jsonObj);

            try (FileWriter writer = new FileWriter(fileJSONData)) {
                writer.write(employeeList.toJSONString());
            } catch (Exception e){
                e.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void showAllDogs(int size, Dog[] dogs){

        size = 2;
        for(int i = 0; i<size; i++){
           // System.out.println((i+1)+") "+dogs[i].getBreed()+" "+ dogs[i].getSize() +" "+ dogs[i].getAge() +" "+ dogs[i].getColor());
           // System.out.println((i+1)+") count of days (seconds) sit in nursety:"+dogs[i].sit());
            JSONParser jsonParser = new JSONParser();

            try (FileReader reader = new FileReader(fileJSONData))
            {
                //Read JSON file
                Object obj = jsonParser.parse(reader);

                JSONArray employeeList = (JSONArray) obj;
                System.out.println(employeeList);

                //Iterate over employee array
                //employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public static void editDogFields(int count, Dog[] dogs){

        int i = 0;
        System.out.println("Enter number of dog:");
        i = in.nextInt();
        in.nextLine();
        i++;
        if(i>=1 && i<=count){

            System.out.println("OLD data:"+(i+1)+") "+dogs[i].getBreed()+" "+ dogs[i].getSize() +" "+ dogs[i].getAge() +" "+ dogs[i].getColor());
            String breed, size, color;
            int age;

            System.out.println("Enter new size:");
            size = in.nextLine();
            dogs[i].setSize(size);

            System.out.println("Enter new age:");
            age = in.nextInt();
            in.nextLine();
            dogs[i].setAge(age);

        }
        else{
            System.out.println("error: number of dog incorrect");
        }

    }

    public static void main(String[] args) {

        System.out.println("Nursery project");

        in = new Scanner(System.in);
        String command;

        Dog[] dogs=new Dog[10];
        int count = 0;
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
                    showAllDogs(count, dogs);
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




