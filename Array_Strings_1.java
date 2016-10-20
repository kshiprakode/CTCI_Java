//	Determine if a string has all unique characters
//	Assumptions, 'A' and 'a' are different
//	Space and symbols are ignored

package ctci.kshiprakode;

public class Array_Strings_1 {

	public static boolean isUnique(String string)
	{
		// Array to keep a count of occurrence of each character
		boolean charCount[] = new boolean[128];
		
		// Loop for each character and check if it was encountered earlier
		// If encountered earlier, return false
		for(int i = 0; i < string.length(); i++)
		{
			if(Character.isLetterOrDigit(string.charAt(i)))
			{
				if(charCount[string.charAt(i)-'A'])
				{
					return false;
					
				}
				else
		// If not encountered earlier, return true
					charCount[string.charAt(i)-'A'] = true;
			}
		}
		return true;
		
	}
	
	// Considers only lower case characters 'a' - 'z'
	// We use an integer as a bit vector to keep a track of all
	// the characters we have encountered. 
	public static boolean isUniqueBitVector(String string)
	{
		int bitVector = 0;
		for(int i = 0; i < string.length(); i++)
		{
			int val = string.charAt(i) - 'A';
			if((bitVector & (1 << val)) > 0)
				return false;
			else
				bitVector = bitVector | (1 << val);
		}
		return true;
	}
	
	public static void main(String[] args) {
	
	//		Test Cases - 
	//		1. Empty String should return true.
	//		2. Adding different strings with no repetitions
	//		3. Strings with repetitions
	//		4. String with symbols
	//		5. Strings with small and capital characters

		System.out.println("Using an extra O(n) space");
		System.out.println("  : " + isUnique(""));
		System.out.println("Sphinx of black quartz, judge my vow : " + isUnique("Sphinx of black quartz, judge my vow"));
		System.out.println("Mr. Jock, TV quiz PhD, bags few lynx : " + isUnique("Mr. Jock, TV quiz PhD, bags few lynx"));
		System.out.println("aA : " + isUnique("aA"));
		System.out.println("a++A : " + isUnique("a++A"));
		System.out.println("aa : " + isUnique("aa"));
		
		System.out.println();
		System.out.println("Using a O(1) space");
		System.out.println("  : " + isUniqueBitVector(""));
		System.out.println("Sphinx of black quartz, judge my vow : " + isUniqueBitVector("Sphinx of black quartz, judge my vow"));
		System.out.println("Mr. Jock, TV quiz PhD, bags few lynx : " + isUniqueBitVector("Mr. Jock, TV quiz PhD, bags few lynx"));
		System.out.println("ab : " + isUniqueBitVector("ab"));
		System.out.println("a++A : " + isUniqueBitVector("a++A"));
		System.out.println("aa : " + isUniqueBitVector("aa"));
		
		
	}

}
