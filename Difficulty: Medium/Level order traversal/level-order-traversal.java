/* A binary tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    // Constructor
    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/

class Solution {
    public ArrayList<Integer> levelOrder(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){

                Node curr=qu.remove();
                ans.add(curr.data);
                if(curr.left!=null){
                    qu.add(curr.left);
                }
                if(curr.right!=null){
                    qu.add(curr.right);
                }
            
        }
        return ans;
    }
}