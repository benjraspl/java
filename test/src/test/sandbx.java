package test;

/*
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;*/
import java.util.Scanner;

public class sandbx {
	public static void main(String [] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter dat shit niqqa");
		String str = scan.nextLine();
		System.out.println(palindrome(str));
	}	
	static boolean palindrome(String input) {
			String reverse = "";
			
			for (int i = input.length()-1; i>=0; i--) {
				 reverse += input.charAt(i);
			 }
			if (reverse.equalsIgnoreCase(input)) {
				return true;
			} else {
				return false;
			}
			}
	
}