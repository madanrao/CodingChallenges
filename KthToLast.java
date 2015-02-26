package LinkedListProblems; 
import DataStructure.*;
import java.util.*;
public class KthToLast
{
    
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

public void findK(Node head,int k)
{
    Node p = head;
    int count=0;
    while(p!=null)
    {
        // Takes O(n) time
        count++;
        p = p.left;
    }
    
    int i = count - k + 1;
    Node n = head;
    
    while(i>1)
    {
        
        i--;;
        n = n.left;
    }
    
    System.out.print(k+"th to Last element is: "+n.data);
    
    
}


public void kthElement(Node head,int k)
{
    Node p1=head;
    Node p2 = p1;
    int i=k;
    while(i!=1)
    {
        p2 = p2.left;
        i--;
    }
    
    while(p2.left!=null)
    {
        p1 = p1.left;
        p2 = p2.left;
    }
    System.out.print(k+"th Element is:"+p1.data);
    
}
    public static void main(String args[])
    {
        KthToLast kt = new KthToLast();
        Node head = new Node(2);
        Node one = new Node(4);
        one.left = new Node(5);
        Node two = new Node(1);
        one.left.left = two;
        two.left = new Node(7);
        
        head.left = one;
        
        kt.displayNodes(head);
        System.out.println();
        //kt.findK(head,1);
        kt.kthElement(head,2);
    }
}
