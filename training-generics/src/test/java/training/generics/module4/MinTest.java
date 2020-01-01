package training.generics.module4;

import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

public class MinTest {
	private static final Comparator<Integer> COMP = new Comparator<Integer>() {

		@Override
		public int compare(Integer left, Integer right) {
			return Integer.compare(left, right);
		}
	};

	private List<Integer> list = new ArrayList<>();

	@Test(expected = IllegalArgumentException.class)
	public void shouldRaiseExceptionForEmptyList() {
		SortingExamples.min(list, COMP);
		//assertThat(list, Matche);
	}
}
