
public class MyOuterMain {

    public static void main(String []args){

    MyOuter outer = new MyOuter(); 
    MyOuter.MyInner inner = outer.new MyInner(); 
    inner.go();
    
    
    
    }


}
