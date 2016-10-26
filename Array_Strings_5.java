// Determine the distance between two strings
// Add
// Delete
// Replace
// Time Complexity - O(n)

package ctci.kshiprakode;

public class Array_Strings_5 {

	
	public static int oneAway(String str1, String str2)
	{
		if(str1.length() == str2.length())
		{
			return calculateReplace(str1, str2);
		}
		else if(str1.length() > str2.length())
		{
			return calculateAddDelete(str1, str2);
		}
		else
			return calculateAddDelete(str2, str1);
	}

	private static int calculateReplace(String str1,String str2)
	{
		int counter = 0;
		for(int i = 0; i < str1.length();i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				counter++;
			}
		}
		return counter;		
	}
	
	private static int calculateAddDelete(String str1,String str2){
		
		int counter = 0;
		for(int i = 0,j = 0; i < str2.length() && j < str1.length();i++,j++)
		{
			if(str1.charAt(j)!=str2.charAt(i))
			{
				counter++;
				j++;
			}
		}
		return counter;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		Testcases:
		//			1. Empty Strings
		//			2. Strings one edit distance away.
		//			3. Strings two edit distance away.
		System.out.println("'' and '' \t\t: " + oneAway("",""));
		System.out.println("'pale' and 'bale' \t: " + oneAway("pale","bale"));
		System.out.println("'pale' and 'ple' \t: " + oneAway("pale","ple"));
		System.out.println("'pale' and 'bake' \t: " + oneAway("pale","bake"));
		System.out.println("'pales' and 'pale' \t: " + oneAway("pales","pale"));
		
	}

}
