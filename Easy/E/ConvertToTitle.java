package Easy.E;


/**
@Discribute:Given a sorted linked list, 
delete all duplicates such that each element appear only once.

For example:
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * 
 * 
 * 
 * @Update (2015-12-04):
 * @author:ge1mina023
 */

public class ConvertToTitle {
	    public ListNode deleteDuplicates(ListNode head) {
	        if(head == null || head.next == null){
	            return head;
	        }
	        
	        ListNode prev = head;
	        ListNode p = head.next;
	        while(p!=null){
	            if(prev.val == p.val){
	                prev.next = p.next;
	                p = p.next;
	            }
	            else{
	                prev = p;
	                p = p.next;
	            }
	        }
	              
	        return head;
	    }
}
