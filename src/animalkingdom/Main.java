package animalkingdom;

import java.util.*;

import java.util.ArrayList;
import java.util.Comparator;

import animalkingdom.AbstractAnimals;
import animalkingdom.Animals;
import animalkingdom.BirdsFromAnimals;
import animalkingdom.FishFromAnimals;

import animalkingdom.MammalsFromAnimals;

public class Main {
    public static ArrayList<AbstractAnimals> filteredList = new ArrayList<AbstractAnimals>();


    
    public static void filter(ArrayList<AbstractAnimals> list, TestAnimal tester) {
        filteredList.clear();
        for (AbstractAnimals a : list) {
            if (tester.test(a)) {
                filteredList.add(a);
            }
        }
    }
    public static void main(String[] args){
        
        System.out.println("*** Start ***");



        MammalsFromAnimals panda = new MammalsFromAnimals("Panda", 1869);
        MammalsFromAnimals zebra = new MammalsFromAnimals("Zebra", 1778);
        MammalsFromAnimals koala = new MammalsFromAnimals("Koala", 1816);
        MammalsFromAnimals sloth = new MammalsFromAnimals("Sloth", 1804);
        MammalsFromAnimals armadillo = new MammalsFromAnimals("Armadillo", 1758);
        MammalsFromAnimals racoon = new MammalsFromAnimals("Racoon", 1758);
        MammalsFromAnimals bigfoot = new MammalsFromAnimals("Bigfoot", 2021);
        System.out.println(panda.getYearNamed());
        
        

        System.out.println();


        System.out.println("*** Abstract Class ***");
        
        BirdsFromAnimals pigeon = new BirdsFromAnimals("Pigeon", 1837);
        BirdsFromAnimals peacock = new BirdsFromAnimals("Peacock", 1821);
        BirdsFromAnimals toucan = new BirdsFromAnimals("Toucan", 1758);
        BirdsFromAnimals parrot = new BirdsFromAnimals("Parrot", 1824);
        BirdsFromAnimals swan = new BirdsFromAnimals("Swan", 1758);
        System.out.println( "this bird loves to eat " +  pigeon.eat());
        
        System.out.println();

        FishFromAnimals salmon = new FishFromAnimals("Salmon", 1758);
        FishFromAnimals catfish = new FishFromAnimals("Catfish", 1817);
        FishFromAnimals perch = new FishFromAnimals("Perch", 1758);

        System.out.println("this fish likes to eat " + salmon.eat());




        ArrayList<AbstractAnimals> myList = new ArrayList<AbstractAnimals>();
         myList.add(panda);
         myList.add(zebra);
         myList.add(koala);
         myList.add(sloth);
         myList.add(armadillo);
         myList.add(racoon);
         myList.add(bigfoot);
         myList.add(pigeon);
         myList.add(peacock);
         myList.add(toucan);
         myList.add(parrot);
         myList.add(swan);
         myList.add(salmon);
         myList.add(catfish);
         myList.add(perch);


        System.out.println("\n***Animals By Descending Year***");
        myList.sort((i1, i2) -> i2.getYearNamed() - i1.getYearNamed());
        myList.forEach(animal -> System.out.println(animal.getName() + " " + animal.getYearNamed()));
     
        System.out.println();



        
        System.out.println("\n*** Alphabetically***");
        myList.sort((i1, i2) -> i1.getName().compareToIgnoreCase(i2.getName()));
        myList.forEach(animal -> System.out.println(animal.getName()));


        System.out.println();

        System.out.println("\n*** By how They Move ***");
        myList.sort((i1, i2) -> i1.move().compareToIgnoreCase(i2.move()));
        myList.forEach(animal -> System.out.println(animal.getName() + " " + animal.move()));


        System.out.println();


        System.out.println("\n*** That Breathes With Lungs ***");
        filter(myList, animal -> animal.breath().equalsIgnoreCase("lungs"));
        filteredList.forEach(animal -> System.out.println(animal.getName() + " breathes by " + animal.breath()));


        System.out.println();

     
        System.out.println("\n*** Breathe With Lungs and Were Named in 1758 ***");
        filter(myList, animal -> animal.breath().equalsIgnoreCase("lungs") && animal.getYearNamed() == 1758);
        filteredList.forEach(animal -> System.out
                .println(animal.getName() + " breathes by " + animal.breath() + " and was named in " + animal.getYearNamed()));
       

                System.out.println();

                System.out.println("\n*** Breathe With Lungs and Lay Eggs ***");
        filter(myList,
                animal -> animal.breath().equalsIgnoreCase("lungs") && animal.reproduce().equalsIgnoreCase("eggs"));
        filteredList.forEach(animal -> System.out
                .println(animal.getName() + " breathes by " + animal.breath() + " and reproduces by " + animal.reproduce()));
              

                System.out.println();

                System.out.println("\n*** Named in 1758 Sorted Alphabetically ***");
                filter(myList, animal -> animal.getYearNamed() == 1758);
                filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
                filteredList.forEach(animal -> System.out.println(animal.getName() + " was named in " + animal.getYearNamed()));
        

    }
}