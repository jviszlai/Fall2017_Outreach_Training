import java.util.Random;

public class November_11 {
	
	public static void main(String[] args) {
		/*
		 * new thing!
		 * Create a method that takes in one parameter of type int
		 * that is the number of rows.
		 * The method will print out a triangle
		 * of asterisks with that number of rows.
		 
		     Examples:
		     n = 1:
		     *
		     n = 2:
		     *
		     * *
		     n = 3:
		     *
		     * *
		     * * *
		     n = 4:
		     * 
		     * *
		     * * *
		     * * * *
		     
		 *    etc.
		 * */
		 count(2);
		 
	}

	static void triangle(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void count(int n) {
		if (n == 1) {
			System.out.println("1");
		} else {
			System.out.println(n);
			count(n - 1);
		}
	}
	
}
