package stringmethodsprogram;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="pratiksha";
		String reversedStr="";
	for(int i=string.length()-1;i>=0;i--)
	{
		reversedStr=reversedStr+string.charAt(i);
	}
	System.out.println("Original string=" +string);
	System.out.println("Reversed of given  string=" +reversedStr);
	

	}

}
