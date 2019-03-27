import java.util.Comparator;

public class BySpreadComparator implements Comparator<MeteoDuJour> {

	@Override
	public int compare(MeteoDuJour arg0, MeteoDuJour arg1) {
		// TODO Auto-generated method stub
		int difference = arg0.getSpread() - arg1.getSpread();
		return difference;
	}

}
