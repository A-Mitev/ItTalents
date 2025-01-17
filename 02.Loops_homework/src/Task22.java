import java.util.Scanner;

public class Task22 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int input = scanner.nextInt();

		while ((input < 1) || (input > 999)) {
			System.out.println("Wrong input, please enter new digit between 1 and 999!");
			input = scanner.nextInt();
		}

		int count = 0;
		int nexNum = input + 1;

		while (count < 10) {
			if ((nexNum % 2 == 0) || (nexNum % 3 == 0) || (nexNum % 5 == 0)) {
				count++;
				System.out.println(count + ":" + nexNum);
			}
			nexNum++;
		}
	}
}
