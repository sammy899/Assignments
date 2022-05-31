package samiksha;
class AnyClass
{
    int i;
 
    AnyClass()
    {
        System.out.println("First Constructor");
    }
 
    AnyClass(int j)
    {
        this();    
        System.out.println("Second Constructor");
    }
 
    void methodOne()
    {
        System.out.println("From method one");
    }
 
    void methodTwo()
    {
        System.out.println(this.i);  
        this.methodOne();      
    }
}



