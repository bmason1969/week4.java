package week4java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Week4menueAppwithList {
	static Scanner scanner = new Scanner(System.in);

//	public static void main(String[] args) {
		// TODO Auto-generated method stub
	static Map<String, String> phoneBook = new HashMap<String, String>();
	public static void main (String[]args) {
		
		int choice = 0;
		while (choice != 4) {
			priceMenue();
			choice = getuserChoice();
		if(choice == 1) {
			displayPhoneBook();
		}else if(choice == 2) {
			addContavt();
		}else if(choice == 3) {
				deleteContact();
		}else if (choice == 4) {
					System.out.println("Goodbye");
		}else {
					System.out.println("Please pick a valip option!");
				}
	}
	}

}
