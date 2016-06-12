package MethodOverloading;

public class Varmethod
{

	
	
		void add(int...args)
		{
			
			
			int sum=0;
			
			for(int i=0;i<args.length;i++)
			{
				sum=sum+args[i];
			}
			
			System.out.println(sum);
		}
		
		
		
		void add(int a)
		{
			System.out.println("runnning int arg");
		}
		
		
		
		void add(int a,int b)
		{
			System.out.println("multi arg method");
		}
		
		
		
		public static void main(String[] args)
		{
		
		
			Varmethod v=new Varmethod();
		     
			v.add(5);
			v.add(5,7);
			v.add(2,2,3,4);
		
			
			
	    }
	
	
	
}
