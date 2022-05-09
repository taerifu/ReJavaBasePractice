package test001;

import java.util.Scanner;

public class PrintIntMinus {
	
	public static void main(String[] args) {
		Scanner numberScanner = new Scanner(System.in);
		
		int fisrtTypeNum = numberScanner.nextInt();
		int secondTypeNum = numberScanner.nextInt();
		
		System.out.print(fisrtTypeNum - secondTypeNum);
		
		numberScanner.close();
	}
	
}
