package MusicInstrumentsHomework;

public class Demo {
	
	public static void main(String[] args) {
		
//		MusicInstrument kitara = new MusicInstrument("Kitara", InstrumentType.Strunni , 2240);
//		MusicInstrument flejta = new MusicInstrument("Flejta",InstrumentType.Duhovi, 120);
//		MusicInstrument piano = new MusicInstrument("Piano",InstrumentType.Klavishni,  2999);
//		MusicInstrument sintezator = new MusicInstrument("Sintezator",InstrumentType.Electronni, 6555);
		
		MusicShop planetaPayner = new MusicShop(2500);
		
		planetaPayner.addMusicInstrument("Babaran", new MusicInstrument("baraban", InstrumentType.Udarni, 550), 9);
		planetaPayner.addMusicInstrument("Fleita", new MusicInstrument("Flejta",InstrumentType.Duhovi, 120), 3);
		planetaPayner.addMusicInstrument("Kitara", new MusicInstrument("Kitara", InstrumentType.Strunni , 2240), 4);
		planetaPayner.addMusicInstrument("Piano", new MusicInstrument("Piano",InstrumentType.Klavishni,  2999), 1);
		planetaPayner.addMusicInstrument("Sntezator", new MusicInstrument("Sintezator",InstrumentType.Electronni, 6555), 5);
		
		
	}
}
