package training.generics.module1;

public class GenericExample {

	public static void main(String[] args) {
		GenericCircularBuffer<String> buffer = new GenericCircularBuffer<String>(10);
		buffer.offer("a");
		buffer.offer("bc");
		buffer.offer("d");
		
		
		String value = concatenate(buffer);
		System.out.println(value);
	}

	private static String concatenate(GenericCircularBuffer<String> buffer) {
		StringBuilder result = new StringBuilder();
		String value;
		
		while ((value = (String) buffer.poll()) != null) {
			result.append(value);
		}
		return result.toString();
	}

}
