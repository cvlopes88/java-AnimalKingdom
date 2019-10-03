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
    @Override
    public String move(){
        return "Swim";
    }
   @Override
    public String reproduce(){
        return "eggs";
    }

    @Override
    public String breath(){
        return "Gills";
    }
}