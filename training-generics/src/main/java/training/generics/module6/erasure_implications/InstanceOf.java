package training.generics.module6.erasure_implications;

public class InstanceOf<T> {
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof InstanceOf) {
			return true;
		}
		return false;
	}
}
