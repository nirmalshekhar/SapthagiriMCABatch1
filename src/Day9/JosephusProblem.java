package Day9;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class JosephusProblem {
    public static Node head=null;
    public void circularLL(int n){
        head=new Node(1);
        Node temp=head;
        for(int i=2;i<=n;i++){
            temp.next=new Node(i);
            temp=temp.next;
        }
        temp.next=head;//Make it circular

    }
    void display(int n){
        Node temp=head;
        int count=0;
        while(temp!=null && count<n){
            System.out.print(temp.data+" ->");
            temp=temp.next;
            count++;
        }
        System.out.println("Back to head");
        System.out.println();
    }
    public int josephus(int k){
        if(head==null || head.next==null) return -1;
        Node prev=null;
        Node curr=head;
        while(curr.next!=curr){
            for(int i=1;i<k;i++){
                prev=curr;
                curr=curr.next;
            }
            System.out.println("Eliminated Element :"+curr.data);
            prev.next=curr.next;
            curr=prev.next;
        }
        head=curr;
        return curr.data;
    }
    public static void main(String[] args) {
        JosephusProblem cll=new JosephusProblem();
        cll.circularLL(7);
        cll.display(7);
        System.out.println("Survivor : Thala for a Reason "+cll.josephus(2));
    }
}
