import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int input = scanner.nextInt();
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		

		while ((input > 0) && (input < 9)) {
			
		 a = scanner.nextInt();
		 b = scanner.nextInt();
		 c = scanner.nextInt();
		 d = scanner.nextInt();
		 
		}

		System.out.println(a + " " + b + " " + c + " " + d);
	}
	}


