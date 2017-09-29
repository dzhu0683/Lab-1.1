// Darren Zhu Lab 1.1
public class ControlStructures
{
	public static void main(String [] args)
	{
		primeprinter();
		foobarbaz();
		System.out.println("We're done, yay!");
	}
	public static void primeprinter()
	{
		int numfac = 0;
		for(int a = 2; a < 230; a++)
		{
			int factor = 1;
			for(int b = 2; b < a; b++)
			{
				if (a % b == 0)
				{
					factor = 0;
				}
			}
			
			if (factor == 1)
			{
				numfac += factor;
				System.out.print(a + " ");
				if(numfac % 10 == 0)
				{
					System.out.println("");
				}
			}
		}
		System.out.println();
	}
	public static void foobarbaz()
	{
		for(int x = 1; x <= 500; x++)
		{
			if(x % 3 == 0 && x % 7 == 0)
			{
				System.out.print("fooBar ");
			}
			else if(x % 3 == 0 && x % 10 == 0)
			{
				System.out.print("fooBaz ");
			}
			else if(x % 7 == 0 && x % 10 == 0)
			{
				System.out.print("BarBaz ");
			}
			else if(x % 3 == 0 && x % 7 == 0 && x % 10 == 0)
			{
				System.out.print("fooBarBaz ");
			}
			else if (x % 3 == 0)
			{
				System.out.print("foo ");
			}
			else if(x % 7 == 0)
			{
				System.out.print("Bar ");
			}
			else if(x % 10 == 0)
			{
				System.out.print("Baz ");
			}
			else
			{
				System.out.print(x + " ");
			}
		}
		System.out.println();
	}
}
