/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public boolean isSymmetric(Node root) {
        // code here
         if(root==null){
            return false;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root.left);
        q.add(root.right);
        while(!q.isEmpty()){
            Node n1=q.remove();
            Node n2=q.remove();
            if(n1==null && n2==null) continue;
            if(n1==null || n2==null) return false;
            if(n1.data!=n2.data) return false;
            q.add(n1.left);
            q.add(n2.right);
            q.add(n1.right);
            q.add(n2.left);
        }
        return true;
    }
}