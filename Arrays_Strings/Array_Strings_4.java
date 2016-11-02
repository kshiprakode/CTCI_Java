// Determine if a given string is a palindrome permutation
// Maintain character count (Time Complexity - O(n), Space Complexity - O(n))
// Sort and check (Time Complexity O(n log(n))

package ctci.kshiprakode.Arrays_Strings;

public class Array_Strings_4 {

	// Assuming spaces, symbols are ignored
	// lower case characters are different from uppercase characters
	public static boolean isPalindromePermutation(String string)
	{
		int charCount[] = new int[128];
		boolean flag = false; 
		
		// Loop for each character and keep character count
		for(int i = 0; i < string.length(); i++)
		{
			if(Character.isLetterOrDigit(string.charAt(i)))
			{
					charCount[string.charAt(i)-'A']++;
			}
		}

		for(int i = 0; i < 128; i++)
		{
			if(charCount[i] % 2 != 0)
			{
				if(flag)
					return false;
				else 
					flag = true;
			}
		}

		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("For string 'taco a atco' - " + isPalindromePermutation("taco a atco"));
		System.out.println("For string '' - " + isPalindromePermutation(""));
		System.out.println("For string 'ata' - " + isPalindromePermutation("ata"));
		System.out.println("For string 'atab' - " + isPalindromePermutation("atab"));
		System.out.println("For string 'atab' - " + isPalindromePermutation("a!"));
	}

}
