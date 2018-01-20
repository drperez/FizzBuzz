package fizzbuzz;

public class FizzBuzz {

	/**
	 * Returns the result of the FizzBuzz quiz
	 * @param number
	 * @return String
	 */
	public String ProcessFizzBuzz(int number) {
		
		return numberComparison(number);
		
	}
	
	/**
	 * Calculate the result of the FizzBuzz comparison
	 * @param number
	 * @return String
	 */
	private String numberComparison(int number) {
		
		String resultingValue = "";

		if (number % 3 == 0 && number % 5 == 0)
			resultingValue = "fizzbuzz";
		else if (number % 3 == 0)
			resultingValue = "fizz";
		else if (number % 5 == 0)
			resultingValue = "buzz";
		else
			resultingValue = String.valueOf(number);
		
		return resultingValue;
		
	}
}
