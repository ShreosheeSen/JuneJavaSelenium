package LogicalPrograms;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		
		String s1 = "Aace";
		String s2 = "Care";
		String s3 = "java";
		String s4 = "avaj";
		//String s5 = "Pace";
		
		if(s3.length() == s4.length())
{
			char[] c1 =s3.toCharArray();
			char[] c2 =s4.toCharArray();
			
			//char[] c3 =s1.toCharArray();
			//char[] c4 =s2.toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			//Arrays.sort(c3);
			//Arrays.sort(c4);
			
			System.out.println(c1);
			System.out.println(c2);
			
			//System.out.println(c3);
			//System.out.println(c4);
			
			boolean result = Arrays.equals(c1,c2);
			//boolean result1 = Arrays.equals(c3,c4);
			
			System.out.println(result);
			//System.out.println(result1);
			
			if(result)
			{
				System.out.println(s3+ " and " + s4 + "Are anagram string");
				
			}
			
			else
			{
				System.out.println(s3+ " and " + s4 + "Are Not anagram string");
				
			}	
			
			/*if(result1)
			{
				System.out.println(s1+ " and " + s2 + "Are anagram string");
				
			}
			
			else
			{
				System.out.println(s1+ " and " + s2 + "Are Not anagram string");
				
			}*/
}
		

	}

}
