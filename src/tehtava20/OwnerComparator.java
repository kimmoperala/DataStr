package tehtava20;

import java.util.Comparator;

public class OwnerComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		TrafficCard t1 = (TrafficCard) o1;
		TrafficCard t2 = (TrafficCard) o2;
		if (t1.mOwnerName.equals(t2.mOwnerName)) {
			return 0;
		} else if (t1.mOwnerName.compareTo(t2.mOwnerName) > 0) {
			return 1;
		} else {
			return -1;
		}
	}

}
