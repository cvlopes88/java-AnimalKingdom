package animalkingdom;

public class BirdsFromAnimals extends AbstractAnimals {

    public String name;

    public BirdsFromAnimals(String name, int yearNamed){

        super(name, yearNamed);
       
        this.name = name;
    }
    
    public String eat(){
        return "Grains";
    }

    public String move(){
        return "Fly";
    }

    public String reproduce(){
        return "eggs";
    }

    
    public String breath(){
        return "Lungs";
    }

}