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
		if(value == 0){
			return Integer.toString(value);
		}
		return "";
	}
}
