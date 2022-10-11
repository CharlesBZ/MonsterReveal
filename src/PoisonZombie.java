// The use of the 'extends' keyword in the class declaration establishes that PoisonZombie is a child of the class Laboratory and it implements Walker
public class PoisonZombie extends Laboratory implements Walker{
  public String capability3;

  // Parameterized Constructor for the InsidiousGhost Class
  public PoisonZombie(String name, String capability3, int powerLevel) {
    super(name, powerLevel);
    this.capability3 = capability3;
    //System.out.println("PoisonZombie Class Parameterized Constructor Called.");
  }

  @Override
  public void walk() {
    System.out.println("Zombies were once humans who were rizen from their rest. ");
    System.out.println("They can be found on graveyards or eating your fiendly local neighbors face. ");
    System.out.println("If you get bitten by one try to stay away from people or");
    System.out.println("keep yourself lock since there isn't a cure yet for the Zombierona Virus\n ");
  }
    @Override
  public void printLaboratoryInfo() {
    super.printLaboratoryInfo();
    System.out.println("My Monster Type is: " + this.capability3 + ", I may not be the strongests of monsters,"); 
    System.out.println("but my precense alone can get anyone sick within a 10 meter radious!");
    System.out.println("'Hehehehehe'.\n");
  }
}