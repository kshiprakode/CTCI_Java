// Given a matrix, 

package ctci.kshiprakode;

import java.util.Arrays;
import java.util.HashSet;

public class Array_Strings_8 {

	public static void zeroMatrixSpace1(int [][]mat)
	{
		
		boolean rowZero = false;
		boolean columnZero = false;
		
		for(int i = 0; i < mat.length; i++)
		{
			if(mat[i][0] == 0)
				rowZero = true;
		}
		
		for(int i = 0; i < mat[0].length; i++)
		{
			if(mat[0][i] == 0)
				columnZero = true;
		}
		
		if(rowZero && columnZero)
		{
			mat[0][0] = 0;
		}
		
		for(int i = 1; i < mat.length; i++)
		{
			for(int j = 1; j < mat[0].length; j++)
			{
				if(mat[i][j] == 0)
				{
					mat[i][0] = 0;
					mat[0][j] = 0;
				}
			}
		}

		for(int i = 1; i < mat.length; i++)
		{
			for(int j = 1; j < mat[0].length; j++)
			{
				if(mat[i][j] == 0)
				{
					mat[i][0] = 0;
					mat[0][j] = 0;
				}
			}
		}

		for(int i = 0; i < mat.length; i++)
			System.out.println(Arrays.toString(mat[i]));
		
		
		for(int i = 1; i < mat.length; i++)
		{
			if(mat[i][0] == 0)
			{
				for(int j = 1; j < mat[0].length; j++)
				{
					mat[i][j] = 0;
				}
			}
		}
		
		for(int i = 1; i < mat[0].length; i++)
		{
			if(mat[0][i] == 0)
			{
				for(int j = 1; j < mat.length; j++)
				{
					mat[j][i] = 0;
				}
			}
		}
		

		if(mat[0][0] == 0)
		{
			for(int i = 0 ; i < mat.length;i++ )
				mat[i][0] = 0;
			for(int i = 0 ; i < mat[0].length;i++ )
				mat[0][i] = 0;

		}
		
		for(int i = 0; i < mat.length; i++)
			System.out.println(Arrays.toString(mat[i]));
		
	}
	
	public static void zeroMatrixSpacen(int [][]mat)
	{
		
		HashSet<Integer> row = new HashSet<Integer>();
		HashSet<Integer> column = new HashSet<Integer>();
		
		for(int i = 0; i < mat.length; i++)
		{
			for(int j = 0; j < mat[0].length; j++)
			{
				if(mat[i][j] == 0)
				{
					row.add(i);
					column.add(j);
				}
				
			}
		}

		for(int i = 0; i < mat.length; i++)
		{
			if(row.contains(i))
				for(int j = 0; j < mat[0].length; j++)
				{
					mat[i][j] = 0;
					
				}
		}

		for(int i = 0; i < mat[0].length; i++)
		{
			if(column.contains(i))
				for(int j = 0; j < mat.length; j++)
				{
					mat[j][i] = 0;
					
				}
		}
		
		for(int i = 0; i < mat.length; i++)
			System.out.println(Arrays.toString(mat[i]));

		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{0,1,2,3},{1,2,3,4},{2,3,4,0},{1,2,3,4}};
		
		zeroMatrixSpacen(mat);
		zeroMatrixSpace1(mat);
	}

}
