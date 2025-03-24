public class PracticeProblem {

	public static void main(String args[]) {

	}




	public static int sum2D(int[][] array2D)
	{
		int sum = 0;
		for (int row = 0 ; row < array2D.length; row++)
		{
			for (int column = 0; column < array2D[row].length; column++)
			{
				sum += array2D[row][column];
			}
		}
		return sum;
	}




	public static int sumRow(int[][] array2D , int rowNum )
	{
		int sum = 0;
		for (int column = 0; column < array2D[rowNum].length; column++)
		{
			sum += array2D[rowNum][column];
		}
		return sum;
	}






	public static int sumColumn(int[][] array2D , int column )
	{
		int sum = 0;
		for (int row = 0; row < array2D.length; row++)
		{
			sum += array2D[row][column];
		}
		return sum;
	}






	


}
