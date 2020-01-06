package fall2019;

public class leetCode807 {
	
	public int maxIncreaseKeepingSkyline(int[][] grid) {
		
		int sum = 0;
        for (int index = 0; index < grid.length; index++) {
        	for (int j = 0; j < grid[0].length; j++) {
        		sum += grid[index][j];
        	}
        	
        }
        
        return sum;
    }

}
