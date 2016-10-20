//	Check if one string is a permutation of the other
//	Are spaces and symbols considered or ignored?
// 	Lower and Upper cases considered or not?

package ctci.kshiprakode;

import java.util.Arrays;

public class Array_Strings_2 {

	// Assuming character and symbols are present but not considered
	// Assuming lower and upper cases are both different 
	// Multiple ways to solve it
	// Sort and compare the strings (Time Complexity - O(n log(n)))
	// Use additional data structure - (Time Complexity - O(n), Space Complexity - O(n))	
	public static boolean isPermutation(String string1, String string2)
	{
		int charCount1[] = new int[128];
		int charCount2[] = new int[128];
		
		// Loop for each character and keep character count
		for(int i = 0; i < string1.length(); i++)
		{
			if(Character.isLetterOrDigit(string1.charAt(i)))
			{
					charCount1[string1.charAt(i)-'A']++;
			}
		}

		// Loop for each character and keep character count
		for(int i = 0; i < string2.length(); i++)
		{
			if(Character.isLetterOrDigit(string2.charAt(i)))
			{
					charCount2[string2.charAt(i)-'A']++;
			}
		}

		// Compare the character counts
		return charCount1.equals(charCount2);
	
	}

	// Sort and compare the strings (Time Complexity - O(n log(n)))
	public static boolean isPermutationUsingSort(String string1, String string2)
	{
		char str1[] = string1.toCharArray();
		Arrays.sort(str1);
		
		char str2[] = string2.toCharArray();
		Arrays.sort(str2);
		
 		for(int i = 0, j = 0; i < str1.length && j < str2.length;)
		{
			// Increment i, if it points to a symbol or space
			if(!Character.isLetterOrDigit(str1[i]))
			{
				i++;
				continue;
			}
			// Increment j, if it points to a symbol or space
			if(!Character.isLetterOrDigit(str2[j]))
			{
				j++;
				continue;
			}
			if(Character.isLetterOrDigit(str1[i]) && Character.isLetterOrDigit(str2[j]))
			{
				if(str1[i] != str2[j])
				{
					return false;
				}
			}
			i++;
			j++;
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String Permutation - Using Sorting");
		System.out.println("String 1 : taco is cool\nString 2 : cool is taco \n" + isPermutationUsingSort("cool is taco","taco is cool"));
		System.out.println("\nString 1 : taco_is_cool!\nString 2 : cool is taco \n" + isPermutationUsingSort("cool_is_taco!","tacoiscool"));
		System.out.println("\nString 1 : [] \nString 2 : [ ] \n" + isPermutationUsingSort(""," "));
		System.out.println("\nString 1 : Hi! This is awesome! \nString 2 : hi! This is awesome \n" + isPermutationUsingSort("Hi! This is awesome!","hi! This is awesome"));
		System.out.println("\nString 1 : Hi! How are you?! \nString 2 : Hi! Doing good?! \n" + isPermutationUsingSort("Hi! How are you?!","Hi! Doing good?!"));
		
		System.out.println("\nString Permutation - Using Extra Space");
		System.out.println("String 1 : taco is cool\nString 2 : cool is taco \n" + isPermutationUsingSort("cool is taco","taco is cool"));
		System.out.println("\nString 1 : taco_is_cool!\nString 2 : cool is taco \n" + isPermutationUsingSort("cool_is_taco!","tacoiscool"));
		System.out.println("\nString 1 : [] \nString 2 : [ ] \n" + isPermutationUsingSort(""," "));
		System.out.println("\nString 1 : Hi! This is awesome! \nString 2 : hi! This is awesome \n" + isPermutationUsingSort("Hi! This is awesome!","hi! This is awesome"));
		System.out.println("\nString 1 : Hi! How are you?! \nString 2 : Hi! Doing good?! \n" + isPermutationUsingSort("Hi! How are you?!","Hi! Doing good?!"));
		
	}

}
