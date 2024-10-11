class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode curr=head;
        ListNode prev=null;
        
        while(curr!=null){
            if(curr.val==val){
                if(prev==null){
                     curr=curr.next;
                     head=curr;
                }
                else{
                prev.next=curr.next;
                curr=prev.next; 
                }
            }
            else{
            prev=curr;
            curr=curr.next;
            }
        }
        return head;
    }
}