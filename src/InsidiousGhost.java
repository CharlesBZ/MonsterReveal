// The use of the 'extends' keyword in the class declaration establishes that InsidiousGhost is a child of the class Laboratory and it implements Haunter
public class InsidiousGhost extends Laboratory implements Haunter {
  public String capability2;

  // Parameterized Constructor for the InsidiousGhost Class
  public InsidiousGhost(String name, String capability2, int powerLevel) {
    super(name, powerLevel);
    this.capability2 = capability2;
    //System.out.println("InsidiousGhost Class Parameterized Constructor Called.");
  }
  @Override
  public void haunt() {
    System.out.println("Insidious Ghosts are a spirit that you don't want on your homes. ");
    System.out.println("Most of them appear from curses or previous dead house owners.\n ");
  }
    @Override
  public void kill(){
    System.out.println("If you find yourself with one in your home, consult your local priest!!\n ");
  }
    @Override
  public void printLaboratoryInfo() {
    super.printLaboratoryInfo();
    System.out.println("My Monster Type is: " + this.capability2 + ", I can go through walls and haunt living people's home 'oOoOoOoOooOo'.\n");
  }
}