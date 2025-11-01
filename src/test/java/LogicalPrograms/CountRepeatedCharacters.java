package LogicalPrograms;

public class CountRepeatedCharacters {

	public static void main(String[] args) {
		String str ="Engineering";
		int count = 0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			char temp = str.charAt(i);
			if (temp=='e' || temp=='E') 
			{
				count++;
			}
			
		}
		
      System.out.println("number of e or E "+ count);
	}

}
