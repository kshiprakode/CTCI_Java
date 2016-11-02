//	Rotate Matrix
// Complexity is O(n^2)

package ctci.kshiprakode.Arrays_Strings;

import java.util.Arrays;

public class Array_Strings_7 {

	
	// Generic function to print the 2D matrix
	private static void printMatrix(int [][]mat, int n){
		
		for(int i = 0; i < n ;i++)
		{
			System.out.println(Arrays.toString(mat[i]));
		}

		
	}
	public static void rotate(int [][]mat, int n)
	{
		// For each layer
		for(int layer = 0 ; layer < n/2; layer++)
		{
			
			int first = layer;
			int last = n - 1 - layer;
			
			// Do one round of traversals in each for loop
			for(int i = first; i < last; i++)
			{
				// Getting an offset depending on the layer we are
				int offset = i - first;
				
				int top = mat[first][i];

				// top left -> top right
				mat[first][i] = mat[last-offset][first];

				// top right -> bottom right
				mat[last-offset][first] = mat[last][last-offset];
				
				// bottom right -> bottom left
				mat[last][last-offset] = mat[i][last];
				
				// bottom right -> top left
				mat[i][last] = top;
				
			}
		}
		
		System.out.println();
		System.out.println("After Rotation");
		printMatrix(mat,n);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		System.out.println("Before Rotation");
		
		printMatrix(mat,4);
		rotate(mat,4);
		
	}

}
