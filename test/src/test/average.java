package test;

import java.util.Scanner;

public class average {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//int nr;
		System.out.println("Zahl:");
		String str = scan.nextLine();
		
		String rev = ""; 
		
		 for (int i = str.length()-1; i>=0; i--) {
			 rev += str.charAt(i);
			 System.out.println("boop");
		 }
		 System.out.println("Str: "+str+" Rev: "+rev);
	}
}