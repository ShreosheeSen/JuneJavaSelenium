package LogicalPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicateCharaters {

	public static void main(String[] args) {
	
		String s = "PunePunemumbaimumbaidelhimum";
		
		Set<Character> se = new HashSet<Character>();
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if(!se.contains(c))
			{
				se.add(c);
				sb.append(c);
				
			}
		}
		System.out.println(sb);
		

	}

}
