import java.util.*;
import java.io.*;


public class DotCom {


    private ArrayList<String> locationCells; 
    
    public void setLocations(ArrayList<String> locationCells){
    
        this.locationCells = locationCells; 
        
    }
    
    public String checkYourSelf(String userInput){
    
         String result = "miss"; 
         
         int index = locationCells.indexOf(userInput); 
         if(index>=0){
         
             locationCells.remove(index); 
             
             if(locationCells.isEmpty()){
                 
                 result = "kill"; 
             }else{
             
               result = "hit";
             
             }
         
         }
         
           return result; 
          
    }

}

