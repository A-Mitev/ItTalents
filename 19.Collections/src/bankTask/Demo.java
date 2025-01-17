package bankTask;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args)
			throws FaliralaBankaException, InvalidDepositNameException, ClientNameException, InvalidSalaryException {

		Bank ittsBank = new Bank("ITTS-Bank", 99999);
		List<BankProduct> products = new ArrayList<>(6);
		ittsBank.setBankProducts(products);

		Deposit smallDeposit = new Deposit(2.2, 5, "Small Deposit IBAN ");
		Credit potrebitelski = new Credit(7, 9, "Potrebitelski Credit IBAN ");
		Deposit megaDeposit = new Deposit(3, 60, "Golqm deposit IBAN ");
		Credit koftiKredit = new Credit(14, 50,  "Kofti Kredit IBAN ");

		List<Client> clients = new ArrayList<Client>();
		for (int index = 0; index < 10; index++) {
			String name = "client";
			clients.add(new Client(name += index, Math.random() * 2000, Math.random() * 500));
		}

		for (Client client : clients) {
			client.setBank(ittsBank);
			double percent = (Math.random() * (1 - 0.8)) + 0.8;
			if (percent < 0.9) {
				client.makeDeposit(client.getMoneyInAccount() * percent, smallDeposit);
			}
			if (percent >= 0.9) {
				client.makeDeposit(client.getMoneyInAccount() * percent, megaDeposit);
			}

			// Credit getting on random
			double random = Math.random();
			if (random < 0.5) {
				client.getCredit(3000, potrebitelski);
			}
			if (random >= 0.5) {
				client.getCredit(400, koftiKredit);
			}
		}
		
		
		for(Client client : clients){
			System.out.println(client.toString());
		}

		for (BankProduct product : products) {
			System.out.println(product.getName() + " " + " mesechen period " + product.getPeriod());
		}

		System.out.println();

		System.out.println("\n" + "Nalichni sredstva v Bankata: " + ittsBank.getAvailableMoney());
		System.out.println("Bankov rezerv: " + ittsBank.getBankReserve());

	}
}
