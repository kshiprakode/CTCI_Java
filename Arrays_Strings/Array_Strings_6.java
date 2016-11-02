// Compress the given string depending on the number of characters.
// If the compressed string does not have a length smaller than the 
// given string, return the given string.
// Since each character in the string needs to be visited atleast once
// Time Complexity - O(n) (Using StringBuilder)
// Time Complexity - O(n + concat^2) (Using String since, string concat takes O(n^2) time)

package ctci.kshiprakode.Arrays_Strings;

public class Array_Strings_6 {

	// String concatenation is an expensive overation and should be replaced by StringBuilder.
	public static String stringCompression(String string){
		
		StringBuilder newString = new StringBuilder();
		
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
			newString.append(Character.toString(string.charAt(i)) + counter);
			i = j;
			counter = 0;
		}

		if(newString.length() < string.length())
			return newString.toString();

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
