import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		System.out.println("Enter an integer");
		int sc = new Scanner(System.in).nextInt();
		
		
		if(sc > 20 || sc > 5) {
			System.out.println("The input is greater than 20");
		}else {
			System.out.println("The input is less than 20");
		}
		

	}

}
