import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		int day = scanner.nextInt();
		int month = scanner.nextInt();
		int year = scanner.nextInt();
		
		while ((day < 0 || day > 31) || (month < 0 || month > 12) || (year < 0 )){
			System.out.println("Invalid input, please repeat with correct data!");
			day = scanner.nextInt();
			month = scanner.nextInt();
			year = scanner.nextInt();
		}
		
		
		
		
		
			}
		}
	

