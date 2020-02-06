import java.util.*; //Import Scanner

public class FibonacciNonRecursive { //Declare class
	
	public static int n; //Declare variable to be used as user-defined length of Fibonacci sequence
	static Scanner scanner = new Scanner(System.in); //Create a Scanner instance
	
	
	public static void main(String[] args) {//Declare main function

		System.out.println("How long do you want the Fibonacci sequence to be? "); //Get user input for how long they want the sequence to be
		n = scanner.nextInt(); //Set user input as the value of variable n
		int[] array = new int[n]; //Declare, create and assign array of length n
		array[0] = 1; //Establish the first two values of the sequence, i.e. the base cases
		array[1] = 1;
		
		for(int i = 2; i<=(n-1); i++) { //Populating the Fibonacci sequence. Since the first two values of the sequence are already set, start the counter at index 2
				array[(i)] = array[(i-1)] + array[(i-2)]; //Set the value at array[i] to be the sum of the previous two values
		}
		for(int i = 0; i<=(n-1); i++) { //Outputting the entire Fibonacci sequence
			System.out.println(array[i]);
		}
	}
}


//This code was written by Domhnall Ó Dubhlainn, 01/12/2018