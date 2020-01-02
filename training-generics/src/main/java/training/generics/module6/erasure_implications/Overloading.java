package training.generics.module6.erasure_implications;

import java.util.List;

public class Overloading {
	public void print(String param) {
		
	}
	
	public void print(Integer param) {
		
	}
	
	public void print (List<String> param) {
		
	}
	
	//Compile error cannot overload generics
//	public void print (List<Integer> param) {
//		
//	}
}

