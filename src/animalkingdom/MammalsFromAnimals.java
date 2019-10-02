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
    public String move(){
        return "Walk";
    }

    public String reproduce(){
        return "Live Births";
    }

    
    public String breath(){
        return "Lungs";
    }
}