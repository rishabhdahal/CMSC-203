/*
 * Class: CMSC203 CRN 47501
 * Instructor: Professor Dr. Grigoriy Grinberg
 * Description: Build an application that will step through some possible problems to restore internet connectivity.  Assume that your computer uses wi-fi to connect to a router which connects to an Internet Service Provider (ISP) which connects to the Internet.
 * Due: 06/19/2022
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Rishabh Dahal 
*/

// import scanner to read the user inputs
import java.util.Scanner;

// declare the class 
public class WiFiDiagnosis 
{
	// declaration of main function
	public static void main(String[] args) 
	{
		// declare Scanner object to read input from user
		Scanner input = new Scanner(System.in);
		
		// declaration of variables
		String userInput1, userInput2;
		String userInput3, userInput4;
		// output displayed to the user
		System.out.println("WiFi Diagnosis\n");
		System.out.println("**********************\n");
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		
		// First step
		System.out.println("First step: reboot your computer");
		System.out.println("Are you able to connect with the internet? (yes or no)");
		
		// String Variable for input of user
		userInput1 = input.nextLine();
		if(userInput1.equals("yes"))
			{
			System.out.print("Rebooting your computer seemed to work");
			// Stop the program
			System.exit(0); 
			}
		
		// Second step
		else
			{
			System.out.println("Second step: reboot your router");
			System.out.println("Now are you able to connect with the internet? (yes or no)");
			
			// String Variable for input of user			
			userInput2 = input.nextLine();
			if(userInput2.equals("yes"))
				{
				System.out.println("Rebooting your router seems to work");
				// Stop the program
				System.exit(0); 
				}
			
			// Third step
			else
				{
				System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");
				System.out.println("Now are you able to connect with the internet? (yes or no)");
				
				// String Variable for input of user			
				userInput3 = input.nextLine();
				if(userInput3.equals("yes"))
					{
					System.out.println("Fixing your cables into the routher seemed to work");
					// Stop the program
					System.exit(0);
					}
				
				// Fourth step
				else
					{
					System.out.println("Fourth step: move your computer closer to your router");
					System.out.println("Now are you able to connect with the internet? (yes or no)");
					
					// String Variable for input of user			
					userInput4 = input.nextLine();
					if(userInput4.equals("yes"))
						{
						System.out.println("Moving your computer closer to the router seemed to work");
						// Stop the program
						System.exit(0);
						}
					
					// Fifth step
					else
						{
						System.out.println("Fifth step: contact your ISP");
						System.out.println("Make sure your ISP is hooked up to your router.");
						}
					}
				}
			}
		}
	}
