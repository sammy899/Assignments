package samiksha;

abstract class Animal {
	
	
	    abstract void soundOfAnimal();  
	}
	 
	class Cat extends Animal
	{
	    void soundOfAnimal()
	    {
	        System.out.println("Meoh");
	        
	    }
	}
	 
	class Dog extends Animal
	{
	    void soundOfAnimal()
	    {
	        System.out.println("Bow Bow");
	        
	    }
	}

