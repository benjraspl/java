package test;

import java.util.Scanner;

public class fizzbuzz {
 public static void main(String [] args) {
	 String output = "";
	 int length;
	 Scanner imp = new Scanner(System.in);
	 System.out.println("Wie hoch gezählt werdn?");
	 length = imp.nextInt();
	 for (int cnt = 1; cnt <= length; cnt++) {
		 if (cnt%3 == 0 && cnt%5 == 0) {
		 	output="FizzBuzz";
		 }
		 else if (cnt%3 == 0) {
		 		output="Fizz";
		 	}
		 	else if (cnt%5 == 0) {
		 			output="Buzz";
		 		}
		 		else {
		 			output = Integer.toString(cnt);
		 		}		 
		System.out.println(output);
	 }
 } }