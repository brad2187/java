//import java.util.Scanner;

public class PowerBall {
	
	private int minNumber;
	private int maxNumber;
	private int[] arrayList;
	private int[] arrayList2;
	private int powerBall;
	private int arraySize;
	
	public int getMin()
	{
		return minNumber;
	}
	
	public int getMax()
	{
		return maxNumber;
	}
	
	public void setMin(int aNumber)
	{
		minNumber = aNumber;
	}
	
	public void setMax(int aNumber)
	{
		maxNumber = aNumber;
	}
	
	public void printMenu()
	{
		System.out.println("---Welcome to the Lottery!!---\n\nPlease choose an option(1-5)\n"
				+ "1. Daily Game\n2. Little Lotto\n3. Lotto\n4. Power Ball\n5. Quit\n6. Double Power Ball\n");
	}
	
	public void computeRandom(int high, int low, int gameType)
	{
		boolean existsDuplicate = true;
		arrayList2 = new int[gameType];
		
		do {
		arrayList = new int[gameType];
		for (int i = 0; i < gameType; i++)
		{
		int result;
		result = low + (int)(Math.random() * (high - low +1));
		arrayList[i] = result;
		arrayList2[i] = result;
		
		for (int j = 0; j < gameType; j++)
		{
			for (int b = 0; b < gameType; b++)
			{
				if (arrayList[j] == arrayList2[b])
				{
					arrayList[j] = low + (int)(Math.random() * (high - low +1));
					j = 0;
					b = 0;
				}
			}
		}
		existsDuplicate = false;
		
		}
		}while(existsDuplicate == true);
		
	}
	
	public void printArray(int gameType)
	{
		System.out.println("The random numbers are ");
		
		//for(int i = 0; i < gameType; i++ )
		for(int a : arrayList)
		{
			System.out.print(a + ", ");
		}
		System.out.println("\n");
	}
	
	public void powerBall()
	{
		int result;
		result = 0 + (int)(Math.random() * (40 - 0 +1));
		powerBall = result;
		//System.out.print(powerBall);
		//System.out.println("\n");
	}

	public void setArraySize(int theUserChoice)
	{
		arraySize = theUserChoice;
	}
	
	public void printPowerBall()
	{
		System.out.print("Power ball is ");
		System.out.print(powerBall);
		System.out.println("\n");
	}
	
	
	
	
	
	
}
