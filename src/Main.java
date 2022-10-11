import java.util.Scanner;
import java.util.ArrayList;

//import java.util.*;

class Main {
  public static void main(String[] args) {
    
    // Create a Scanner Object
  Scanner input = new Scanner(System.in);

    //Create Welcome message for user
    System.out.println(
      "*******  ************************  *******\n" +
      "******** ***********************  ********\n" + 
      "**********    Monster Reveal    **********\n" +
      "******** ***********************  ********\n" +
      "******  *************************  *******\n");

    //Create loop until user leaves the Monster Reveal or quits out
    boolean running = true;
    while(running) {

      //Give user choices of what Monster Reveals are available to see or if they want to leave
     System.out.println("\n Hello! Welcome to our Monsters Reveal! Please select the Reveal\n that you want to see:\n"
                    + "1) Monster Reveal 1\n"
                    + "2) Monster Reveal 2\n"
                    + "3) Monster Reveal 3\n"
                    + "4) Leave the Reveal\n");
     
    int choice = input.nextInt();
    if (choice == 4) {
        break;
    }

    //Generics String
      ArrayList<String> monsterReveal = new ArrayList<String>();
      
      // You can create a string with a name then add it to the arraylist.
      monsterReveal.add(new String("Here are the Monsters that we will be revealing today!!"));
      
      String monster1 = "The Armored Skeleton!!";
      monsterReveal.add(monster1);
      
      String monster2 = "The Insidious Ghost!!";
      monsterReveal.add(monster2);

      String monster3 = "The Poison Zombie!!";
      monsterReveal.add(monster3);
      
      String monster4 = "The Ravager!!";
      monsterReveal.add(monster4);

      String monster5 = "The Wrath King!!";
      monsterReveal.add(monster5);

      for (int i = 0; i < monsterReveal.size(); i++) {
        System.out.println(monsterReveal.get(i));
      }
      
      //Give user choices of what monsters are available to see or if they want to leave
     System.out.println("\nPlease select the monster that you want to see:\n"
                    + "1) Armored Skeleton\n"
                    + "2) Insidious Ghost\n"
                    + "3) Poison Zombie\n"
                    + "4) Ravager\n"
                    + "5) Wrath King\n"
                    + "6) And any other number to exit!\n"
                    + "7) Don't pick number 7 twice, it will reset the monster selection\n");
      
      
      if (choice == 7){
       Number7Catcher.catchIt(7);
       Number7Catcher.use(1,0);
       System.out.println("Made it to the end!");
      }

      //Get user's monster choice
     choice = input.nextInt();
      
      //Perform action based on users monsters choice
     switch(choice) {
     case 1: System.out.println("An Armored Skeleton appears!");
     ArmoredSkeleton armoredSkeleton = new ArmoredSkeleton("Armored Skeleton", "Skeleton", 105);
        armoredSkeleton.walk();
        armoredSkeleton.sound();
        armoredSkeleton.printLaboratoryInfo();
             break;
        
     case 2: System.out.println("An Insidious Ghost materializes out of nowhere!");
     InsidiousGhost insidiousGhost = new InsidiousGhost("Insidious Ghost", "Spirit", 230);
       insidiousGhost.haunt();
       insidiousGhost.kill();
       insidiousGhost.printLaboratoryInfo();
             break;
        
     case 3: System.out.println("A Poisonous Zombie walks slowly!");
     PoisonZombie poisonZombie = new PoisonZombie("Poison Zombie", "Undead", 55);
       poisonZombie.walk();
       poisonZombie.printLaboratoryInfo();  
             break;
        
     case 4: System.out.println("A Ravager moves around very fast aggresively!");
     Ravager ravager = new Ravager("Ravager", "Demon", 2000);
       ravager.haunt();
       ravager.kill();
       ravager.printLaboratoryInfo();  
             break;
        
     case 5: System.out.println("The Wrath King stares at you menacingly!");
     WrathKing wrathKing = new WrathKing("Wrath King", "Unidentified", 9000);
       wrathKing.haunt();
       wrathKing.kill();
       wrathKing.printLaboratoryInfo();  
             break;
  
     default: System.out.println("Thanks for visiting, Have a good one!");
             break;
     }
      //end loop
    }  
    
    System.out.println("\nThanks for visiting, Have a good one!");
      input.close();
    
  }  
}