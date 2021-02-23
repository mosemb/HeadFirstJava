
class MovieTestDrive {

   public static void main(String [] args){
   
   Movie one = new Movie(); 
   one.title = "Gone with the wind"; 
   one.rating = 4; 
   one.genre = "Adventure"; 
   one.playit();
   
   Movie two = new Movie(); 
   two.title = "Robocop";
   two.rating = 8; 
   two.genre = "Science Fiction";
   two.playit();
   
   }
}
