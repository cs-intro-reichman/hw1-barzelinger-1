// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int range = Integer.parseInt(args[0]);
		
		// generating three random numbers in the given range
		int a = (int) ((Math.random() * range) + 1);
		int b = (int) ((Math.random() * range) + 1);
		int c = (int) ((Math.random() * range) + 1);
		
		// finding the order of the numbers
		int max = Math.max(a,b);
		max = Math.max(max, c);
		int min = Math.min(a,b);
		min = Math.min(min, c);
		int mid = (a + b + c) - min - max;
		
		System.out.println(a + " " + b + " " + c);
		System.out.println(min + " " + mid + " " + max);
	}
}
