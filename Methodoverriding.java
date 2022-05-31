package samiksha;
class SuperClass
{
    void methodOfSuperClass()
    {
        System.out.println("From Super Class");
    }
}
 
class SubClass extends SuperClass
{
    void methodOfSuperClass()
    {
    	
        System.out.println("From Sub Class");
    }
}
 
public class MethodOverriding
{
    public static void main(String[] args)
    {
        SuperClass superclass = new SuperClass();
        superclass.methodOfSuperClass();         
        SubClass subclass = new SubClass();
        subclass.methodOfSuperClass();         
    }
}
public class Methodoverriding {

	public static void main(String[] args) {
		
	}

}
