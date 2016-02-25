package MusicInstrumentsHomework;

import java.util.HashMap;
import java.util.Map;

public class MusicShop {

	private Map<String, MusicInstrument> productsInShop;
	private double availableMoney;
	

	public MusicShop(double availableMoney) {
		productsInShop = new HashMap<String, MusicInstrument>();
		this.setAvailableMoney(availableMoney);
	}
	
	

	void addMusicInstrument(String name, InstrumentType type, double price, int quantity) {
		if (!productsInShop.containsKey(name)) {
			productsInShop.put(name, new MusicInstrument(name, type, price));
			int newQuantityInShop = productsInShop.get(name).getQuantityInShop() + quantity;
			productsInShop.get(name).setQuantityInShop(newQuantityInShop);
			
		}
	}
	
	void sellMusicInstrument(String name, int quantityForSale){
		if((productsInShop.containsKey(name)) && (productsInShop.get(name).getQuantityInShop() >= quantityForSale)){
			// tova se poluchi mnogo qko i kao raboti trqbva da namali tekushtata nalichnost na tekushtiq instrument
			 productsInShop.get(name).setQuantityInShop(productsInShop.get(name).getQuantityInShop() - quantityForSale);
			 availableMoney += productsInShop.get(name).getPrice() * quantityForSale;
		} else{
			System.out.println("Nedostatuchna nalichnost ot posocheniq produkt " + "\"" +  productsInShop.get(name).getName() + "\"");
		}
	}
	

	public double getAvailableMoney() {
		return availableMoney;
	}

	public void setAvailableMoney(double availableMoney) {
		if (availableMoney >= 0)
			this.availableMoney = availableMoney;
	}

}