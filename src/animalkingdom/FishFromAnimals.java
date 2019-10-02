package animalkingdom;

public class FishFromAnimals extends AbstractAnimals {

    public String name;

    public FishFromAnimals(String name, int yearNamed){

        super(name, yearNamed);
        this.name = name;
    }

    public String eat(){
        return "smaller fish";
    }
    public String move(){
        return "Swim";
    }

    public String reproduce(){
        return "eggs";
    }

    
    public String breath(){
        return "Gills";
    }
}