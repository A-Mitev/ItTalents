import java.util.Scanner;

public class Task18 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int firtsNum = scanner.nextInt();
		int seconNum = scanner.nextInt();

		for (int i = 1; i <= firtsNum; i++) {
			for (int j = 1; j <= seconNum; j++) {

				System.out.printf("%d * %d = %d;", i, j, (i * j));
				System.out.println();
			}
		}
	}

}
