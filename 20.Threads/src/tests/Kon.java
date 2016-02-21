package tests;

public class Kon implements Runnable {

	private static final int TIME_TO_RUN_A_MILE = 250;
	private static final int MILES_TO_RUN = 200;

	@Override
	public void run() {
		String horseName = Thread.currentThread().getName();
		System.out.println(horseName + "Starts Running");

		for (int mile = 0; mile < MILES_TO_RUN; mile++) {
			try {
				Thread.sleep(TIME_TO_RUN_A_MILE);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Do sega izbqga tolkova" + mile);
		}

		System.out.println(horseName + "Finished Running");
	}

}