package training.generics.module1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GenericCircularBufferTest {
	private GenericCircularBuffer<Integer> buffer = new GenericCircularBuffer<Integer>(2);

	@Test
	public void shouldOfferPollableELement() {
		assertTrue(buffer.offer(1));
		assertEquals(Integer.valueOf(1), buffer.poll());
	}

	@Test
	public void shouldNotOfferWhenBufferIsFull() {
		assertTrue(buffer.offer(1));
		assertTrue(buffer.offer(2));
		assertFalse(buffer.offer(3));
	}

	@Test
	public void shouldNotPollWhenBufferIsEmpty() {
		assertNull(buffer.poll());
	}

	@Test
	public void shouldRecycleBuffer() {
		assertTrue(buffer.offer(1));
		assertTrue(buffer.offer(2));
		assertEquals(Integer.valueOf(1), buffer.poll());
		assertTrue(buffer.offer(3));
		assertEquals(Integer.valueOf(2), buffer.poll());
		assertEquals(Integer.valueOf(3), buffer.poll());
	}
}
