// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {

		String name3 = args[0];
		String name2 = args[1];
		String name1 = args[2];
		double bill = Double.parseDouble(args[3]);

		bill = bill/3.0;
		bill = Math.ceil(bill);

		System.out.println("Dear " + name1 + ", " + name2 + ", and " + 
							name3 + ": pay " + bill + " Shekels each.");
	}
}
