package week4java;

import java.util.ArrayList;
import java.util.List;

public class week4Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] cars = new String [3];
		cars[0] = "Camaro";
		cars[1] = "F150";
		cars[2] = "Mustang";
		
		//List<E> list of E where E is the generic that will be replaced with the type
		//list<String> reads as list of String
		List<String> sports = new ArrayList<String>();
		sports.add("wristling");
		sports.add("soccer");
		sports.add("football");
		sports.remove(1);
		
		for (int i = 0; i < sports.size(); i++) {
			System.out.println(sports.get(i));
		}
		
		for (String sport : sports) {
			System.out.println(sport);
		}
		
		List<Integer> numbers = new ArrayList<Integer>();
	}

}
