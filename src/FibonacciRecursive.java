import java.util.*; //Import Scanner
public class FibonacciRecursive { //Declare class

	public static int n; //Declare variable to be used as user-defined length of Fibonacci sequence
	static Scanner scanner = new Scanner(System.in); //Create a Scanner instance

	public static void main(String[] args) {
		System.out.println("How long do you want the Fibonacci sequence to be? "); //Get user input for how long they want the sequence to be
		n = scanner.nextInt(); //Set user input as the value of variable n
		for (int i = 0; i <= n; i++) { //This for loop iterates each time for every Fibonacci value requested by the user
			System.out.println(fibRecursion(i)); //The recursive fibRecursion method is called for each value required by the user
		}
	}

	public static int fibRecursion(int number) { //Recursive declaration of method fibRecursion
		if ((number == 0) || (number == 1)) { //This if statement handles the first two values of the Fibonacci sequence (0 and 1). AKA the base cases where recursive calculation is not necessary
			return number; //Return the base-case value
		}
		else { //This else statement handles each successive Fibonacci value calculation recursively
			return fibRecursion(number - 1) + fibRecursion(number - 2); //Return the Fibonacci value to the for loop in the main method, and recursively call the fibRecursion method, passing the  previous two values as arguments for the next calculation
		}
	}
}

//The logic behind this code was sourced from https://medium.com/launch-school/recursive-fibonnaci-method-explained-d82215c5498e, accessed 02/12/2018