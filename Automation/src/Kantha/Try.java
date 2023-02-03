package Kantha;

public class Try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="121";
		
		String str2="";
		
		for (int i=str1.length()-1; i>=0; i--)
		{
			str2=str2+str1.charAt(i);
			
		}
			if(str1.equals(str2))
			{
				System.out.println(" the given string is  palindrom");
				
			}
			else
			{
				System.out.println("the given string not a palindram");
			}
	}

}
