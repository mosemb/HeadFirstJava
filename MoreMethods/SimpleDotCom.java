
public class SimpleDotCom {
   
      int [] locationCells; 
      int numOfHits = 0; 
   
   public void setLocations(int [] locationCells){
   
        this.locationCells = locationCells; 
   }
   
   public String checkYourSelf (String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss"; 
        
        for(int cell: locationCells) {
            
            if (guess == cell){
                
                result = "hit";
                numOfHits++; 
                break;
            } }
        
           if(numOfHits==locationCells.length){
       
                    result = "Kill";
                              }
   
            System.out.println(result); 
            return result;
   }
   



}

