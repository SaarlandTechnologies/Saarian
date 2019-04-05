public class Main {

	static Saarian saarian = new Saarian();

	public static void main(final String...strings) {
		if (saarian.search(Jobs.AUSHILFE)) {
			saarian.bewerben();
		} else {
			saarian.gotoLocation(Location.STRAßEN_STRICH);
			if (saarian.location != null) {
				if (saarian.search(Leute.NOTGEIL)) {
					saarian.machAngebot(saarian.getLatestEntity(), Angebote.SUCK_OFF);
					if (saarian.getLatestEntity().getAngebotResponse()) {
						saarian.tuEs();
					} else {
						saarian.say("Ich machs auch für weniger! :");
					}
				}
			}
		}
	}
	
}
