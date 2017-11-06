
public class digui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(que2(1729));
	}
	
	//写一个递归函数DigitSum(n)，输入一个非负整数，返回组成它的数字之和，
	//例如，调用DigitSum(1729)，则应该返回1+7+2+9，它的和是19
	public static int que2(int n) {
		System.out.println(n);
		if(n < 10)
			return n;
		//if(终止条件)
		//	return sb;
		//return 第一步操作 + que2（参数衰减值）
		return n%10 + que2(n / 10);
	}
	
	//1 1*1
	//4 2*2
	//9 3*3
	//16
	public static int que1(int n) {
		if (n <= 0) {
			return n;
		}
		return n*n + que1(n - 1);
	}
	
	///实现n^k
	public static int que0(int n,int k) {
		if(k <= 0)
			return 1;
		return n * que0(n, k-1);
	}
	
	public static double log(int n) {
		if (n <= 0) {
			return n;
		}
		return Math.log(n) + log(n - 1);
	}
	
	public static long F(int n) {
		if(n <= 1) return n;
		return F(n-1) + F(n-2);
	}
	
	public static String exR1(int n) {
		if(n <= 0) return "";
		return exR1(n - 3) + n + exR1(n-2) + n;
	}
	
	//二分查找
	public static int  rank(int key,int[] a) {
		return rank(key,a,0,a.length - 1);
	}
	public static int rank(int key,int[] a,int lo,int hi) {
		if(lo > hi) return -1;
		int mid = lo + (hi - lo);
		if(key < a[mid]) 
			return rank(key, a,lo,mid - 1);
		else if(key > a[mid])
			return rank(key, a,mid + 1,hi);
		else 
			return mid;
	}

}
