package Midterm;

import java.util.*;

public class Problem5StringChar {

	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Enter the Word ");
			String word = input.nextLine();
			if(word.equals("")) {
				break;
			}else {
				removeDoubleLetters();
			}
		}
		System.out.println(tempWord);
	}
	
	public static void removeDoubleLetters(String word) {
		String tempWord = null;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (i == 0 || ch!= word.charAt(i-1)) {
				tempWord += ch;
			}
		}
		return tempWord;
	}

}
