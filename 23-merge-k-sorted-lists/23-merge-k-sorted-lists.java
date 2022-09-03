/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public class pair{
        
        int i;
        ListNode l;
        
        pair(int i, ListNode l){
            this.l=l;
            this.i=i;
        }
        
    }
    
    public ListNode mergeKLists(ListNode[] Lists) {
        
        PriorityQueue<pair> Q= new PriorityQueue<>((a,b)->{
            return a.l.val-b.l.val;
        });
        
        for(int i=0; i<Lists.length; i++){
            if(Lists[i]!=null){
                Q.add(new pair(i,Lists[i]));
                Lists[i]=Lists[i].next;
            }
        }
        
        ListNode head=null;
        
        if(Q.size()==0) return null;
        
        pair curr=Q.remove();
        head=curr.l;
        head.next=null;
        ListNode currNode=head;
        if(Lists[curr.i]!=null){
             Q.add(new pair(curr.i,Lists[curr.i]));
             Lists[curr.i]=Lists[curr.i].next;
        }
        
        while(true){
            if(Q.size()==0) break;
            curr=Q.remove();
            currNode.next=curr.l;
            currNode=currNode.next;
            currNode.next=null;
            if(Lists[curr.i]!=null){
             Q.add(new pair(curr.i,Lists[curr.i]));
             Lists[curr.i]=Lists[curr.i].next;
            }
        }
        
        return head;
        
    }
    
}