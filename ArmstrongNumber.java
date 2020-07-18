package classA1.armStrongNumber;

public class ArmstrongNumber {
	

	public static void main(String[] args) {

	
		// Declare your input

		int input = 12;

		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)

		int calculate = 0, rem, org;
		//int rem;
		//int org;
		
		// Assign input into variable original 
		
		org = input;
		

		// Use loop to calculate: which loop to use until the number greater than 0??

		while (input != 0) 
		{
			rem = org % 10;
			input = org/10;
			calculate = calculate + (rem*rem*rem);
		}
		
		if (org == calculate ) 
			System.out.println("ArmStrong Number");
	else
			System.out.println("Not an ArmStrong Number");
	
		
	}
}
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)

			

			// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)

			

			// Within loop: Add calculated with the cube of remainder & assign it to calculated

			
		

		

		// Check whether calculated and original are same

		

			//When it matches print it as Armstrong number