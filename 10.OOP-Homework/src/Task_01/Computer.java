package Task_01;

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	int hardDiskMemory;
	int freeMemory;
	String operationSystem;
	//String brand;     za test

	void changeOperationSystem(String newOperationSystem) {
		this.operationSystem = newOperationSystem;

	}

	void useMemory(int memory) {
		if (memory > freeMemory) {
			System.out.println("Not enough free memory!");
			return;
		} else {
			this.freeMemory -= memory;
		}
	}

	void printComputerElements() {
		System.out.println("Year ot production - " + this.year + "\n" + "Price - " + this.price + "\n" + "Notebook - "
				+ this.isNotebook + "\n" + "Hdd capacity - " + this.hardDiskMemory + "\n" + "Free memory - " + this.freeMemory + "\n"
				+ "Opration system - " + this.operationSystem + "\n");
	}
}
