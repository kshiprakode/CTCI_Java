// Compress the given string depending on the number of characters.
// If the compressed string does not have a length smaller than the 
// given string, return the given string.
// Since each character in the string needs to be visited atleast once
// Time Complexity - O(n)

package ctci.kshiprakode;

public class Array_Strings_6 {

	public static String stringCompression(String string){
		
		String newString = new String();
		
		int counter = 1;
		for(int i = 0 , j = 1 ;i < string.length() && j < string.length();)
		{
			while(string.charAt(i) == string.charAt(j))
			{
				counter++;
				j++;
				if(j >= string.length())
					break;
			}
			newString += Character.toString(string.charAt(i)) + counter;
			i = j;
			counter = 0;
		}

		if(newString.length() < string.length())
			return newString;

		return string;
	}
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		System.out.println(stringCompression("aaaaaba"));
		System.out.println(stringCompression("aba"));
		System.out.println(stringCompression("aaabbbccccdddeef"));
		System.out.println(stringCompression("aaaaaaabbbbbbb"));
		System.out.println(stringCompression("abcdeffffffff"));
		System.out.println(stringCompression("abcdef"));
		System.out.println(stringCompression(""));
	}
}
