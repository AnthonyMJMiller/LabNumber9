package circleCircumferenceArea;

import java.util.Scanner;

public class CircleAppLabNumber9 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		String enter;
		int count = 0;
		System.out.println("This is the Circle Calculation App!");
		
		do {
			count++;
			CircleLab9 theCircle = new CircleLab9(Validator.getDouble(key, "Enter in a circle radius: "));
			
			System.out.println("The circumference for the circle is: " + theCircle.getFormattedCircumference());
			
			System.out.println("The area for the circle is: " + theCircle.getFormattedArea());
			
			System.out.println("Do you want to view another circle? (Yes/No):");
			enter = key.next();
			while (!enter.equalsIgnoreCase("Yes") && !enter.equalsIgnoreCase("No")) {
				System.out.println("Error! Please input Yes or No.");
				enter = key.next();
					
			}
			if (enter.equalsIgnoreCase("No")) {
				break;
			}
			
		}
		while (enter.equalsIgnoreCase("Yes"));
		if (count == 1) {
		System.out.println("You have viewed " + count + " circle today. Thanks for using the Circle Calculator App! Goodbye!");
		} else {
			System.out.println("You have viewed " + count + " circles today. Thanks for using the Circle Calculator App! Goodbye!");
		}

	}

}
