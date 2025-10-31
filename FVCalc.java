// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		double currentValue = Double.parseDouble(args[0]);
		double interestRate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		
		// calculating future value using the formula FV = PV * (1 + r)^n
		double futureValue = currentValue * Math.pow((1 + interestRate/100), years);	

		System.out.printf("After %d years, $%.0f saved at %.1f%% will yeild $%.0f%n", 
								years, currentValue, interestRate, futureValue);

		// System.out.println("After " + years + " years, " + "$" + (int) currentValue + 
		// 					" saved at " + interestRate + "% will yeild $" + (int) futureValue); 
	
	}
}