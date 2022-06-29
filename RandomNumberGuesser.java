import java.util.Scanner;

// Creating the class RandomNumberGueser
public class RandomNumberGuesser 
{
	public static void main(String[] args) 
	{  
		// Print header
		System.out.println("NUMBER GUESSER:");
		RNG.scan = new Scanner(System.in);
		int nextGuess; 
		// Generating random number using random number generated from RNG.java
		int randNum = RNG.rand(); 
		// Initializing the lowGuess and highGuess variables
		int lowGuess = 0, highGuess = 100; 
		// Declare validate boolean variable
		boolean validate;
		char ch= 'y';
		// Reset count to 0
		RNG.resetCount();  
		// Initializing a for loop for continuous running of the function
		while(ch == 'y')
		{
			System.out.println("Enter your guess between "+ lowGuess + " and "+ highGuess);
			// Take user input
			nextGuess = RNG.scan.nextInt(); 
			// Validate user input
			validate = RNG.inputValidation(nextGuess, lowGuess, highGuess);
			if (validate == true)
			{
				// If the guess exactly matches the random number
				if(nextGuess == randNum)  
				{
					System.out.println("Number of guesses is " +RNG.count);
					System.out.println("Congratulations, you guessed correctly");
					// Reset lowGuess and highGuess
					lowGuess = 0; highGuess = 100; 
					// Generate a new random number
					randNum = RNG.rand(); 
					System.out.println("Try again? (yes or no)");
					ch = RNG.scan.next().charAt(0);
				}
				else
				{
					// If the guess does not match the random number
					if(randNum < nextGuess)
					{
						System.out.println("Number of guesses is " +RNG.count);
						System.out.println("Your guess is too high");
						// Change the values of highGuess according to the guess number
						highGuess = nextGuess;
					}
					else 
					{
						System.out.println("Number of guesses is " +RNG.count);
						System.out.println("Your guess is too low");
						// Change the values of lowGuess according to the guess number
						lowGuess = nextGuess;
					}
				}
			}
		}           
		// Output message if user doesn't want to play game again
		System.out.println("Thanks for playing...");
	}
}

