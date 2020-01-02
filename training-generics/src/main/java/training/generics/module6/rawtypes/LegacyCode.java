package training.generics.module6.rawtypes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LegacyCode {

	public static void main(String[] args) {
		List<Object> values = new ArrayList<>();
		values.add("abc");
		values.add(1);
		values.add(new Object());
		
		List rawType = values;
		List<String> strings = rawType;
		
		for (String string : strings) {
			System.out.println(string);
		}
		
		Iterator iterator = values.iterator();
		while (iterator.hasNext()) {
			Object element = iterator.next();
			System.out.println(element);
		}
		
	}

}
