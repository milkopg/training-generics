package training.generics.module3.before;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
	public int compare(final Person left, final Person right) {
		return Integer.compare(left.getAge(), right.getAge());
	}
}
