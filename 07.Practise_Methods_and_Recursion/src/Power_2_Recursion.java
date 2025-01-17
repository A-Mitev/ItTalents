import java.util.Scanner;

public class Power_2_Recursion {

	static long powerFunc(int number, int power){
		if(power < 1){
			return 1;
		}
		return number * powerFunc(number, power -1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int power = scanner.nextInt();
		int number = 2;
		
		System.out.println(powerFunc(number, power));
		scanner.close();
	}

}
