public class Task23 {
	public static void main(String[] args) {

		int level = 1;
		while (level < 10) {
			for (int i = level; i < 10; i++) {
				System.out.print(level + "*" + i + "; ");
			}
			System.out.println();
			level++;
		}
	}
}
