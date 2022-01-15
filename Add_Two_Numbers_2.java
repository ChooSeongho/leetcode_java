
class ListNode {
		int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next;}
}

public class Add_Two_Numbers_2 {

	public static void main(String[] args) {
//		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
//		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
		ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
		ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
		ListNode res = addTwoNumbers(l1, l2);
		
		while(res != null) {
			System.out.println(res.val);
			res = res.next;
		}
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode res = new ListNode(0);
		ListNode tmp = res;
		int carry = 0;
		
		while(l1 != null || l2 != null) {
			int add = (l1 != null? l1.val : 0) + (l2 != null? l2.val : 0) + carry;
			carry = add / 10;
			add = add % 10;
			tmp.next = new ListNode(add);
			tmp = tmp.next;
			if(l1 != null)l1 = l1.next;
			if(l2 != null)l2 = l2.next;
		}
		
		if(carry != 0) {
			tmp.next = new ListNode(carry);
		}
		
		res = res.next;
		
		return res;
	}
	

}
