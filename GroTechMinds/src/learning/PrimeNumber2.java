package learning;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber2 {

	public static void main(String[] args) {
		//getPrimeNumbers(20);
		primeNumbersWithout3atUnitPlace(200);
		primeNumbersWithout3And7AtUnitPlace(200);
	}

	public static List<Integer> getPrimeNumbers(int lastNumber) {
		List<Integer> primeNumberList = new ArrayList<Integer>();
		for (int i = 2; i <= lastNumber; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				primeNumberList.add(i);
				// System.out.print(i + " ");
			}
		}
		System.out.println(primeNumberList);

		return primeNumberList;
	}

	public static List<Integer> primeNumbersWithout3atUnitPlace(int lastNumber) {
		List<Integer> primeNumberList = new ArrayList<Integer>();
		List<Integer> resultNumberList = new ArrayList<Integer>();
		for (int i = 2; i <= lastNumber; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				primeNumberList.add(i);
				// System.out.print(i + " ");
			}
		}
		System.out.println(primeNumberList);

		for (int number : primeNumberList) {
			if (number % 10 != 3) {
				resultNumberList.add(number);
			}
		}
		System.out.println(resultNumberList);
		return resultNumberList;

	}
	
	public static List<Integer> primeNumbersWithout3And7AtUnitPlace(int lastNumber) {
		List<Integer> primeNumberList = new ArrayList<Integer>();
		List<Integer> resultNumberList = new ArrayList<Integer>();
		for (int i = 2; i <= lastNumber; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				primeNumberList.add(i);
				// System.out.print(i + " ");
			}
		}
		System.out.println(primeNumberList);

		for (int number : primeNumberList) {
			if (number % 10 != 3 && number % 10 != 7) {
				resultNumberList.add(number);
			}
		}
		System.out.println(resultNumberList);
		return resultNumberList;

	}


}
