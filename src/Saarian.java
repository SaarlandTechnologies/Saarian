import java.util.ArrayList;
import java.util.List;

public class Saarian {
	
	Location location = Location.VICTORIA_SECRET;
	List<Jobs> verfuegbareJobs = new ArrayList<Jobs>();
	List<Leute> leuds = new ArrayList<Leute>();
	Entity latest;
	
	public Saarian() {
		for (Jobs job : Jobs.values()) {
			if (job.equals(Jobs.AUSHILFE)) continue;
			verfuegbareJobs.add(job);
		}
		for (Leute leute : Leute.values()) {
			leuds.add(leute);
		}
	}
	
	public boolean search(final Jobs jobs) {
		return verfuegbareJobs.contains(jobs);
	}
	
	public boolean search(final Leute leute) {
		if (leuds.contains(leute)) {
			latest = new Entity();
			return true;
		}
		return false;
	}
	
	public void bewerben() {
		say("Ich bewerbe mich! :)");
		// TODO: Add bewerben
	}
	
	public void machAngebot(final Entity entity, final Angebote angebote) {
		entity.reciveAngebot(this);
	}
	
	public void tuEs() {
		say("Ich tue es! :)");
		// TODO: Add angebotsaction
	}
	
	public void say(final String text) {
		System.out.println(text);
	}
	
	public void gotoLocation(final Location location) {
		this.location = location;
	}
	
	public Entity getLatestEntity() {
		return this.latest;
	}

}
