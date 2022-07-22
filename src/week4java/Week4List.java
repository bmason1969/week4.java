package week4java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week4List {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	}
//	Create a List of integers from one to the value stored in endNum. After the List has been created, then print it to the console.
		public static void createList(int endNum) {
		// Write your code in this method
		
			List<Integer> listNums = new ArrayList<Integer>();
			
			if (endNum > 0 ) {		    
			       
		    for ( int i = 1; i <= endNum; i++ ) {
			       listNums.add(i);
		    } 
		    
		System.out.println("The first number in the List is " + listNums.get(0));
		
	    System.out.println("The last number in the List is " + listNums.get(listNums.size()-1));
			} else {
			    System.out.println("Your List cannot be less than zero.");
			}
		}

		
 public static void main1(String[] args) {
	Scanner in = new Scanner(System.in);
	int endNum = in.nextInt();
	
	createList(endNum);
 }
// Create a List of integers from one to the value stored in endNum. After the List has been created, then print it to the console. 
 
 public static void createList1(int endNum) {
		// Provide inline hints or outlines for your students
		List<Integer> listNums = new ArrayList<>();
		
		for (int i = 1; i <= endNum; i++) {
		    listNums.add(i);
		}
		
		System.out.println(listNums);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int endNum = in.nextInt();
		
		createList(endNum);
	}
	
//	Create a list that finds all the (positive) factors of the value of userNumber and stores them as elements of the list. 
//	At a minimum all values of userNumber will have two (2) possible factors at a minimum; one (1) and userNumber. Then print the list to the console.
//	Make use of the modulo operator (%) inside a loop to determine if the number returns a zero. If so, it is a factorial.
	static void factors(int userNumber) {
	List<Integer> factorNum = new ArrayList<>();
	for (int i = 1; i <= userNumber; i++) {
	    if ( userNumber % i == 0) {
	        factorNum.add(i);
	    }
	}
	
	System.out.println(factorNum);
}
	public static void main2(String[] args) {
			Scanner in = new Scanner(System.in);
			int userNumber = in.nextInt();
			factors(userNumber);
		}
	}




	