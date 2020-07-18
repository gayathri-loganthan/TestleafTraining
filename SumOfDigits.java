package classH1.sumOfDigits;

public class SumOfDigits {

	public static void main(String[] args) {
		//Declare variables
		int input = 123;
        int sum = 0;
        int rem;

while (input > 0) {
	//find reminder of 123 which is 3
	rem = input % 10;

	sum = sum + rem;
	//find quotient of 123 which is 12
	input = input/10;

}

System.out.println(sum);
	}

}