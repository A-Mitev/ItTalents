package tests;

import java.util.ArrayList;
import java.util.List;

public class DemoKone {

	private static final int NUMBER_OF_HORSES = 10;

	public static void main(String[] args) {

		List<Thread> horsesThreads = new ArrayList<Thread>();
		
		for (int horse = 0; horse < NUMBER_OF_HORSES; horse++) {
			Kon kon = new Kon();
			Thread horseThread = new Thread(kon,"Kon nomer " + horse);
			horsesThreads.add(horseThread);
		}
	}
}