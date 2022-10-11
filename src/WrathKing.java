// The use of the 'extends' keyword in the class declaration establishes that WrathKing is a child of the class Laboratory and it implements Haunter
public class WrathKing extends Laboratory implements Haunter{
  public String capability5;

  // Parameterized Constructor for the WrathKing Class
  public WrathKing(String name, String capability5, int powerLevel) {
    super(name, powerLevel);
    this.capability5 = capability5;
    //System.out.println("Ravager Class Parameterized Constructor Called.");
  }
    @Override
  public void haunt() {
    System.out.println("Unknown Monster Subject. ");
    System.out.println("Classified as Apollyon\n ");
  }

   @Override
  public void kill() {
    System.out.println("Warning!! Will take human lives on if too close.\n ");
  }
  
    @Override
  public void printLaboratoryInfo() {
    super.printLaboratoryInfo();
    System.out.println("My Monster Type is: " + this.capability5 + ", Who dares to enter my domain?" + "\nFool, you shouldn't have come here. Now you will face the consequences!!" + "\n'Sinister laugh'");
  }
}