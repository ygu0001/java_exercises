package Chapter4;

public class printf {

	public static void main(String[] args) {
		int count = 5;
		double amount = 450.5689786;
		boolean bool = true;
		//System.out.printf("count is %d and amount is %.5e, %6b",count, amount,bool);

		System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees",
				"Radians", "Sine", "Cosine", "Tangent");
//		System.out.printf("%10s%10s%10s%10s%10s\n", "Degrees",
//				"Radians", "Sine", "Cosine", "Tangent");	
	
		int degrees = 30;
		double radians = Math.toRadians(degrees); System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees,
		    radians, Math.sin(radians), Math.cos(radians),
		    Math.tan(radians));
	
		degrees = 60;
		radians = Math.toRadians(degrees); System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees,
		    radians, Math.sin(radians), Math.cos(radians),
		    Math.tan(radians));
		
		System.out.printf("amount is %f %e\n", 32.32, 32.32);
		System.out.printf("%6s\n", "Java");
		System.out.printf("%-6b%s\n", (1 > 2), "Java");
	
	}
	
	
	

}
