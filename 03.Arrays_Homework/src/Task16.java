import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int arraySize = 10;
		float[] array = new float[arraySize];

		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextFloat();
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();

		for (int i = 0; i < array.length; i++) {
			if (array[i] < -0.231) {
				array[i] = (float) (Math.pow(i + 1, 2) + 41.25);
			} else {
				array[i] = array[i] * (i + 1);
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}
}
