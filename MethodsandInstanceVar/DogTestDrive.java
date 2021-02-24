
public class DogTestDrive {

   public static void main (String []args) {
   
      Dog d = new Dog();
      d.setSize(80);
      //d.size = 80; 
      
      Dog two = new Dog(); 
      two.setSize(14);
      //two.size = 14; 
      
      Dog three = new Dog(); 
      three.setSize(20);
      //three.size = 20; 
      
      d.bark(); 
      two.bark(); 
      three.bark(); 
      
   }
}


