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
    @Override
    public String move(){
        return "Fly";
    }
    @Override
    public String reproduce(){
        return "eggs";
    }

    @Override
    public String breath(){
        return "Lungs";
    }

}