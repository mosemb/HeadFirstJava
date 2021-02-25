import java.util.*;


public class SimpleDotComTestDrive {

    public static void main(String []args){
       
    
       GameHelper helper = new GameHelper();
    
       SimpleDotCom game = new SimpleDotCom();
       int random = (int) Math.random()*5; 
       int numGuesses = 0;
       
       int [] locations = {random,random+1,random+2}; 
       
       game.setLocations(locations);
       //String userGuess = "8";
       
       
       boolean isAlive = true;
       
       while(isAlive == true){
       
          String guess = helper.getUserInput("Enter a number!"); 
          String result = game.checkYourSelf(guess);
          numGuesses++;
          
          if(result.equals("Kill")){
          
             isAlive = false;
             System.out.println("You took "+numGuesses+ " Guesses!");
          
          }
          
       
       }
       
       
    }

   
}
