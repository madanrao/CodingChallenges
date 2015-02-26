package LinkedListProblems;
import DataStructure.*;


public class ReverseLL
{
    /*
     * reverse the linked list
     * For each node, left should point to the Prev node, first node should point to NULL. 
     */
    public void displayNodes(Node head)
{
    Node d = head;
    while(d!=null)
    {
        System.out.print(d.data+"  |->  ");
        d = d.left;
    }
    System.out.print("END |");
}


    public Node reverse(Node head)
    {
        Node p = head;
        Node prev = null;
        Node curr = null;
        while(p!=null)
        {
            curr = p;
            p = p.left;
            curr.left = prev;
            prev = curr;
        }
        return prev;
    }
    
    public static void main(String args[])
    {
        Node head = new Node(1);
        Node one = new Node(2);
        one.left = new Node(3);
        one.left.left = new Node(4);
        head.left = one;
        
        ReverseLL r = new ReverseLL();
        r.displayNodes(head);
        System.out.println();
        Node newHead = r.reverse(head);
        r.displayNodes(newHead);
    }
}
