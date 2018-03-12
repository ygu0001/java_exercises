package Chapter4;

import java.util.Scanner;

/**
*
*@author Clair Yiting Gu
*/
public class practice4_13 {

	public static void main(String[] args) {
		
		char letter;
		System.out.println("Enter a letter:");
		Scanner sc = new Scanner(System.in);
		letter = sc.next().charAt(0);
		
		if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'|| letter == 'A'||letter == 'E'||letter == 'I'||letter == 'O'||letter == 'U')
			System.out.println(letter + " is a vowel");
		else if(Character.isLetter(letter) == false)
			System.out.println(letter + " is an invalid input");
		else	
			System.out.println(letter + " is a consonant");
	}

}
