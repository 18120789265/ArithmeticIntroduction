import java.util.Arrays;
import java.util.HashSet;


public class shudu {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		char[][] arrs = {{'5','.','.','.','7','.','.','.','.'},
////						 {'4','7','.','.','.','.','.','.','.'},
////						 {'3','.','.','.','.','.','.','.','.'},
////						 {'2','.','.','.','.','.','.','.','.'},
////						 {'1','.','.','.','.','.','.','.','.'},
////						 {'6','.','.','.','.','.','.','.','.'},
////						 {'7','.','.','.','.','.','.','.','.'},
////						 {'8','.','.','.','.','.','.','.','.'},
////						 {'9','.','.','.','.','.','.','.','.'}};
////		System.out.println(isValidSudoku(arrs));
//		test(0,0);
//	}
	
	public static void test(int i,int j) {
		for(int k = 0; k < 16 ; k++){
			//����k������xxҲ��������yyһ�����ڣ�xx����һ��
			int xx = i + k/5;
			//yy��ֵÿ������һ��������0-��n-1��֮��ѭ��
			int yy = j + k%5;
			System.out.println(xx + "|" + yy);
		}
	}
	
	//�ж������Ƿ�Ϸ�
	public static boolean isValidSudoku(char[][] board) {
		StringBuilder str = new StringBuilder();
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				String s = String.valueOf(board[i][j]);
				if (str.indexOf(s) >= 0 && !s.equals(".")) {
					return false;
				}
				str.append(s);
			}
			str.delete(0, str.length());
		}
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				String s = String.valueOf(board[j][i]);
				if (str.indexOf(s) >= 0 && !s.equals(".")) {
					return false;
				}
				str.append(s);
			}
			str.delete(0, str.length());
		}
		
		for (int i = 0; i < board.length;i+=3 ) {
			for (int j = 0; j < board.length; j+=3) {
				for(int k = 0; k <9 ; k++){
					int xx = i + k/3;
					int yy = j + k%3;
					String s = String.valueOf(board[xx][yy]);
					if (str.indexOf(s) >= 0 && !s.equals(".")) {
						System.out.println(xx + "|" + yy);
						return false;
					}
					str.append(s);
                }
				str.delete(0, str.length());
			}
		}

        return true;
    }
}
