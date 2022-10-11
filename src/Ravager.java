// The use of the 'extends' keyword in the class declaration establishes that Ravager is a child of the class Laboratory and it implements Haunter
public class Ravager extends Laboratory implements Haunter {
  public String capability4;

  // Parameterized Constructor for the Ravager Class
  public Ravager(String name, String capability4, int powerLevel) {
    super(name, powerLevel);
    this.capability4 = capability4;
    //System.out.println("Ravager Class Parameterized Constructor Called.");
  }
  
  @Override
  public void haunt() {
    System.out.println("Zombies were once humans who were rizen from their rest. ");
    System.out.println("They can be found on graveyards or eating your fiendly local neighbors face.\n ");
  }
  
  @Override
  public void kill(){
    System.out.println("Warning, do no ask any questions about their head as they are quite"); 
    System.out.println("sensitive about the subject. ");
    System.out.println("Doing so may result in your head being spontaneously sliced off!\n ");
  }
  
    @Override
  public void printLaboratoryInfo() {
    super.printLaboratoryInfo();
    System.out.println("My Monster Type is: " + this.capability4 + ", Where are you looking at? My head is down here,"); 
    System.out.println("in my hand! Do you want your head misplaced? 'HMMMMMM'!\n");
  }
}