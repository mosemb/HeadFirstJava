
public class Duck{

    private int size; 
    static int duckCount = 0; 
    
    public Duck(){
    
      // Helps count everytime the instance variable is instantiated
      this.duckCount ++;
    
    }
    
    public void setSize(int size){
      this.size = size; 

    }
    
    public int getSize(){
      return this.size;
    }

}
