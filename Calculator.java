// return statement and passing input via argument

package week1.day2;

public class Calculator {
	
	
	public int add(int num1,int num2) {
		
		int addition = num1+num2;
		return addition;
		
	}
	
	public double sub(double num1, double num2) {
		double diff = num1 - num2; 
        return diff;
	}
	
	public static void main(String[] args) {
	
	Calculator calc = new Calculator();
	System.out.println(calc.add(10, 20));
	double sub = calc.sub(23.12, 12.05);
	System.out.println(sub);	
	}
}
