package training.generics.module3.before;

public class SortedPair<T extends Comparable<T>> {

	private final T first;
	private final T second;

	public SortedPair(T left, T right) {
		if (left.compareTo(right) < 0) {
			first = left;
			second = right;
		} else {
			first = right;
			second = left;
		}
	}

	public T getFirst() {
		return first;
	}

	public T getSecond() {
		return second;
	}

	@Override
	public String toString() {
		return "SortedPair{" + "first=" + first + ", second=" + second + '}';
	}
}
