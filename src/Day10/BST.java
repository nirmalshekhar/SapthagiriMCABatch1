package Day10;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class BST {
    static Node root=null;
    Node insert(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data<root.data){
            root.left=insert(root.left,data);
        }
        else if(data> root.data){
            root.right=insert(root.right,data);
        }
        return root;
    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }
    boolean search(Node root,int data){
        if(root==null)return false;
        if(root.data==data)return true;
        if(data<root.data){
            return search(root.left,data);
        }
        else{
            return search(root.right,data);
        }
    }
    int countNodes(Node root){
        if(root==null)return 0;
        return 1+countNodes(root.left)+
                countNodes(root.right);
    }
    int countLeaf(Node root){
        if(root==null)return 0;
        if(root.left==null && root.right==null)return 1;
        return countLeaf(root.left)+countLeaf(root.right);
    }
    public static void main(String[] args) {
        BST tree=new BST();
        int[] arr={50,30,70,20,40,60,80,15};
        for(int val:arr){
            root=tree.insert(root,val);
        }
        System.out.println("Inorder Traversal(Sorted Format)");
        tree.inorder(root);
        System.out.println();
        System.out.println("Search :"+tree.search(root,60));
        System.out.println("No of Nodes :"+tree.countNodes(root));
        System.out.println("No of Leaf :"+tree.countLeaf(root));
    }
}
