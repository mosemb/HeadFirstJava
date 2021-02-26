// You can have more than one constructor in a class, so long as the arguments are different. 

public class Dog extends Animal {

    int size; 
    String name; 

    public Dog(int size){
    
    // Setting the defualt size for the dog. 
    
     this.size = size;
    
     System.out.println("I am the Dog Constructor! With Size:"+this.size);
    
    }
    
    public Dog(){
            super();
            this.size = 27; 
            System.out.println("I am the Dog Constructor! With Default Size:"+this.size);
            
    
    }
    
    public Dog(String name){
          
         this.name = name; 
         //super(); 
    
    }
         }
