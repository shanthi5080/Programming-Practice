package strings;

public class Substring {
	//Write a program to find a substring in a given string and then replace it with another string.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "Lucky";
//Scanner in= new Scanner(Syetm.in)
String substr=str.substring(0,2);
String replstr=substr.replace("Lu","tr");
System.out.println("Substring is "+ substr);
System.out.println("Replace String is " +replstr);

		
	}

}
