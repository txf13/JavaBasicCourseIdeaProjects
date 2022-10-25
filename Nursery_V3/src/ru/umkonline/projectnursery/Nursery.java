
package ru.umkonline.projectnursery;

import java.util.Scanner;


public class Nursery {

    public static void addNewDog(int i, Dog[] dogs){
        Scanner in = new Scanner(System.in);
        String breed, size,color;
        int age;
        System.out.println("Enter breed:");
        breed = in.nextLine();
        System.out.println("Enter size:");
        size = in.nextLine();
       System.out.println("Enter color:");
        color = in.nextLine();
        System.out.println("Enter age:");
        age = in.nextInt();
        dogs[i] = new Dog(breed,size, age, color);
    }

    public static void showAllDogs(int size, Dog[] dogs){

        for(int i = 0; i<size; i++){
            System.out.println((i+1)+") "+dogs[i].breed+" "+dogs[i].size+" "+dogs[i].age+" "+dogs[i].color);

        }
    }

    public static void main(String[] args) {

        System.out.println("Nursery project");
        Scanner in = new Scanner(System.in);
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
                    }
                    else{
                        System.out.println("Nursery id full!");
                    }
                    break;
                case "list":
                    System.out.println("Show all dogs");
                    if(count>0) {
                        showAllDogs(count, dogs);
                    }
                    else{
                        System.out.println("Nursery id empty");
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





   /*Dog mastif = new Dog();

        mastif.breed = "Neapolitan Mastiff";
        mastif.size = "large";
        mastif.age = 5;
        mastif.color = "black";

        System.out.println("First dog:"+mastif.breed+", "+mastif.age+", "+mastif.color);

        Dog maltese = new Dog("Maltese", "small", 2, "white");

        System.out.println("Second dog:"+maltese.breed+" "+maltese.age+" "+maltese.color);*/
