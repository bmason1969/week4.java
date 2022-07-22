package week4java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week4codingQuestions {

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	static void beginEnd(int endNum) {
			// Add your code below this line 
//			if ( endNum > 0 ) {
//			    List<Integer> newList = new ArrayList<>();
	//		    for ( int i = 1; i <= endNum; i++ ) {
//			        newList.add(i);
	//		    }
			
		//	    System.out.println("The first number in the List is " + newList.get(0));
//			    System.out.println("The last number in the List is " + newList.get(newList.size()-1));
	//		} else {
		//	    System.out.println("Your List cannot be less than zero.");
//			}

			// Add your code above this line
		
//			Scanner in = new Scanner(System.in);
//			int endNum = in.nextInt();
			
//		}
//	Given a List called tenWords that contains ten (10) different words, write a program that takes integer values stored in num1, num2, and num3 
//	and use that to find the value stored in the particular positions in the List. Take these three (3) words and create a new List called threeWords. 
//	Print out the List stored in threeWords to the console.

//	Don't forget to make sure the numbers entered for num1, num2, and num3 is between 0 and 9.
	

				static void wordReplace(List<String> tenWords, int num1, int num2, int num3) {
				// Write your code below this line
				if ((num1 >= 0 && num1 < 10) && (num2 >= 0 && num2 < 10) && (num3 >= 0 && num3 < 10)) {
				    List<String> threeWords = new ArrayList<String>();
				    String word1 = tenWords.get(num1);
				    String word2 = tenWords.get(num2);
				    String word3 = tenWords.get(num3);
				    
				    threeWords.add(word1);
				    threeWords.add(word2);
				    threeWords.add(word3);
				    System.out.println(threeWords);
				} else {
				    System.out.println("Sorry, there was an error getting a number you requested.");
				}
			    
				// Write your code above this line
			}
								
		    // DO NOT CHANGE ANY CODE BELOW THIS LINE
			public static void main(String[] args) {
				
				Scanner in = new Scanner(System.in);
				int num1 = in.nextInt();
				int num2 = in.nextInt();
				int num3 = in.nextInt();
				
				List<String> tenWords = new ArrayList<String>();
				tenWords.add("Bumfuzzle");
				tenWords.add("Cattywampus");
				tenWords.add("Widdershins");
				tenWords.add("Gubbins");
				tenWords.add("Lollygag");
				tenWords.add("Malarkey");
				tenWords.add("Wabbit");
				tenWords.add("Impignorate");
				tenWords.add("Yarborough");
				tenWords.add("Bloviate");
				
				wordReplace(tenWords, num1, num2, num3);
			}
		
//			Create a list that finds all the (positive) factors of the value of userNumber and stores them as elements of the list. 
//			At a minimum all values of userNumber will have two (2) possible factors at a minimum; one (1) and userNumber. Then print the list to the console.
//			Make use of the modulo operator (%) inside a loop to determine if the number returns a zero. If so, it is a factorial.
			
			List<Integer> userNumber = new ArrayList<Integer>();
			static void factors(int userNumber) {
				
				List<Integer> factorNum = new ArrayList<>();
				for (int i = 1; i <= userNumber; i++) {
				    if ( userNumber % i == 0) {
				        factorNum.add(i);
				    }
				System.out.println(factorNum);
				}
			}	
//			Given four integer numbers stored in the variables num1, num2, num3, and num4, create a List that stores all of the values plus the 
//			sum of all the values in the last element in the List. 	Print the List to the console.
			static void sumList(int num1, int num2, int num3, int num4) {
				List<Integer> numsPlusSum = new ArrayList<>();
				numsPlusSum.add(num1);
				numsPlusSum.add(num2);
				numsPlusSum.add(num3);
				numsPlusSum.add(num4);
				numsPlusSum.add(num1 + num2 + num3 + num4);
				
				System.out.println(numsPlusSum);
			}
		
//			Given five (5) numbers by the user stored in num1, num2, num3, num4, and num5, create a List called squaredNums 
//			that takes the user values and stores the squared value of that number as an element of squaredNums.
			
			static List squaredList(int num1, int num2, int num3, int num4, int num5) {
			    //your code  here
				List<Integer> squaredNums = new ArrayList<Integer>();
				squaredNums.add(num1*num1);
				squaredNums.add(num2*num2);
				squaredNums.add(num3*num3);
				squaredNums.add(num4*num4);
				squaredNums.add(num5*num5);
				
														
			    	return squaredNums;
			}
	
	

			public static void main1(String[] args) {
				
				Scanner in = new Scanner(System.in);
				int num1 = in.nextInt();
				int num2 = in.nextInt();
				int num3 = in.nextInt();
				int num4 = in.nextInt();
				int num5 = in.nextInt();
				
				System.out.println(squaredList(num1,num2,num3,num4,num5));
			}
			
//			Create a List of integers from one to the value stored in endNum. After the List has been created, then print it to the console.
			static void createList(int endNum) {
				// Provide in line hints or outlines for your students
				List<Integer> listNums = new ArrayList<>();
				
				for (int i = 1; i <= endNum; i++) {
				    listNums.add(i);
				}
				
				System.out.println(listNums);
			}

			public static void main2(String[] args) {
				Scanner in = new Scanner(System.in);
				int endNum = in.nextInt();
				
				createList(endNum);
			}

//			Given a List of characters called alphabet, search the list for the character stored in userLetter and print to the console the index value of that 
//			character.
			static void findLetter(List alphabet, char userLetter) {
				// Write your code below this line 
				int valueIndex = alphabet.indexOf(userLetter);
				System.out.println(valueIndex);
				
				// Write your code above this line 
			}

			public static void main3(String[] args) {
				Scanner in = new Scanner(System.in);
				char userLetter = in.next().charAt(0);
				
				List<Character> alphabet = new ArrayList<>();
				for (int i = 97; i < (97+26); i++) {
				    alphabet.add((char) i);
				}
				
				findLetter(alphabet, userLetter);
			}
				
				
//				Given a List of five (5) words entered in by the user, create a new List that contains every other List item from the original list starting with 
//				the first item.	Print the old List and the new List to the console.
				
				
				static void halfList(List words) {
					// Provide inline hints or outlines for your students
					List<String> newList = new ArrayList<>();
					for(int i = 0; i < words.size(); i++) {
					    if ( i % 2 == 0 ) {
					        newList.add(words.get(i).toString());
					    }
					}
					System.out.println("The old list is: " + words);
					System.out.println("The new list is: " + newList);
				}

			    // DO NOT CHANGE THE CODE BELOW THIS LINE
				public static void main4(String[] args) {
					Scanner in = new Scanner(System.in);
					String word1, word2, word3, word4, word5;
					word1 = in.nextLine();
					word2 = in.nextLine();
					word3 = in.nextLine();
					word4 = in.nextLine();
					word5 = in.nextLine();
					List<String> words = new ArrayList<>();
					words.add(word1);
					words.add(word2);
					words.add(word3);
					words.add(word4);
					words.add(word5);
					
					halfList(words);
					
				}
//				Given a list stored in productList, write a program that will access elements in the list based on the index value stored in indexVal. 
//				Because this number is provided by the user, check to make sure the number is at least zero (0), but not larger than the index value of 
//				the last item in the list.If indexVal is valid, print the product associated with the value stored at indexVal. If indexVal is not valid, 
//				then print to the console, "No product can be found with that product number."
				
				public static void main5(String[] args) {
				    //DO NOT CHANGE CODE BELOW
					Scanner in = new Scanner(System.in);
					int indexVal = in.nextInt();
					List<String> productList = new ArrayList<>(); 
					
					productList.add("Macbook");
					productList.add("HP Notebook");
					productList.add("iPhone 12");
					productList.add("Acer Aspire");
					productList.add("Windows Surface");
					productList.add("Galaxy S20");
					//DO NOT CHANGE CODE ABOVE
					
					// Write your code below this line
					if (indexVal >= 0 && indexVal < productList.size()) {
					    System.out.println(productList.get(indexVal));
					} else {
					    System.out.println("No product can be found with that product number.");
					}
					
				}
			}