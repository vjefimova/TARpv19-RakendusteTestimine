import java.util.Arrays;

public class FizzBuzz {
	
	private int[] numbers;
	
	public String[] getNumbers() {
		numbers = new int[100];
		for(int i = 0; i< numbers.length; i++) {
			numbers[i]=i+1;
		}
		return (String[])Arrays.stream(numbers).mapToObj(this::fizzbuzz).toArray(String[]::new);
	}
	
	public String fizzbuzz(int value) {
		if (value % 3 == 0 || value % 5 == 0) {
			if (value % 3 == 0 && value % 5 == 0) {
				return "Fizzbuzz";
			} else if (value % 3 == 0) {
				return "Fizz";
			} else if (value % 5 == 0) {
				return "Buzz";
			}
		} else {
			return Integer.toString(value);
		}
		return "";
	}


}
