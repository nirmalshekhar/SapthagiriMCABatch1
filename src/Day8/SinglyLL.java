package Day8;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SinglyLL {
    static Node head=null;
    public void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }
    public void addAtPosition(int data,int position){
        Node newNode=new Node(data);
        if(position==1){
            addFirst(data);
            return;
        }
        Node curr=head;
        //Traversal and to reach to that position
        for(int i=1;i<position-1 && curr!=null;i++){
            curr=curr.next;
        }
        if(curr==null){
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next=curr.next;
        curr.next=newNode;
    }
    public void reverse(){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public boolean isCyclic(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return true;
        }
        return false;
    }
    public int findMiddle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public void swapNodes(int x,int y){
        if(x==y)return;//if both nodes are same
        Node prevX=null,currX=head;
        while(currX!=null && currX.data!=x){
            prevX=currX;
            currX=currX.next;
        }
        Node prevY=null,currY=head;
        while(currY!=null && currY.data!=y){
            prevY=currY;
            currY=currY.next;
        }
        if(currX==null || currY==null)return;
        if(prevX!=null){
            prevX.next=currY;
        }
        else{
            head=currY;
        }
        if(prevY!=null){
            prevY.next=currX;
        }
        else{
            head=currX;
        }
        Node temp=currX.next;
        currX.next=currY.next;
        currY.next=temp;
    }
   public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ->");
            curr=curr.next;
        }
        System.out.print("null");
       System.out.println();
    }
    public static void main(String[] args) {
        SinglyLL list=new SinglyLL();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.display();
//        list.addFirst(60);
//        list.display();
//        list.addAtPosition(70,3);
//        list.display();
//        list.reverse();
//        list.display();
        //Manually create a cycle
        //list.head.next.next.next.next=list.head.next;
        System.out.println("Cycle : "+list.isCyclic());
        System.out.println("Middle Element is  :"+list.findMiddle());
        list.swapNodes(20,40);
        list.display();



    }
}
