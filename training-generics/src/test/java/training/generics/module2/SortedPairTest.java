package training.generics.module2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import training.generics.module3.before.SortedPair;

public class SortedPairTest {
	
	@Test
	public void shoildRetainOrderOfOrderedPair() {
		SortedPair<Integer> pair = new SortedPair<Integer>(1, 2);
		
		assertEquals(1, pair.getFirst().intValue());
		assertEquals(2, pair.getSecond().intValue());
	}

	@Test
	public void shouldFlipOrderOfMisorderedPair() {
		SortedPair<Integer> pair = new SortedPair<Integer>(2, 1);
		assertEquals(1, pair.getFirst().intValue());
		assertEquals(2, pair.getSecond().intValue());
	}
}
