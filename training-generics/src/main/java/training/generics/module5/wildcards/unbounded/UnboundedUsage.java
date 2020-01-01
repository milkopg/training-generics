package training.generics.module5.wildcards.unbounded;

import java.util.ArrayList;
import java.util.List;

import training.generics.module5.wildcards.bounded.Person;

public class UnboundedUsage {

	public static void main(String[] args) {
		List<Object> objects = new ArrayList<>();
		objects.add(new Object());
		objects.add(new Person("Don Draper", 89));
		
		// Its only safe to add null to a List<?>
        List<?> wildcards = new ArrayList<>();
        wildcards.add(null);
        System.out.println(wildcards);
	}

}
