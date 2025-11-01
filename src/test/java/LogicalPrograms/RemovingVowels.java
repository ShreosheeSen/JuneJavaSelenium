package LogicalPrograms;

public class RemovingVowels {

	public static void main(String[] args) {
		
		String m="kashi";
		String m1 = "";
		//String str1 = str.toLowerCase();
		
		for(int i=0; i<=m.length()-1;i++)
		{
			char temp = m.charAt(i);
			if(temp=='a' || temp=='e'|| temp =='i' || temp == 'o' || temp == 'u')
			{
				continue;
			}
			m1=m1+temp;
		}
		System.out.println(m1);

	}

}
