package samiksha;


	class A
	{
	     A()
	     {
	        // First Constructor
	     }
	 
	     A(int i)
	     {
	        // Second Constructor
	     }
	 
	    A(int i, int j)
	    {
	       // Third Constructor
	    }
	}
	class MainClass
	{
	     public static void main(String[] args)
	     {
	          A a1 = new A();      
	          A a2 = new A(10);    
	          A a3 = new A(10, 20);   
	     }
	}
