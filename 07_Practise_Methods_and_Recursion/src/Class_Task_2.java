public class Class_Task_2 {
//	static int sumFunction(int input){
//		int sum = 0;
//		for (int index = 1; index < input; index++) {
//			sum += index;
//		}
//		return sum;
//	}
//	
//	
//	public static void main(String[] args) {
//		int input = 5;
//		
//		int result = sumFunction(input);
//		System.out.println(result);
//		
//		
//		}
//}

	static int sumFunc(int num){
		if(num <= 0){
			return 0;
		}
		int result = num + sumFunc(num -1);
		return result;
	}
	
	public static void main(String[] args) {
		int num = 5;
		
		
		System.out.println(sumFunc(num));
		
	}
}
	
	