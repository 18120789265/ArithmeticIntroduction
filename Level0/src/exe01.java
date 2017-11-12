import java.util.ArrayList;
import java.util.List;


public class exe01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(que01(47));
//		char[] str = new char[100];
//		String string = "";
//		for (int i = 0; i < string.length(); i++) {
//			str[i] = string.charAt(i);
//		}
//		System.out.println(replaceBlank(str,11));
//		System.out.println(str);
		
//		System.out.println(countOnes(1));
		
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
//		node1.print();
		ListNode node4 = reverse2(node1);
		node4.print();
	}
	
	public static ListNode reverse2(ListNode head){
		if (head == null || head.next == null) {
			return head;
		}
		ListNode prev = reverse2(head.next);
        head.next.next = head;
        head.next = null;
		return prev;
	}
	//��ת����
	//����һ������1->2->3->null�������ת�������Ϊ3->2->1->null
	public static ListNode reverse(ListNode head) {
//		if (head == null) {
//			return null;
//		}
//		if (head.next == null) {
//			return head;
//		}
//		List<ListNode> temps = new ArrayList<ListNode>();
//		while (true) {
//			temps.add(head);
//			head = head.next;
//			if (head.next == null) {
//				temps.add(head);
//				break;
//			}
//		}
//		for (int i = temps.size() - 1; i > 0; i --) {
//			temps.get(i).next = temps.get(i-1);
//		}
//		temps.get(0).next = null;
//		return head;
		//�Ż�
		ListNode prev = null;
        while(head!=null){
            ListNode tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;
    }
	public static class ListNode {
		public int val;
		public ListNode next;
		public ListNode(int val) {
			this.val = val;
	        this.next = null;
		}
		public void print() {
			System.out.println(val);
			if (next != null) {
				next.print();
			}
		}
	}

	//������һ�� 32 λ�������Ķ����Ʊ�ʾ���ж��ٸ� 1.
	public static int countOnes(int num) {
//		if (num < 0) {
//			num = -num;
//		}
//		int count = 0;
//		//����num = 6��������Ϊ0110(8,4,2,1)
//        while(num != 0){
//        	//λ�룬���num��Ӧ�����Ƶĵ�0ΪΪ1��λ��0x01�Ľ��Ϊ1
//            count += num & 0x01;
//            //���������ƶ�һλ��һ�κ�0110���0011����3
//            num = num >> 1;
//        }
//        return count;
		int count = 0;
        while(num!=0){
        	//num & (num-1);����ȥ��num��Ӧ���������ұߵ�1
            num = num & (num-1);
            count++;
        }
        return count;
    }
	
	//���һ�ַ�������һ���ַ����е����пո��滻�� %20 ������Լ�����ַ������㹻�Ŀռ��������µ��ַ�������õ����ǡ���ʵ�ġ��ַ����ȡ�
	//��ĳ�����Ҫ���ر��滻����ַ����ĳ��ȡ�
	public static int replaceBlank(char[] string, int length) {
		if (string == null || string.length == 0) {
			return 0;
		}
		char[] res = new char[string.length];
		int len = 0;
		for (int i = 0; i < length; i++,len++) {
			if (string[i] == ' ') {
				res[len] = '%';
				res[++len] = '2';
				res[++len] = '0';
			}else {
				res[len] = string[i];
			}
		}
		
		for (int i = 0; i < len; i++) {
			string[i] = res[i];
		}
		return len;
//		int reallen = length;
//        for(int i = 0;i<length;i++){
//            if(string[i] == ' ')
//                reallen += 2;
//        }
//        int index = reallen;
//        for(int i = length - 1;i>= 0 ;i-- ){
//            if(string[i] == ' '){
//                string[--index] = '0';
//                string[--index] = '2';
//                string[--index] = '%';
//            }else{
//                string[--index] = string[i];
//            }
//        }
//        return reallen;
    }
	
//	����쳲����������е� N ������
//	��ν��쳲�����������ָ��
//	ǰ2������ 0 �� 1 ��
//	�� i �����ǵ� i-1 �����͵�i-2 �����ĺ͡�
//	쳲��������е�ǰ10�������ǣ�
//	0, 1, 1, 2, 3, 5, 8, 13, 21, 34 ...
	public static int que01(int n) {
		if (n == 1) {
			return 0;
		}else if(n == 2) {
			return 1;
		}
		//�ݹ飬�ٶ����ܶ�
//		return que01(n - 1) + que01(n - 2);
		//ѭ����ʽ������˼���ǽ�ǰ������һֱ�����������ظ��ı仯
	    int num1=0;
        int num2=1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
        	sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
        return sum;
	}

}
