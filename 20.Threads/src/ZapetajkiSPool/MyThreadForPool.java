package ZapetajkiSPool;

public class MyThreadForPool implements Runnable {

	private int zapetajkiCount;

	public int getValue() {
		return zapetajkiCount;
	}

	private String textToAnalize;

	public MyThreadForPool(String textToAnalize) {
		this.textToAnalize = textToAnalize;
	}

	public void run() {

		String[] zapetajki = textToAnalize.replaceAll("^,", "").split(",");

		zapetajkiCount = zapetajki.length - 1;
		System.out.println("V tozi thread sa prebroeni - " + zapetajkiCount);

	}

}