package lab1;

import java.util.Random;

public class lab1
{

	public static void main(String[] args)
	{
		Random random = new Random();
		
		for(int x=0; x<1000; x++)
		{
			int first = random.nextInt(4);
			int second = random.nextInt(4);
			int third = random.nextInt(4);
			
			
			
			System.out.println(first+second+third);
		}
			
	}
	public void changing()
	{
		
	}

}

