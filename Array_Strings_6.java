// Compress the given string depending on the number of characters.
// If the compressed string does not have a length smaller than the 
// given string, return the given string.
// 


package ctci.kshiprakode;

public class Array_Strings_6 {

	public static String stringCompression(String string){
		
		String newString = new String();
		
		int counter = 1;
		for(int i = 0 , j = 1 ;i < string.length();)
		{
			if(i < string.length() && j <  string.length())
			{
				while(string.charAt(i) == string.charAt(j) && j < string.length())
				{
					counter++;
					j++;
				}
			}

			newString += Character.toString(string.charAt(i)) + counter;
			i = j;
			counter = 0;
			System.out.println(newString);
		}
		
		return newString;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(stringCompression("aaa"));

	}

}
