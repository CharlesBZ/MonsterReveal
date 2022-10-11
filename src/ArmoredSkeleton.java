// The use of the 'extends' keyword in the class declaration establishes that ArmoredSkeleton is a child of the class Laboratory and it implements Walker
public class ArmoredSkeleton extends Laboratory implements Walker {
  public String capability;

  // Parameterized Constructor for the ArmoredSkeleton Class
  public ArmoredSkeleton(String name, String capability, int powerLevel) {
    super(name, powerLevel);
    this.capability = capability;
    //System.out.println("ArmoredSkeleton Class Parameterized Constructor Called.");
  }

  @Override
  public void walk() {
    System.out.println("Armored Skeletons are ancient humans who were long ago put to sleep.");
    System.out.println("They can be found on abandomed tombs and carry old century weapons. ");
    System.out.println("Be warned not to wake one up!!\n ");
  }
    @Override
  public void printLaboratoryInfo() {
    super.printLaboratoryInfo();
    System.out.println("My Monster Type is: " + this.capability + ", My armored is so strong that it can deflect the strongests of weapons, even enchanted Swords!! 'RAAAAAH'!\n ");
  }
    
   void sound(){
   System.out.println("Skeleton noise: 'Rustle' 'Rustle'\n ");
 }
  
}