/*initialize Monster Reveal with either constructor or method:

   * - Create Monsters
   * - Create Monster Reveal
   * - Update Monster's Reveal property
   *
   *
   **/

class Laboratory {
  //Fields for Laboratory
  public String name;
  public int powerLevel;
  
  // Parameterized Constructor for MonsterReveal class
  public Laboratory(String name, int powerLevel) {
    this.name = name;
    this.powerLevel = powerLevel;
    //System.out.println("Laboratory Class Parameterized Constructor Called.");
  }

  // Method for Laboratory class
  public void printLaboratoryInfo() {
    System.out.println("I am the: " + this.name + ", and I have a power level of: " +     
    this.powerLevel + " Muahahahahaha!!");
  }

}