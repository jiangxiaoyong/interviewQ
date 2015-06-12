
public class Rotate {

	public int[][]rotate(int[][]matrix, int n){
		
		int [][] matrix_new = new int[n][n];
		for (int i = 0; i < n ; i++){
			for(int j = 0; j < n; j++){
				int x = matrix[i][j];
				matrix_new[j][n-1-i] = x;
			}
		}
		
		return matrix_new;
	}
	
	public static void main(String[] args) {
		
		int [][]matrix = new int[4][4];
		int counter = 1;
		for(int i = 0 ;i < 4; i ++){
			for(int j = 0; j < 4; j ++){
				matrix[i][j] = counter;
				counter ++;
			}
				
		}
		
		Rotate r = new Rotate();
		int [][] results = r.rotate(matrix, 4);
		
		for(int i = 0 ;i < 4; i ++){
			for(int j = 0; j < 4; j ++){
				System.out.println(results[i][j]);
			}
				
		}
	}

}
