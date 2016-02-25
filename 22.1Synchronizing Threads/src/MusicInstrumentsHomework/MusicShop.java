package MusicInstrumentsHomework;

import java.util.HashMap;
import java.util.Map;

public class MusicShop {
	
	private Map<String, MusicInstrument> productsInShop;
	private double availableMoney;
	
	
	public MusicShop( double availableMoney) {
		productsInShop = new HashMap<String, MusicInstrument>();
		this.setAvailableMoney(availableMoney);
	}


	
	void addMusicInstrument(String name , MusicInstrument instrument, int quantity ){
		if(!productsInShop.containsKey(instrument.getName())){
			productsInShop.put(instrument.getName(), instrument);
		}
	}
	
	

	public double getAvailableMoney() {
		return availableMoney;
	}


	public void setAvailableMoney(double availableMoney) {
		if(availableMoney >= 0)
		this.availableMoney = availableMoney;
	}
	
	
	
}
