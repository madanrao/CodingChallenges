package LinkedListProblems;
import DataStructure.Node;
import java.util.*;
public class LLDup
{
    /*
     * Find the duplicate nodes in a linked list and delete them
     * Method 1: Using two pointers O(n^2)
     * Method 2: Using Hash Table O(n)
     */
    public Node checkIterate(Node head)
    {
        Node p1 = head;
        Node p2 = null;
        
        while(p1!=null)
        {
            p2 = p1.left;
            Node prev = p1;
            while(p2!=null)
            {
               
                if(p1.data==p2.data)
                {
                    prev.left = p2.left;
                    
                }
                else
                    prev = p2;
               
                p2 = p2.left;
                
            }
            p1 = p1.left;
        }
    return head;
}

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

public Node checkHash(Node head)
{
    Hashtable h = new Hashtable();
    Node p = head;
    Node prev = head;
    while(p!=null)
    {
        if(!h.containsKey((Integer)p.data))
        {
            h.put(p.data,true);
        }
        else
        {
            prev.left = p.left;
        }
        
        p = p.left;
    }
    
    return head;
    
}
    public static void main(String args[])
    {
        LLDup d = new LLDup();
        
        Node head = new Node(4);
        Node one = new Node(4);
        one.left = new Node(4);
        Node two = new Node(4);
        one.left.left = two;
        two.left = new Node(4);
        
        head.left = one;
        d.displayNodes(head);
        //Node newHead = d.checkIterate(head);
        //d.displayNodes(newHead);
        
        System.out.println("**********************");
        System.out.println("ByHashTable");
        
        Node newHead = d.checkHash(head);
        d.displayNodes(newHead);
    }
}
