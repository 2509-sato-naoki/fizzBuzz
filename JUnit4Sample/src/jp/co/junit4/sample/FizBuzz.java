package jp.co.junit4.sample;

public class FizBuzz {
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			System.out.println(checkFizzBuzz(i));
		}
	}

	public static String checkFizzBuzz(int num) {
		String number = String.valueOf(num);

		if ((num % 15) == 0) {
			return "FizzBuzz";
		} else if (num % 3 == 0) {
			return "Fizz";
		} else if ((num % 5) == 0) {
			return "Buzz";
		} else {
			return number;
		}
	}
}
