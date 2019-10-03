package animalkingdom;

public abstract class AbstractAnimals {
    
static int maxId = 0;
  int id;
  String name;
  int yearNamed;
 
 public AbstractAnimals(String name, int yearNamed){

    this.name = name;
    this.yearNamed = yearNamed;
 }
public int getId(){
   return id;
}
public String getName(){
   return name;
}
public int getYearNamed() {
   return yearNamed;
}
//     @Override
//     public String toString() {
//         return "Name: " + name + " Year Named: " + yearNamed;
//     }
    public abstract String move();

    public abstract String breath();

    public abstract String reproduce();
}