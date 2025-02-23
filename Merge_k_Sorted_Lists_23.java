import java.util.Comparator;
import java.util.PriorityQueue;

public class Merge_k_Sorted_Lists_23 {
	public static void main(String[] args) {
		ListNode[] input = new ListNode[3];
		input[0] = new ListNode();
		input[0].val = 1;
		input[0].next = new ListNode(4);
		input[0].next.next = new ListNode(5);
		input[1] = new ListNode();
		input[1].val = 1;
		input[1].next = new ListNode(3);
		input[1].next.next = new ListNode(4);
		input[2] = new ListNode();
		input[2].val = 2;
		input[2].next = new ListNode(6);
		ListNode result = mergeKLists(input);
		while(result != null) {
			System.out.print(result.val + "->");
			result = result.next;
		}
	}
	
	public static ListNode mergeKLists(ListNode[] lists) {
		PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
        	@Override
			public int compare(ListNode o1, ListNode o2) {
				return o1.val - o2.val;
			}
        });
        
        for(int i = 0; i< lists.length ; i++) {
        	if(lists[i] != null) {        		
        		pq.add(lists[i]);
        	}
        }
        
        ListNode dummy = new ListNode();
        ListNode idx = dummy;
        
        while(!pq.isEmpty()) {
        	ListNode node = pq.poll();
        	
        	if(node.next != null)
        		pq.add(node.next);
        	
        	idx.next = node;
        	idx = idx.next;
        }
        
        return dummy.next;
    }
}