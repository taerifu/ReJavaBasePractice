package test002;

import java.util.Scanner;

public class CalcTestGrade {

	public static void main(String[] args) {
		Scanner gradeScanner = new Scanner(System.in);
		
		String finalGrade = "";
		int studentGrade = gradeScanner.nextInt();
		
		if(studentGrade <= 100 && studentGrade >= 0) {
			int studentGradeRound = Math.floorDiv(studentGrade, 10);
			
			switch (studentGradeRound) {
			case 10:
				finalGrade = "A";
				break;
			case 9:
				finalGrade = "A";
				break;
			case 8:
				finalGrade = "B";
				break;
			case 7:
				finalGrade = "C";
				break;
			case 6:
				finalGrade = "D";
				break;
			default:
				finalGrade = "F";
				break;
			}
			
		System.out.println(finalGrade);
		} else {
			System.out.println("성적 범위를 벗어났습니다.");
		}
		
		gradeScanner.close();
	}

}
