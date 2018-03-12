package Chapter4;

import java.util.Scanner;

/**
*(Random character) Write a program that displays a random uppercase letter using the Math.random() method.
*@author Clair Yiting Gu
*github:https://github.com/ygu0001/java_exercises/tree/master/Chapter4
*/
public class practice4_16 {

	public static void main(String[] args) {
		
		int num = 65+(int) (Math.random()*25);
		
		System.out.println((char)(num));
	}

}
