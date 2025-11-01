package LogicalPrograms;

public class Duplicatewords {

	public static void main(String[] args) {
		
		String s1[]= {"Java","Python","Testing","Automation"};
		
		String s2[]= {"Java","Python","Test","Automation"};
		
		for(int i=0;i<s1.length; i++)
		{
			for(int j=0;j<s2.length;j++)
			{
				if(s1[i]==s2[j])
				{
					System.out.println("Duplicate works are" +s1[i]);
				}
			}
		}
		

	}

}
