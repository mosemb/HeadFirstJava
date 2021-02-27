
public class MusicTestMain {
      
      //public static void main(String[] args)
      public static void main(String[] args){
      
      MusicTest play = new MusicTest(); 
      if (args.length < 2){
         
         System.out.println("Dont for get the 2 required arguments "); 
      } else {
      
         int instrument = Integer.parseInt(args[0]);
         int note = Integer.parseInt(args[1]);
         play.play(instrument,note); 
      }
      
      
      }


}
