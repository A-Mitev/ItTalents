import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Please enter a digit for the array size");
		int arraySize = scanner.nextInt();
		int[][] array = new int [arraySize][arraySize];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		
		int sum = 0; 
		int digitCOunt = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				digitCOunt++;
			}
		}
		
		System.out.println("The sum of all digits is " + sum);
		System.out.println("The arithmetic average is " + sum / digitCOunt);
	}

}
