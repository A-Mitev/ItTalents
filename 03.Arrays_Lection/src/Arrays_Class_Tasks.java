import java.util.Scanner;

public class Arrays_Class_Tasks {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] a = new int[5];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		
	}

}
