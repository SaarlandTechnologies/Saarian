import java.util.Random;

public class Entity {
	
	boolean response = false;

	public void reciveAngebot(Saarian saarian) {
		this.response = new Random().nextBoolean();
	}
	
	public boolean getAngebotResponse() {
		return response;
	}

}
