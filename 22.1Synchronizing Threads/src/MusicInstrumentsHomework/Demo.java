package MusicInstrumentsHomework;

public class Demo {

	public static void main(String[] args) {

		MusicShop planetaPayner = new MusicShop(2500);
		
		planetaPayner.addMusicInstrument("Baraban", InstrumentType.Udarni, 550, 9);
		planetaPayner.addMusicInstrument("Flejta", InstrumentType.Duhovi, 120, 4);
		planetaPayner.addMusicInstrument("Piano", InstrumentType.Klavishni, 2999, 2);
		planetaPayner.addMusicInstrument("Sintezator", InstrumentType.Electronni, 6555,  4);
		planetaPayner.addMusicInstrument("Kitara", InstrumentType.Strunni, 955, 5);
		
		planetaPayner.sellMusicInstrument("Baraban", 5);
		
		System.out.println(planetaPayner.getAvailableMoney());
	}
}