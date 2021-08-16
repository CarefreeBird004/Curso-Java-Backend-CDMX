package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsLowerBoundedTester {

    public static void addCat(List<? super RedCat>catList){
        catList.add(new RedCat());
        System.out.println("Cat Added");
    }

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<Animal>();
        List<Cat> catList = new ArrayList<Cat>();
        List<RedCat> redCatList = new ArrayList<RedCat>();
        List<Dog> dogList = new ArrayList<Dog>();

        //Add list of super class Animal od Cat class
        addCat(animalList);

        //add list of Cat class
        addCat(animalList);

        //compile time error
        //can not add list of subclase RedCat of Cat class
        //addCat(RedCatList);

        //compile time error
        //can not add List of subclase Dog of superclass Animals of Cat class
        //addCat.addMerhod(dogList);

    }

    class Animal {}
    class Cat extends Animal {}
    class RedCat extends Cat {}
    class Dog extends Animal {}
}
