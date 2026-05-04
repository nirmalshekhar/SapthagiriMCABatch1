package Day10;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        left=right=null;
    }
}
public class BinaryTree {
    TreeNode root;
    void preorder(TreeNode root){
        if(root==null)return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    void postorder(TreeNode root){
        if(root==null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    void levelOrder(TreeNode root){
        if(root==null)return;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null)
                q.offer(curr.left);
            if(curr.right!=null)
                q.offer(curr.right);
        }
    }
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.root=new TreeNode(1);
        tree.root.left=new TreeNode(2);
        tree.root.right=new TreeNode(3);
        tree.root.left.left=new TreeNode(4);
        tree.root.left.right=new TreeNode(5);
        System.out.println("Preorder Traversal ->");
        tree.preorder(tree.root);
        System.out.println();
        System.out.println("Inorder Traversal ->");
        tree.inorder(tree.root);
        System.out.println();
        System.out.println("Postorder Traversal ->");
        tree.postorder(tree.root);
        System.out.println();
        System.out.println("Level order Traversal :");
        tree.levelOrder(tree.root);

    }
}
