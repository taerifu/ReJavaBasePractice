package test002;

import java.util.Scanner;

public class CompareTwoNumbers {
	
	public static void main(String[] args) {
		Scanner numberScanner = new Scanner(System.in);
		
		int fisrtTypeNum = numberScanner.nextInt();
		int secondTypeNum = numberScanner.nextInt();
		
		if(fisrtTypeNum > secondTypeNum) {
			System.out.println(" > ");
		} else if(fisrtTypeNum < secondTypeNum) {
			System.out.println(" < ");
		} else {
			System.out.println(" == ");
		}
		
		numberScanner.close();
	}
	
}
