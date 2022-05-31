package samiksha;
class A
{
    int i = 10;
}
 
class B extends A
{
    int j = 20;
}
 
class C extends B
{
    int k = 30;
}
 
class D extends C
{
    int m = 40;
}
public class ExplicitDownCasting {

	public static void main(String[] args) {
		 A a = new A();
	        B b = (B) a;   
	        C c = (C) a;   
	        D d = (D) a;   
	        B b1 = new B();
	        D d1 = (D) b1;   
	        d1 = (D) new C(); 

	}

}
