// You can have more than one constructor in a class, so long as the arguments are different. 

public class Dog {

    int size; 

    public Dog(int size){
    
    // Setting the defualt size for the dog. 
    
     this.size = size;
    
     System.out.println("I am the Dog Constructor! With Size:"+this.size);
    
    }
    
    public Dog(){
    
            this.size = 27; 
            System.out.println("I am the Dog Constructor! With Default Size:"+this.size);
    
    }
         }
