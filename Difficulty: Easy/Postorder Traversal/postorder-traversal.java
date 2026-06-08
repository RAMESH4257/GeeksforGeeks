/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    void postorder(List<Integer> li,Node root){
        if(root==null) return;
        postorder(li,root.left);
        postorder(li,root.right);
        li.add(root.data);
    }
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> li=new ArrayList<>();
        postorder(li,root);
        return li;
        
    }
}