package Midterm;

import java.util.*;

public class Problem5StringChar {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

			System.out.println("Enter the Word ");
			String word = input.nextLine();
			String newStr = removeDoubleLetters(word);
			System.out.println(newStr);
	}
	
	private static String removeDoubleLetters(String word) {
		String tempWord = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (i == 0 || ch!= word.charAt(i-1)) {
				tempWord += ch;
			}
		}
		return tempWord;
	}
	
}
