public class Merge_Two_Sorted_Lists_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode[] list1 = new ListNode[3];
		ListNode[] list2 = new ListNode[3];
		list1[0] = new ListNode(1);
		ListNode l12 = new ListNode(2);
		ListNode l13 = new ListNode(4);
		l12.next = l13;
		list1[0].next = l12;
		list2[0] = new ListNode(1);
		ListNode l22 = new ListNode(3);
		ListNode l23 = new ListNode(4);
		l22.next = l23;
		list2[0].next = l22;
		list2[2] = new ListNode(0);
		
		for(int i = 0; i < list1.length; i++) {
			ListNode l = mergeTwoLists(list1[i], list2[i]);
			while(l != null) {
				System.out.print(l.val + "->");
				l = l.next;
			}
			System.out.println();
		}
		
	}
	
	public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if(list1 == null) {
        	return list2;
        } else if(list2 == null) {
        	return list1;
        }
		
		ListNode dummy = new ListNode(0);
		ListNode idx = dummy;
        
        while(list1 != null && list2 != null) {
        	if(list1.val > list2.val) {
        		idx.next = list2;
        		list2 = list2.next;
        	} else {
        		idx.next = list1;
        		list1 = list1.next;
        	}
        	idx = idx.next;
        }
        
        if(list1 != null) {
        	idx.next = list1;
        } else if(list2 != null) {
        	idx.next = list2;
        }
        
        return dummy.next;
    }
}
