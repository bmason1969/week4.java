package week4java;

public class week4stringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName = "Sally";
		String lastName = "Smith";
		System.out.println(firstName + " " + lastName);
		
		String tripleHi = multiplyString("Hi", 3);
		System.out.println(multiplyString("Hello", 4));
		System.out.println(tripleHi);
		// use String when you have a value that is not going to change much. string is mutable
		firstName = firstName.concat(lastName);
		System.out.println(firstName);
		
		StringBuilder fullName = new StringBuilder("Sam");
		fullName.append(" Smith");
		System.out.println(fullName.toString());
//		System.out.println(fullName.charAt(s);
//		System.out.println(fullName.deleteCharAt(s));
//		System.out.println(fullName.delete(1, 3));
		System.out.println(fullName.indexOf("it"));
		System.out.println(fullName.replace(4, 9, "Thompson"));
		System.out.println(fullName.reverse());
	}

	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}
	// StringBuilder is not mutable
	// we use a StringBuilder to dynamically create a string and we use a String when we want to create a constant or a value that has been set
	/*
	 * 
	 */
	
	public static String multiplyStringB(String str, int num) {
		StringBuilder result = new StringBuilder();
//		for(int = 0; i < num; i++) { 
			result.append(str);
//	}
		return result.toString();
	}
		
}
