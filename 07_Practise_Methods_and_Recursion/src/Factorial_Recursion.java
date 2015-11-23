import java.util.Scanner;

public class Factorial_Recursion {
	
	static int factoiralFunc(int number){
		if(number <= 1){
			return 1;
		}
		return number * factoiralFunc(number - 1);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		System.out.println(factoiralFunc(number));
		
		scanner.close();
	}

}
