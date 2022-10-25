
package ru.umkonline.projectnursery;

public class Nursery {

    public static void main(String[] args) {

        System.out.println("Nursery project");

        Dog mastif = new Dog();

        mastif.breed = "Neapolitan Mastiff";
        mastif.size = "large";
        mastif.age = 5;
        mastif.color = "black";

        System.out.println("First dog:"+mastif.breed+", "+mastif.age+", "+mastif.color);

        Dog maltese = new Dog("Maltese", "small", 2, "white");

        System.out.println("Second dog:"+maltese.breed+" "+maltese.age+" "+maltese.color);

    }

}
