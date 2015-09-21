package strings;

public class StringParanthesisBal {
	// Write a program to check if a given string of parenthesis has balanced parenthesis or not.For example a string as "(())" is a valid string where as strings like ")(" or "(()))" are not valid strings.
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="()";
		//String str2="(())";
		//char[] char2=new char[]{'(','(',')',')'};
		//String str2 =new String(char2);
		
		//System.out.println(String.valueOf(char2));
		String str3=")(";
		String str4="(()))";
		
		char[] str5= new char[]{'(','(','(',')',')'};
		
		for (int i=1;i<str5.length;i++)
		{
		if (str5[i]==(str5[i+1]))
			System.out.println("equal");
		else
			System.out.println(" Not equal");
		
		
		
	}
		
	}
}
