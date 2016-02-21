package zapetajkiSPetThreada;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zapetajki {

	
	private static final int COUNT_OF_DIFFERENT_THREADS = 5;

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {

		Scanner scanner = new Scanner(System.in);
			scanner = new Scanner(new File("war_peace.txt"));
		StringBuilder builder = new StringBuilder();

		while (scanner.hasNextLine()) {
			builder.append(scanner.nextLine());
		}
		String allElements = builder.toString();
		int partForAnalize = allElements.length() / COUNT_OF_DIFFERENT_THREADS;

		System.out.println("Celiqt text sudurza " + "\"" + allElements.length() + "\"" + " simvola.");
		System.out.println("Broj simvoli za edin tread " + "\"" + partForAnalize + "\"");

		long start = System.currentTimeMillis();
		
		int finalCount= 0;
		int startIndex = 0;
		for (int index = 0; index < COUNT_OF_DIFFERENT_THREADS; index++) {
			MyThread myThread = new MyThread(allElements.substring(startIndex, startIndex + partForAnalize));
			Thread thread = new Thread(myThread);
			thread.start();
			
			// bez tozi join vremeto e mnoooogo po-kratko, no bez nego
			// ne uspqvam da vzema myThread.getValue();
			// v momenta testvam s Future, predpolagam tova e reshenieto.
			thread.join();
			finalCount += myThread.getValue();
			
			startIndex += partForAnalize;
			
		}
		System.out.println("Obsht broj zapetajki = " + finalCount);
		
		
		//...ostaveno e samo za info kakvo e bilo (hrumna mi genialnata ideq da zamestq povtorenieto 
		//na kod s cikul i to vze che se poluchi :)...
		
//		MyThread thread1 = new MyThread(allElements.substring(0, partForAnalize));
//		Thread thread11 = new Thread(thread1);
//
//		MyThread thread2 = new MyThread(allElements.substring(partForAnalize, (partForAnalize * 2)));
//		Thread thread22 = new Thread(thread2);
//
//		MyThread thread3 = new MyThread(allElements.substring((partForAnalize * 2), (partForAnalize * 3)));
//		Thread thread33 = new Thread(thread3);
//
//		MyThread thread4 = new MyThread(allElements.substring((partForAnalize * 3), (partForAnalize * 4)));
//		Thread thread44 = new Thread(thread4);
//
//		MyThread thread5 = new MyThread(allElements.substring((partForAnalize * 4), allElements.length()));
//		Thread thread55 = new Thread(thread5);
//
//		thread11.start();
//		thread11.join();
//		// System.out.println(thread1.getValue() + "tova e na purvata");
//
//		thread22.start();
//		thread22.join();
//		// System.out.println(thread2.getValue()+ "tova e na vtorata");
//
//		thread33.start();
//		thread33.join();
//		// System.out.println(thread3.getValue() + "tova e na tretata");
//		//
//		thread44.start();
//		thread44.join();
//		// System.out.println(thread4.getValue() + "tova e chetvurtata");
//
//		thread55.start();
//		thread55.join();
//		// System.out.println(thread5.getValue()+ "tovae petata ");

		// tova mi vze silite, ne namiram kak da vzema celiq sbor na
		// zapetajki... ( update - namereno reshenie!)
		
//		System.out.println("Obsht broj zapetajki = " + (thread1.getValue() + thread2.getValue() + thread3.getValue()
//				+ thread4.getValue() + thread5.getValue()));

		System.out.println("Time " + (System.currentTimeMillis() - start));
	}
}

