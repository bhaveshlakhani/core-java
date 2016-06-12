package generalization;


class Animal
{

	void noise()
	{
		System.out.println("every animal make noise");
	}
	
}

class Cat extends Animal
{

	void noise()
	{
		System.out.println("meow,meow");
	}
}
class Dog extends Animal
{

	void noise()
	{
		System.out.println("bow,bow");
	}
}

class Snack extends Animal
{
	void noise()
	{
		System.out.println("hiss,hiss");
	}
}

class Animalsimulator
{

	void makenoise(Animal arg)
	{
		
		arg.noise();
	}
	
}

public class Generalize
{

	public static void main(String[] args)
	{
		System.out.println("************************");
		
		Animalsimulator a=new Animalsimulator();
		
		a.makenoise(new Cat());
		a.makenoise(new Dog());
		
		System.out.println("************************");
		
	}
	
	
	
}
