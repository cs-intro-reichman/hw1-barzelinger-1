// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

		double currentValue = Double.parseDouble(args[0]);
		double interestRate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		
		// calculating future value using the formula FV = PV * (1 + r)^n
		double futureValue = currentValue * Math.pow((1 + interestRate/100), (double) years);	

		System.out.println("After " + years + " years, " + "$" + (int) currentValue + 
							" saved at " + interestRate + "% will yield $" + (int) futureValue); 
	
	}
}