package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
ArrayList<String> s = new ArrayList<String>();
		
		s.add("hi");
		s.add("hey");
		s.add("hello");
		s.add("okay");
		s.add("k");
		//2. Add five Strings to your list
		
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < s.size(); i++){
			String string = s.get(i);
			System.out.println(string);
		}
		System.out.println("\n");
			//4. Print all the Strings using a for-each loop
		for(String k : s){
			System.out.println(k);
		}
		System.out.println("\n");
		
	
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}

