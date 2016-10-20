//	Check if one string is a permutation of the other
//	Are spaces and symbols considered or ignored?
// 	Lower and Upper cases considered or not?

package ctci.kshiprakode;

import java.util.Arrays;

public class Array_Strings_2 {

	// Assuming character and symbols are present but not considered
	// Assuming lower and upper cases are both different 
	// Multiple ways to solve it
	// Sort and compare the strings (Time Complexity - O(n))
	// Use additional data structure - (Time Complexity - O(n), Space Complexity - O(n))	
	public static boolean isPermutation(String string1, String string2)
	{
		
		
		return false;
	}

	
	public static boolean isPermutationUsingSort(String string1, String string2)
	{
		char str1[] = string1.toCharArray();
		Arrays.sort(str1);
		
		char str2[] = string1.toCharArray();
		Arrays.sort(str2);
		
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("String Permutation");
		System.out.println("String 1 : \nString 2 : \n" + isPermutation("",""));
		
	}

}
