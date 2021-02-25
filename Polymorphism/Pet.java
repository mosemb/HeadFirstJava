// This can facilitate multiple inheritance without getting into the deadly diamond of death
// All methods in an interface must be abstract and that means they will be implemented in 
// The sublcasses. 
// When the methods are abstract they much be an class that is either abstract or interface


public interface Pet {


  // All interface methods must be abstract
  public abstract void beFriendly();
  public abstract void play();

    
}


