/****************************************************************************
 *
 * Created by: Jess and Craig
 * Created on: Oct 2016
 * Takes a string from the user and reverses it using recursion.
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorifier{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		InputStreamReader r = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(r);
		
	    int userInputNumber;
		
		System.out.println("Enter a number to be factorialed: ");
		
		try {
		
			userInputNumber = Integer.parseInt(br.readLine());
			int factorialed = Factorize(userInputNumber);
			
			System.out.println(factorialed);
			
		} catch (NumberFormatException e) {
			
			System.out.println("Invalid input. Run program again, and enter a NUMBER");
			
		}
		
	}
	
	public static int Factorize(int number) {
		
		int answer ;
		
		if (number > 1) {
			
			System.out.println(number);
			answer = number * (Factorize (number - 1));
			
		} else {
			
			answer = 1; 
			
		}
		
		return answer;
	}
	

}
