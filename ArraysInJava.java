package samiksha;
class A
{
    int i;
 
    void methodOne()
    {
        System.out.println("From Class A");
    }
}
 
class B extends A
{
    @Override
    void methodOne()
    {
        System.out.println("From Class B");
    }
}
 
public class ArraysInJava
{
    public static void main(String[] args)
    {
        A[] arrayOfSuperClassReferences = new A[5];   
 
        for (int i = 0; i < arrayOfSuperClassReferences.length; i++)
        {
            arrayOfSuperClassReferences[i] = new B();     
 
            arrayOfSuperClassReferences[i].methodOne();   
        }
    }
}