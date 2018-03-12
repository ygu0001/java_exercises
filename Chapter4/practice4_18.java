package Chapter4;

import java.util.Scanner;

/**
*(Student major and status) Write a program that prompts the user to enter two characters and displays the major and status 
*represented in the characters. The first character indicates the major and the second is number character 1, 2, 3, 4, 
*which indicates whether a student is a freshman, sophomore, junior, or senior. Suppose the following chracters are used to denote the majors:
M: Mathematics
C: Computer Science
I: Information Technology
*@author Clair Yiting Gu
*github:https://github.com/ygu0001/java_exercises/tree/master/Chapter4
*/
public class practice4_18 {

	public static void main(String[] args) {
		
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two characters");
		s = sc.next();
		
		if(s.charAt(0) == 'M')
			System.out.println("Mathematics");
		else if(s.charAt(0)== 'C')
			System.out.println("Computer Science");
		else if(s.charAt(0) == 'I')
			System.out.println("Information Technology");
		else 
			System.out.println("Invalid input");
		
		
		if(s.charAt(1) == '1')
			System.out.println("Freshman");
		else if(s.charAt(1)== '2')
			System.out.println("Sophmore");
		else if(s.charAt(1) == '3')
			System.out.println("Junior");
		else if(s.charAt(1) == '4')
			System.out.println("Senior");
		else 
			System.out.println("Invalid input");
		
	}

}
