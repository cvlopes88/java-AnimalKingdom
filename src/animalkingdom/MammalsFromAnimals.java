package animalkingdom;

public class MammalsFromAnimals extends AbstractAnimals {

    public String name;

    public MammalsFromAnimals(String name, int yearNamed){

        super(name, yearNamed);
        this.name = name;
    }

    public String eat(){
        return "everything lol";
    }
   @Override
    public String move(){
        return "Walk";
    }
    @Override
    public String reproduce(){
        return "Live Births";
    }

    @Override
    public String breath(){
        return "Lungs";
    }
}