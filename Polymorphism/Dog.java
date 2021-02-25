 
 // The impliments in this case is extending the Pet class. 
 // Pretty much is the java way of saying you can inherit from 2 super classes. 
 
 public class Dog extends Canine implements Pet 
 
  {
 
 
     public String makeNoise(String noise){
     
       System.out.println("Woof Woof!");
       
       return noise; }
   
     public boolean eat(){
      boolean eat = true;
      return eat;
   
         } 
         
     public void beFriendly(){
     
         System.out.println("Hey am playing");
     }
     
     
     public void play(){
     
        System.out.println("Hey am pretty good");
     }
   
   }
