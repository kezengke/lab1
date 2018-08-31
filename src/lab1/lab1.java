package lab1;

import java.util.Random;

public class lab1
{

	public static void main(String[] args)
	{
		Random random = new Random();
		System.out.println("(1)");
		float count = 0;
		for(int x=0; x<1000; x++)
		{
			int first = random.nextInt(4);
			int second = random.nextInt(4);
			int third = random.nextInt(4);
			
			if(first ==second && first == third)
			{
				++count;
			}
						
			System.out.println(changing(first)+
					changing(second)+changing(third));
			
		}
		
		System.out.println("Expected seeing 'AAA:'");
		System.out.println(0.25*0.25*0.25);
		System.out.println("Actually seeing 'AAA:'");
		System.out.println(count/1000.0);
		
		
		
	}
	
	public static String changing(int a)
	{
		String b;
		
		if(a==0)
		{
			b = "A";
		}
		else if(a==1)
		{
			b = "C";
		}
		else if(a==2)
		{
			b = "G";
		}
		else
		{
			b = "T";
		}
		return b;
	}

}

