package LogicalPrograms;

public class CountwithSpaces {

	public static void main(String[] args) {
		
		String str = "Au to  ma  ti  on";
		int count = 0;
		for(int i =0; i<=str.length()-1;i++)
		{
			char temp = str.charAt(i);
			
			if(temp == ' ')
			{
				count++;
			}
		}
       System.out.println("Spaces ::  "+count);
	}

}
