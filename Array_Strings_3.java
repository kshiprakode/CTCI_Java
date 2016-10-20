// Replace all spaces in a string with '%20'
// Assuming you are given additional spaces to hold the extra characters

package ctci.kshiprakode;


public class Array_Strings_3 {

	// Start backwards and go on copying copy till you encounter a space
	// After encountering a space, add characters '%20'
	// Time Complexity - O(n)
	public static String URLify(char[] string)
	{
		int i = string.length -1;
		while(Character.isWhitespace(string[i]))
			i--;
		
		for(int j = string.length - 1; j >= 0 && i >= 0;i--)
		{
			if(!Character.isWhitespace(string[i]))
			{
				string[j] = string[i];
				j--;
			}
			else
			{
				string[j--] = '0';
				string[j--] = '2';
				string[j--] = '%';
			}
		}
		return String.valueOf(string);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("URLify 'this is a string      ' -> " + URLify(new String("this is a string      ").toCharArray()));
		System.out.println("URLify 'this' -> " + URLify(new String("this").toCharArray()));
		System.out.println("URLify 'Mr. John Smith    ' -> " + URLify(new String("Mr. John Smith    ").toCharArray()));
		System.out.println("URLify 'A B  ' -> " + URLify(new String("A B  ").toCharArray()));

	}

}
