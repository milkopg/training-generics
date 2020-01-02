package training.generics.module6.erasure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Erasure<T, B extends Comparable<B>> {
	public void unbounded(T param) {
		System.out.println("T is a string");
	}
	
	public void lists (List<String> param, List<List<T>> param2) {
		String str = param.get(0);
	}
	
	public void bounded (B param) {
		System.out.println("B is CustomComparable<Integer>");
	}
	
	
	public static void main(String[] args) {
		Erasure<String, CustomComparable<Integer>> erasure = new Erasure<String, CustomComparable<Integer>>();
		
		CustomComparable<Integer> customComparable = new CustomComparable<Integer>() {
			
			@Override
			public int compareTo(CustomComparable<Integer> o) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		erasure.bounded(customComparable);
		
		erasure.lists(Arrays.asList("one"), new ArrayList(new ArrayList<String>()));
		erasure.unbounded("String");
	}
	

}


