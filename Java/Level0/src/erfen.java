
public class erfen {

	/**
	 * @param args
	 */
//	public static void main(String[] args) { 
//		// TODO Auto-generated method stub
//		int[] arr = {1,2,3,4,5,6}; 
//		System.err.println(rank(4, arr));
//		System.err.println(rank2(4, arr));
//	}
	
	public static int rank(int key,int[] arr) {
		int lo = 0;
		int hi = arr.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi-lo)/2;
			if (key < arr[mid]) {
				hi = mid - 1;
			}else if (key > arr[mid]) {
				lo = mid + 1;
			}else {
				return mid;
			}
		}
		return -1;
	}

	public static int rank2(int key,int[] arr) {
		int lo = 0;
		int hi = arr.length - 1;
		while(lo < hi){
			int mid = lo + (hi - lo)/2;
//			if (key > arr[mid]) {
//				lo = mid + 1;
//			}else if (key < arr[mid]) {
//				hi = mid - 1;
//			}else {
//				return mid;
//			}
			if (key < arr[mid]) {
				lo = mid - 1;
			}else if (key > arr[mid]) {
				hi = mid + 1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
