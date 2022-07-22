package week4java;

import java.util.ArrayList;
import java.util.List;

public class Week4Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
// why would we use a StringBuilder instead of a String
// String is mutable they can not be changed . StringBuilder can be changed multiple times or built up
	
// instantiate a new StringBuilder and append the characters 0 through 9 to it separated by dashes
// make sure no dashes appear at the end of the StringBuilder
	
	StringBuilder sb = new StringBuilder();
//	sb.append(0);
//	sb.append('-';
//	sb.append('-');
//	this this the long way but below is better
	
	for(int i = 0; i < 10; i++) {
		if (i != 9) {
		sb.append(i + "-");
	}else {
		sb.append(i);
	}
	}
		System.out.println(sb.toString());
		
// another way of doing this:
 	for(int i = 0; i < 10; i++) {
		sb.append(i);
		if (i != 9) {
		sb.append("-");
	
	}
}
		System.out.println(sb.toString());	
	
	
// create a list of Strings and add 5 Strings to it, each with a different length
	List<String> names = new ArrayList<String>();
	names.add("Ty");
	names.add("Roy");
	names.add("Mike");
	names.add("Justin");
	names.add ("Alexander");
	
	System.out.println(names);
	}
}

	
	

