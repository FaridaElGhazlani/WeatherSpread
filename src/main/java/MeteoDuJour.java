
public class MeteoDuJour {

	final private int jour;

	public int getJour() {
		return jour;
	}

	final private int tmax;
	final private int tmin;
	public MeteoDuJour(int jour, int tmax, int tmin) {
		super();
		this.jour = jour;
		this.tmax = tmax;
		this.tmin = tmin;
	}
	
	@Override
	public String toString() {
		return "MeteoDuJour [jour=" + jour + ", tmax=" + tmax + ", tmin=" + tmin + "]";
	}
	
	public int getSpread() {
		return tmax-tmin;
	}
	
}
