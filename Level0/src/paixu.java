
public class paixu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,7,4,8,2,9};
//		insert(arr);
//		selected(arr);
		maopao(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	//1,7,4,8,2,9
	public static void guibing(int[] arr) {
		
	}
	
	//ð������һ����������������������ð����
	//����֮����жԱȣ���������������ϴ���С������н���
	//��һ��֮��������С�������ܹ������õ�����߻����ұ�
	public static void maopao(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i; j < arr.length; j++) {
//				if (arr[i] > arr[j]) {
//					int t = arr[i];
//					arr[i] = arr[j];
//					arr[j] = t;
//				}
//			}
//		}
		//������ɨ���ȥ
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length - i - 1; j++) {
//				if (arr[j] > arr[j+1]) {
//					int t = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = t;
//				}
//			}
//		}
		//���ҵ���ɨ��
		//1,7,4,8,2,9
		//1 7 4 8 9 2
		//1 7 4 9 8 2
		//1 7 9 4 8 2
		//1 9 7 4 8 2
		//9 1 7 4 8 2
//		for (int i = arr.length - 1; i >= 0; i--) {
//			for (int j = arr.length - 1; j > arr.length - i - 1; j--) {
//				if (arr[j] > arr[j-1]) {
//					int t = arr[j];
//					arr[j] = arr[j-1];
//					arr[j-1] = t;
//				}
//			}
//		}
		//�Ż�
		int v = 0;
		boolean swaped;//ʹ��һ����־�жϽ������Ƿ񻹻�ִ�����ݽ���
		int n = arr.length;
		//1,7,4,8,2,9 
		do {
			swaped = false;
			for (int i = 1; i < n; i++) {
				if (arr[i - 1] > arr[i]) {
					v ++;
					int temp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = temp;
					swaped = true;//����˴��з������ݽ�����˵��while����ִ�еı�Ҫ
				}
			}
			n--;
		} while (swaped);//�������ѭ��û�з������ݽ�����˵�����������ݶ��ǰ��չ������еģ�û�б�Ҫ�ٽ���ѭ��
//		System.out.println(v);
	}
	
	
	//ѡ������
	//���赱ǰҪ���������n����С����n+1��ʼ�Ƚϣ����n+1����С��n�������ͽ����߽��н���
	//������ѡ����֣��Ӻ�����������ε�ѡ�����С���������õ���ǰҪ�����λ����
	public static void selected(int[] arr) {
		int len = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[i]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					len++;
				}
			}
		}
		System.out.println(len);
	}
	
	//��������
	//���ĺ��ڶ���ѭ������Ҫ�Ӻ���ǰ�Ƚ�
	//1,3,5    2,6
	//�ŵ�n����ʱ������ǰn-1�����Ѿ����к��ˣ�����n������ֵ��������
	//��ʼ�ѵ�n-1������ʼ�����n�������бȽϣ������n�����Ƚ�С���ͽ���Ӧ�ı��Ƚϵ����������ƶ�һλ
	//���ѱ��������ĵ�n�����������һ�αȽϳɹ�������λ��
	public static void insert(int[] arr) {
		//�ҵĵ�һ���汾,����࣬���Ľ����Ƚ���
//		int t = 0;
//		int v = -1;
//		for (int i = 1; i < arr.length; i++) {
//			t = arr[i];
//			for (int j = i; j >= 0; j--) {
//				if (arr[j] > t) {
//					arr[j+1] = arr[j];
//					v = j;
//				}
//			}
//			if(v != -1){
//				arr[v] = t;
//			}
//			v = -1;
//		}
		for(int i = 1;i < arr.length ; i++){
			for(int j = i;j > 0;j --){
				if(arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}else{
					//�����������ù�
					break;
				}
			}
		}
		
	}
}
