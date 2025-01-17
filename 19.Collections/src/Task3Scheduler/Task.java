package Task3Scheduler;

public class Task implements ITask {

	private String work;
	private static int currentID = 1;
	private int id;
	
	
	
	public Task(String work) throws WrongWorkEntryException {
		setWork(work);
		this.id = currentID++;
	}
	
	//seter v kojto da si napravq proverka i da upraznq hvurlqneto na exception
	public void setWork(String work) throws WrongWorkEntryException {
		if(work != null && !work.equals("") && work.length() > 0){
		this.work = work;
		} else {
			throw new WrongWorkEntryException("Invalid work entry!");
		}
	}



	@Override
	public void doWork() {
		System.out.println("Zadacha " + this.id + " e " + "\"" + work + "\"");
	}





	

	

}
