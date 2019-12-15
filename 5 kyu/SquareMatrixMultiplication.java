public class SquareMatrixMultiplication {
	public static int[][] matrixMultiplication(int[][] a, int[][] b) {
		int[][] myArray = new int[a.length][b[0].length];

		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				for(int k = 0; k < a[0].length; k++) {
					myArray[i][j] += a[i][k]*b[k][j];      
				}    
			}
		}
		return myArray;
	}
}