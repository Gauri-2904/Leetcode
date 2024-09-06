/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
       boolean set[]=new boolean[(int)1e5+1];
       for(int num:nums){
        set[num]=true;//values of nums that we will delete from set

       }
       ListNode prev=null;
       ListNode cur=head;
       while(cur!=null){
        if(set[cur.val]==true){
            if(prev==null){//deletion at head  1  2  3 4  5
            head=head.next;//delete 1
            cur.next=null;
            cur=head;//2   finally 1 ,2 are deleted
            }else{  //
                prev.next=cur.next;//  3-> 4-> 5
                cur.next=null;
                cur=prev.next;
            }
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
        return head;
       }
    }

