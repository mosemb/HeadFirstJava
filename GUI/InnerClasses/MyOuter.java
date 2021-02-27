public class MyOuter {

   int x; 
   
   public class MyInner{
   
      public void go(){
         // An inner class can use verything of the Outer class as if inculding privates
         x = 45; 
         System.out.print(x);
      
      }
   
   }


}
