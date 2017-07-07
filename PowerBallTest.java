//Name: Bradley Hall
//Assignment 4
//3/29/16

import java.util.Scanner;

public class PowerBallTest {
	
	public static void main(String[] args)
	{
		int userChoice = 0;
		int high = 61;
		int low =19;
		int theArraySize = 0;
		int powerBall = 0;
		
		Scanner input = new Scanner(System.in);
		
		PowerBall dailyGame = new PowerBall2();
		
		PowerBall2 doublePowerBall = new PowerBall2();
		
		while (userChoice != 5)
		{
			dailyGame.printMenu();
			userChoice = input.nextInt();
			//dailyGame.setArraySize(userChoice);
		
			while(high > 60)
			{
				System.out.println("Choose a high number below 60:");
				high = input.nextInt();
				if (high > 60)
				{
					System.out.println(high + " is to high. Please choose a number below 60.");
				}
			}
		
			while(low < 20)
			{
				System.out.println("Choose a low number about 20");
				low = input.nextInt();
				if (low < 20 || low > high)
				{
					System.out.println(low + " is too low. Please choose a number above 20.");
				}
			}
			switch(userChoice)
			{
			case 1:
				theArraySize = 3;
				dailyGame.setArraySize(theArraySize);
				System.out.println("You chose to play the daily game.\n");
				dailyGame.computeRandom(high, low, theArraySize);
				dailyGame.printArray(theArraySize);
				break;
			case 2:
				theArraySize = 4;
				dailyGame.setArraySize(theArraySize);
				System.out.println("You chose to play the little lotto.\n");
				dailyGame.computeRandom(high, low, theArraySize);
				dailyGame.printArray(theArraySize);
				break;
			case 3:
				theArraySize = 5;
				dailyGame.setArraySize(theArraySize);
				System.out.println("You chose to play the lotto.\n");
				dailyGame.computeRandom(high, low, theArraySize);
				dailyGame.printArray(theArraySize);
				break;
			case 4:
				theArraySize = 5;
				dailyGame.setArraySize(theArraySize);
				System.out.println("You chose to play the Power Ball.\n");
				dailyGame.computeRandom(high, low, theArraySize);
				dailyGame.printArray(theArraySize);
				System.out.print("The power ball is ");
				dailyGame.powerBall();
				break;
			case 5:
				//System.out.println("Thanks for playing!");
				break;
			case 6:
				theArraySize = 5;
				doublePowerBall.setArraySize(theArraySize);
				System.out.println("You chose to play the Double Power Ball.\n");
				doublePowerBall.computeRandom(high, low, theArraySize);
				doublePowerBall.printArray(theArraySize);
				//System.out.print("The power ball is ");
				doublePowerBall.powerBall();
				doublePowerBall.printPowerBall();
				doublePowerBall.printPowerBall2();
				doublePowerBall.setPowerBall2();
				break;
			}
		}
			System.out.println("Thanks for playing!");
		//
			//dailyGame.printArray(theArraySize);
		input.close();
		
	}

}
