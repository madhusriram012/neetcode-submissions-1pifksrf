/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null) return "";
        Queue<TreeNode> q=new LinkedList<>();
        StringBuilder sb=new StringBuilder();

        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr==null){
                sb.append("n ");
                continue;
            }
            sb.append(curr.val+" ");
            q.add(curr.left);
            q.add(curr.right);
        }

        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data=="") return null;

        Queue<TreeNode> q=new LinkedList<>();
        String[] values=data.split(" ");
        TreeNode root=new TreeNode(Integer.parseInt(values[0]));
        for(int i=0;i<values.length;i++){
            System.out.print(values[i]+" ");
        }
        q.add(root);

        for(int i=1;i<values.length;i++){
            TreeNode parent=q.poll();
            if(!values[i].equals("n")){
                TreeNode left=new TreeNode(Integer.parseInt(values[i]));
                parent.left=left;
                q.add(left);
            }
            if(!values[++i].equals("n")){
                TreeNode right=new TreeNode(Integer.parseInt(values[i]));
                parent.right=right;
                q.add(right);
            }
        }
        return root;
    }
}
