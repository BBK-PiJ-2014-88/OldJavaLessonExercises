public class Matrix{
	private int[][] array2d;
	private int rowLength = 0;
	private int columnLength = 0;

	public Matrix(int row, int column){
		this.array2d = new int[row][column];
		this.rowLength = row;
		this.columnLength = column;
		for (int a = 0; a < row; a++;){
			for (int b = 0; b < column; b++;){
				this.array2d[a][b] = 1;
			}
		}
	}

	public void setElement(int s, int t, int u){
		if (s < rowLength ) && if (t < columnLength){
			this.array2d[s][t] = u
		}
	}

	public void setRow(int rowToChange, String text){
		private boolean continue1 = true;
		private int count = 1;
		//checking number of commas in text to see if number of values is OK
		//count starts at 1 as the number of values in text 67,89,34 will
		// be the number of commas plus one
		//
		for (x = 0; x <


	}


}