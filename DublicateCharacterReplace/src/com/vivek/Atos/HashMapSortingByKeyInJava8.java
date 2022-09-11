package com.vivek.Atos;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
public class HashMapSortingByKeyInJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating HashMap object of type <String, String>
        HashMap<String, String> companyFounder = 
                new HashMap<String, String>(); 
 
        // adding key-value pairs to HashMap object
        companyFounder.put("Google", "Sundar Pichai");
        companyFounder.put("Facebook", "Mark Zuckerberg");
        companyFounder.put("LinkedIn", "Reid Hoffman");
        companyFounder.put("Apple", "Tim Cook");
        companyFounder.put("Microsoft", "Bill Gates");
        companyFounder.put("Amazon", "Jeff Bezos");
        companyFounder.put("Oracle", "Larry Ellison");
 
        System.out.println("Before Sorting for Keys:\n");
 
        // iterating original HashMap
        for(Map.Entry<String, String> mvalue : companyFounder.entrySet()){
            System.out.println("Key : "  + mvalue.getKey() + "\t\t"
                    + "Value : "  + mvalue.getValue());
        }
 
        // create LinkedhashMap for storing entries 
        // after SORTING by Keys using Stream in Java 8
        Map<String, String> keyLHMap = new LinkedHashMap<>();
 
        // Sorting by Keys using comparingByKey() method
        companyFounder.entrySet().stream().sorted(
                Map.Entry.comparingByKey()).forEachOrdered(
                        c -> keyLHMap.put(c.getKey(), c.getValue()));
 
        System.out.println("\n\nSorting Keys using stream in Java 8\n");
 
        // iterating LinkedHashMap in normal way
        for(Map.Entry<String, String> keyEntry : keyLHMap.entrySet()){
            System.out.println("Key : "  + keyEntry.getKey() + "\t\t"
                    + "Value : "  + keyEntry.getValue());
        }
	}

}
