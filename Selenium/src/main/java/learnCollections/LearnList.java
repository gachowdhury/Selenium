package learnCollections;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step 1 : Create object for ArrayList
		List<String> lst = new ArrayList<String>();
		
		//Add Item in the list
		lst.add("Leemon");
		lst.add("Shumaiya");
		lst.add("Naira");
		lst.add("Nabhan");
		lst.add("Amaria");
		
		System.out.println(lst);
		
		//get the count of list
		System.out.println(lst.size());
		
		//Add in the list
		lst.add("LearnList");
		System.out.println(lst.size());
		
		System.out.println("........................................");
		
		//Print all items inside the list
		for (int i = 1; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		
		//Delete or Remove the item from list
		lst.remove(1);
		
		//Print all items inside the list
				for (int i = 0; i < lst.size(); i++) {
					System.out.println(lst.get(i));
				}
				System.out.println("........................................");
				
				System.out.println(lst.contains("Leemon"));
				
				System.out.println("........................................");
				
				lst.clear();
				System.out.println("........................................");

				System.out.println(lst.isEmpty());
				
	}
}
