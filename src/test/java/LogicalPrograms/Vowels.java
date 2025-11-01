package LogicalPrograms;

public class Vowels {

	public static void main(String[] args) {
		
		String str="I love oranges";//a,e,i,o,u
		int count = 0;
		String str1 = str.toLowerCase();
		for(int i=0; i<=str1.length()-1;i++)
		{
			char temp = str1.charAt(i);
			if(temp=='a' || temp=='e'|| temp =='i' || temp == 'o' || temp == 'u')
			{
				count++;
				System.out.println(temp);
			}
		}
		System.out.println("Number of vowels" +count);

	}

}
