
public class Dog {

    String name;

    public static void main (String []args ){
       
       Dog d = new Dog();
       d.name = "Fred"; 
       d.bark();
       
       // An array of dogs 
       Dog[] dogs = new Dog[3]; // A type of Dogs
       dogs[0] = new Dog();
       dogs[1] = new Dog(); 
       dogs[2] = d;
       
       dogs[0].name = "Bart"; 
       dogs[1].name = "Josep";
       
       //System.out.println("The last dog name is "+dogs[2].name);
       
       int x = 0; 
       while(x<dogs.length){
         
         dogs[x].bark();
         x = x+1; 
         
       }
                
    }
    
    public void bark (){
    
      System.out.println(name+" Says Ruff Ruff Ruff!"); 
    }
}
