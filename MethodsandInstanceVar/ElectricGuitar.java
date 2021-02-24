
class ElectricGuitar {
   
   String brand; 
   int numOfPickups; 
   boolean rockStarUsesIt;
   
   void setBrand(String aBrand){
     this.brand = aBrand; 
   }
   
    void setNumOfPickUps(int num){
   this.numOfPickups = num;
   }
   
   
   int getNumOfPicks(){
       return this.numOfPickups; 
   }
   
  
   
   void setRockStarUsesIt(boolean yesOrNo){
       this.rockStarUsesIt = yesOrNo;
      
   }
   
   boolean getRockStarUsesIt(){
     return rockStarUsesIt;
   
   }
}
