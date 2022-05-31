package samiksha;

public class Inheritance {
	class A
	{
	    int i;
	    void methodOne()
	    {
	        System.out.println("From methodOne");
	    }
	}
	 
	class B extends A
	{
	    int j;
	    void methodTwo()
	    {
	        System.out.println("From methodTwo");
	    }
	}
}
