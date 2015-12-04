import java.util.Scanner;

public class Class_Tasks_2 {

	static int[] generateArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 14);
		}
		return array;
	}
	
	static void printArray(int[] masiv){
		for (int i = 0; i < masiv.length; i++) {
			System.out.print(masiv[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int size = scanner.nextInt();
		
		printArray(generateArray(size));
	}
}