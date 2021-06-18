package interfaceexamples;

public interface TestEx {

    int a = 44;
    
  static void staticMethod()
    {
    	System.out.println("static method of interface");
    }
   
    default void defaultMethod()
    {
    	System.out.println("default method of interface");
	}
    
    void test();     // by default public  ||  incomplete abstract
	void demo();	 // by default public  ||  incomplete abstract
}
