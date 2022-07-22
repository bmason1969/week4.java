/**
 * 
 */
package week4java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author bmaso
 *
 */
public class week4Collections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 *  TODO Auto-generated method stub
		 *
		 * a list is a type of collection like dog to animals
		 * list- allows for duplicate, allows null values,keeps elements ordered by index 
		 *List common implementations: ArrayList, LinkedList, Vector
		 */
		
		List<String> students = new ArrayList<String> ();
		students.add("Rob");
		students.add("Rob");
		students.add("Sam");
		students.add("null");
		
		for(String student : students) {
			System.out.println(student);
		}
		System.out.println(students.get(2));//Sam
		System.out.println(students.get(0));//Rob
		/*
		 * set:
		 * no duplicates, it does not allow duplicates
		 * unordered; when you print a set it does not follow order entered
		 * it allows null (only one null since it does not allow duplicates)
		 * common implementations: HashSet, LinkedHashSet, TreeSet
		 */
		
		Set<String> states = new HashSet<String>();
		states.add("Alabama");
		//states.add("Alabama");
		states.add("Alaska");
		states.add("Arizona");
		states.add("California");
		states.add("null");
		
		System.out.println(states.size());
		System.out.println(states.contains("New Jersey"));
		if (states.contains("Alabama")) {
			states.remove("Alabama");
		}
		
		for(String state : states) {
			System.out.println(state);
		}
		
		/*
		 * Maps:
		 * Map<K, V> K is the key, and V is the value
		 * key value pairs (dictionary)
		 * values can be duplicate but not keys
		 * common implementations: HashMap, LinkedHashMap, TreeMap, Hashtable.
		 */
		
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		racerPlacements.put(1, "Tommy");
		racerPlacements.put(2, "Sally");
		racerPlacements.put(3, "John");
		
		System.out.println(racerPlacements.get(1));
		
		racerPlacements.remove(1);
		
		
		Set<Integer> racerKeys = racerPlacements.keySet();
		for(Integer key : racerKeys) {
			System.out.println(key + ":" + racerPlacements.get(key));
		}
		
		Collection<String> racer = racerPlacements.values();
		for(String racers : racer) {
			System.out.println(racer);
		}
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Augment", "make somthing greater");
		dictionary.put("Diminish", "make or become less");
		dictionary.put("Ostentatious", "vulgar");
		
		
	}

}
