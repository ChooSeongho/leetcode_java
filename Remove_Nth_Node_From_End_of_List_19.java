
public class Remove_Nth_Node_From_End_of_List_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode t1 = new ListNode(1);
//		ListNode t2 = new ListNode(2);
//		ListNode t3 = new ListNode(3);
//		ListNode t4 = new ListNode(4);
//		ListNode t5 = new ListNode(5);
//		t1.next = t2;
//		t2.next = t3;
//		t3.next = t4;
//		t4.next = t5;
		
		ListNode n = removeNthFromEnd(t1, 1);
		
		while(n != null) {
			System.out.println(n.val);
			n = n.next;
		}

	}
	
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode first = new ListNode(0);
		first.next = head;
        ListNode start = first;
        ListNode end = first;
        
        for(int i = 0; i <= n; i++) {
        	end = end.next;
        }
        
        while(end != null) {
        	start = start.next;
        	end = end.next;
        }
        
        start.next = start.next.next;
        
        return first.next;
    }

}
