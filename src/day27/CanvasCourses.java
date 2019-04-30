package day27;

import java.util.Arrays;

public class CanvasCourses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String url = "https://learn.cybertekschool.com/courses/204";
		
		String[] unknownCourse = url.split("/");
		
		System.out.println(Arrays.toString(unknownCourse));
		int number=Integer.parseInt(unknownCourse[unknownCourse.length-1]);
		System.out.println(number);

		switch(number) {
		case 147:
			System.out.println("the course is Java Programming");
			break;
		case 204:
			System.out.println("Mentoring Session");
			break;
		case 149:
			System.out.println("SDLC");
			break;
		case 152:
			System.out.println("Qa Testing");
			break;
		case 144:
			System.out.println("Team activity");
			break;
		case 143:
			System.out.println("Welcome Kit");
			break;
			default:
				System.out.println("Invalid number for the course");
				break;
			
		}
		
	}

}
