package circleCircumferenceArea;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CircleLab9 {
	
	private double r;
	NumberFormat formatter = new DecimalFormat("#0.00");
	
	public CircleLab9(double radius) {
		r = radius;
		
	}
	
	public double getCircumference() {
		return  2 * (Math.PI * r);
	}
	
	public String getFormattedCircumference() {
		
		return formatter.format(getCircumference());
	}
	
	public double getArea() {
		return Math.PI * (r * r);
	}
	
	public String getFormattedArea() {
		return formatter.format(getArea());
		
	}
	
	
	
	

}
