/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node prev=null,temp=head;
        while(temp!=null){
            Node nextnode=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nextnode;
        }
        return prev;
    }
}