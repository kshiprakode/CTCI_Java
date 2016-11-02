// Assume you are given a method isSubstring that checks if one string is the substring of another
// Write a method to check if one string is a rotation of the other with only one call is isSubstring

package ctci.kshiprakode.Arrays_Strings;

public class Arrays_Strings_9 {


	public static boolean isRotation(String str1, String str2)
	{

		// concat the second string with itself
		// can be replaced with an inexpensive operation
		str2 = str2 + str2;
		return str2.indexOf(str1) == -1 ? false : true;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Is waterbottle a rotation of bottlewater  : " + isRotation("waterbottle","bottlewater"));
		System.out.println("Is waterbottle a rotation of botwatetler  : " + isRotation("waterbottle","botwatetler"));
		
		
	}

}
