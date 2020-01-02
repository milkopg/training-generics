package training.generics.module7.a_class_literals;

public class Logger {
	private String value;
	
	public Logger(String value) {
		this.value = value;
	}
	
	public void log() {
		System.out.println(value);
	}
}
