package ZapetajkiSPool;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ZapetaikiSPool {
	
//	Niki, tova e tvoqt kod kojto se opitava da promenq no cikula s razdelqneto baq me zatrudnqva. Izuchavam go :)

		private static final int NUMBER_OF_THREADS = 8;

		public static void main(String[] args) throws FileNotFoundException, InterruptedException, ExecutionException {
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(new File("war_peace.txt"));
			StringBuilder builder = new StringBuilder();
			while (scanner.hasNextLine()) {
				builder.append(scanner.nextLine());
			}
			
			long start = System.currentTimeMillis();
			
			ExecutorService threadPool = Executors.newFixedThreadPool(NUMBER_OF_THREADS);
			
			List<Future<Integer>> results = new ArrayList<Future<Integer>>();
			
			
			
			for (int part = 0; part <= NUMBER_OF_THREADS-1; part++) {
				String partOfText = builder.substring((part * builder.length()/NUMBER_OF_THREADS)+1, 
						(part+1) * builder.length()/NUMBER_OF_THREADS);
				
				results.add(threadPool.submit( ()-> {
					int count = 0;
					for (int i = 1; i <= 100; i++) {
						for (int index = 0; index < partOfText.length(); index++) {
							if (partOfText.charAt(index) == ',') {
								count++;
							}
						}
					}
					
					return count;
				}));
			}
			
			int count = 0;
			
			for (Future<Integer> num : results) {
				count += num.get();
			}
			
			System.out.println(count);
			System.out.println("Time " + (System.currentTimeMillis() - start));
			
			threadPool.shutdown();
		}

	}