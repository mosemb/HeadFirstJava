// In this case we are imlimenting the Pet interface, but we can implement as many interfaces 
//as possible e.g ( public class RobotDog extends Robot impliments Pet, Savable, Paintable {};

public class RobotDog extends Robot implements Pet {

 
    
      public void beFriendly(){
     
         System.out.println("Hey am playing");
     }
     
      public void play(){
     
        System.out.println("Hey am pretty good");
     }

     

   

}

