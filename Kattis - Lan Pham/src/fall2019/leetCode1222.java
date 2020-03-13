package fall2019;

import java.util.ArrayList;
import java.util.List;

public class leetCode1222 {
	
	public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
		
		List<List<Integer>> answer = new ArrayList<>();
		
		char[][] chess = new char[8][8];
		
		for (int index = 0; index < queens.length; index++) {
			chess[queens[index][0]][queens[index][1]] = 'Q';
		}
        
		
		chess[king[0]][king[1]] = 'K';
		
		for (int index = king[0]; index < 8; index++) {
			if (chess[index][king[1]] == 'Q') {
				ArrayList<Integer> hey = new ArrayList<Integer>();
				hey.add(index);
				hey.add(king[1]);
				answer.add(hey);
				break;
			}
		}
		
		for (int index = king[0]; index >= 0; index--) {
			if (chess[index][king[1]] == 'Q') {
				ArrayList<Integer> hey = new ArrayList<Integer>();
				hey.add(index);
				hey.add(king[1]);
				answer.add(hey);
				break;
			}
		}
		
		for (int index = king[1]; index < 8; index++) {
			if (chess[king[1]][index] == 'Q') {
				ArrayList<Integer> hey = new ArrayList<Integer>();
				hey.add(index);
				hey.add(king[1]);
				answer.add(hey);
				break;
			}
		}
		
		for (int index = king[1]; index >= 0; index--) {
			if (chess[king[1]][index] == 'Q') {
				ArrayList<Integer> hey = new ArrayList<Integer>();
				hey.add(index);
				hey.add(king[1]);
				answer.add(hey);
				break;
			}
		}
		
		for (int index = king[0]; index < 8; index++) {
			for (int j = king[1]; j < 8; j++) {
				if (chess[index][j] == 'Q') {
					ArrayList<Integer> hey = new ArrayList<Integer>();
					hey.add(index);
					hey.add(j);
					answer.add(hey);
					break;
				}
			}
		}
		
		
		for (int index = king[0]; index >= 0; index--) {
			for (int j = king[1]; j >= 0; j--) {
				if (chess[index][j] == 'Q') {
					ArrayList<Integer> hey = new ArrayList<Integer>();
					hey.add(index);
					hey.add(j);
					answer.add(hey);
					break;
				}
			}
		}
		
		return answer;
    }

}
