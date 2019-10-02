package animalkingdom;


import java.util.ArrayList;
import java.util.Comparator;

import animalkingdom.BirdsFromAnimals;
import animalkingdom.FishFromAnimals;
import animalkingdom.Mammals;

public class Main {


    public static void main(String[] args){

        System.out.println("*** Start ***");



        Mammals panda = new Mammals("Panda", 1869);
        Mammals zebra = new Mammals("Zebra", 1778);
        Mammals koala = new Mammals("Koala", 1816);
        Mammals sloth = new Mammals("Sloth", 1804);
        Mammals armadillo = new Mammals("Armadillo", 1758);
        Mammals raccoon = new Mammals("Racoon", 1758);
        Mammals bigfoot = new Mammals("Bigfoot", 2021);
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


     













    }
}