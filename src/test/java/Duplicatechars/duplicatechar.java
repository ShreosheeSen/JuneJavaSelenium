package Duplicatechars;

import java.util.HashMap;
import java.util.Map;

public class duplicatechar {

	public static void main(String[] args) {
		
	        String str = "sssseeeeellllllnnnnnnniuuuuuuuuummmmmmmmmm";
	        findDuplicateCharacters(str);
	}

	    public static void findDuplicateCharacters(String str) 
	    {
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Count the occurrences of each character
	        for (char c : str.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        // Print characters with count > 1
	        System.out.println("Duplicate characters in the string:");
	        
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) 
	        {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + " : " + entry.getValue());
		
	}

}
	        
	    }
	    
}

	        
	    
	    
