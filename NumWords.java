// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);
		
		// hundreds: divide by 100
	    int hundreds = number/100 ;
		
		// ens: remove hundreds, then divide by 10
		int tens = (number % 100)/10;
		
		// ones: remainder after dividing by 10
		int ones = (number % 10);
		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
